package org.example.client.body;

import org.example.common.NameSpaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class HotelSearchCriteria {

    @XmlElement(name = "Criterion", namespace = NameSpaces.NS)
    private Criterion criterion;

    public HotelSearchCriteria() {
    }

    public HotelSearchCriteria(Criterion criterion) {
        this.criterion = criterion;
    }

    public Criterion getCriterion() {
        return criterion;
    }

    public void setCriterion(Criterion criterion) {
        this.criterion = criterion;
    }
}
