
package com.cbl.filereadwrite.service.pacs_004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Unique and unambiguous identification of a financial institution or a branch of a financial institution.
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
 *         <element name="FinInstnId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}FinancialInstitutionIdentification18__3"/>
 *         <element name="BrnchId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}BranchData3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification6__3", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", propOrder = {
    "finInstnId",
    "brnchId"
})
public class BranchAndFinancialInstitutionIdentification63 {

    /**
     * Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.
     * 
     */
    @XmlElement(name = "FinInstnId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    protected FinancialInstitutionIdentification183 finInstnId;
    /**
     * Identifies a specific branch of a financial institution.
     * 
     *                         Usage: This component should be used in case the identification information in the financial institution component does not provide identification up to branch level.
     * 
     */
    @XmlElement(name = "BrnchId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected BranchData3 brnchId;

    /**
     * Unique and unambiguous identification of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.
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

    /**
     * Identifies a specific branch of a financial institution.
     * 
     *                         Usage: This component should be used in case the identification information in the financial institution component does not provide identification up to branch level.
     * 
     * @return
     *     possible object is
     *     {@link BranchData3 }
     *     
     */
    public BranchData3 getBrnchId() {
        return brnchId;
    }

    /**
     * Sets the value of the brnchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData3 }
     *     
     * @see #getBrnchId()
     */
    public void setBrnchId(BranchData3 value) {
        this.brnchId = value;
    }

}
