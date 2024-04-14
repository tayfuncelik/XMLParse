package org.example.client.header;

import org.example.client.header.RequestorID;
import org.example.client.header.RequestorOptions;
import org.example.common.NameSpaces;

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
    @XmlElement(name = "RequestorID", namespace = NameSpaces.NS)
    private RequestorID requestorID;
    @XmlElement(name = "RequestorOptions", namespace = NameSpaces.NS)
    private RequestorOptions requestorOptions;

    public Source() {
    }

    public Source(RequestorID requestorID, RequestorOptions requestorOptions) {
        this.requestorID = requestorID;
        this.requestorOptions = requestorOptions;
    }

    public RequestorID getRequestorID() {
        return requestorID;
    }

    public void setRequestorID(RequestorID requestorID) {
        this.requestorID = requestorID;
    }

    public RequestorOptions getRequestorOptions() {
        return requestorOptions;
    }

    public void setRequestorOptions(RequestorOptions requestorOptions) {
        this.requestorOptions = requestorOptions;
    }
}
