
package com.cbl.filereadwrite.service.camt_059_001;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NtfctnToRcvStsRpt" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}NotificationToReceiveStatusReportV08"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08", propOrder = {
    "ntfctnToRcvStsRpt"
})
@XmlRootElement
public class Document {

    @XmlElement(name = "NtfctnToRcvStsRpt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08", required = true)
    protected NotificationToReceiveStatusReportV08 ntfctnToRcvStsRpt;

    /**
     * Gets the value of the ntfctnToRcvStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationToReceiveStatusReportV08 }
     *     
     */
    public NotificationToReceiveStatusReportV08 getNtfctnToRcvStsRpt() {
        return ntfctnToRcvStsRpt;
    }

    /**
     * Sets the value of the ntfctnToRcvStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationToReceiveStatusReportV08 }
     *     
     */
    public void setNtfctnToRcvStsRpt(NotificationToReceiveStatusReportV08 value) {
        this.ntfctnToRcvStsRpt = value;
    }

}
