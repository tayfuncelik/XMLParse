package org.example;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

//@XmlType(propOrder={"title", "book", "count", "testData"})
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
