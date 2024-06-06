
package com.cbl.filereadwrite.service.camt_54;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the identification of a person or an organisation.
 * 
 * <p>Java class for PartyIdentification135__1 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification135__1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}HVPSPlus_RestrictedFINXMax140Text_Extended" minOccurs="0"/>
 *         <element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}PostalAddress24__1" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Party38Choice__1" minOccurs="0"/>
 *         <element name="CtryOfRes" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CountryCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification135__1", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.08", propOrder = {
    "nm",
    "pstlAdr",
    "id",
    "ctryOfRes"
})
public class PartyIdentification1351 {

    /**
     * Name by which a party is known and which is usually used to identify that party.
     * 
     */
    @XmlElement(name = "Nm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.08")
    protected String nm;
    /**
     * Information that locates and identifies a specific address, as defined by postal services.
     * 
     */
    @XmlElement(name = "PstlAdr", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.08")
    protected PostalAddress241 pstlAdr;
    /**
     * Unique and unambiguous identification of a party.
     * 
     */
    @XmlElement(name = "Id", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.08")
    protected Party38Choice1 id;
    /**
     * Country in which a person resides (the place of a person's home). In the case of a company, it is the country from which the affairs of that company are directed.
     * 
     */
    @XmlElement(name = "CtryOfRes", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.08")
    protected String ctryOfRes;

    /**
     * Name by which a party is known and which is usually used to identify that party.
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
     * @see #getNm()
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Information that locates and identifies a specific address, as defined by postal services.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress241 }
     *     
     */
    public PostalAddress241 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress241 }
     *     
     * @see #getPstlAdr()
     */
    public void setPstlAdr(PostalAddress241 value) {
        this.pstlAdr = value;
    }

    /**
     * Unique and unambiguous identification of a party.
     * 
     * @return
     *     possible object is
     *     {@link Party38Choice1 }
     *     
     */
    public Party38Choice1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party38Choice1 }
     *     
     * @see #getId()
     */
    public void setId(Party38Choice1 value) {
        this.id = value;
    }

    /**
     * Country in which a person resides (the place of a person's home). In the case of a company, it is the country from which the affairs of that company are directed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfRes() {
        return ctryOfRes;
    }

    /**
     * Sets the value of the ctryOfRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCtryOfRes()
     */
    public void setCtryOfRes(String value) {
        this.ctryOfRes = value;
    }

}
