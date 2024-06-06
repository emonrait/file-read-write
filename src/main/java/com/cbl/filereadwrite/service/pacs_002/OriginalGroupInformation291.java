
package com.cbl.filereadwrite.service.pacs_002;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Unique and unambiguous identifier of the group of transactions as assigned by the original instructing party.
 * 
 * <p>Java class for OriginalGroupInformation29__1 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OriginalGroupInformation29__1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrgnlMsgId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}HVPSPlus_RestrictedFINXMax35Text__3_"/>
 *         <element name="OrgnlMsgNmId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}HVPSPlus_RestrictedFINXMax35Text__3_"/>
 *         <element name="OrgnlCreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}HVPSPlus_DateTime__3_" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalGroupInformation29__1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", propOrder = {
    "orgnlMsgId",
    "orgnlMsgNmId",
    "orgnlCreDtTm"
})
public class OriginalGroupInformation291 {

    /**
     * Point to point reference assigned by the original instructing party to unambiguously identify the original message.
     * 
     */
    @XmlElement(name = "OrgnlMsgId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", required = true)
    protected String orgnlMsgId;
    /**
     * Specifies the original message name identifier to which the message refers, for example, pacs.003.001.01 or MT103.
     * 
     */
    @XmlElement(name = "OrgnlMsgNmId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", required = true)
    protected String orgnlMsgNmId;
    /**
     * Original date and time at which the message was created.
     * 
     */
    @XmlElement(name = "OrgnlCreDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orgnlCreDtTm;

    /**
     * Point to point reference assigned by the original instructing party to unambiguously identify the original message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgId() {
        return orgnlMsgId;
    }

    /**
     * Sets the value of the orgnlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgnlMsgId()
     */
    public void setOrgnlMsgId(String value) {
        this.orgnlMsgId = value;
    }

    /**
     * Specifies the original message name identifier to which the message refers, for example, pacs.003.001.01 or MT103.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgNmId() {
        return orgnlMsgNmId;
    }

    /**
     * Sets the value of the orgnlMsgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgnlMsgNmId()
     */
    public void setOrgnlMsgNmId(String value) {
        this.orgnlMsgNmId = value;
    }

    /**
     * Original date and time at which the message was created.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgnlCreDtTm() {
        return orgnlCreDtTm;
    }

    /**
     * Sets the value of the orgnlCreDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getOrgnlCreDtTm()
     */
    public void setOrgnlCreDtTm(XMLGregorianCalendar value) {
        this.orgnlCreDtTm = value;
    }

}
