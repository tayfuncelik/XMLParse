package org.example;

import org.example.client.HotelAvai;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws URISyntaxException {

        try {

            URL resource = Main.class.getClassLoader().getResource("input.xml");
            if (resource == null) {
                throw new IllegalArgumentException("file not found!");
            }

            File file =new File(resource.toURI());
            JAXBContext jaxbContext = JAXBContext.newInstance(HotelAvai.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            HotelAvai que= (HotelAvai) jaxbUnmarshaller.unmarshal(file);

            System.out.println("");
            System.out.println("Answers:");

        } catch (JAXBException e) {
            e.printStackTrace();
        }


    }
}