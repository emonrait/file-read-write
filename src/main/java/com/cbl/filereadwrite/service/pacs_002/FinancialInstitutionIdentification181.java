
package com.cbl.filereadwrite.service.pacs_002;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the details to identify a financial institution.
 * 
 * <p>Java class for FinancialInstitutionIdentification18__1 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FinancialInstitutionIdentification18__1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BICFI" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}BICFIDec2014Identifier" minOccurs="0"/>
 *         <element name="ClrSysMmbId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}ClearingSystemMemberIdentification2__1" minOccurs="0"/>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}LEIIdentifier" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}Max140Text" minOccurs="0"/>
 *         <element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}PostalAddress24__2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionIdentification18__1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", propOrder = {
    "bicfi",
    "clrSysMmbId",
    "lei",
    "nm",
    "pstlAdr"
})
public class FinancialInstitutionIdentification181 {

    /**
     * Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 "Banking - Banking telecommunication messages - Business identifier code (BIC)".
     * 
     */
    @XmlElement(name = "BICFI", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    protected String bicfi;
    /**
     * Information used to identify a member within a clearing system.
     * 
     */
    @XmlElement(name = "ClrSysMmbId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    protected ClearingSystemMemberIdentification21 clrSysMmbId;
    /**
     * Legal entity identifier of the financial institution.
     * 
     */
    @XmlElement(name = "LEI", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    protected String lei;
    /**
     * Name by which an agent is known and which is usually used to identify that agent.
     * 
     */
    @XmlElement(name = "Nm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    protected String nm;
    /**
     * Information that locates and identifies a specific address, as defined by postal services.
     * 
     */
    @XmlElement(name = "PstlAdr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    protected PostalAddress242 pstlAdr;

    /**
     * Code allocated to a financial institution by the ISO 9362 Registration Authority as described in ISO 9362 "Banking - Banking telecommunication messages - Business identifier code (BIC)".
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICFI() {
        return bicfi;
    }

    /**
     * Sets the value of the bicfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBICFI()
     */
    public void setBICFI(String value) {
        this.bicfi = value;
    }

    /**
     * Information used to identify a member within a clearing system.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemMemberIdentification21 }
     *     
     */
    public ClearingSystemMemberIdentification21 getClrSysMmbId() {
        return clrSysMmbId;
    }

    /**
     * Sets the value of the clrSysMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemMemberIdentification21 }
     *     
     * @see #getClrSysMmbId()
     */
    public void setClrSysMmbId(ClearingSystemMemberIdentification21 value) {
        this.clrSysMmbId = value;
    }

    /**
     * Legal entity identifier of the financial institution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLEI()
     */
    public void setLEI(String value) {
        this.lei = value;
    }

    /**
     * Name by which an agent is known and which is usually used to identify that agent.
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
     *     {@link PostalAddress242 }
     *     
     */
    public PostalAddress242 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress242 }
     *     
     * @see #getPstlAdr()
     */
    public void setPstlAdr(PostalAddress242 value) {
        this.pstlAdr = value;
    }

}
