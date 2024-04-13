package org.example.client;


import org.example.NameSpaces;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

@XmlAccessorType(FIELD)
public class AvailRequestSegments {
    @XmlElement(name = "AvailRequestSegment", namespace = NameSpaces.NS)
    private AvailRequestSegment availRequestSegment;




}
