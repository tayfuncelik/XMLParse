package org.example.client.header;

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

    public RequestorID() {

    }

    public RequestorID(String id, String messagePassword) {
        this.id = id;
        this.messagePassword = messagePassword;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessagePassword() {
        return messagePassword;
    }

    public void setMessagePassword(String messagePassword) {
        this.messagePassword = messagePassword;
    }
}
