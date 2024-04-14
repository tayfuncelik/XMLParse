package org.example.client.header;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestorOption")
public class RequestorOption {
    @XmlAttribute(name = "Name")
    private String name;
    @XmlAttribute(name = "Value")
    private String value;

    public RequestorOption() {
    }

    public RequestorOption(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
