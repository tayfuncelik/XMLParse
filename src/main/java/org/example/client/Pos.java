package org.example.client;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

@XmlAccessorType(FIELD)
public class Pos {
    @XmlElement(name = "Source", namespace="http://www.opentravel.org/OTA/2003/05")
    public Source source;

    public Pos(){}
    public Pos(Source source) {
        this.source = source;
    }

    //@XmlElement(name = "Source")
}
