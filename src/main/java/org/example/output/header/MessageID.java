package org.example.output.header;

import org.example.common.NameSpaces;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "MessageID",namespace = NameSpaces.ADD)
public class MessageID {
    @XmlValue
    private String value;

    public MessageID(){}
    public MessageID(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
