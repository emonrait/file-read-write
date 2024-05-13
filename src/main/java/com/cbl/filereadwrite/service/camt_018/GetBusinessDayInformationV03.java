
package com.cbl.filereadwrite.service.camt_018;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBusinessDayInformationV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBusinessDayInformationV03"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgHdr" type="{urn:swift:xsd:camt.018.001.03}CAMT018MessageHeader2CMA"/&gt;
 *         &lt;element name="BizDayInfQryDef" type="{urn:swift:xsd:camt.018.001.03}BusinessDayQuery1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBusinessDayInformationV03", namespace = "urn:swift:xsd:camt.018.001.03", propOrder = {
    "msgHdr",
    "bizDayInfQryDef"
})
public class GetBusinessDayInformationV03 {

    @XmlElement(name = "MsgHdr", namespace = "urn:swift:xsd:camt.018.001.03", required = true)
    protected CAMT018MessageHeader2CMA msgHdr;
    @XmlElement(name = "BizDayInfQryDef", namespace = "urn:swift:xsd:camt.018.001.03")
    protected BusinessDayQuery1 bizDayInfQryDef;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link CAMT018MessageHeader2CMA }
     *     
     */
    public CAMT018MessageHeader2CMA getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAMT018MessageHeader2CMA }
     *     
     */
    public void setMsgHdr(CAMT018MessageHeader2CMA value) {
        this.msgHdr = value;
    }

    /**
     * Gets the value of the bizDayInfQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayQuery1 }
     *     
     */
    public BusinessDayQuery1 getBizDayInfQryDef() {
        return bizDayInfQryDef;
    }

    /**
     * Sets the value of the bizDayInfQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayQuery1 }
     *     
     */
    public void setBizDayInfQryDef(BusinessDayQuery1 value) {
        this.bizDayInfQryDef = value;
    }

}
