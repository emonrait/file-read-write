
package com.cbl.filereadwrite.service.camt_018;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Revision" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Body"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}AppHdr"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element ref="{urn:swift:xsd:camt.018.001.03}Document" minOccurs="0"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "revision",
    "body"
})
@XmlRootElement(name = "DataPDU", namespace = "urn:swift:saa:xsd:saa.2.0")
public class DataPDU {

    @XmlElement(name = "Revision", namespace = "urn:swift:saa:xsd:saa.2.0", required = true)
    protected String revision;
    @XmlElement(name = "Body", namespace = "urn:swift:saa:xsd:saa.2.0", required = true)
    protected DataPDU.Body body;

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link DataPDU.Body }
     *     
     */
    public DataPDU.Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPDU.Body }
     *     
     */
    public void setBody(DataPDU.Body value) {
        this.body = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}AppHdr"/&gt;
     *         &lt;choice&gt;
     *           &lt;element ref="{urn:swift:xsd:camt.018.001.03}Document" minOccurs="0"/&gt;
     *         &lt;/choice&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "appHdr",
        "document"
    })
    public static class Body {

        @XmlElement(name = "AppHdr", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", required = true)
        protected BusinessApplicationHeaderV01 appHdr;
        @XmlElement(name = "Document", namespace = "urn:swift:xsd:camt.018.001.03")
        protected Document document;

        /**
         * Gets the value of the appHdr property.
         * 
         * @return
         *     possible object is
         *     {@link BusinessApplicationHeaderV01 }
         *     
         */
        public BusinessApplicationHeaderV01 getAppHdr() {
            return appHdr;
        }

        /**
         * Sets the value of the appHdr property.
         * 
         * @param value
         *     allowed object is
         *     {@link BusinessApplicationHeaderV01 }
         *     
         */
        public void setAppHdr(BusinessApplicationHeaderV01 value) {
            this.appHdr = value;
        }

        /**
         * Gets the value of the document property.
         * 
         * @return
         *     possible object is
         *     {@link Document }
         *     
         */
        public Document getDocument() {
            return document;
        }

        /**
         * Sets the value of the document property.
         * 
         * @param value
         *     allowed object is
         *     {@link Document }
         *     
         */
        public void setDocument(Document value) {
            this.document = value;
        }

    }

}
