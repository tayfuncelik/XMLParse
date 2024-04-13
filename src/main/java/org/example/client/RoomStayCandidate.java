package org.example.client;

import org.example.NameSpaces;
import org.example.client.GuestCounts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class RoomStayCandidate {
    @XmlAttribute(name = "Quantity")
    private String quantity;
    @XmlAttribute(name = "RPH")
    private String rph;
    @XmlElement(name = "GuestCounts", namespace = NameSpaces.NS)
    private GuestCounts guestCounts;

}
