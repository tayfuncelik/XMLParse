package org.example.client;

import org.example.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Source", propOrder = {
        "requestorID",
        "requestorOptions"
})
public class Source {
    @XmlElement(name = "RequestorID", namespace= NameSpaces.NS)
    private RequestorID requestorID;
    @XmlElement(name = "RequestorOptions", namespace=NameSpaces.NS)
    private RequestorOptions requestorOptions;

}
