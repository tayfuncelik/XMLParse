package org.example.common;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPHeader;

public class Marchaller {
    public static void addToHeader(Object obj, SOAPHeader header) throws JAXBException {
        JAXBContext yjc2 = JAXBContext.newInstance(obj.getClass());
        Marshaller marshaller = yjc2.createMarshaller();
        marshaller.marshal(obj, header);
    }

    public static void addToBody(Object obj, SOAPBody body) throws JAXBException {
        JAXBContext yjc2 = JAXBContext.newInstance(obj.getClass());
        Marshaller marshaller = yjc2.createMarshaller();
        marshaller.marshal(obj, body);
    }

}
