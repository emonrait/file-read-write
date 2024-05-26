
package com.cbl.filereadwrite.service.pacs_008;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Unique identification, as assigned by a clearing system, to unambiguously identify a member of the clearing system.
 * 
 * <p>Java class for ClearingSystemMemberIdentification2__1 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClearingSystemMemberIdentification2__1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClrSysId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}ClearingSystemIdentification2Choice__1"/>
 *         <element name="MmbId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}HVPSPlus_RestrictedFINXMax28Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingSystemMemberIdentification2__1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08", propOrder = {
    "clrSysId",
    "mmbId"
})
public class ClearingSystemMemberIdentification21 {

    /**
     * Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is processed.
     * 
     */
    @XmlElement(name = "ClrSysId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08", required = true)
    protected ClearingSystemIdentification2Choice1 clrSysId;
    /**
     * Identification of a member of a clearing system.
     * 
     */
    @XmlElement(name = "MmbId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08", required = true)
    protected String mmbId;

    /**
     * Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is processed.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemIdentification2Choice1 }
     *     
     */
    public ClearingSystemIdentification2Choice1 getClrSysId() {
        return clrSysId;
    }

    /**
     * Sets the value of the clrSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemIdentification2Choice1 }
     *     
     * @see #getClrSysId()
     */
    public void setClrSysId(ClearingSystemIdentification2Choice1 value) {
        this.clrSysId = value;
    }

    /**
     * Identification of a member of a clearing system.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmbId() {
        return mmbId;
    }

    /**
     * Sets the value of the mmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMmbId()
     */
    public void setMmbId(String value) {
        this.mmbId = value;
    }

}
