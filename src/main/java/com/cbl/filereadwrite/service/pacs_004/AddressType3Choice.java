
package com.cbl.filereadwrite.service.pacs_004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Choice of formats for the type of address.
 * 
 * <p>Java class for AddressType3Choice complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AddressType3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}AddressType2Code"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}GenericIdentification30"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType3Choice", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", propOrder = {
    "cd",
    "prtry"
})
public class AddressType3Choice {

    /**
     * Type of address expressed as a code.
     * 
     */
    @XmlElement(name = "Cd", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    @XmlSchemaType(name = "string")
    protected AddressType2Code cd;
    /**
     * Type of address expressed as a proprietary code.
     * 
     */
    @XmlElement(name = "Prtry", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected GenericIdentification30 prtry;

    /**
     * Type of address expressed as a code.
     * 
     * @return
     *     possible object is
     *     {@link AddressType2Code }
     *     
     */
    public AddressType2Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType2Code }
     *     
     * @see #getCd()
     */
    public void setCd(AddressType2Code value) {
        this.cd = value;
    }

    /**
     * Type of address expressed as a proprietary code.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     * @see #getPrtry()
     */
    public void setPrtry(GenericIdentification30 value) {
        this.prtry = value;
    }

}
