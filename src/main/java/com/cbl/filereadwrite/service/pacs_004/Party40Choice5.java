
package com.cbl.filereadwrite.service.pacs_004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of a person, an organisation or a financial institution.
 * 
 * <p>Java class for Party40Choice__5 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Party40Choice__5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Pty" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}PartyIdentification135__4"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party40Choice__5", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", propOrder = {
    "pty"
})
public class Party40Choice5 {

    /**
     * Identification of a person or an organisation.
     * 
     */
    @XmlElement(name = "Pty", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected PartyIdentification1354 pty;

    /**
     * Identification of a person or an organisation.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1354 }
     *     
     */
    public PartyIdentification1354 getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1354 }
     *     
     * @see #getPty()
     */
    public void setPty(PartyIdentification1354 value) {
        this.pty = value;
    }

}
