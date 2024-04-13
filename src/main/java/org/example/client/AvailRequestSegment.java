package org.example.client;


import org.example.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)

public class AvailRequestSegment {
    @XmlElement(name = "StayDateRange",namespace = NameSpaces.NS)
    private org.example.client.StayDateRange StayDateRange;
    @XmlElement(name = "RoomStayCandidates", namespace = NameSpaces.NS)
    private RoomStayCandidates roomStayCandidates;
    @XmlElement(name = "HotelSearchCriteria", namespace = NameSpaces.NS)
    private HotelSearchCriteria hotelSearchCriteria;
}
