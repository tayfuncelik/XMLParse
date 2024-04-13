package org.example.client;

import org.example.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Criterion")
public class Criterion {
    @XmlElement(name = "HotelRef", namespace = NameSpaces.NS)
    private HotelRef hotelRef;
}
