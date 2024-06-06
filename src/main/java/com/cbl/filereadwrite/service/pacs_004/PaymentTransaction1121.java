
package com.cbl.filereadwrite.service.pacs_004;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides further details on the reference and status on the original transactions, included in the original instruction, to which the return message applies.
 * 
 * <p>Java class for PaymentTransaction112__1 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentTransaction112__1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RtrId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}HVPSPlus_RestrictedFINXMax35Text__3_" minOccurs="0"/>
 *         <element name="OrgnlGrpInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}OriginalGroupInformation29__1" minOccurs="0"/>
 *         <element name="OrgnlInstrId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}HVPSPlus_RestrictedFINXMax35Text__3_" minOccurs="0"/>
 *         <element name="OrgnlEndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}HVPSPlus_RestrictedFINXMax35Text__2_"/>
 *         <element name="OrgnlTxId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}HVPSPlus_RestrictedFINXMax35Text__3_" minOccurs="0"/>
 *         <element name="OrgnlUETR" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}UUIDv4Identifier"/>
 *         <element name="OrgnlClrSysRef" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}HVPSPlus_RestrictedFINXMax35Text__3_" minOccurs="0"/>
 *         <element name="OrgnlIntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="OrgnlIntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}ISODate" minOccurs="0"/>
 *         <element name="RtrdIntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}RestrictedFINActiveCurrencyAndAmount"/>
 *         <element name="IntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}ISODate"/>
 *         <element name="SttlmPrty" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}Priority3Code" minOccurs="0"/>
 *         <element name="SttlmTmIndctn" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}SettlementDateTimeIndication1__1" minOccurs="0"/>
 *         <element name="RtrdInstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}BaseOneRate" minOccurs="0"/>
 *         <element name="CompstnAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}RestrictedFINActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}ChargeBearerType1Code" minOccurs="0"/>
 *         <element name="ChrgsInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}Charges7__1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ClrSysRef" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}HVPSPlus_RestrictedFINXMax35Text__3_" minOccurs="0"/>
 *         <element name="InstgAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}BranchAndFinancialInstitutionIdentification6__2"/>
 *         <element name="InstdAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}BranchAndFinancialInstitutionIdentification6__2"/>
 *         <element name="RtrChain" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}TransactionParties7__1"/>
 *         <element name="RtrRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09}PaymentReturnReason6__1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction112__1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", propOrder = {
    "rtrId",
    "orgnlGrpInf",
    "orgnlInstrId",
    "orgnlEndToEndId",
    "orgnlTxId",
    "orgnlUETR",
    "orgnlClrSysRef",
    "orgnlIntrBkSttlmAmt",
    "orgnlIntrBkSttlmDt",
    "rtrdIntrBkSttlmAmt",
    "intrBkSttlmDt",
    "sttlmPrty",
    "sttlmTmIndctn",
    "rtrdInstdAmt",
    "xchgRate",
    "compstnAmt",
    "chrgBr",
    "chrgsInf",
    "clrSysRef",
    "instgAgt",
    "instdAgt",
    "rtrChain",
    "rtrRsnInf"
})
public class PaymentTransaction1121 {

