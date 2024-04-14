package org.example.output.body;

import org.example.common.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD)
public class Rooms {
    @XmlAttribute(name = "numberOfChildren")
    private String numberOfChildren;
    @XmlAttribute(name = "uniqueRoomGroups")
    private String uniqueRoomGroups;

    @XmlElement(name = "room")
    private List<Room> room;

    public Rooms(){

    }
    public Rooms(String uniqueRoomGroups, String numberOfChildren, List<Room> room) {
        this.uniqueRoomGroups = uniqueRoomGroups;
        this.numberOfChildren = numberOfChildren;
        this.room = room;
    }

    public String getUniqueRoomGroups() {
        return uniqueRoomGroups;
    }

    public void setUniqueRoomGroups(String uniqueRoomGroups) {
        this.uniqueRoomGroups = uniqueRoomGroups;
    }

    public String getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(String numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public List<Room> getRoom() {
        return room;
    }

    public void setRoom(List<Room> room) {
        this.room = room;
    }
}
