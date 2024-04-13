package org.example;

//import jakarta.xml.bind.annotation.XmlAttribute;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

@XmlAccessorType(FIELD)
public class RequestorID {
    @XmlAttribute(name = "ID", namespace="http://www.opentravel.org/OTA/2003/05")
    public String id;
    @XmlAttribute(name = "MessagePassword", namespace="http://www.opentravel.org/OTA/2003/05")
    public String messagePassword;

  //  private String messagePassword;

    public RequestorID(){}
    public RequestorID(String id, String messagePassword) {
        this.id = id;
        this.messagePassword = messagePassword;
    }
}
