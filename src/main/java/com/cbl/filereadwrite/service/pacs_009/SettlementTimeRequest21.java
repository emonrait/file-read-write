
package com.cbl.filereadwrite.service.pacs_009;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Provides information on the requested settlement time(s)
 *                 of the payment instruction.
 * 
 * <p>Java class for SettlementTimeRequest2__1 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SettlementTimeRequest2__1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CLSTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08}HVPSPlus_Time" minOccurs="0"/>
 *         <element name="TillTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08}HVPSPlus_Time" minOccurs="0"/>
 *         <element name="FrTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08}HVPSPlus_Time" minOccurs="0"/>
 *         <element name="RjctTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08}HVPSPlus_Time" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementTimeRequest2__1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08", propOrder = {
    "clsTm",
    "tillTm",
    "frTm",
    "rjctTm"
})
public class SettlementTimeRequest21 {

    /**
     * Time by which the amount of money must be
     *                         credited, with confirmation, to the CLS Bank's account at the central bank.
     *                         Usage: Time must be expressed in Central European Time (CET).
     * 
     */
    @XmlElement(name = "CLSTm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar clsTm;
    /**
     * Time until when the payment may be settled.
     * 
     */
    @XmlElement(name = "TillTm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tillTm;
    /**
     * Time as from when the payment may be settled.
     * 
     */
    @XmlElement(name = "FrTm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar frTm;
    /**
     * Time by when the payment must be settled to
     *                         avoid rejection.
     * 
     */
    @XmlElement(name = "RjctTm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar rjctTm;

    /**
     * Time by which the amount of money must be
     *                         credited, with confirmation, to the CLS Bank's account at the central bank.
     *                         Usage: Time must be expressed in Central European Time (CET).
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCLSTm() {
        return clsTm;
    }

    /**
     * Sets the value of the clsTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCLSTm()
     */
    public void setCLSTm(XMLGregorianCalendar value) {
        this.clsTm = value;
    }

    /**
     * Time until when the payment may be settled.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTillTm() {
        return tillTm;
    }

    /**
     * Sets the value of the tillTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTillTm()
     */
    public void setTillTm(XMLGregorianCalendar value) {
        this.tillTm = value;
    }

    /**
     * Time as from when the payment may be settled.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrTm() {
        return frTm;
    }

    /**
     * Sets the value of the frTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getFrTm()
     */
    public void setFrTm(XMLGregorianCalendar value) {
        this.frTm = value;
    }

    /**
     * Time by when the payment must be settled to
     *                         avoid rejection.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRjctTm() {
        return rjctTm;
    }

    /**
     * Sets the value of the rjctTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getRjctTm()
     */
    public void setRjctTm(XMLGregorianCalendar value) {
        this.rjctTm = value;
    }

}
