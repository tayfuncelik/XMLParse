package org.example.client.body;

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

    public GuestCount() {
    }

    public GuestCount(String ageQualifyingCode, String count) {
        this.ageQualifyingCode = ageQualifyingCode;
        this.count = count;
    }

    public String getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    public void setAgeQualifyingCode(String ageQualifyingCode) {
        this.ageQualifyingCode = ageQualifyingCode;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
