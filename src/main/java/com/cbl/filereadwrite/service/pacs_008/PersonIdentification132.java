
package com.cbl.filereadwrite.service.pacs_008;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Unique and unambiguous way to identify a person.
 * 
 * <p>Java class for PersonIdentification13__2 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PersonIdentification13__2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DtAndPlcOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}DateAndPlaceOfBirth1__1" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08}GenericPersonIdentification1__2" maxOccurs="2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentification13__2", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08", propOrder = {
    "dtAndPlcOfBirth",
    "othr"
})
public class PersonIdentification132 {

    /**
     * Date and place of birth of a person.
     * 
     */
    @XmlElement(name = "DtAndPlcOfBirth", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08")
    protected DateAndPlaceOfBirth11 dtAndPlcOfBirth;
    /**
     * Unique identification of a person, as assigned by an institution, using an identification scheme.
     * 
     */
    @XmlElement(name = "Othr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08")
    protected List<GenericPersonIdentification12> othr;

    /**
     * Date and place of birth of a person.
     * 
     * @return
     *     possible object is
     *     {@link DateAndPlaceOfBirth11 }
     *     
     */
    public DateAndPlaceOfBirth11 getDtAndPlcOfBirth() {
        return dtAndPlcOfBirth;
    }

    /**
     * Sets the value of the dtAndPlcOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndPlaceOfBirth11 }
     *     
     * @see #getDtAndPlcOfBirth()
     */
    public void setDtAndPlcOfBirth(DateAndPlaceOfBirth11 value) {
        this.dtAndPlcOfBirth = value;
    }

    /**
     * Unique identification of a person, as assigned by an institution, using an identification scheme.
     * 
     * Gets the value of the othr property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othr property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericPersonIdentification12 }
     * </p>
     * 
     * 
     * @return
     *     The value of the othr property.
     */
    public List<GenericPersonIdentification12> getOthr() {
        if (othr == null) {
            othr = new ArrayList<>();
        }
        return this.othr;
    }

}
