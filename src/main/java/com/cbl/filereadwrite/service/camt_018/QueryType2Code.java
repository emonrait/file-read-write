
package com.cbl.filereadwrite.service.camt_018;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="QueryType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALLL"/&gt;
 *     &lt;enumeration value="CHNG"/&gt;
 *     &lt;enumeration value="MODF"/&gt;
 *     &lt;enumeration value="DELD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QueryType2Code", namespace = "urn:swift:xsd:camt.018.001.03")
@XmlEnum
public enum QueryType2Code {

    ALLL,
    CHNG,
    MODF,
    DELD;

    public String value() {
        return name();
    }

    public static QueryType2Code fromValue(String v) {
        return valueOf(v);
    }

}
