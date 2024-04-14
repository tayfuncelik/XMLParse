package org.example.output.body;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotelStayDuration")

public class HotelStayDuration {
    @XmlAttribute(name = "numberOfNights")
    private long numberOfNights;
    @XmlAttribute(name = "startDate")
    private String startDate;

    public HotelStayDuration() {
    }

    public HotelStayDuration(long numberOfNights, String startDate) {
        this.numberOfNights = numberOfNights;
        this.startDate = startDate;
    }

    public long getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(long numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
