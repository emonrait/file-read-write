
package com.cbl.filereadwrite.service.pacs_004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Scope

 *                 The PaymentReturn message is sent by an agent to the previous agent in the payment chain to undo a payment previously settled.

 *                 Usage

 *                 The PaymentReturn message is exchanged between agents to return funds after settlement of credit transfer instructions (that is FIToFICustomerCreditTransfer message and FinancialInstitutionCreditTransfer message) or direct debit instructions (FIToFICustomerDirectDebit message).

 *                 The PaymentReturn message should not be used between agents and non-financial institution customers. Non-financial institution customers will be informed about a debit or a credit on their account(s) through a BankToCustomerDebitCreditNotification message ('notification') and/or BankToCustomerAccountReport/BankToCustomerStatement message ('statement').

 *                 The PaymentReturn message can be used to return single instructions or multiple instructions from one or different files.

 *                 The PaymentReturn message can be used in domestic and cross-border scenarios.

 *                 The PaymentReturn message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.
 * 
 * <p>Java class for PaymentReturnV09 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentReturnV09">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}GroupHeader90__1"/>
 *         <element name="TxInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}PaymentTransaction112__1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReturnV09", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", propOrder = {
    "grpHdr",
    "txInf"
})
public class PaymentReturnV09 {

    /**
     * Set of characteristics shared by all individual transactions included in the message.
     * 
     */
    @XmlElement(name = "GrpHdr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    protected GroupHeader901 grpHdr;
    /**
     * Information concerning the original transactions, to which the return message refers.
     * 
     */
    @XmlElement(name = "TxInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    protected PaymentTransaction1121 txInf;

    /**
     * Set of characteristics shared by all individual transactions included in the message.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader901 }
     *     
     */
    public GroupHeader901 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader901 }
     *     
     * @see #getGrpHdr()
     */
    public void setGrpHdr(GroupHeader901 value) {
        this.grpHdr = value;
    }

    /**
     * Information concerning the original transactions, to which the return message refers.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction1121 }
     *     
     */
    public PaymentTransaction1121 getTxInf() {
        return txInf;
    }

    /**
     * Sets the value of the txInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction1121 }
     *     
     * @see #getTxInf()
     */
    public void setTxInf(PaymentTransaction1121 value) {
        this.txInf = value;
    }

}
