package org.example.client.body;

import org.example.common.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class GuestCounts {
    @XmlElement(name = "GuestCount", namespace = NameSpaces.NS)
    private List<GuestCount> guestCountList;

    public GuestCounts() {
    }

    public GuestCounts(List<GuestCount> guestCountList) {
        this.guestCountList = guestCountList;
    }

    public List<GuestCount> getGuestCountList() {
        return guestCountList;
    }

    public void setGuestCountList(List<GuestCount> guestCountList) {
        this.guestCountList = guestCountList;
    }
}
