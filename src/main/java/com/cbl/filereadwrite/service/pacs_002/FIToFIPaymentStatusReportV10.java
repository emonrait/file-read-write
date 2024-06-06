
package com.cbl.filereadwrite.service.pacs_002;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Scope

 * The FIToFIPaymentStatusReport message is sent by an instructed agent to the previous party in the payment chain. It is used to inform this party about the positive or negative status of an instruction (either single or file). It is also used to report on a pending instruction.

 * Usage

 * The FIToFIPaymentStatusReport message is exchanged between agents to provide status information about instructions previously sent. Its usage will always be governed by a bilateral agreement between the agents.

 * The FIToFIPaymentStatusReport message can be used to provide information about the status (e.g. rejection, acceptance) of a credit transfer instruction, a direct debit instruction, as well as other intra-agent instructions (for example FIToFIPaymentCancellationRequest).

 * The FIToFIPaymentStatusReport message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.

 * The FIToFIPaymentStatusReport message can be used in domestic and cross-border scenarios.

 * The FIToFIPaymentStatusReport may also be sent to the receiver of the payment in a real time payment scenario, as both sides of the transactions must be informed of the status of the transaction (for example either the beneficiary is credited, or the transaction is rejected).
 * 
 * <p>Java class for FIToFIPaymentStatusReportV10 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FIToFIPaymentStatusReportV10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}GroupHeader91__1"/>
 *         <element name="TxInfAndSts" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}PaymentTransaction110__1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FIToFIPaymentStatusReportV10", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", propOrder = {
    "grpHdr",
    "txInfAndSts"
})
public class FIToFIPaymentStatusReportV10 {

    /**
     * Set of characteristics shared by all individual transactions included in the status report message.
     * 
     */
    @XmlElement(name = "GrpHdr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", required = true)
    protected GroupHeader911 grpHdr;
    /**
     * Information concerning the original transactions, to which the status report message refers.
     * 
     */
    @XmlElement(name = "TxInfAndSts", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", required = true)
    protected PaymentTransaction1101 txInfAndSts;

    /**
     * Set of characteristics shared by all individual transactions included in the status report message.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader911 }
     *     
     */
    public GroupHeader911 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader911 }
     *     
     * @see #getGrpHdr()
     */
    public void setGrpHdr(GroupHeader911 value) {
        this.grpHdr = value;
    }

    /**
     * Information concerning the original transactions, to which the status report message refers.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction1101 }
     *     
     */
    public PaymentTransaction1101 getTxInfAndSts() {
        return txInfAndSts;
    }

    /**
     * Sets the value of the txInfAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction1101 }
     *     
     * @see #getTxInfAndSts()
     */
    public void setTxInfAndSts(PaymentTransaction1101 value) {
        this.txInfAndSts = value;
    }

}
