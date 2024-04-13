package org.example.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class StayDateRange {

    @XmlAttribute(name = "End")
    private String end;
    @XmlAttribute(name = "Start")
    private String start;

}
