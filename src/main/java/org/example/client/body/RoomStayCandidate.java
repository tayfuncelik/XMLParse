package org.example.client.body;

import org.example.common.NameSpaces;

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

    public RoomStayCandidate() {
    }

    public RoomStayCandidate(String quantity, String rph, GuestCounts guestCounts) {
        this.quantity = quantity;
        this.rph = rph;
        this.guestCounts = guestCounts;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getRph() {
        return rph;
    }

    public void setRph(String rph) {
        this.rph = rph;
    }

    public GuestCounts getGuestCounts() {
        return guestCounts;
    }

    public void setGuestCounts(GuestCounts guestCounts) {
        this.guestCounts = guestCounts;
    }
}
