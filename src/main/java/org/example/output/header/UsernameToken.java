package org.example.output.header;

import org.example.common.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class UsernameToken {
    @XmlAttribute(name = "Id", namespace = NameSpaces.OAS1)
    private String Id;
    @XmlElement(name = "Username",namespace = NameSpaces.OAS)
    private String username;
    @XmlElement(name = "Nonce",namespace = NameSpaces.OAS)
    private Nonce nonce;
    @XmlElement(name = "Password",namespace = NameSpaces.OAS)
    private Password password;
    @XmlElement(name = "Created",namespace = NameSpaces.OAS1)
    private String created;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Nonce getNonce() {
        return nonce;
    }

    public void setNonce(Nonce nonce) {
        this.nonce = nonce;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
