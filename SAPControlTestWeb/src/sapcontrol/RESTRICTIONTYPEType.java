
package sapcontrol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RESTRICTION-TYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RESTRICTION-TYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SAPControl-RESTRICT-NONE"/>
 *     &lt;enumeration value="SAPControl-RESTRICT-INT"/>
 *     &lt;enumeration value="SAPControl-RESTRICT-FLOAT"/>
 *     &lt;enumeration value="SAPControl-RESTRICT-INTRANGE"/>
 *     &lt;enumeration value="SAPControl-RESTRICT-FLOATRANGE"/>
 *     &lt;enumeration value="SAPControl-RESTRICT-ENUM"/>
 *     &lt;enumeration value="SAPControl-RESTRICT-BOOL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RESTRICTION-TYPE")
@XmlEnum
public enum RESTRICTIONTYPEType {

    @XmlEnumValue("SAPControl-RESTRICT-NONE")
    SAP_CONTROL___RESTRICT___NONE("SAPControl-RESTRICT-NONE"),
    @XmlEnumValue("SAPControl-RESTRICT-INT")
    SAP_CONTROL___RESTRICT___INT("SAPControl-RESTRICT-INT"),
    @XmlEnumValue("SAPControl-RESTRICT-FLOAT")
    SAP_CONTROL___RESTRICT___FLOAT("SAPControl-RESTRICT-FLOAT"),
    @XmlEnumValue("SAPControl-RESTRICT-INTRANGE")
    SAP_CONTROL___RESTRICT___INTRANGE("SAPControl-RESTRICT-INTRANGE"),
    @XmlEnumValue("SAPControl-RESTRICT-FLOATRANGE")
    SAP_CONTROL___RESTRICT___FLOATRANGE("SAPControl-RESTRICT-FLOATRANGE"),
    @XmlEnumValue("SAPControl-RESTRICT-ENUM")
    SAP_CONTROL___RESTRICT___ENUM("SAPControl-RESTRICT-ENUM"),
    @XmlEnumValue("SAPControl-RESTRICT-BOOL")
    SAP_CONTROL___RESTRICT___BOOL("SAPControl-RESTRICT-BOOL");
    private final String value;

    RESTRICTIONTYPEType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RESTRICTIONTYPEType fromValue(String v) {
        for (RESTRICTIONTYPEType c: RESTRICTIONTYPEType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
