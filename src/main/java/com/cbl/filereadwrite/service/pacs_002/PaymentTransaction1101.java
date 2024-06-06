
package com.cbl.filereadwrite.service.pacs_002;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides further details on the original transactions, to which the status report message refers.
 * 
 * <p>Java class for PaymentTransaction110__1 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentTransaction110__1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StsId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}HVPSPlus_RestrictedFINXMax35Text__3_" minOccurs="0"/>
 *         <element name="OrgnlGrpInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}OriginalGroupInformation29__1"/>
 *         <element name="OrgnlInstrId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}HVPSPlus_RestrictedFINXMax35Text__3_" minOccurs="0"/>
 *         <element name="OrgnlEndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}HVPSPlus_RestrictedFINXMax35Text__3_"/>
 *         <element name="OrgnlTxId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}HVPSPlus_RestrictedFINXMax35Text__3_" minOccurs="0"/>
 *         <element name="OrgnlUETR" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}UUIDv4Identifier"/>
 *         <element name="TxSts" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}ExternalPaymentTransactionStatus1Code"/>
 *         <element name="StsRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}StatusReasonInformation12__1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ChrgsInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}Charges7__1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AccptncDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}HVPSPlus_DateTime__3_" minOccurs="0"/>
 *         <element name="FctvIntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}DateAndDateTime2Choice__1" minOccurs="0"/>
 *         <element name="ClrSysRef" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}HVPSPlus_RestrictedFINXMax35Text__3_" minOccurs="0"/>
 *         <element name="InstgAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}BranchAndFinancialInstitutionIdentification6__2"/>
 *         <element name="InstdAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}BranchAndFinancialInstitutionIdentification6__2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction110__1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", propOrder = {
    "stsId",
    "orgnlGrpInf",
    "orgnlInstrId",
    "orgnlEndToEndId",
    "orgnlTxId",
    "orgnlUETR",
    "txSts",
    "stsRsnInf",
    "chrgsInf",
    "accptncDtTm",
    "fctvIntrBkSttlmDt",
    "clrSysRef",
    "instgAgt",
    "instdAgt"
})
public class PaymentTransaction1101 {

