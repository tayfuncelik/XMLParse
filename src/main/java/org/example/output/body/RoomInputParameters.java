package org.example.output.body;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class RoomInputParameters {

    @XmlAttribute(name = "uniqueRoomGroups")
    private Integer uniqueRoomGroups;
    @XmlAttribute(name = "numberOfChildren")
    private Integer numberOfChildren;
    @XmlElement(name = "rooms")
    private Rooms rooms;

    public RoomInputParameters(){}

    public RoomInputParameters(Integer uniqueRoomGroups, Integer numberOfChildren, Rooms rooms) {
        this.uniqueRoomGroups = uniqueRoomGroups;
        this.numberOfChildren = numberOfChildren;
        this.rooms = rooms;
    }

    public Integer getUniqueRoomGroups() {
        return uniqueRoomGroups;
    }

    public void setUniqueRoomGroups(Integer uniqueRoomGroups) {
        this.uniqueRoomGroups = uniqueRoomGroups;
    }

    public Integer getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(Integer numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public Rooms getRooms() {
        return rooms;
    }

    public void setRooms(Rooms rooms) {
        this.rooms = rooms;
    }
}
