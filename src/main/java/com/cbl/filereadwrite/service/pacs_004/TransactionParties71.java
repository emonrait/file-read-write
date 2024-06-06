
package com.cbl.filereadwrite.service.pacs_004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides further details on the parties specific to the individual transaction.
 * 
 * <p>Java class for TransactionParties7__1 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TransactionParties7__1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}Party40Choice__1" minOccurs="0"/>
 *         <element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}Party40Choice__2"/>
 *         <element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}Party40Choice__3" minOccurs="0"/>
 *         <element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}BranchAndFinancialInstitutionIdentification6__1" minOccurs="0"/>
 *         <element name="PrvsInstgAgt1" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}BranchAndFinancialInstitutionIdentification6__1" minOccurs="0"/>
 *         <element name="PrvsInstgAgt2" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}BranchAndFinancialInstitutionIdentification6__4" minOccurs="0"/>
 *         <element name="PrvsInstgAgt3" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}BranchAndFinancialInstitutionIdentification6__4" minOccurs="0"/>
 *         <element name="IntrmyAgt1" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}BranchAndFinancialInstitutionIdentification6__1" minOccurs="0"/>
 *         <element name="IntrmyAgt2" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}BranchAndFinancialInstitutionIdentification6__4" minOccurs="0"/>
 *         <element name="IntrmyAgt3" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}BranchAndFinancialInstitutionIdentification6__4" minOccurs="0"/>
 *         <element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}BranchAndFinancialInstitutionIdentification6__1" minOccurs="0"/>
 *         <element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}Party40Choice__4"/>
 *         <element name="UltmtCdtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}Party40Choice__5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionParties7__1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", propOrder = {
    "ultmtDbtr",
    "dbtr",
    "initgPty",
    "dbtrAgt",
    "prvsInstgAgt1",
    "prvsInstgAgt2",
    "prvsInstgAgt3",
    "intrmyAgt1",
    "intrmyAgt2",
    "intrmyAgt3",
    "cdtrAgt",
    "cdtr",
    "ultmtCdtr"
})
public class TransactionParties71 {

