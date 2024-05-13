
package com.cbl.filereadwrite.service.camt_018;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBusinessDayInformationV03CMA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBusinessDayInformationV03CMA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgHdr" type="{urn:swift:xsd:camt.018.001.03}CAMT018MessageHeader2CMA"/&gt;
 *         &lt;element name="BizDayInfQryDef" type="{urn:swift:xsd:camt.018.001.03}BusinessDayQuery1CMA"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBusinessDayInformationV03CMA", namespace = "urn:swift:xsd:camt.018.001.03", propOrder = {
    "msgHdr",
    "bizDayInfQryDef"
})
public class GetBusinessDayInformationV03CMA {

    @XmlElement(name = "MsgHdr", namespace = "urn:swift:xsd:camt.018.001.03", required = true)
    protected CAMT018MessageHeader2CMA msgHdr;
    @XmlElement(name = "BizDayInfQryDef", namespace = "urn:swift:xsd:camt.018.001.03", required = true)
    protected BusinessDayQuery1CMA bizDayInfQryDef;

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
     *     {@link BusinessDayQuery1CMA }
     *     
     */
    public BusinessDayQuery1CMA getBizDayInfQryDef() {
        return bizDayInfQryDef;
    }

    /**
     * Sets the value of the bizDayInfQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayQuery1CMA }
     *     
     */
    public void setBizDayInfQryDef(BusinessDayQuery1CMA value) {
        this.bizDayInfQryDef = value;
    }

}
