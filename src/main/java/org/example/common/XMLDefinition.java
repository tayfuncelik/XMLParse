package org.example.common;

import javax.xml.soap.*;
import java.io.IOException;
import java.io.OutputStream;

public class XMLDefinition {
    private SOAPBody body;
    private SOAPHeader header;
    private SOAPMessage soapMessage;

    public XMLDefinition() throws SOAPException {
        MessageFactory mf = MessageFactory.newInstance();
        SOAPMessage soapMsg = mf.createMessage();
        setSoapMessage(soapMsg);
        SOAPPart part = soapMsg.getSOAPPart();
        SOAPEnvelope envelope = part.getEnvelope();
        setBody(soapMsg.getSOAPBody());
        setHeader(envelope.getHeader());
        envelope.addNamespaceDeclaration("oas1", NameSpaces.OAS1);
        envelope.addNamespaceDeclaration("oas", NameSpaces.OAS);
        envelope.addNamespaceDeclaration("add", NameSpaces.ADD);
    }

    public SOAPBody getBody() {
        return body;
    }

    public void setBody(SOAPBody body) {
        this.body = body;
    }

    public SOAPHeader getHeader() {
        return header;
    }

    public void setHeader(SOAPHeader header) {
        this.header = header;
    }

    public SOAPMessage getSoapMessage() {
        return soapMessage;
    }

    public void setSoapMessage(SOAPMessage soapMessage) {
        this.soapMessage = soapMessage;
    }

    public void writeMessage(OutputStream fOut) throws SOAPException, IOException {
        getSoapMessage().writeTo(fOut);
    }
}
