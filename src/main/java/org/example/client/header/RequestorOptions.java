package org.example.client.header;

import org.example.common.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class RequestorOptions {
    @XmlElement(name = "RequestorOption", namespace = NameSpaces.NS)
    private List<RequestorOption> requestorOption;

    public RequestorOptions() {

    }

    public RequestorOptions(List<RequestorOption> requestorOption) {
        this.requestorOption = requestorOption;
    }

    public List<RequestorOption> getRequestorOption() {
        return requestorOption;
    }

    public void setRequestorOption(List<RequestorOption> requestorOption) {
        this.requestorOption = requestorOption;
    }
}
