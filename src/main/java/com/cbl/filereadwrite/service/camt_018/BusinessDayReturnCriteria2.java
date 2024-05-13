
package com.cbl.filereadwrite.service.camt_018;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDayReturnCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessDayReturnCriteria2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SysDtInd" type="{urn:swift:xsd:camt.018.001.03}RequestedIndicator" minOccurs="0"/&gt;
 *         &lt;element name="SysStsInd" type="{urn:swift:xsd:camt.018.001.03}RequestedIndicator" minOccurs="0"/&gt;
 *         &lt;element name="SysCcyInd" type="{urn:swift:xsd:camt.018.001.03}RequestedIndicator" minOccurs="0"/&gt;
 *         &lt;element name="ClsrPrdInd" type="{urn:swift:xsd:camt.018.001.03}RequestedIndicator" minOccurs="0"/&gt;
 *         &lt;element name="EvtInd" type="{urn:swift:xsd:camt.018.001.03}RequestedIndicator" minOccurs="0"/&gt;
 *         &lt;element name="SsnPrdInd" type="{urn:swift:xsd:camt.018.001.03}RequestedIndicator" minOccurs="0"/&gt;
 *         &lt;element name="EvtTpInd" type="{urn:swift:xsd:camt.018.001.03}RequestedIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDayReturnCriteria2", namespace = "urn:swift:xsd:camt.018.001.03", propOrder = {
    "sysDtInd",
    "sysStsInd",
    "sysCcyInd",
    "clsrPrdInd",
    "evtInd",
    "ssnPrdInd",
    "evtTpInd"
})
public class BusinessDayReturnCriteria2 {

    @XmlElement(name = "SysDtInd", namespace = "urn:swift:xsd:camt.018.001.03")
    protected Boolean sysDtInd;
    @XmlElement(name = "SysStsInd", namespace = "urn:swift:xsd:camt.018.001.03")
    protected Boolean sysStsInd;
    @XmlElement(name = "SysCcyInd", namespace = "urn:swift:xsd:camt.018.001.03")
    protected Boolean sysCcyInd;
    @XmlElement(name = "ClsrPrdInd", namespace = "urn:swift:xsd:camt.018.001.03")
    protected Boolean clsrPrdInd;
    @XmlElement(name = "EvtInd", namespace = "urn:swift:xsd:camt.018.001.03")
    protected Boolean evtInd;
    @XmlElement(name = "SsnPrdInd", namespace = "urn:swift:xsd:camt.018.001.03")
    protected Boolean ssnPrdInd;
    @XmlElement(name = "EvtTpInd", namespace = "urn:swift:xsd:camt.018.001.03")
    protected Boolean evtTpInd;

    /**
     * Gets the value of the sysDtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSysDtInd() {
        return sysDtInd;
    }

    /**
     * Sets the value of the sysDtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSysDtInd(Boolean value) {
        this.sysDtInd = value;
    }

    /**
     * Gets the value of the sysStsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSysStsInd() {
        return sysStsInd;
    }

    /**
     * Sets the value of the sysStsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSysStsInd(Boolean value) {
        this.sysStsInd = value;
    }

    /**
     * Gets the value of the sysCcyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSysCcyInd() {
        return sysCcyInd;
    }

    /**
     * Sets the value of the sysCcyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSysCcyInd(Boolean value) {
        this.sysCcyInd = value;
    }

    /**
     * Gets the value of the clsrPrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClsrPrdInd() {
        return clsrPrdInd;
    }

    /**
     * Sets the value of the clsrPrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClsrPrdInd(Boolean value) {
        this.clsrPrdInd = value;
    }

    /**
     * Gets the value of the evtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEvtInd() {
        return evtInd;
    }

    /**
     * Sets the value of the evtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEvtInd(Boolean value) {
        this.evtInd = value;
    }

    /**
     * Gets the value of the ssnPrdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSsnPrdInd() {
        return ssnPrdInd;
    }

    /**
     * Sets the value of the ssnPrdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSsnPrdInd(Boolean value) {
        this.ssnPrdInd = value;
    }

    /**
     * Gets the value of the evtTpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEvtTpInd() {
        return evtTpInd;
    }

    /**
     * Sets the value of the evtTpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEvtTpInd(Boolean value) {
        this.evtTpInd = value;
    }

}
