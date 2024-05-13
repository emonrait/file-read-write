
package com.cbl.filereadwrite.service.camt_018;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RequestType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RT01"/&gt;
 *     &lt;enumeration value="RT02"/&gt;
 *     &lt;enumeration value="RT03"/&gt;
 *     &lt;enumeration value="RT04"/&gt;
 *     &lt;enumeration value="RT05"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestType1Code", namespace = "urn:swift:xsd:camt.018.001.03")
@XmlEnum
public enum RequestType1Code {

    @XmlEnumValue("RT01")
    RT_01("RT01"),
    @XmlEnumValue("RT02")
    RT_02("RT02"),
    @XmlEnumValue("RT03")
    RT_03("RT03"),
    @XmlEnumValue("RT04")
    RT_04("RT04"),
    @XmlEnumValue("RT05")
    RT_05("RT05");
    private final String value;

    RequestType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestType1Code fromValue(String v) {
        for (RequestType1Code c: RequestType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
