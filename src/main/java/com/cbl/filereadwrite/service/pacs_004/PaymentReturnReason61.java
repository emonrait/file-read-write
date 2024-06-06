
package com.cbl.filereadwrite.service.pacs_004;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides further details on the reason of the return of the transaction.
 * 
 * <p>Java class for PaymentReturnReason6__1 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentReturnReason6__1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}PartyIdentification135__3" minOccurs="0"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}ReturnReason5Choice__1"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}HVPSPlus_RestrictedFINXMax105Text" maxOccurs="2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReturnReason6__1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", propOrder = {
    "orgtr",
    "rsn",
    "addtlInf"
})
public class PaymentReturnReason61 {

    /**
     * Party that issues the return.
     * 
     */
    @XmlElement(name = "Orgtr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected PartyIdentification1353 orgtr;
    /**
     * Specifies the reason for the return.
     * 
     */
    @XmlElement(name = "Rsn", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    protected ReturnReason5Choice1 rsn;
    /**
     * Further details on the return reason.
     * 
     */
    @XmlElement(name = "AddtlInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected List<String> addtlInf;

    /**
     * Party that issues the return.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1353 }
     *     
     */
    public PartyIdentification1353 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1353 }
     *     
     * @see #getOrgtr()
     */
    public void setOrgtr(PartyIdentification1353 value) {
        this.orgtr = value;
    }

    /**
     * Specifies the reason for the return.
     * 
     * @return
     *     possible object is
     *     {@link ReturnReason5Choice1 }
     *     
     */
    public ReturnReason5Choice1 getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnReason5Choice1 }
     *     
     * @see #getRsn()
     */
    public void setRsn(ReturnReason5Choice1 value) {
        this.rsn = value;
    }

    /**
     * Further details on the return reason.
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
