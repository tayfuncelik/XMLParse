package org.example.client;

import org.example.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestorOptions {
    @XmlElement(name = "RequestorOption",namespace = NameSpaces.NS)
    private List<RequestorOption> requestorOption;

}
