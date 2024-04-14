package org.example.client.body;

import org.example.common.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class RoomStayCandidates {

    @XmlElement(name = "RoomStayCandidate", namespace = NameSpaces.NS)
    private List<RoomStayCandidate> roomStayCandidateList;

    public RoomStayCandidates() {
    }

    public RoomStayCandidates(List<RoomStayCandidate> roomStayCandidateList) {
        this.roomStayCandidateList = roomStayCandidateList;
    }

    public List<RoomStayCandidate> getRoomStayCandidateList() {
        return roomStayCandidateList;
    }

    public void setRoomStayCandidateList(List<RoomStayCandidate> roomStayCandidateList) {
        this.roomStayCandidateList = roomStayCandidateList;
    }
}
