//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.07.10 at 10:06:49 AM EDT 
//


package opin.dictionary.Merged;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for polarityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="polarityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="positive"/>
 *     &lt;enumeration value="negative"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum PolarityType {

    @XmlEnumValue("positive")
    POSITIVE("positive"),
    @XmlEnumValue("negative")
    NEGATIVE("negative");
    private final String value;

    PolarityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PolarityType fromValue(String v) {
        for (PolarityType c: PolarityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}