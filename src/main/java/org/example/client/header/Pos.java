package org.example.client.header;

import org.example.common.NameSpaces;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

@XmlAccessorType(FIELD)
public class Pos {
    @XmlElement(name = "Source", namespace= NameSpaces.NS)
    private Source source;

    public Pos(){}
    public Pos(Source source) {
        this.source = source;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}
