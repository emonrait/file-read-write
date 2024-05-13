
package com.cbl.filereadwrite.service.camt_059_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for RemittanceAmount4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemittanceAmount4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RmtAmtAndTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}DocumentAmount1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AdjstmntAmtAndRsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.059.001.08}DocumentAdjustment1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceAmount4", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08", propOrder = {
    "rmtAmtAndTp",
    "adjstmntAmtAndRsn"
})
public class RemittanceAmount4 {

    @XmlElement(name = "RmtAmtAndTp", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected List<DocumentAmount1> rmtAmtAndTp;
    @XmlElement(name = "AdjstmntAmtAndRsn", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.059.001.08")
    protected List<DocumentAdjustment1> adjstmntAmtAndRsn;

    /**
     * Gets the value of the rmtAmtAndTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the javax XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rmtAmtAndTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRmtAmtAndTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentAmount1 }
     * 
     * 
     */
    public List<DocumentAmount1> getRmtAmtAndTp() {
        if (rmtAmtAndTp == null) {
            rmtAmtAndTp = new ArrayList<DocumentAmount1>();
        }
        return this.rmtAmtAndTp;
    }

    /**
     * Gets the value of the adjstmntAmtAndRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the javax XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the adjstmntAmtAndRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjstmntAmtAndRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentAdjustment1 }
     * 
     * 
     */
    public List<DocumentAdjustment1> getAdjstmntAmtAndRsn() {
        if (adjstmntAmtAndRsn == null) {
            adjstmntAmtAndRsn = new ArrayList<DocumentAdjustment1>();
        }
        return this.adjstmntAmtAndRsn;
    }

}
