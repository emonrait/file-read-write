
package com.cbl.filereadwrite.service.pacs_004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information that locates and identifies a specific branch of a financial institution.
 * 
 * <p>Java class for BranchData3 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BranchData3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}Max35Text" minOccurs="0"/>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}LEIIdentifier" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}Max140Text" minOccurs="0"/>
 *         <element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}PostalAddress24" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchData3", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", propOrder = {
    "id",
    "lei",
    "nm",
    "pstlAdr"
})
public class BranchData3 {

    /**
     * Unique and unambiguous identification of a branch of a financial institution.
     * 
     */
    @XmlElement(name = "Id", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected String id;
    /**
     * Legal entity identification for the branch of the financial institution.
     * 
     */
    @XmlElement(name = "LEI", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected String lei;
    /**
     * Name by which an agent is known and which is usually used to identify that agent.
     * 
     */
    @XmlElement(name = "Nm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected String nm;
    /**
     * Information that locates and identifies a specific address, as defined by postal services.
     * 
     */
    @XmlElement(name = "PstlAdr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected PostalAddress24 pstlAdr;

    /**
     * Unique and unambiguous identification of a branch of a financial institution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getId()
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Legal entity identification for the branch of the financial institution.
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
     *     {@link PostalAddress24 }
     *     
     */
    public PostalAddress24 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress24 }
     *     
     * @see #getPstlAdr()
     */
    public void setPstlAdr(PostalAddress24 value) {
        this.pstlAdr = value;
    }

}
