package org.example.client;

//import jakarta.xml.bind.annotation.XmlElement;
//import jakarta.xml.bind.annotation.XmlRootElement;


import org.example.NameSpaces;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name="OTA_HotelAvailRQ", namespace= NameSpaces.NS)
@XmlAccessorType(XmlAccessType.FIELD)
public class HotelAvai implements Serializable {
    @XmlAttribute(name = "RequestedCurrency")
    private String requestedCurrency;
    @XmlElement(name = "POS",  namespace =NameSpaces.NS)
    private Pos pos;
    @XmlElement(name = "AvailRequestSegments", namespace =NameSpaces.NS)
    private AvailRequestSegments availRequestSegments;

    public HotelAvai(){}
    public HotelAvai(Pos pos) {
        this.pos = pos;
    }

    public String getRequestedCurrency() {
        return requestedCurrency;
    }

    public void setRequestedCurrency(String requestedCurrency) {
        this.requestedCurrency = requestedCurrency;
    }

    public Pos getPos() {
        return pos;
    }

    public void setPos(Pos pos) {
        this.pos = pos;
    }

    public AvailRequestSegments getAvailRequestSegments() {
        return availRequestSegments;
    }

    public void setAvailRequestSegments(AvailRequestSegments availRequestSegments) {
        this.availRequestSegments = availRequestSegments;
    }
}
