
package com.cbl.filereadwrite.service.pacs_008;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies if an operation is an increase or a decrease.
 * 
 * <p>Java class for CreditDebitCode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CreditDebitCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRDT"/>
 *     <enumeration value="DBIT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CreditDebitCode", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08")
@XmlEnum
public enum CreditDebitCode {


    /**
     * Operation is an increase.
     * 
     */
    CRDT,

    /**
     * Operation is a decrease.
     * 
     */
    DBIT;

    public String value() {
        return name();
    }

    public static CreditDebitCode fromValue(String v) {
        return valueOf(v);
    }

}
