package org.example.output.header;

import org.example.common.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class Nonce {
    @XmlAttribute(name = "EncodingType")
    private String encodingType;
    @XmlValue
    private String value;

    public Nonce() {
    }

    public Nonce(String encodingType, String value) {
        this.encodingType = encodingType;
        this.value = value;
    }

    public String getEncodingType() {
        return encodingType;
    }

    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
