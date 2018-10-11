
package sapcontrol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VISIBLE-LEVEL.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VISIBLE-LEVEL">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SAPControl-UNKNOWN"/>
 *     &lt;enumeration value="SAPControl-OPERATOR"/>
 *     &lt;enumeration value="SAPControl-EXPERT"/>
 *     &lt;enumeration value="SAPControl-DEVELOPER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VISIBLE-LEVEL")
@XmlEnum
public enum VISIBLELEVELType {

    @XmlEnumValue("SAPControl-UNKNOWN")
    SAP_CONTROL___UNKNOWN("SAPControl-UNKNOWN"),
    @XmlEnumValue("SAPControl-OPERATOR")
    SAP_CONTROL___OPERATOR("SAPControl-OPERATOR"),
    @XmlEnumValue("SAPControl-EXPERT")
    SAP_CONTROL___EXPERT("SAPControl-EXPERT"),
    @XmlEnumValue("SAPControl-DEVELOPER")
    SAP_CONTROL___DEVELOPER("SAPControl-DEVELOPER");
    private final String value;

    VISIBLELEVELType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VISIBLELEVELType fromValue(String v) {
        for (VISIBLELEVELType c: VISIBLELEVELType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
