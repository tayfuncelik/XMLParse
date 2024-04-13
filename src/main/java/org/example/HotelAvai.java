package org.example;

//import jakarta.xml.bind.annotation.XmlElement;
//import jakarta.xml.bind.annotation.XmlRootElement;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name="OTA_HotelAvailRQ", namespace="http://www.opentravel.org/OTA/2003/05")
@XmlAccessorType(XmlAccessType.FIELD)
public class HotelAvai implements Serializable {

    @XmlElement(name = "POS", namespace="http://www.opentravel.org/OTA/2003/05")
    private Pos pos;
    @XmlElement(name = "AvailRequestSegments", namespace="http://www.opentravel.org/OTA/2003/05")
    private AvailRequestSegments availRequestSegments;
/*
    public HotelAvai(){}
    public HotelAvai(Pos pos) {
        this.pos = pos;
    }

    public Pos getPos() {
        return pos;
    }

    public void setPos(Pos pos) {
        this.pos = pos;
    }
    public String getAvailRequestSegments() {
        return availRequestSegments;
    }

    public void setAvailRequestSegments(String availRequestSegments) {
        this.availRequestSegments = availRequestSegments;
    }*/
}
