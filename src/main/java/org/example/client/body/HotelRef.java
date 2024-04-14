package org.example.client.body;

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

    public HotelRef(){}
    public HotelRef(String hotelCityCode, String hotelCode, String hotelCodeContext) {
        this.hotelCityCode = hotelCityCode;
        this.hotelCode = hotelCode;
        this.hotelCodeContext = hotelCodeContext;
    }

    public String getHotelCityCode() {
        return hotelCityCode;
    }

    public void setHotelCityCode(String hotelCityCode) {
        this.hotelCityCode = hotelCityCode;
    }

    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }

    public String getHotelCodeContext() {
        return hotelCodeContext;
    }

    public void setHotelCodeContext(String hotelCodeContext) {
        this.hotelCodeContext = hotelCodeContext;
    }
}
