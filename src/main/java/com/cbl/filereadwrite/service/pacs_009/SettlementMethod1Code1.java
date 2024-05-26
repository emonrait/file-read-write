
package com.cbl.filereadwrite.service.pacs_009;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Specifies the method used to settle the credit transfer
 *                 instruction.
 * 
 * <p>Java class for SettlementMethod1Code__1</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SettlementMethod1Code__1">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CLRG"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SettlementMethod1Code__1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08")
@XmlEnum
public enum SettlementMethod1Code1 {


    /**
     * Settlement is done through a payment clearing
     *                         system.
     * 
     */
    CLRG;

    public String value() {
        return name();
    }

    public static SettlementMethod1Code1 fromValue(String v) {
        return valueOf(v);
    }

}
