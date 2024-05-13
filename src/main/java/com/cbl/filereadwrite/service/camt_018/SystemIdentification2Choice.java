
package com.cbl.filereadwrite.service.camt_018;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemIdentification2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemIdentification2Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="MktInfrstrctrId" type="{urn:swift:xsd:camt.018.001.03}MarketInfrastructureIdentification1Choice"/&gt;
 *           &lt;element name="Ctry" type="{urn:swift:xsd:camt.018.001.03}CountryCode"/&gt;
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
@XmlType(name = "SystemIdentification2Choice", namespace = "urn:swift:xsd:camt.018.001.03", propOrder = {
    "mktInfrstrctrId",
    "ctry"
})
public class SystemIdentification2Choice {

    @XmlElement(name = "MktInfrstrctrId", namespace = "urn:swift:xsd:camt.018.001.03")
    protected MarketInfrastructureIdentification1Choice mktInfrstrctrId;
    @XmlElement(name = "Ctry", namespace = "urn:swift:xsd:camt.018.001.03")
    protected String ctry;

    /**
     * Gets the value of the mktInfrstrctrId property.
     * 
     * @return
     *     possible object is
     *     {@link MarketInfrastructureIdentification1Choice }
     *     
     */
    public MarketInfrastructureIdentification1Choice getMktInfrstrctrId() {
        return mktInfrstrctrId;
    }

    /**
     * Sets the value of the mktInfrstrctrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketInfrastructureIdentification1Choice }
     *     
     */
    public void setMktInfrstrctrId(MarketInfrastructureIdentification1Choice value) {
        this.mktInfrstrctrId = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

}
