package org.example.client.body;

import org.example.common.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Criterion")
public class Criterion {
    @XmlElement(name = "HotelRef", namespace = NameSpaces.NS)
    private HotelRef hotelRef;

    public Criterion() {
    }

    public Criterion(HotelRef hotelRef) {
        this.hotelRef = hotelRef;
    }

    public HotelRef getHotelRef() {
        return hotelRef;
    }

    public void setHotelRef(HotelRef hotelRef) {
        this.hotelRef = hotelRef;
    }
}
