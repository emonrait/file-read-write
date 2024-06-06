
package com.cbl.filereadwrite.service.pacs_002;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Set of characteristics shared by all individual transactions included in the message.
 * 
 * <p>Java class for GroupHeader91__1 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GroupHeader91__1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}HVPSPlus_RestrictedFINXMax35Text__3_"/>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10}HVPSPlus_DateTime__3_"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader91__1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", propOrder = {
    "msgId",
    "creDtTm"
})
public class GroupHeader911 {

    /**
     * Point to point reference, as assigned by the instructing party, and sent to the next party in the chain to unambiguously identify the message.
     * Usage: The instructing party has to make sure that MessageIdentification is unique per instructed party for a pre-agreed period.
     * 
     */
    @XmlElement(name = "MsgId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", required = true)
    protected String msgId;
    /**
     * Date and time at which the message was created.
     * 
     */
    @XmlElement(name = "CreDtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.10", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;

    /**
     * Point to point reference, as assigned by the instructing party, and sent to the next party in the chain to unambiguously identify the message.
     * Usage: The instructing party has to make sure that MessageIdentification is unique per instructed party for a pre-agreed period.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMsgId()
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Date and time at which the message was created.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCreDtTm()
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

}
