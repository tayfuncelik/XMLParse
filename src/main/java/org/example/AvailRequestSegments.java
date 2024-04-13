package org.example;


import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

@XmlAccessorType(FIELD)
public class AvailRequestSegments {
    @XmlElement(name = "AvailRequestSegment", namespace = "http://www.opentravel.org/OTA/2003/05")
    public AvailRequestSegment availRequestSegment;

}
