
package com.cbl.filereadwrite.service.camt_059_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TaxAmount3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxAmount3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}PercentageRate" minOccurs="0"/&gt;
 *         &lt;element name="TaxblBaseAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="Dtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}TaxRecordDetails3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxAmount3", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08", propOrder = {
    "rate",
    "taxblBaseAmt",
    "ttlAmt",
    "dtls"
})
public class TaxAmount3 {

    @XmlElement(name = "Rate", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected BigDecimal rate;
    @XmlElement(name = "TaxblBaseAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected ActiveOrHistoricCurrencyAndAmount taxblBaseAmt;
    @XmlElement(name = "TtlAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected ActiveOrHistoricCurrencyAndAmount ttlAmt;
    @XmlElement(name = "Dtls", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected List<TaxRecordDetails3> dtls;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the taxblBaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTaxblBaseAmt() {
        return taxblBaseAmt;
    }

    /**
     * Sets the value of the taxblBaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTaxblBaseAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.taxblBaseAmt = value;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlAmt = value;
    }

    /**
     * Gets the value of the dtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the javax XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxRecordDetails3 }
     * 
     * 
     */
    public List<TaxRecordDetails3> getDtls() {
        if (dtls == null) {
            dtls = new ArrayList<TaxRecordDetails3>();
        }
        return this.dtls;
    }

}
