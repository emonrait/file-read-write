
package com.cbl.filereadwrite.service.camt_018;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDayCriteria1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessDayCriteria1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SchCrit" type="{urn:swift:xsd:camt.018.001.03}BusinessDaySearchCriteria1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDayCriteria1", namespace = "urn:swift:xsd:camt.018.001.03", propOrder = {
    "schCrit"
})
public class BusinessDayCriteria1 {

    @XmlElement(name = "SchCrit", namespace = "urn:swift:xsd:camt.018.001.03", required = true)
    protected BusinessDaySearchCriteria1 schCrit;

    /**
     * Gets the value of the schCrit property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDaySearchCriteria1 }
     *     
     */
    public BusinessDaySearchCriteria1 getSchCrit() {
        return schCrit;
    }

    /**
     * Sets the value of the schCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDaySearchCriteria1 }
     *     
     */
    public void setSchCrit(BusinessDaySearchCriteria1 value) {
        this.schCrit = value;
    }

}
