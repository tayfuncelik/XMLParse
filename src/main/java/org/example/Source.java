package org.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Source", propOrder = {
        "requestorID"
})
public class Source {
    @XmlElement(name = "RequestorID", namespace="http://www.opentravel.org/OTA/2003/05")
    public RequestorID requestorID;
   // private List<RequestorOption> requestorOptions;

    //@Embedded
   // @XmlElement(name = "RequestorOptions")
    //protected List<RequestorOption> requestorOptions;

    public Source(){

    }
    public Source(RequestorID requestorID) {
        this.requestorID = requestorID;
    }
}
