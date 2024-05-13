
package com.cbl.filereadwrite.service.camt_018;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RequestType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RT11"/&gt;
 *     &lt;enumeration value="RT12"/&gt;
 *     &lt;enumeration value="RT13"/&gt;
 *     &lt;enumeration value="RT14"/&gt;
 *     &lt;enumeration value="RT15"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestType2Code", namespace = "urn:swift:xsd:camt.018.001.03")
@XmlEnum
public enum RequestType2Code {

    @XmlEnumValue("RT11")
    RT_11("RT11"),
    @XmlEnumValue("RT12")
    RT_12("RT12"),
    @XmlEnumValue("RT13")
    RT_13("RT13"),
    @XmlEnumValue("RT14")
    RT_14("RT14"),
    @XmlEnumValue("RT15")
    RT_15("RT15");
    private final String value;

    RequestType2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestType2Code fromValue(String v) {
        for (RequestType2Code c: RequestType2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
