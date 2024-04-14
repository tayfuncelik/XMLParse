package org.example.output.header;

import org.example.common.NameSpaces;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Security",namespace = NameSpaces.OAS)
public class Security {

    @XmlElement(name = "UsernameToken",namespace = NameSpaces.OAS)
    private UsernameToken usernameToken;

    public UsernameToken getUsernameToken() {
        return usernameToken;
    }

    public void setUsernameToken(UsernameToken usernameToken) {
        this.usernameToken = usernameToken;
    }
}
