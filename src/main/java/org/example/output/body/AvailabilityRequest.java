package org.example.output.body;

import org.example.common.NameSpaces;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "availabilityRequest")
public class AvailabilityRequest {
    @XmlAttribute(name = "inputCurrency")
    private String inputCurrency;
    @XmlAttribute(name = "inputLanguageCode")
    private String inputLanguageCode;
    @XmlElement(name = "globalInputParameters")
    private GlobalInputParameters globalInputParameters;
    @XmlElement(name = "roomInputParameters")
    private RoomInputParameters roomInputParameters;

    public AvailabilityRequest() {
    }

    public AvailabilityRequest(String inputCurrency, String inputLanguageCode, GlobalInputParameters globalInputParameters, RoomInputParameters roomInputParameters) {
        this.inputCurrency = inputCurrency;
        this.inputLanguageCode = inputLanguageCode;
        this.globalInputParameters = globalInputParameters;
        this.roomInputParameters = roomInputParameters;
    }

    public GlobalInputParameters getGlobalInputParameters() {
        return globalInputParameters;
    }

    public void setGlobalInputParameters(GlobalInputParameters globalInputParameters) {
        this.globalInputParameters = globalInputParameters;
    }

    public RoomInputParameters getRoomInputParameters() {
        return roomInputParameters;
    }

    public void setRoomInputParameters(RoomInputParameters roomInputParameters) {
        this.roomInputParameters = roomInputParameters;
    }

    public String getInputCurrency() {
        return inputCurrency;
    }

    public void setInputCurrency(String inputCurrency) {
        this.inputCurrency = inputCurrency;
    }

    public String getInputLanguageCode() {
        return inputLanguageCode;
    }

    public void setInputLanguageCode(String inputLanguageCode) {
        this.inputLanguageCode = inputLanguageCode;
    }
}
