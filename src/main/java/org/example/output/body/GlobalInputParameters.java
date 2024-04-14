package org.example.output.body;

import org.example.common.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
public class GlobalInputParameters {
    @XmlElement(name = "hotelInputDetails")
    private HotelInputDetails hotelInputDetails;
    @XmlElement(name = "hotelStayDuration")
    private HotelStayDuration hotelStayDuration;

    public GlobalInputParameters() {
    }

    public GlobalInputParameters(HotelInputDetails hotelInputDetails, HotelStayDuration hotelStayDuration) {
        this.hotelInputDetails = hotelInputDetails;
        this.hotelStayDuration = hotelStayDuration;
    }

    public HotelInputDetails getHotelInputDetails() {
        return hotelInputDetails;
    }

    public void setHotelInputDetails(HotelInputDetails hotelInputDetails) {
        this.hotelInputDetails = hotelInputDetails;
    }

    public HotelStayDuration getHotelStayDuration() {
        return hotelStayDuration;
    }

    public void setHotelStayDuration(HotelStayDuration hotelStayDuration) {
        this.hotelStayDuration = hotelStayDuration;
    }
}
