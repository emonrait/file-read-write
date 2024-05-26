
package com.cbl.filereadwrite.service.pacs_009;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Unique and unambiguous identification of a financial
 *                 institution or a branch of a financial institution.
 * 
 * <p>Java class for BranchAndFinancialInstitutionIdentification6__3 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BranchAndFinancialInstitutionIdentification6__3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstnId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08}FinancialInstitutionIdentification18__3"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification6__3", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08", propOrder = {
    "finInstnId"
})
public class BranchAndFinancialInstitutionIdentification63 {

    /**
     * Unique and unambiguous identification of a
     *                         financial institution, as assigned under an internationally recognised or proprietary
     *                         identification scheme.
     * 
     */
    @XmlElement(name = "FinInstnId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08", required = true)
    protected FinancialInstitutionIdentification183 finInstnId;

    /**
     * Unique and unambiguous identification of a
     *                         financial institution, as assigned under an internationally recognised or proprietary
     *                         identification scheme.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification183 }
     *     
     */
    public FinancialInstitutionIdentification183 getFinInstnId() {
        return finInstnId;
    }

    /**
     * Sets the value of the finInstnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification183 }
     *     
     * @see #getFinInstnId()
     */
    public void setFinInstnId(FinancialInstitutionIdentification183 value) {
        this.finInstnId = value;
    }

}
