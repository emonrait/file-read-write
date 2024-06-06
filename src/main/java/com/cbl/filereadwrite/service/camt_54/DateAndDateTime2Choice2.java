
package com.cbl.filereadwrite.service.camt_54;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Choice between a date or a date and time format.
 * 
 * <p>Java class for DateAndDateTime2Choice__2 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DateAndDateTime2Choice__2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}ISODate"/>
 *         <element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}HVPSPlus_DateTime__3_"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndDateTime2Choice__2", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.08", propOrder = {
    "dt",
    "dtTm"
})
public class DateAndDateTime2Choice2 {

    /**
     * Specified date.
     * 
     */
    @XmlElement(name = "Dt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.08")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    /**
     * Specified date and time.
     * 
     */
    @XmlElement(name = "DtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.08")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtTm;

    /**
     * Specified date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDt()
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Specified date and time.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDtTm()
     */
    public void setDtTm(XMLGregorianCalendar value) {
        this.dtTm = value;
    }

}