    /**
     * Ultimate party that owes an amount of money to the (ultimate) creditor.
     * 
     */
    @XmlElement(name = "UltmtDbtr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected Party40Choice1 ultmtDbtr;
    /**
     * Party that owes an amount of money to the (ultimate) creditor.
     * 
     */
    @XmlElement(name = "Dbtr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    protected Party40Choice2 dbtr;
    /**
     * Party that initiates the payment.
     *                         Usage: This can be either the debtor or a party that initiates the credit transfer on behalf of the debtor.
     * 
     */
    @XmlElement(name = "InitgPty", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected Party40Choice3 initgPty;
    /**
     * Financial institution servicing an account for the debtor.
     * 
     */
    @XmlElement(name = "DbtrAgt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected BranchAndFinancialInstitutionIdentification61 dbtrAgt;
    /**
     * Agent immediately prior to the instructing agent.
     * 
     */
    @XmlElement(name = "PrvsInstgAgt1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected BranchAndFinancialInstitutionIdentification61 prvsInstgAgt1;
    /**
     * Agent immediately prior to the instructing agent.
     * 
     */
    @XmlElement(name = "PrvsInstgAgt2", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected BranchAndFinancialInstitutionIdentification64 prvsInstgAgt2;
    /**
     * Agent immediately prior to the instructing agent.
     * 
     */
    @XmlElement(name = "PrvsInstgAgt3", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected BranchAndFinancialInstitutionIdentification64 prvsInstgAgt3;
    /**
     * Agent between the debtor's agent and the creditor's agent.
     * 
     *                         Usage: If more than one intermediary agent is present, then IntermediaryAgent1 identifies the agent between the DebtorAgent and the IntermediaryAgent2.
     * 
     */
    @XmlElement(name = "IntrmyAgt1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected BranchAndFinancialInstitutionIdentification61 intrmyAgt1;
    /**
     * Agent between the debtor's agent and the creditor's agent.
     * 
     *                         Usage: If more than two intermediary agents are present, then IntermediaryAgent2 identifies the agent between the IntermediaryAgent1 and the IntermediaryAgent3.
     * 
     */
    @XmlElement(name = "IntrmyAgt2", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected BranchAndFinancialInstitutionIdentification64 intrmyAgt2;
    /**
     * Agent between the debtor's agent and the creditor's agent.
     * 
     *                         Usage: If IntermediaryAgent3 is present, then it identifies the agent between the IntermediaryAgent 2 and the CreditorAgent.
     * 
     */
    @XmlElement(name = "IntrmyAgt3", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected BranchAndFinancialInstitutionIdentification64 intrmyAgt3;
    /**
     * Financial institution servicing an account for the creditor.
     * 
     */
    @XmlElement(name = "CdtrAgt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected BranchAndFinancialInstitutionIdentification61 cdtrAgt;
    /**
     * Party to which an amount of money is due.
     * 
     */
    @XmlElement(name = "Cdtr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    protected Party40Choice4 cdtr;
    /**
     * Ultimate party to which an amount of money is due.
     * 
     */
    @XmlElement(name = "UltmtCdtr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected Party40Choice5 ultmtCdtr;

    /**
     * Ultimate party that owes an amount of money to the (ultimate) creditor.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice1 }
     *     
     */
    public Party40Choice1 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice1 }
     *     
     * @see #getUltmtDbtr()
     */
    public void setUltmtDbtr(Party40Choice1 value) {
        this.ultmtDbtr = value;
    }

    /**
     * Party that owes an amount of money to the (ultimate) creditor.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice2 }
     *     
     */
    public Party40Choice2 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice2 }
     *     
     * @see #getDbtr()
     */
    public void setDbtr(Party40Choice2 value) {
        this.dbtr = value;
    }

    /**
     * Party that initiates the payment.
     *                         Usage: This can be either the debtor or a party that initiates the credit transfer on behalf of the debtor.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice3 }
     *     
     */
    public Party40Choice3 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice3 }
     *     
     * @see #getInitgPty()
     */
    public void setInitgPty(Party40Choice3 value) {
        this.initgPty = value;
    }

    /**
     * Financial institution servicing an account for the debtor.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification61 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification61 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification61 }
     *     
     * @see #getDbtrAgt()
     */
    public void setDbtrAgt(BranchAndFinancialInstitutionIdentification61 value) {
        this.dbtrAgt = value;
    }

    /**
     * Agent immediately prior to the instructing agent.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification61 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification61 getPrvsInstgAgt1() {
        return prvsInstgAgt1;
    }

    /**
     * Sets the value of the prvsInstgAgt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification61 }
     *     
     * @see #getPrvsInstgAgt1()
     */
    public void setPrvsInstgAgt1(BranchAndFinancialInstitutionIdentification61 value) {
        this.prvsInstgAgt1 = value;
    }

    /**
     * Agent immediately prior to the instructing agent.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification64 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification64 getPrvsInstgAgt2() {
        return prvsInstgAgt2;
    }

    /**
     * Sets the value of the prvsInstgAgt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification64 }
     *     
     * @see #getPrvsInstgAgt2()
     */
    public void setPrvsInstgAgt2(BranchAndFinancialInstitutionIdentification64 value) {
        this.prvsInstgAgt2 = value;
    }

    /**
     * Agent immediately prior to the instructing agent.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification64 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification64 getPrvsInstgAgt3() {
        return prvsInstgAgt3;
    }

    /**
     * Sets the value of the prvsInstgAgt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification64 }
     *     
     * @see #getPrvsInstgAgt3()
     */
    public void setPrvsInstgAgt3(BranchAndFinancialInstitutionIdentification64 value) {
        this.prvsInstgAgt3 = value;
    }

    /**
     * Agent between the debtor's agent and the creditor's agent.
     * 
     *                         Usage: If more than one intermediary agent is present, then IntermediaryAgent1 identifies the agent between the DebtorAgent and the IntermediaryAgent2.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification61 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification61 getIntrmyAgt1() {
        return intrmyAgt1;
    }

    /**
     * Sets the value of the intrmyAgt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification61 }
     *     
     * @see #getIntrmyAgt1()
     */
    public void setIntrmyAgt1(BranchAndFinancialInstitutionIdentification61 value) {
        this.intrmyAgt1 = value;
    }

    /**
     * Agent between the debtor's agent and the creditor's agent.
     * 
     *                         Usage: If more than two intermediary agents are present, then IntermediaryAgent2 identifies the agent between the IntermediaryAgent1 and the IntermediaryAgent3.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification64 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification64 getIntrmyAgt2() {
        return intrmyAgt2;
    }

    /**
     * Sets the value of the intrmyAgt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification64 }
     *     
     * @see #getIntrmyAgt2()
     */
    public void setIntrmyAgt2(BranchAndFinancialInstitutionIdentification64 value) {
        this.intrmyAgt2 = value;
    }

    /**
     * Agent between the debtor's agent and the creditor's agent.
     * 
     *                         Usage: If IntermediaryAgent3 is present, then it identifies the agent between the IntermediaryAgent 2 and the CreditorAgent.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification64 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification64 getIntrmyAgt3() {
        return intrmyAgt3;
    }

    /**
     * Sets the value of the intrmyAgt3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification64 }
     *     
     * @see #getIntrmyAgt3()
     */
    public void setIntrmyAgt3(BranchAndFinancialInstitutionIdentification64 value) {
        this.intrmyAgt3 = value;
    }

    /**
     * Financial institution servicing an account for the creditor.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification61 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification61 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification61 }
     *     
     * @see #getCdtrAgt()
     */
    public void setCdtrAgt(BranchAndFinancialInstitutionIdentification61 value) {
        this.cdtrAgt = value;
    }

    /**
     * Party to which an amount of money is due.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice4 }
     *     
     */
    public Party40Choice4 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice4 }
     *     
     * @see #getCdtr()
     */
    public void setCdtr(Party40Choice4 value) {
        this.cdtr = value;
    }

    /**
     * Ultimate party to which an amount of money is due.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice5 }
     *     
     */
    public Party40Choice5 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice5 }
     *     
     * @see #getUltmtCdtr()
     */
    public void setUltmtCdtr(Party40Choice5 value) {
        this.ultmtCdtr = value;
    }

}
