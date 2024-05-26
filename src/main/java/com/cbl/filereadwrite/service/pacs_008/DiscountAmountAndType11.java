
package com.cbl.filereadwrite.service.pacs_008;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the amount with a specific type.
 * 
 * <p>Java class for DiscountAmountAndType1__1 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DiscountAmountAndType1__1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}DiscountAmountType1Choice__1" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}ActiveOrHistoricCurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountAmountAndType1__1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08", propOrder = {
    "tp",
    "amt"
})
public class DiscountAmountAndType11 {

    /**
     * Specifies the type of the amount.
     * 
     */
    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08")
    protected DiscountAmountType1Choice1 tp;
    /**
     * Amount of money, which has been typed.
     * 
     */
    @XmlElement(name = "Amt", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;

    /**
     * Specifies the type of the amount.
     * 
     * @return
     *     possible object is
     *     {@link DiscountAmountType1Choice1 }
     *     
     */
    public DiscountAmountType1Choice1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountAmountType1Choice1 }
     *     
     * @see #getTp()
     */
    public void setTp(DiscountAmountType1Choice1 value) {
        this.tp = value;
    }

    /**
     * Amount of money, which has been typed.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     * @see #getAmt()
     */
    public void setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
    }

}
