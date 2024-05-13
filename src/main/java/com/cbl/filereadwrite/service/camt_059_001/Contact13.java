
package com.cbl.filereadwrite.service.camt_059_001;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Contact13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact13"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NmPrfx" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}NamePrefix2Code" minOccurs="0"/&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="PhneNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="MobNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="FaxNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max2048Text" minOccurs="0"/&gt;
 *         &lt;element name="EmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="EmailPurp" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="JobTitl" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Rspnsblty" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Dept" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}OtherContact1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrefrdMtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}PreferredContactMethod2Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact13", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08", propOrder = {
    "nmPrfx",
    "nm",
    "phneNb",
    "mobNb",
    "faxNb",
    "urlAdr",
    "emailAdr",
    "emailPurp",
    "jobTitl",
    "rspnsblty",
    "dept",
    "othr",
    "prefrdMtd"
})
public class Contact13 {

    @XmlElement(name = "NmPrfx", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    @XmlSchemaType(name = "string")
    protected NamePrefix2Code nmPrfx;
    @XmlElement(name = "Nm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String nm;
    @XmlElement(name = "PhneNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String phneNb;
    @XmlElement(name = "MobNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String mobNb;
    @XmlElement(name = "FaxNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String faxNb;
    @XmlElement(name = "URLAdr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String urlAdr;
    @XmlElement(name = "EmailAdr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String emailAdr;
    @XmlElement(name = "EmailPurp", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String emailPurp;
    @XmlElement(name = "JobTitl", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String jobTitl;
    @XmlElement(name = "Rspnsblty", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String rspnsblty;
    @XmlElement(name = "Dept", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String dept;
    @XmlElement(name = "Othr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected List<OtherContact1> othr;
    @XmlElement(name = "PrefrdMtd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    @XmlSchemaType(name = "string")
    protected PreferredContactMethod2Code prefrdMtd;

    /**
     * Gets the value of the nmPrfx property.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefix2Code }
     *     
     */
    public NamePrefix2Code getNmPrfx() {
        return nmPrfx;
    }

    /**
     * Sets the value of the nmPrfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefix2Code }
     *     
     */
    public void setNmPrfx(NamePrefix2Code value) {
        this.nmPrfx = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the phneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhneNb() {
        return phneNb;
    }

    /**
     * Sets the value of the phneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhneNb(String value) {
        this.phneNb = value;
    }

    /**
     * Gets the value of the mobNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobNb() {
        return mobNb;
    }

    /**
     * Sets the value of the mobNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobNb(String value) {
        this.mobNb = value;
    }

    /**
     * Gets the value of the faxNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNb() {
        return faxNb;
    }

    /**
     * Sets the value of the faxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNb(String value) {
        this.faxNb = value;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLAdr(String value) {
        this.urlAdr = value;
    }

    /**
     * Gets the value of the emailAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAdr() {
        return emailAdr;
    }

    /**
     * Sets the value of the emailAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAdr(String value) {
        this.emailAdr = value;
    }

    /**
     * Gets the value of the emailPurp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPurp() {
        return emailPurp;
    }

    /**
     * Sets the value of the emailPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPurp(String value) {
        this.emailPurp = value;
    }

    /**
     * Gets the value of the jobTitl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitl() {
        return jobTitl;
    }

    /**
     * Sets the value of the jobTitl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitl(String value) {
        this.jobTitl = value;
    }

    /**
     * Gets the value of the rspnsblty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnsblty() {
        return rspnsblty;
    }

    /**
     * Sets the value of the rspnsblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspnsblty(String value) {
        this.rspnsblty = value;
    }

    /**
     * Gets the value of the dept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * Sets the value of the dept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept(String value) {
        this.dept = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the javax XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherContact1 }
     * 
     * 
     */
    public List<OtherContact1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<OtherContact1>();
        }
        return this.othr;
    }

    /**
     * Gets the value of the prefrdMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredContactMethod2Code }
     *     
     */
    public PreferredContactMethod2Code getPrefrdMtd() {
        return prefrdMtd;
    }

    /**
     * Sets the value of the prefrdMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredContactMethod2Code }
     *     
     */
    public void setPrefrdMtd(PreferredContactMethod2Code value) {
        this.prefrdMtd = value;
    }

}
