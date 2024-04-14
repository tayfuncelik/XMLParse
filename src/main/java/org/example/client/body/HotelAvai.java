package org.example.client.body;

import org.example.client.header.Pos;
import org.example.common.NameSpaces;
import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "OTA_HotelAvailRQ", namespace = NameSpaces.NS)
@XmlAccessorType(XmlAccessType.FIELD)
public class HotelAvai implements Serializable {
    @XmlAttribute(name = "RequestedCurrency")
    private String requestedCurrency;
    @XmlAttribute(name = "PrimaryLangID")
    private String primaryLangID;
    @XmlElement(name = "POS", namespace = NameSpaces.NS)
    private Pos pos;
    @XmlElement(name = "AvailRequestSegments", namespace = NameSpaces.NS)
    private AvailRequestSegments availRequestSegments;

    public HotelAvai() {
    }

    public HotelAvai(String requestedCurrency, String primaryLangID, Pos pos, AvailRequestSegments availRequestSegments) {
        this.requestedCurrency = requestedCurrency;
        this.primaryLangID = primaryLangID;
        this.pos = pos;
        this.availRequestSegments = availRequestSegments;
    }

    public String getRequestedCurrency() {
        return requestedCurrency;
    }

    public void setRequestedCurrency(String requestedCurrency) {
        this.requestedCurrency = requestedCurrency;
    }

    public String getPrimaryLangID() {
        return primaryLangID;
    }

    public void setPrimaryLangID(String primaryLangID) {
        this.primaryLangID = primaryLangID;
    }

    public Pos getPos() {
        return pos;
    }

    public void setPos(Pos pos) {
        this.pos = pos;
    }

    public AvailRequestSegments getAvailRequestSegments() {
        return availRequestSegments;
    }

    public void setAvailRequestSegments(AvailRequestSegments availRequestSegments) {
        this.availRequestSegments = availRequestSegments;
    }
}
