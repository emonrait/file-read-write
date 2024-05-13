
package com.cbl.filereadwrite.service.camt_018;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemEventType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SystemEventType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LVCO"/&gt;
 *     &lt;enumeration value="LVCC"/&gt;
 *     &lt;enumeration value="LVRT"/&gt;
 *     &lt;enumeration value="EUSU"/&gt;
 *     &lt;enumeration value="STSU"/&gt;
 *     &lt;enumeration value="LWSU"/&gt;
 *     &lt;enumeration value="EUCO"/&gt;
 *     &lt;enumeration value="FIRE"/&gt;
 *     &lt;enumeration value="STDY"/&gt;
 *     &lt;enumeration value="LTNC"/&gt;
 *     &lt;enumeration value="CRCO"/&gt;
 *     &lt;enumeration value="RECC"/&gt;
 *     &lt;enumeration value="LTGC"/&gt;
 *     &lt;enumeration value="LTDC"/&gt;
 *     &lt;enumeration value="CUSC"/&gt;
 *     &lt;enumeration value="IBKC"/&gt;
 *     &lt;enumeration value="SYSC"/&gt;
 *     &lt;enumeration value="SSSC"/&gt;
 *     &lt;enumeration value="REOP"/&gt;
 *     &lt;enumeration value="PCOT"/&gt;
 *     &lt;enumeration value="NPCT"/&gt;
 *     &lt;enumeration value="ESTF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SystemEventType2Code", namespace = "urn:swift:xsd:camt.018.001.03")
@XmlEnum
public enum SystemEventType2Code {

    LVCO,
    LVCC,
    LVRT,
    EUSU,
    STSU,
    LWSU,
    EUCO,
    FIRE,
    STDY,
    LTNC,
    CRCO,
    RECC,
    LTGC,
    LTDC,
    CUSC,
    IBKC,
    SYSC,
    SSSC,
    REOP,
    PCOT,
    NPCT,
    ESTF;

    public String value() {
        return name();
    }

    public static SystemEventType2Code fromValue(String v) {
        return valueOf(v);
    }

}
