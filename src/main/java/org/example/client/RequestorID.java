package org.example.client;

//import jakarta.xml.bind.annotation.XmlAttribute;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

@XmlAccessorType(FIELD)
public class RequestorID {
    @XmlAttribute(name = "ID")
    private String id;
    @XmlAttribute(name = "MessagePassword")
    private String messagePassword;

}
