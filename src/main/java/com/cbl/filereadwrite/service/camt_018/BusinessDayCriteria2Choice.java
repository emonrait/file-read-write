
package com.cbl.filereadwrite.service.camt_018;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDayCriteria2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessDayCriteria2Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="NewCrit" type="{urn:swift:xsd:camt.018.001.03}BusinessDayCriteria1"/&gt;
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
@XmlType(name = "BusinessDayCriteria2Choice", namespace = "urn:swift:xsd:camt.018.001.03", propOrder = {
    "newCrit"
})
public class BusinessDayCriteria2Choice {

    @XmlElement(name = "NewCrit", namespace = "urn:swift:xsd:camt.018.001.03")
    protected BusinessDayCriteria1 newCrit;

    /**
     * Gets the value of the newCrit property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayCriteria1 }
     *     
     */
    public BusinessDayCriteria1 getNewCrit() {
        return newCrit;
    }

    /**
     * Sets the value of the newCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayCriteria1 }
     *     
     */
    public void setNewCrit(BusinessDayCriteria1 value) {
        this.newCrit = value;
    }

}
