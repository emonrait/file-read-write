
package com.cbl.filereadwrite.service.pacs_004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information related to an identification, for example, party identification or account identification.
 * 
 * <p>Java class for GenericIdentification30 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GenericIdentification30">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}Exact4AlphaNumericText"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}Max35Text"/>
 *         <element name="SchmeNm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericIdentification30", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", propOrder = {
    "id",
    "issr",
    "schmeNm"
})
public class GenericIdentification30 {

    /**
     * Proprietary information, often a code, issued by the data source scheme issuer.
     * 
     */
    @XmlElement(name = "Id", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    protected String id;
    /**
     * Entity that assigns the identification.
     * 
     */
    @XmlElement(name = "Issr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    protected String issr;
    /**
     * Short textual description of the scheme.
     * 
     */
    @XmlElement(name = "SchmeNm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected String schmeNm;

    /**
     * Proprietary information, often a code, issued by the data source scheme issuer.
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
     * Entity that assigns the identification.
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
     * @see #getIssr()
     */
    public void setIssr(String value) {
        this.issr = value;
    }

    /**
     * Short textual description of the scheme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchmeNm() {
        return schmeNm;
    }

    /**
     * Sets the value of the schmeNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSchmeNm()
     */
    public void setSchmeNm(String value) {
        this.schmeNm = value;
    }

}
