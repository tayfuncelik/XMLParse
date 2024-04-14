import org.example.Main;
import org.example.client.body.*;
import org.example.client.body.convert.Guest;
import org.example.client.header.Pos;
import org.example.client.header.RequestorID;
import org.example.client.header.Source;
import org.example.output.body.AvailabilityRequest;
import org.example.output.header.Security;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPHeader;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.Silent.class)
public class TestMain {
    @Mock
    private HotelAvai hotelAvai;
    @Mock
    private Pos pos;
    @Mock
    private Source source;
    @Mock
    private RequestorID requestorID;
    @Mock
    private SOAPHeader soapHeader;
    @Mock
    private SOAPBody soapBody;
    @Mock
    private AvailRequestSegments availRequestSegments;
    @Mock
    private AvailRequestSegment availRequestSegment;
    @Mock
    protected JAXBContext jaxbContext;
    @Mock
    private HotelAvai hotel;
    @Mock
    private Criterion criterion;
    @Mock
    private RoomStayCandidate roomStayCandidate;
    @Mock
    private GuestCounts guestCounts;
    @Mock
    private GuestCount guestCount;
    @Mock
    private HotelRef hotelRef;

    @Mock
    private HotelSearchCriteria hotelSearchCriteria;

    @Mock
    private StayDateRange stayDateRange;
    @Mock
    private RoomStayCandidates roomStayCandidates;

    @Before
    public final void setUp() {
        this.hotel = Mockito.mock(HotelAvai.class);

        when(hotelAvai.getPos()).thenReturn(pos);
        when(pos.getSource()).thenReturn(source);
        when(source.getRequestorID()).thenReturn(requestorID);
        when(requestorID.getId()).thenReturn("WSRMXRDOO");
        when(requestorID.getMessagePassword()).thenReturn("Pz_882bi");

    }

    @Test
    public void isValidArg() {
        String[] arg = new String[]{"input.xml", "output.xml"};
        Main.isArgsValid(arg);
    }

    @Test
    public void mainTest() {
        String[] arg = new String[]{"input.xml", "output.xml"};
        Main.main(arg);
    }

    @Test
    public void setSecurityTest() throws JAXBException, UnsupportedEncodingException, NoSuchAlgorithmException {

        // when(JAXBContext.newInstance(Security.class)).thenReturn(jaxbContext);
        //final Marshaller marshaller = mock(Marshaller.class);
        //when(jaxbContext.createMarshaller()).thenReturn(marshaller);

        try (MockedStatic<JAXBContext> jaxbContext = Mockito.mockStatic(JAXBContext.class)) {
            jaxbContext.when(() -> JAXBContext.newInstance(Security.class))
                    .thenThrow(JAXBException.class);
            assertThrows(JAXBException.class, () -> Main.setSecurity(hotelAvai, soapHeader));
        }
    }

    @Test
    public void jaxbExceptionTest() {

        try (MockedStatic<JAXBContext> jaxbContext = Mockito.mockStatic(JAXBContext.class)) {
            jaxbContext.when(() -> JAXBContext.newInstance(Security.class))
                    .thenThrow(JAXBException.class);
            assertThrows(JAXBException.class, () -> Main.setSecurity(hotelAvai, soapHeader));
        }
    }

    @Test
    public void sumChildTest() {
        List<Guest> guestList = new ArrayList<>();
        guestList.add(new Guest(1, 3));
        guestList.add(new Guest(2, 5));

        Integer sum = Main.sumChild(guestList);
        assertEquals(sum, 3);
    }

    @Test
    public void bodyTest(){
        List<Guest> guestList = new ArrayList<>();
        guestList.add(new Guest(1, 3));
        guestList.add(new Guest(2, 5));
        when(hotel.getPrimaryLangID()).thenReturn("PRIMARY_ID");
        when(hotel.getRequestedCurrency()).thenReturn("EUR");

        when(hotel.getAvailRequestSegments()).thenReturn(availRequestSegments);
        when(availRequestSegments.getAvailRequestSegment()).thenReturn(availRequestSegment);
        when(availRequestSegment.getHotelSearchCriteria()).thenReturn(hotelSearchCriteria);
        when(hotelSearchCriteria.getCriterion()).thenReturn(criterion);
        when(criterion.getHotelRef()).thenReturn(hotelRef);
        when(hotelRef.getHotelCode()).thenReturn("HOTEL_CODE");
        when(hotelRef.getHotelCityCode()).thenReturn("HOTEL_CITY_CODE");
        when(hotelRef.getHotelCodeContext()).thenReturn("HOTEL_CODE_CONTEXT");

        when(availRequestSegment.getStayDateRange()).thenReturn(stayDateRange);
        when(stayDateRange.getStart()).thenReturn(Instant.now().toString());
        when(stayDateRange.getEnd()).thenReturn(Instant.now().toString());
        when(availRequestSegment.getRoomStayCandidates()).thenReturn(roomStayCandidates);

        when(roomStayCandidate.getQuantity()).thenReturn("11111");
        when(roomStayCandidate.getRph()).thenReturn("RPH_VAL");
        when(roomStayCandidate.getGuestCounts()).thenReturn(guestCounts);

        when(guestCount.getCount()).thenReturn("1");
        when(guestCount.getAgeQualifyingCode()).thenReturn("10");

        List<GuestCount> gc = new ArrayList<>();
        gc.add(guestCount);
        when(guestCounts.getGuestCountList()).thenReturn(gc);

        List<RoomStayCandidate> rc = new ArrayList<>();
        rc.add(roomStayCandidate);

        when(roomStayCandidates.getRoomStayCandidateList()).thenReturn(rc);


        try (MockedStatic<JAXBContext> jaxbContext = Mockito.mockStatic(JAXBContext.class)) {
            jaxbContext.when(() -> JAXBContext.newInstance(AvailabilityRequest.class))
                    .thenThrow(JAXBException.class);
            assertThrows(JAXBException.class, () -> Main.setResponseBody(hotel, soapBody));
        }
    }


}
