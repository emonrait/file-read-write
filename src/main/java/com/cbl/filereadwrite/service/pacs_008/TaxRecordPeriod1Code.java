
package com.cbl.filereadwrite.service.pacs_008;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the period related to the tax payment.
 * 
 * <p>Java class for TaxRecordPeriod1Code</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TaxRecordPeriod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MM01"/>
 *     <enumeration value="MM02"/>
 *     <enumeration value="MM03"/>
 *     <enumeration value="MM04"/>
 *     <enumeration value="MM05"/>
 *     <enumeration value="MM06"/>
 *     <enumeration value="MM07"/>
 *     <enumeration value="MM08"/>
 *     <enumeration value="MM09"/>
 *     <enumeration value="MM10"/>
 *     <enumeration value="MM11"/>
 *     <enumeration value="MM12"/>
 *     <enumeration value="QTR1"/>
 *     <enumeration value="QTR2"/>
 *     <enumeration value="QTR3"/>
 *     <enumeration value="QTR4"/>
 *     <enumeration value="HLF1"/>
 *     <enumeration value="HLF2"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxRecordPeriod1Code", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08")
@XmlEnum
public enum TaxRecordPeriod1Code {


    /**
     * Tax is related to the second month of the period.
     * 
     */
    @XmlEnumValue("MM01")
    MM_01("MM01"),

    /**
     * Tax is related to the first month of the period.
     * 
     */
    @XmlEnumValue("MM02")
    MM_02("MM02"),

    /**
     * Tax is related to the third month of the period.
     * 
     */
    @XmlEnumValue("MM03")
    MM_03("MM03"),

    /**
     * Tax is related to the fourth month of the period.
     * 
     */
    @XmlEnumValue("MM04")
    MM_04("MM04"),

    /**
     * Tax is related to the fifth month of the period.
     * 
     */
    @XmlEnumValue("MM05")
    MM_05("MM05"),

    /**
     * Tax is related to the sixth month of the period.
     * 
     */
    @XmlEnumValue("MM06")
    MM_06("MM06"),

    /**
     * Tax is related to the seventh month of the period.
     * 
     */
    @XmlEnumValue("MM07")
    MM_07("MM07"),

    /**
     * Tax is related to the eighth month of the period.
     * 
     */
    @XmlEnumValue("MM08")
    MM_08("MM08"),

    /**
     * Tax is related to the ninth month of the period.
     * 
     */
    @XmlEnumValue("MM09")
    MM_09("MM09"),

    /**
     * Tax is related to the tenth month of the period.
     * 
     */
    @XmlEnumValue("MM10")
    MM_10("MM10"),

    /**
     * Tax is related to the eleventh month of the period.
     * 
     */
    @XmlEnumValue("MM11")
    MM_11("MM11"),

    /**
     * Tax is related to the twelfth month of the period.
     * 
     */
    @XmlEnumValue("MM12")
    MM_12("MM12"),

    /**
     * Tax is related to the first quarter of the period.
     * 
     */
    @XmlEnumValue("QTR1")
    QTR_1("QTR1"),

    /**
     * Tax is related to the second quarter of the period.
     * 
     */
    @XmlEnumValue("QTR2")
    QTR_2("QTR2"),

    /**
     * Tax is related to the third quarter of the period.
     * 
     */
    @XmlEnumValue("QTR3")
    QTR_3("QTR3"),

    /**
     * Tax is related to the forth quarter of the period.
     * 
     */
    @XmlEnumValue("QTR4")
    QTR_4("QTR4"),

    /**
     * Tax is related to the first half of the period.
     * 
     */
    @XmlEnumValue("HLF1")
    HLF_1("HLF1"),

    /**
     * Tax is related to the second half of the period.
     * 
     */
    @XmlEnumValue("HLF2")
    HLF_2("HLF2");
    private final String value;

    TaxRecordPeriod1Code(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static TaxRecordPeriod1Code fromValue(String v) {
        for (TaxRecordPeriod1Code c: TaxRecordPeriod1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
