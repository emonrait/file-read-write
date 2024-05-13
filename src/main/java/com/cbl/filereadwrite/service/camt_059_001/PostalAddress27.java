
package com.cbl.filereadwrite.service.camt_059_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PostalAddress27 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalAddress27"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdrTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}AddressType3Choice" minOccurs="0"/&gt;
 *         &lt;element name="CareOf" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="Dept" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="SubDept" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="StrtNm" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="BldgNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max16Text" minOccurs="0"/&gt;
 *         &lt;element name="BldgNm" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="Flr" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="UnitNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max16Text" minOccurs="0"/&gt;
 *         &lt;element name="PstBx" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max16Text" minOccurs="0"/&gt;
 *         &lt;element name="Room" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="PstCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max16Text" minOccurs="0"/&gt;
 *         &lt;element name="TwnNm" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="TwnLctnNm" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="DstrctNm" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="CtrySubDvsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="AdrLine" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}Max70Text" maxOccurs="7" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress27", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08", propOrder = {
    "adrTp",
    "careOf",
    "dept",
    "subDept",
    "strtNm",
    "bldgNb",
    "bldgNm",
    "flr",
    "unitNb",
    "pstBx",
    "room",
    "pstCd",
    "twnNm",
    "twnLctnNm",
    "dstrctNm",
    "ctrySubDvsn",
    "ctry",
    "adrLine"
})
public class PostalAddress27 {

    @XmlElement(name = "AdrTp", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected AddressType3Choice adrTp;
    @XmlElement(name = "CareOf", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String careOf;
    @XmlElement(name = "Dept", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String dept;
    @XmlElement(name = "SubDept", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String subDept;
    @XmlElement(name = "StrtNm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String strtNm;
    @XmlElement(name = "BldgNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String bldgNb;
    @XmlElement(name = "BldgNm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String bldgNm;
    @XmlElement(name = "Flr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String flr;
    @XmlElement(name = "UnitNb", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String unitNb;
    @XmlElement(name = "PstBx", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String pstBx;
    @XmlElement(name = "Room", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String room;
    @XmlElement(name = "PstCd", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String pstCd;
    @XmlElement(name = "TwnNm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String twnNm;
    @XmlElement(name = "TwnLctnNm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String twnLctnNm;
    @XmlElement(name = "DstrctNm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String dstrctNm;
    @XmlElement(name = "CtrySubDvsn", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String ctrySubDvsn;
    @XmlElement(name = "Ctry", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected String ctry;
    @XmlElement(name = "AdrLine", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected List<String> adrLine;

    /**
     * Gets the value of the adrTp property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType3Choice }
     *     
     */
    public AddressType3Choice getAdrTp() {
        return adrTp;
    }

    /**
     * Sets the value of the adrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType3Choice }
     *     
     */
    public void setAdrTp(AddressType3Choice value) {
        this.adrTp = value;
    }

    /**
     * Gets the value of the careOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareOf() {
        return careOf;
    }

    /**
     * Sets the value of the careOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareOf(String value) {
        this.careOf = value;
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
     * Gets the value of the subDept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDept() {
        return subDept;
    }

    /**
     * Sets the value of the subDept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDept(String value) {
        this.subDept = value;
    }

    /**
     * Gets the value of the strtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtNm() {
        return strtNm;
    }

    /**
     * Sets the value of the strtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrtNm(String value) {
        this.strtNm = value;
    }

    /**
     * Gets the value of the bldgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgNb() {
        return bldgNb;
    }

    /**
     * Sets the value of the bldgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldgNb(String value) {
        this.bldgNb = value;
    }

    /**
     * Gets the value of the bldgNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgNm() {
        return bldgNm;
    }

    /**
     * Sets the value of the bldgNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldgNm(String value) {
        this.bldgNm = value;
    }

    /**
     * Gets the value of the flr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlr() {
        return flr;
    }

    /**
     * Sets the value of the flr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlr(String value) {
        this.flr = value;
    }

    /**
     * Gets the value of the unitNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitNb() {
        return unitNb;
    }

    /**
     * Sets the value of the unitNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitNb(String value) {
        this.unitNb = value;
    }

    /**
     * Gets the value of the pstBx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstBx() {
        return pstBx;
    }

    /**
     * Sets the value of the pstBx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstBx(String value) {
        this.pstBx = value;
    }

    /**
     * Gets the value of the room property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoom(String value) {
        this.room = value;
    }

    /**
     * Gets the value of the pstCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstCd() {
        return pstCd;
    }

    /**
     * Sets the value of the pstCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstCd(String value) {
        this.pstCd = value;
    }

    /**
     * Gets the value of the twnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwnNm() {
        return twnNm;
    }

    /**
     * Sets the value of the twnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwnNm(String value) {
        this.twnNm = value;
    }

    /**
     * Gets the value of the twnLctnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwnLctnNm() {
        return twnLctnNm;
    }

    /**
     * Sets the value of the twnLctnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwnLctnNm(String value) {
        this.twnLctnNm = value;
    }

    /**
     * Gets the value of the dstrctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstrctNm() {
        return dstrctNm;
    }

    /**
     * Sets the value of the dstrctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDstrctNm(String value) {
        this.dstrctNm = value;
    }

    /**
     * Gets the value of the ctrySubDvsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsn() {
        return ctrySubDvsn;
    }

    /**
     * Sets the value of the ctrySubDvsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrySubDvsn(String value) {
        this.ctrySubDvsn = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the adrLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the adrLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdrLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdrLine() {
        if (adrLine == null) {
            adrLine = new ArrayList<String>();
        }
        return this.adrLine;
    }

}
