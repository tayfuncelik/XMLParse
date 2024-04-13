package org.example.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestCount")
public class GuestCount {
    @XmlAttribute(name = "AgeQualifyingCode")
    private String ageQualifyingCode;
    @XmlAttribute(name = "Count")
    private String count;
}
