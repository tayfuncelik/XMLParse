package org.example.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRef")
public class HotelRef {
    @XmlAttribute(name = "HotelCityCode")
    private String hotelCityCode;
    @XmlAttribute(name = "HotelCode")
    private String hotelCode;
    @XmlAttribute(name = "HotelCodeContext")
    private String hotelCodeContext;
}
