
package com.cbl.filereadwrite.service.pacs_004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of a person, an organisation or a financial institution.
 * 
 * <p>Java class for Party40Choice__3 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Party40Choice__3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Pty" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}PartyIdentification135__1"/>
 *         <element name="Agt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}BranchAndFinancialInstitutionIdentification6__3"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party40Choice__3", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", propOrder = {
    "pty",
    "agt"
})
public class Party40Choice3 {

    /**
     * Identification of a person or an organisation.
     * 
     */
    @XmlElement(name = "Pty", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected PartyIdentification1351 pty;
    /**
     * Identification of a financial institution.
     * 
     */
    @XmlElement(name = "Agt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected BranchAndFinancialInstitutionIdentification63 agt;

    /**
     * Identification of a person or an organisation.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1351 }
     *     
     */
    public PartyIdentification1351 getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1351 }
     *     
     * @see #getPty()
     */
    public void setPty(PartyIdentification1351 value) {
        this.pty = value;
    }

    /**
     * Identification of a financial institution.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification63 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification63 getAgt() {
        return agt;
    }

    /**
     * Sets the value of the agt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification63 }
     *     
     * @see #getAgt()
     */
    public void setAgt(BranchAndFinancialInstitutionIdentification63 value) {
        this.agt = value;
    }

}
