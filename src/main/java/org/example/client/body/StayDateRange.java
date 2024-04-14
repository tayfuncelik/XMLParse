package org.example.client.body;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class StayDateRange {

    @XmlAttribute(name = "End")
    private String end;
    @XmlAttribute(name = "Start")
    private String start;

    public StayDateRange(){

    }
    public StayDateRange(String end, String start) {
        this.end = end;
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }
}
