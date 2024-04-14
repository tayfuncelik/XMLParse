package org.example.client.body;


import org.example.common.NameSpaces;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;
@XmlAccessorType(FIELD)
public class AvailRequestSegments {
    @XmlElement(name = "AvailRequestSegment", namespace = NameSpaces.NS)
    private AvailRequestSegment availRequestSegment;

    public AvailRequestSegments() {
    }

    public AvailRequestSegments(AvailRequestSegment availRequestSegment) {
        this.availRequestSegment = availRequestSegment;
    }

    public AvailRequestSegment getAvailRequestSegment() {
        return availRequestSegment;
    }

    public void setAvailRequestSegment(AvailRequestSegment availRequestSegment) {
        this.availRequestSegment = availRequestSegment;
    }
}
