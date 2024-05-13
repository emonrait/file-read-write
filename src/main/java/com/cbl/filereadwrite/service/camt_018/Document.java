
package com.cbl.filereadwrite.service.camt_018;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetBizDayInf" type="{urn:swift:xsd:camt.018.001.03}GetBusinessDayInformationV03CMA"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", namespace = "urn:swift:xsd:camt.018.001.03", propOrder = {
    "getBizDayInf"
})
public class Document {

    @XmlElement(name = "GetBizDayInf", namespace = "urn:swift:xsd:camt.018.001.03", required = true)
    protected GetBusinessDayInformationV03CMA getBizDayInf;

    /**
     * Gets the value of the getBizDayInf property.
     * 
     * @return
     *     possible object is
     *     {@link GetBusinessDayInformationV03CMA }
     *     
     */
    public GetBusinessDayInformationV03CMA getGetBizDayInf() {
        return getBizDayInf;
    }

    /**
     * Sets the value of the getBizDayInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBusinessDayInformationV03CMA }
     *     
     */
    public void setGetBizDayInf(GetBusinessDayInformationV03CMA value) {
        this.getBizDayInf = value;
    }

}
