
package com.cbl.filereadwrite.service.pacs_002;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides information on the status reason of the transaction.
 * 
 * <p>Java class for StatusReasonInformation12__1 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StatusReasonInformation12__1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}PartyIdentification135__1" minOccurs="0"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}StatusReason6Choice__1" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}HVPSPlus_RestrictedFINXMax105Text" maxOccurs="2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReasonInformation12__1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", propOrder = {
    "orgtr",
    "rsn",
    "addtlInf"
})
public class StatusReasonInformation121 {

    /**
     * Party that issues the status.
     * 
     */
    @XmlElement(name = "Orgtr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    protected PartyIdentification1351 orgtr;
    /**
     * Specifies the reason for the status report.
     * 
     */
    @XmlElement(name = "Rsn", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    protected StatusReason6Choice1 rsn;
    /**
     * Further details on the status reason.
     * 
     * Usage: Additional information can be used for several purposes such as the reporting of repaired information.
     * 
     */
    @XmlElement(name = "AddtlInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    protected List<String> addtlInf;

    /**
     * Party that issues the status.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1351 }
     *     
     */
    public PartyIdentification1351 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1351 }
     *     
     * @see #getOrgtr()
     */
    public void setOrgtr(PartyIdentification1351 value) {
        this.orgtr = value;
    }

    /**
     * Specifies the reason for the status report.
     * 
     * @return
     *     possible object is
     *     {@link StatusReason6Choice1 }
     *     
     */
    public StatusReason6Choice1 getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReason6Choice1 }
     *     
     * @see #getRsn()
     */
    public void setRsn(StatusReason6Choice1 value) {
        this.rsn = value;
    }

    /**
     * Further details on the status reason.
     * 
     * Usage: Additional information can be used for several purposes such as the reporting of repaired information.
     * 
     * Gets the value of the addtlInf property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
