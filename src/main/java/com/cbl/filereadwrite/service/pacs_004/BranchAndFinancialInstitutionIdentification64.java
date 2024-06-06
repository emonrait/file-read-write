
package com.cbl.filereadwrite.service.pacs_004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Unique and unambiguous identification of a financial institution or a branch of a financial institution.
 * 
 * <p>Java class for BranchAndFinancialInstitutionIdentification6__4 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BranchAndFinancialInstitutionIdentification6__4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstnId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}FinancialInstitutionIdentification18__4"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification6__4", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", propOrder = {
    "finInstnId"
})
public class BranchAndFinancialInstitutionIdentification64 {

    /**
     * Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.
     * 
     */
    @XmlElement(name = "FinInstnId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    protected FinancialInstitutionIdentification184 finInstnId;

    /**
     * Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification184 }
     *     
     */
    public FinancialInstitutionIdentification184 getFinInstnId() {
        return finInstnId;
    }

    /**
     * Sets the value of the finInstnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification184 }
     *     
     * @see #getFinInstnId()
     */
    public void setFinInstnId(FinancialInstitutionIdentification184 value) {
        this.finInstnId = value;
    }

}
