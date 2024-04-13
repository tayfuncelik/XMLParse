package org.example.client;

import org.example.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class HotelSearchCriteria {

    @XmlElement(name = "Criterion", namespace = NameSpaces.NS)
    private Criterion criterion;
}
