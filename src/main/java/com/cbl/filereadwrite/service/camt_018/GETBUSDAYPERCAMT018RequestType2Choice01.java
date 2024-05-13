
package com.cbl.filereadwrite.service.camt_018;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GETBUSDAYPERCAMT018RequestType2Choice01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GETBUSDAYPERCAMT018RequestType2Choice01"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="PmtCtrl" type="{urn:swift:xsd:camt.018.001.03}RequestType1Code"/&gt;
 *           &lt;element name="Enqry" type="{urn:swift:xsd:camt.018.001.03}RequestType2Code"/&gt;
 *           &lt;element name="Prtry" type="{urn:swift:xsd:camt.018.001.03}GenericIdentification1"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GETBUSDAYPERCAMT018RequestType2Choice01", namespace = "urn:swift:xsd:camt.018.001.03", propOrder = {
    "pmtCtrl",
    "enqry",
    "prtry"
})
public class GETBUSDAYPERCAMT018RequestType2Choice01 {

    @XmlElement(name = "PmtCtrl", namespace = "urn:swift:xsd:camt.018.001.03")
    @XmlSchemaType(name = "string")
    protected RequestType1Code pmtCtrl;
    @XmlElement(name = "Enqry", namespace = "urn:swift:xsd:camt.018.001.03")
    @XmlSchemaType(name = "string")
    protected RequestType2Code enqry;
    @XmlElement(name = "Prtry", namespace = "urn:swift:xsd:camt.018.001.03")
    protected GenericIdentification1 prtry;

    /**
     * Gets the value of the pmtCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType1Code }
     *     
     */
    public RequestType1Code getPmtCtrl() {
        return pmtCtrl;
    }

    /**
     * Sets the value of the pmtCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType1Code }
     *     
     */
    public void setPmtCtrl(RequestType1Code value) {
        this.pmtCtrl = value;
    }

    /**
     * Gets the value of the enqry property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType2Code }
     *     
     */
    public RequestType2Code getEnqry() {
        return enqry;
    }

    /**
     * Sets the value of the enqry property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType2Code }
     *     
     */
    public void setEnqry(RequestType2Code value) {
        this.enqry = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setPrtry(GenericIdentification1 value) {
        this.prtry = value;
    }

}
