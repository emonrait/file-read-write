
package com.cbl.filereadwrite.service.camt_059_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditorReferenceInformation3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditorReferenceInformation3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}CreditorReferenceType3" minOccurs="0"/&gt;
 *         &lt;element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorReferenceInformation3", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08", propOrder = {
    "tp",
    "ref"
})
public class CreditorReferenceInformation3 {

    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected CreditorReferenceType3 tp;
    @XmlElement(name = "Ref", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String ref;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceType3 }
     *     
     */
    public CreditorReferenceType3 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceType3 }
     *     
     */
    public void setTp(CreditorReferenceType3 value) {
        this.tp = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

}
