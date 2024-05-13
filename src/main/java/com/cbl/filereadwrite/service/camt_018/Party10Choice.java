
package com.cbl.filereadwrite.service.camt_018;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Party10Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Party10Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="OrgId" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}OrganisationIdentification7"/&gt;
 *         &lt;element name="PrvtId" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}PersonIdentification5"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party10Choice", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", propOrder = {
    "orgId",
    "prvtId"
})
public class Party10Choice {

    @XmlElement(name = "OrgId", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01")
    protected OrganisationIdentification7 orgId;
    @XmlElement(name = "PrvtId", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01")
    protected PersonIdentification5 prvtId;

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification7 }
     *     
     */
    public OrganisationIdentification7 getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification7 }
     *     
     */
    public void setOrgId(OrganisationIdentification7 value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the prvtId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification5 }
     *     
     */
    public PersonIdentification5 getPrvtId() {
        return prvtId;
    }

    /**
     * Sets the value of the prvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification5 }
     *     
     */
    public void setPrvtId(PersonIdentification5 value) {
        this.prvtId = value;
    }

}
