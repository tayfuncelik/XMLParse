package org.example.client;

import org.example.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)

public class GuestCounts {
    @XmlElement(name = "GuestCount",namespace = NameSpaces.NS)
    private List<GuestCount> guestCount;

}
