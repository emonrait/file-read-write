
package com.cbl.filereadwrite.service.camt_059_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentType1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CdOrPrtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}DocumentType2Choice"/&gt;
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08", propOrder = {
    "cdOrPrtry",
    "issr"
})
public class DocumentType1 {

    @XmlElement(name = "CdOrPrtry", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08", required = true)
    protected DocumentType2Choice cdOrPrtry;
    @XmlElement(name = "Issr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String issr;

    /**
     * Gets the value of the cdOrPrtry property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType2Choice }
     *     
     */
    public DocumentType2Choice getCdOrPrtry() {
        return cdOrPrtry;
    }

    /**
     * Sets the value of the cdOrPrtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType2Choice }
     *     
     */
    public void setCdOrPrtry(DocumentType2Choice value) {
        this.cdOrPrtry = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssr(String value) {
        this.issr = value;
    }

}
