
package com.cbl.filereadwrite.service.pacs_004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of a person, an organisation or a financial institution.
 * 
 * <p>Java class for Party40Choice__4 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Party40Choice__4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Pty" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}PartyIdentification135__3"/>
 *         <element name="Agt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}BranchAndFinancialInstitutionIdentification6__1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party40Choice__4", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", propOrder = {
    "pty",
    "agt"
})
public class Party40Choice4 {

    /**
     * Identification of a person or an organisation.
     * 
     */
    @XmlElement(name = "Pty", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected PartyIdentification1353 pty;
    /**
     * Identification of a financial institution.
     * 
     */
    @XmlElement(name = "Agt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected BranchAndFinancialInstitutionIdentification61 agt;

    /**
     * Identification of a person or an organisation.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1353 }
     *     
     */
    public PartyIdentification1353 getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1353 }
     *     
     * @see #getPty()
     */
    public void setPty(PartyIdentification1353 value) {
        this.pty = value;
    }

    /**
     * Identification of a financial institution.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification61 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification61 getAgt() {
        return agt;
    }

    /**
     * Sets the value of the agt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification61 }
     *     
     * @see #getAgt()
     */
    public void setAgt(BranchAndFinancialInstitutionIdentification61 value) {
        this.agt = value;
    }

}
