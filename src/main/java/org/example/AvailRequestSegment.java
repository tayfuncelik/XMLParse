package org.example;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)

public class AvailRequestSegment {
    @XmlElement(name = "StayDateRange")

    public StayDateRange StayDateRange;
}
