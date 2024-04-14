package org.example.client.body;


import org.example.common.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class AvailRequestSegment {
    @XmlElement(name = "StayDateRange", namespace = NameSpaces.NS)
    private StayDateRange stayDateRange;
    @XmlElement(name = "RoomStayCandidates", namespace = NameSpaces.NS)
    private RoomStayCandidates roomStayCandidates;
    @XmlElement(name = "HotelSearchCriteria", namespace = NameSpaces.NS)
    private HotelSearchCriteria hotelSearchCriteria;

    public AvailRequestSegment(){}
    public AvailRequestSegment(StayDateRange stayDateRange, RoomStayCandidates roomStayCandidates, HotelSearchCriteria hotelSearchCriteria) {
        this.stayDateRange = stayDateRange;
        this.roomStayCandidates = roomStayCandidates;
        this.hotelSearchCriteria = hotelSearchCriteria;
    }

    public StayDateRange getStayDateRange() {
        return stayDateRange;
    }

    public void setStayDateRange(StayDateRange stayDateRange) {
        this.stayDateRange = stayDateRange;
    }

    public RoomStayCandidates getRoomStayCandidates() {
        return roomStayCandidates;
    }

    public void setRoomStayCandidates(RoomStayCandidates roomStayCandidates) {
        this.roomStayCandidates = roomStayCandidates;
    }

    public HotelSearchCriteria getHotelSearchCriteria() {
        return hotelSearchCriteria;
    }

    public void setHotelSearchCriteria(HotelSearchCriteria hotelSearchCriteria) {
        this.hotelSearchCriteria = hotelSearchCriteria;
    }
}