    /**
     * Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the returned transaction.
     *                         Usage: The instructing party is the party sending the return message and not the party that sent the original instruction that is being returned.
     * 
     */
    @XmlElement(name = "RtrId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected String rtrId;
    /**
     * Provides information on the original message.
     * 
     */
    @XmlElement(name = "OrgnlGrpInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected OriginalGroupInformation291 orgnlGrpInf;
    /**
     * Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction.
     * 
     */
    @XmlElement(name = "OrgnlInstrId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected String orgnlInstrId;
    /**
     * Unique identification, as assigned by the original initiating party, to unambiguously identify the original transaction.
     * 
     */
    @XmlElement(name = "OrgnlEndToEndId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    protected String orgnlEndToEndId;
    /**
     * Unique identification, as assigned by the original first instructing agent, to unambiguously identify the transaction.
     * 
     */
    @XmlElement(name = "OrgnlTxId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected String orgnlTxId;
    /**
     * Universally unique identifier to provide the original end-to-end reference of a payment transaction.
     * 
     */
    @XmlElement(name = "OrgnlUETR", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    protected String orgnlUETR;
    /**
     * Unique reference, as assigned by the original clearing system, to unambiguously identify the original instruction.
     * 
     */
    @XmlElement(name = "OrgnlClrSysRef", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected String orgnlClrSysRef;
    /**
     * Amount of money moved between the instructing agent and the instructed agent, as provided in the original instruction.
     * 
     */
    @XmlElement(name = "OrgnlIntrBkSttlmAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected RestrictedFINActiveCurrencyAndAmount orgnlIntrBkSttlmAmt;
    /**
     * Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.

     *                         

     *                         Usage: the OriginalInterbankSettlementDate is the interbank settlement date of the original instruction return message, and not of the return message.
     * 
     */
    @XmlElement(name = "OrgnlIntrBkSttlmDt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orgnlIntrBkSttlmDt;
    /**
     * Amount of money to be moved between the instructing agent and the instructed agent in the returned instruction.
     * 
     */
    @XmlElement(name = "RtrdIntrBkSttlmAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    protected RestrictedFINActiveCurrencyAndAmount rtrdIntrBkSttlmAmt;
    /**
     * Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.
     * 
     *                         Usage: the InterbankSettlementDate is the interbank settlement date of the return message, and not of the original instruction.
     * 
     */
    @XmlElement(name = "IntrBkSttlmDt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intrBkSttlmDt;
    /**
     * Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the settlement instruction.

     *                         

     *                         

     *                         Usage: the SettlementPriority is the settlement priority of the return message, and not of the original instruction.
     * 
     */
    @XmlElement(name = "SttlmPrty", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    @XmlSchemaType(name = "string")
    protected Priority3Code sttlmPrty;
    /**
     * Provides information on the occurred settlement time(s) of the payment transaction.
     * 
     */
    @XmlElement(name = "SttlmTmIndctn", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected SettlementDateTimeIndication11 sttlmTmIndctn;
    /**
     * Amount of money to be moved between the debtor and the creditor, before deduction of charges, in the returned transaction.

     *                         Usage: This amount has to be transported unchanged through the transaction chain.
     * 
     */
    @XmlElement(name = "RtrdInstdAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected RestrictedFINActiveCurrencyAndAmount rtrdInstdAmt;
    /**
     * Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency.
     * 
     */
    @XmlElement(name = "XchgRate", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected BigDecimal xchgRate;
    /**
     * Amount of money asked or paid as compensation for the processing of the instruction.
     * 
     */
    @XmlElement(name = "CompstnAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected RestrictedFINActiveCurrencyAndAmount compstnAmt;
    /**
     * Specifies which party/parties will bear the charges associated with the processing of the payment transaction.
     * 
     *                         Usage: The ChargeBearer applies to the return message, not to the original instruction.
     * 
     */
    @XmlElement(name = "ChrgBr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    @XmlSchemaType(name = "string")
    protected ChargeBearerType1Code chrgBr;
    /**
     * Provides information on the charges to be paid by the charge bearer(s) related to the processing of the return transaction.
     * 
     */
    @XmlElement(name = "ChrgsInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected List<Charges71> chrgsInf;
    /**
     * Unique reference, as assigned by the clearing system, to unambiguously identify the return instruction.
     * 
     */
    @XmlElement(name = "ClrSysRef", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09")
    protected String clrSysRef;
    /**
     * Agent that instructs the next party in the chain to carry out the (set of) instruction(s).
     * 
     *                         Usage: The instructing agent is the party sending the return message and not the party that sent the original instruction that is being returned.
     * 
     */
    @XmlElement(name = "InstgAgt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    protected BranchAndFinancialInstitutionIdentification62 instgAgt;
    /**
     * Agent that is instructed by the previous party in the chain to carry out the (set of) instruction(s).
     * 
     *                         Usage: The instructed agent is the party receiving the return message and not the party that received the original instruction that is being returned.
     * 
     */
    @XmlElement(name = "InstdAgt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    protected BranchAndFinancialInstitutionIdentification62 instdAgt;
    /**
     * Provides all parties (agents and non-agents) involved in a return transaction.
     * 
     */
    @XmlElement(name = "RtrChain", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    protected TransactionParties71 rtrChain;
    /**
     * Provides detailed information on the return reason.
     * 
     */
    @XmlElement(name = "RtrRsnInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.09", required = true)
    protected PaymentReturnReason61 rtrRsnInf;

    /**
     * Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the returned transaction.
     *                         Usage: The instructing party is the party sending the return message and not the party that sent the original instruction that is being returned.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtrId() {
        return rtrId;
    }

    /**
     * Sets the value of the rtrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRtrId()
     */
    public void setRtrId(String value) {
        this.rtrId = value;
    }

    /**
     * Provides information on the original message.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation291 }
     *     
     */
    public OriginalGroupInformation291 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation291 }
     *     
     * @see #getOrgnlGrpInf()
     */
    public void setOrgnlGrpInf(OriginalGroupInformation291 value) {
        this.orgnlGrpInf = value;
    }

    /**
     * Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlInstrId() {
        return orgnlInstrId;
    }

    /**
     * Sets the value of the orgnlInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgnlInstrId()
     */
    public void setOrgnlInstrId(String value) {
        this.orgnlInstrId = value;
    }

    /**
     * Unique identification, as assigned by the original initiating party, to unambiguously identify the original transaction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlEndToEndId() {
        return orgnlEndToEndId;
    }

    /**
     * Sets the value of the orgnlEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgnlEndToEndId()
     */
    public void setOrgnlEndToEndId(String value) {
        this.orgnlEndToEndId = value;
    }

    /**
     * Unique identification, as assigned by the original first instructing agent, to unambiguously identify the transaction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlTxId() {
        return orgnlTxId;
    }

    /**
     * Sets the value of the orgnlTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgnlTxId()
     */
    public void setOrgnlTxId(String value) {
        this.orgnlTxId = value;
    }

    /**
     * Universally unique identifier to provide the original end-to-end reference of a payment transaction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlUETR() {
        return orgnlUETR;
    }

    /**
     * Sets the value of the orgnlUETR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgnlUETR()
     */
    public void setOrgnlUETR(String value) {
        this.orgnlUETR = value;
    }

    /**
     * Unique reference, as assigned by the original clearing system, to unambiguously identify the original instruction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlClrSysRef() {
        return orgnlClrSysRef;
    }

    /**
     * Sets the value of the orgnlClrSysRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgnlClrSysRef()
     */
    public void setOrgnlClrSysRef(String value) {
        this.orgnlClrSysRef = value;
    }

    /**
     * Amount of money moved between the instructing agent and the instructed agent, as provided in the original instruction.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getOrgnlIntrBkSttlmAmt() {
        return orgnlIntrBkSttlmAmt;
    }

    /**
     * Sets the value of the orgnlIntrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     * @see #getOrgnlIntrBkSttlmAmt()
     */
    public void setOrgnlIntrBkSttlmAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.orgnlIntrBkSttlmAmt = value;
    }

    /**
     * Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.

     *                         

     *                         Usage: the OriginalInterbankSettlementDate is the interbank settlement date of the original instruction return message, and not of the return message.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgnlIntrBkSttlmDt() {
        return orgnlIntrBkSttlmDt;
    }

    /**
     * Sets the value of the orgnlIntrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getOrgnlIntrBkSttlmDt()
     */
    public void setOrgnlIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.orgnlIntrBkSttlmDt = value;
    }

    /**
     * Amount of money to be moved between the instructing agent and the instructed agent in the returned instruction.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getRtrdIntrBkSttlmAmt() {
        return rtrdIntrBkSttlmAmt;
    }

    /**
     * Sets the value of the rtrdIntrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     * @see #getRtrdIntrBkSttlmAmt()
     */
    public void setRtrdIntrBkSttlmAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.rtrdIntrBkSttlmAmt = value;
    }

    /**
     * Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.
     * 
     *                         Usage: the InterbankSettlementDate is the interbank settlement date of the return message, and not of the original instruction.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    /**
     * Sets the value of the intrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getIntrBkSttlmDt()
     */
    public void setIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.intrBkSttlmDt = value;
    }

    /**
     * Indicator of the urgency or order of importance that the instructing party would like the instructed party to apply to the processing of the settlement instruction.

     *                         

     *                         

     *                         Usage: the SettlementPriority is the settlement priority of the return message, and not of the original instruction.
     * 
     * @return
     *     possible object is
     *     {@link Priority3Code }
     *     
     */
    public Priority3Code getSttlmPrty() {
        return sttlmPrty;
    }

    /**
     * Sets the value of the sttlmPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority3Code }
     *     
     * @see #getSttlmPrty()
     */
    public void setSttlmPrty(Priority3Code value) {
        this.sttlmPrty = value;
    }

    /**
     * Provides information on the occurred settlement time(s) of the payment transaction.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDateTimeIndication11 }
     *     
     */
    public SettlementDateTimeIndication11 getSttlmTmIndctn() {
        return sttlmTmIndctn;
    }

    /**
     * Sets the value of the sttlmTmIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDateTimeIndication11 }
     *     
     * @see #getSttlmTmIndctn()
     */
    public void setSttlmTmIndctn(SettlementDateTimeIndication11 value) {
        this.sttlmTmIndctn = value;
    }

    /**
     * Amount of money to be moved between the debtor and the creditor, before deduction of charges, in the returned transaction.

     *                         Usage: This amount has to be transported unchanged through the transaction chain.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getRtrdInstdAmt() {
        return rtrdInstdAmt;
    }

    /**
     * Sets the value of the rtrdInstdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     * @see #getRtrdInstdAmt()
     */
    public void setRtrdInstdAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.rtrdInstdAmt = value;
    }

    /**
     * Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getXchgRate()
     */
    public void setXchgRate(BigDecimal value) {
        this.xchgRate = value;
    }

    /**
     * Amount of money asked or paid as compensation for the processing of the instruction.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getCompstnAmt() {
        return compstnAmt;
    }

    /**
     * Sets the value of the compstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     * @see #getCompstnAmt()
     */
    public void setCompstnAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.compstnAmt = value;
    }

    /**
     * Specifies which party/parties will bear the charges associated with the processing of the payment transaction.
     * 
     *                         Usage: The ChargeBearer applies to the return message, not to the original instruction.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public ChargeBearerType1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerType1Code }
     *     
     * @see #getChrgBr()
     */
    public void setChrgBr(ChargeBearerType1Code value) {
        this.chrgBr = value;
    }

    /**
     * Provides information on the charges to be paid by the charge bearer(s) related to the processing of the return transaction.
     * 
     * Gets the value of the chrgsInf property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrgsInf property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChrgsInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charges71 }
     * </p>
     * 
     * 
     * @return
     *     The value of the chrgsInf property.
     */
    public List<Charges71> getChrgsInf() {
        if (chrgsInf == null) {
            chrgsInf = new ArrayList<>();
        }
        return this.chrgsInf;
    }

    /**
     * Unique reference, as assigned by the clearing system, to unambiguously identify the return instruction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrSysRef() {
        return clrSysRef;
    }

    /**
     * Sets the value of the clrSysRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getClrSysRef()
     */
    public void setClrSysRef(String value) {
        this.clrSysRef = value;
    }

    /**
     * Agent that instructs the next party in the chain to carry out the (set of) instruction(s).
     * 
     *                         Usage: The instructing agent is the party sending the return message and not the party that sent the original instruction that is being returned.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification62 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification62 getInstgAgt() {
        return instgAgt;
    }

    /**
     * Sets the value of the instgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification62 }
     *     
     * @see #getInstgAgt()
     */
    public void setInstgAgt(BranchAndFinancialInstitutionIdentification62 value) {
        this.instgAgt = value;
    }

    /**
     * Agent that is instructed by the previous party in the chain to carry out the (set of) instruction(s).
     * 
     *                         Usage: The instructed agent is the party receiving the return message and not the party that received the original instruction that is being returned.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification62 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification62 getInstdAgt() {
        return instdAgt;
    }

    /**
     * Sets the value of the instdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification62 }
     *     
     * @see #getInstdAgt()
     */
    public void setInstdAgt(BranchAndFinancialInstitutionIdentification62 value) {
        this.instdAgt = value;
    }

    /**
     * Provides all parties (agents and non-agents) involved in a return transaction.
     * 
     * @return
     *     possible object is
     *     {@link TransactionParties71 }
     *     
     */
    public TransactionParties71 getRtrChain() {
        return rtrChain;
    }

    /**
     * Sets the value of the rtrChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionParties71 }
     *     
     * @see #getRtrChain()
     */
    public void setRtrChain(TransactionParties71 value) {
        this.rtrChain = value;
    }

    /**
     * Provides detailed information on the return reason.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReturnReason61 }
     *     
     */
    public PaymentReturnReason61 getRtrRsnInf() {
        return rtrRsnInf;
    }

    /**
     * Sets the value of the rtrRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReturnReason61 }
     *     
     * @see #getRtrRsnInf()
     */
    public void setRtrRsnInf(PaymentReturnReason61 value) {
        this.rtrRsnInf = value;
    }

}
