package org.example;

import org.example.client.body.GuestCounts;
import org.example.client.body.HotelAvai;
import org.example.client.body.RoomStayCandidate;
import org.example.client.body.convert.Guest;
import org.example.client.header.RequestorOption;
import org.example.common.XMLDefinition;
import org.example.output.body.*;
import org.example.output.header.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static org.example.common.Const.*;
import static org.example.common.Marchaller.addToBody;
import static org.example.common.Marchaller.addToHeader;

public class Main {

    public static void main(String[] args) {
        DATE_TIME_FORMATTER.setTimeZone(TimeZone.getTimeZone("UTC"));
        isArgsValid(args);

        try {
            String inputXMLFile = args[0];//"input.xml"
            String outputXMLFile = args[1];
            InputStream resource = Main.class.getClassLoader().getResourceAsStream(inputXMLFile);
            if (resource == null) {
                throw new IllegalArgumentException("file not found!");
            }

            /*
            URL resource = Main.class.getClassLoader().getResource("input.xml");
            if (resource == null) {
                throw new IllegalArgumentException("file not found!");
            }
            File file = new File(resource.toURI().getPath());*/
            JAXBContext jaxbContext = JAXBContext.newInstance(HotelAvai.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            HotelAvai hotelAvai = (HotelAvai) jaxbUnmarshaller.unmarshal(resource);
            writeToFile(hotelAvai, outputXMLFile);
            System.out.println("\n____completed_____");
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (SOAPException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void isArgsValid(String[] args) {
        if (args.length < 1) {
            System.out.println("Error choose inputfile");
            System.exit(1);
        }
    }

    public static void writeToFile(HotelAvai hotel, String outputXMLFile) throws SOAPException, JAXBException, IOException {
        XMLDefinition xmlDefinition = new XMLDefinition();
        //SET HEADER
        addToHeader(new MessageID(UUID.randomUUID().toString()), xmlDefinition.getHeader());
        setAction(hotel, xmlDefinition.getHeader());
        addToHeader(new To(ENDPOINT), xmlDefinition.getHeader());
        try {
            setSecurity(hotel, xmlDefinition.getHeader());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        //SET BODY
        setResponseBody(hotel, xmlDefinition.getBody());
        //WRITE
        //soapMsg.writeTo(System.out);
        OutputStream fOut = new FileOutputStream(outputXMLFile);
        xmlDefinition.writeMessage(fOut);
    }

    private static void calculateGuestList(List<GuestCounts> guestCountsList, List<Guest> guestList) {
        guestCountsList.forEach(i -> {

            Guest guest = new Guest();
            i.getGuestCountList().forEach(gc -> {
                if (gc.getAgeQualifyingCode().equals("10")) {
                    guest.setAdultCount(Integer.valueOf(gc.getCount()));
                }
                if (gc.getAgeQualifyingCode().equals("8")) {
                    guest.setChildCount(Integer.valueOf(gc.getCount()));
                }
            });
            guestList.add(guest);
        });
        //System.out.println("total child:" + sumChild(guestList));
    }

    private static Integer sumChild(List<Guest> guestList) {
        return guestList.stream()
                .mapToInt(i -> i.getChildCount())
                .sum();
    }

    private static Map<Integer, List<Guest>> getAdultGroup(List<Guest> guestList) {
        return guestList.stream()
                .collect(groupingBy(Guest::getAdultCount));
    }

    public static void setResponseBody(HotelAvai hotel, SOAPBody body) throws JAXBException {
        AvailabilityRequest request = new AvailabilityRequest();
        request.setInputCurrency(hotel.getRequestedCurrency().equals("EUR") ? EURO : POUND);
        request.setInputLanguageCode(hotel.getPrimaryLangID().toUpperCase());

        List<RoomStayCandidate> roomStayCandidateList = hotel.getAvailRequestSegments().getAvailRequestSegment().getRoomStayCandidates().getRoomStayCandidateList();
        List<GuestCounts> guestCountsList = roomStayCandidateList.stream().map(RoomStayCandidate::getGuestCounts).collect(Collectors.toList());

        List<Guest> guestList = new ArrayList<>();
        calculateGuestList(guestCountsList, guestList);
        Map<Integer, List<Guest>> adultGroup = getAdultGroup(guestList);

        RoomInputParameters rip = new RoomInputParameters();
        rip.setUniqueRoomGroups(adultGroup.size());
        rip.setNumberOfChildren(sumChild(guestList));

        List<Room> roomList = new ArrayList<>();
        for (Map.Entry<Integer, List<Guest>> data : adultGroup.entrySet()) {
            roomList.add(new Room(data.getValue().size(), data.getKey()));
            //System.out.println("numberOfAdults:" + data.getKey() + " numberOfRooms:" + data.getValue().size());
        }
        Rooms rooms = new Rooms();
        rooms.setRoom(roomList);
        rip.setRooms(rooms);
        request.setRoomInputParameters(rip);

        GlobalInputParameters gip = new GlobalInputParameters();
        HotelStayDuration hsd = new HotelStayDuration();

        try {
            setDateFormat(hsd, hotel);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        HotelInputDetails hid = new HotelInputDetails();
        hid.setLocationCode(hotel.getAvailRequestSegments().getAvailRequestSegment().getHotelSearchCriteria().getCriterion().getHotelRef().getHotelCityCode());
        String hotelCode = hotel.getAvailRequestSegments().getAvailRequestSegment().getHotelSearchCriteria().getCriterion().getHotelRef().getHotelCode();
        hid.setHotelId(hotelCode.split("_")[0]);
        hid.setChainCode(hotelCode.split("_")[1]);

        gip.setHotelInputDetails(hid);
        gip.setHotelStayDuration(hsd);
        request.setGlobalInputParameters(gip);

        addToBody(request, body);
    }

    public static void setDateFormat(HotelStayDuration hsd, HotelAvai hotel) throws ParseException {
        String startDate = hotel.getAvailRequestSegments().getAvailRequestSegment().getStayDateRange().getStart();
        String endDate = hotel.getAvailRequestSegments().getAvailRequestSegment().getStayDateRange().getEnd();


        String startFormatted = new SimpleDateFormat("yyyy-MM-dd").format(DATE_TIME_FORMATTER.parse(startDate));
        String endFormatted = new SimpleDateFormat("yyyy-MM-dd").format(DATE_TIME_FORMATTER.parse(endDate));

        long diffInMillies = Math.abs(DATE_TIME_FORMATTER.parse(endDate).getTime() - DATE_TIME_FORMATTER.parse(startDate).getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        //System.out.println(startFormatted);
        //System.out.println(endFormatted);

        hsd.setStartDate(startFormatted);
        hsd.setNumberOfNights(diff);
    }

    public static void setAction(HotelAvai hotel, SOAPHeader header) throws JAXBException {
        List<RequestorOption> ro = hotel.getPos().getSource().getRequestorOptions().getRequestorOption();
        String action = ro.stream()
                .filter(e -> "action".equals(e.getName().toString()))
                .map(RequestorOption::getValue)
                .findFirst().get();
        addToHeader(new Action(action), header);
    }

    private static String encryptPassword(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        MessageDigest crypt = MessageDigest.getInstance("SHA-1");
        crypt.reset();
        crypt.update(password.getBytes("UTF-8"));

        return new BigInteger(1, crypt.digest()).toString(16);
    }

    public static void setSecurity(HotelAvai hotel, SOAPHeader header) throws JAXBException, UnsupportedEncodingException, NoSuchAlgorithmException {
        Security security = new Security();
        UsernameToken usernameToken = new UsernameToken();
        usernameToken.setId("UsernameToken-1");
        usernameToken.setUsername(hotel.getPos().getSource().getRequestorID().getId());

        OffsetDateTime localDate = OffsetDateTime.now(Clock.systemUTC());
        usernameToken.setCreated(localDate.toString());

        String encodedIdString = Base64.getEncoder().encodeToString(hotel.getPos().getSource().getRequestorID().getId().getBytes());
        usernameToken.setNonce(new Nonce(EncodingType, encodedIdString));

        String encodedPassString = encryptPassword(hotel.getPos().getSource().getRequestorID().getId());
        String crazy = encryptPassword(usernameToken.getNonce().getValue() + usernameToken.getCreated() + encodedPassString);
        usernameToken.setPassword(new Password(PasswordType, Base64.getEncoder().encodeToString(crazy.getBytes())));

        security.setUsernameToken(usernameToken);
        addToHeader(security, header);
    }


}