
package com.cbl.filereadwrite.service.camt_018;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDayQuery1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessDayQuery1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QryTp" type="{urn:swift:xsd:camt.018.001.03}QueryType2Code" minOccurs="0"/&gt;
 *         &lt;element name="Crit" type="{urn:swift:xsd:camt.018.001.03}BusinessDayCriteria2Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDayQuery1", namespace = "urn:swift:xsd:camt.018.001.03", propOrder = {
    "qryTp",
    "crit"
})
public class BusinessDayQuery1 {

    @XmlElement(name = "QryTp", namespace = "urn:swift:xsd:camt.018.001.03")
    @XmlSchemaType(name = "string")
    protected QueryType2Code qryTp;
    @XmlElement(name = "Crit", namespace = "urn:swift:xsd:camt.018.001.03")
    protected BusinessDayCriteria2Choice crit;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType2Code }
     *     
     */
    public QueryType2Code getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType2Code }
     *     
     */
    public void setQryTp(QueryType2Code value) {
        this.qryTp = value;
    }

    /**
     * Gets the value of the crit property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayCriteria2Choice }
     *     
     */
    public BusinessDayCriteria2Choice getCrit() {
        return crit;
    }

    /**
     * Sets the value of the crit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayCriteria2Choice }
     *     
     */
    public void setCrit(BusinessDayCriteria2Choice value) {
        this.crit = value;
    }

}
