package org.example.output.body;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Room {
    @XmlAttribute(name = "numberOfRooms")
    private Integer numberOfRooms;
    @XmlAttribute(name = "numberOfAdults")
    private Integer numberOfAdults;

    public Room() {
    }

    public Room(Integer numberOfRooms, Integer numberOfAdults) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfAdults = numberOfAdults;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Integer getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(Integer numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }
}
