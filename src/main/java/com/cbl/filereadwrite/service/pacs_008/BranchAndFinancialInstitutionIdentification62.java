
package com.cbl.filereadwrite.service.pacs_008;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Unique and unambiguous identification of a financial institution or a branch of a financial institution.
 * 
 * <p>Java class for BranchAndFinancialInstitutionIdentification6__2 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BranchAndFinancialInstitutionIdentification6__2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstnId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}FinancialInstitutionIdentification18__2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification6__2", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08", propOrder = {
    "finInstnId"
})
public class BranchAndFinancialInstitutionIdentification62 {

    /**
     * Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.
     * 
     */
    @XmlElement(name = "FinInstnId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08", required = true)
    protected FinancialInstitutionIdentification182 finInstnId;

    /**
     * Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification182 }
     *     
     */
    public FinancialInstitutionIdentification182 getFinInstnId() {
        return finInstnId;
    }

    /**
     * Sets the value of the finInstnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification182 }
     *     
     * @see #getFinInstnId()
     */
    public void setFinInstnId(FinancialInstitutionIdentification182 value) {
        this.finInstnId = value;
    }

}
