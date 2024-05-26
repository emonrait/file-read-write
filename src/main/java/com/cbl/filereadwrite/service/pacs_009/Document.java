
package com.cbl.filereadwrite.service.pacs_009;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Document">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FICdtTrf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08}FinancialInstitutionCreditTransferV08"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08", propOrder = {
    "fiCdtTrf"
})
public class Document {

    @XmlElement(name = "FICdtTrf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08", required = true)
    protected FinancialInstitutionCreditTransferV08 fiCdtTrf;

    /**
     * Gets the value of the fiCdtTrf property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionCreditTransferV08 }
     *     
     */
    public FinancialInstitutionCreditTransferV08 getFICdtTrf() {
        return fiCdtTrf;
    }

    /**
     * Sets the value of the fiCdtTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionCreditTransferV08 }
     *     
     */
    public void setFICdtTrf(FinancialInstitutionCreditTransferV08 value) {
        this.fiCdtTrf = value;
    }

}
