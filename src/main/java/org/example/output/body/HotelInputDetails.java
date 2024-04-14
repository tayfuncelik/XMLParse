package org.example.output.body;

import org.example.common.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
public class HotelInputDetails {
    @XmlAttribute(name = "chainCode")
    private String chainCode;
    @XmlAttribute(name = "hotelId")
    private String hotelId;
    @XmlAttribute(name = "locationCode")
    private String locationCode;

    public HotelInputDetails() {
    }

    public HotelInputDetails(String chainCode, String hotelId, String locationCode) {
        this.chainCode = chainCode;
        this.hotelId = hotelId;
        this.locationCode = locationCode;
    }

    public String getChainCode() {
        return chainCode;
    }

    public void setChainCode(String chainCode) {
        this.chainCode = chainCode;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }
}