    /**
     * Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the reported status.
     * Usage: The instructing party is the party sending the status message and not the party that sent the original instruction that is being reported on.
     * 
     */
    @XmlElement(name = "StsId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    protected String stsId;
    /**
     * Point to point reference, as assigned by the original instructing party, to unambiguously identify the original message.
     * 
     */
    @XmlElement(name = "OrgnlGrpInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", required = true)
    protected OriginalGroupInformation291 orgnlGrpInf;
    /**
     * Unique identification, as assigned by the original instructing party for the original instructed party, to unambiguously identify the original instruction.
     * 
     */
    @XmlElement(name = "OrgnlInstrId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    protected String orgnlInstrId;
    /**
     * Unique identification, as assigned by the original initiating party, to unambiguously identify the original transaction.
     * 
     */
    @XmlElement(name = "OrgnlEndToEndId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", required = true)
    protected String orgnlEndToEndId;
    /**
     * Unique identification, as assigned by the original first instructing agent, to unambiguously identify the transaction.
     * 
     */
    @XmlElement(name = "OrgnlTxId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    protected String orgnlTxId;
    /**
     * Universally unique identifier to provide the original end-to-end reference of a payment transaction.
     * 
     */
    @XmlElement(name = "OrgnlUETR", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", required = true)
    protected String orgnlUETR;
    /**
     * Specifies the status of a transaction, in a coded form.
     * 
     */
    @XmlElement(name = "TxSts", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", required = true)
    protected String txSts;
    /**
     * Provides detailed information on the status reason.
     * 
     */
    @XmlElement(name = "StsRsnInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    protected List<StatusReasonInformation121> stsRsnInf;
    /**
     * Provides information on the charges related to the processing of the rejection of the instruction.
     * 
     * Usage: This is passed on for information purposes only. Settlement of the charges will be done separately.
     * 
     */
    @XmlElement(name = "ChrgsInf", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    protected List<Charges71> chrgsInf;
    /**
     * Point in time when the payment order from the initiating party meets the processing conditions of the account servicing agent. This means that the account servicing agent has received the payment order and has applied checks such as authorisation, availability of funds.
     * 
     */
    @XmlElement(name = "AccptncDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accptncDtTm;
    /**
     * Date and time at which a transaction is completed and cleared, that is, payment is effected.
     * 
     */
    @XmlElement(name = "FctvIntrBkSttlmDt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    protected DateAndDateTime2Choice1 fctvIntrBkSttlmDt;
    /**
     * Unique reference, as assigned by a clearing system, to unambiguously identify the instruction.
     * 
     */
    @XmlElement(name = "ClrSysRef", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    protected String clrSysRef;
    /**
     * Agent that instructs the next party in the chain to carry out the (set of) instruction(s).
     * 
     * Usage: The instructing agent is the party sending the status message and not the party that sent the original instruction that is being reported on.
     * 
     */
    @XmlElement(name = "InstgAgt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", required = true)
    protected BranchAndFinancialInstitutionIdentification62 instgAgt;
    /**
     * Agent that is instructed by the previous party in the chain to carry out the (set of) instruction(s).
     * 
     * Usage: The instructed agent is the party receiving the status message and not the party that received the original instruction that is being reported on.
     * 
     */
    @XmlElement(name = "InstdAgt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", required = true)
    protected BranchAndFinancialInstitutionIdentification62 instdAgt;

    /**
     * Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the reported status.
     * Usage: The instructing party is the party sending the status message and not the party that sent the original instruction that is being reported on.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsId() {
        return stsId;
    }

    /**
     * Sets the value of the stsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStsId()
     */
    public void setStsId(String value) {
        this.stsId = value;
    }

    /**
     * Point to point reference, as assigned by the original instructing party, to unambiguously identify the original message.
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
     * Specifies the status of a transaction, in a coded form.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxSts() {
        return txSts;
    }

    /**
     * Sets the value of the txSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTxSts()
     */
    public void setTxSts(String value) {
        this.txSts = value;
    }

    /**
     * Provides detailed information on the status reason.
     * 
     * Gets the value of the stsRsnInf property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stsRsnInf property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStsRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReasonInformation121 }
     * </p>
     * 
     * 
     * @return
     *     The value of the stsRsnInf property.
     */
    public List<StatusReasonInformation121> getStsRsnInf() {
        if (stsRsnInf == null) {
            stsRsnInf = new ArrayList<>();
        }
        return this.stsRsnInf;
    }

    /**
     * Provides information on the charges related to the processing of the rejection of the instruction.
     * 
     * Usage: This is passed on for information purposes only. Settlement of the charges will be done separately.
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
     * Point in time when the payment order from the initiating party meets the processing conditions of the account servicing agent. This means that the account servicing agent has received the payment order and has applied checks such as authorisation, availability of funds.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccptncDtTm() {
        return accptncDtTm;
    }

    /**
     * Sets the value of the accptncDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getAccptncDtTm()
     */
    public void setAccptncDtTm(XMLGregorianCalendar value) {
        this.accptncDtTm = value;
    }

    /**
     * Date and time at which a transaction is completed and cleared, that is, payment is effected.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice1 }
     *     
     */
    public DateAndDateTime2Choice1 getFctvIntrBkSttlmDt() {
        return fctvIntrBkSttlmDt;
    }

    /**
     * Sets the value of the fctvIntrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice1 }
     *     
     * @see #getFctvIntrBkSttlmDt()
     */
    public void setFctvIntrBkSttlmDt(DateAndDateTime2Choice1 value) {
        this.fctvIntrBkSttlmDt = value;
    }

    /**
     * Unique reference, as assigned by a clearing system, to unambiguously identify the instruction.
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
     * Usage: The instructing agent is the party sending the status message and not the party that sent the original instruction that is being reported on.
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
     * Usage: The instructed agent is the party receiving the status message and not the party that received the original instruction that is being reported on.
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

}
