
package sapcontrol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HAVerificationState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HAVerificationState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SAPControl-HA-SUCCESS"/>
 *     &lt;enumeration value="SAPControl-HA-WARNING"/>
 *     &lt;enumeration value="SAPControl-HA-ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HAVerificationState")
@XmlEnum
public enum HAVerificationStateType {

    @XmlEnumValue("SAPControl-HA-SUCCESS")
    SAP_CONTROL___HA___SUCCESS("SAPControl-HA-SUCCESS"),
    @XmlEnumValue("SAPControl-HA-WARNING")
    SAP_CONTROL___HA___WARNING("SAPControl-HA-WARNING"),
    @XmlEnumValue("SAPControl-HA-ERROR")
    SAP_CONTROL___HA___ERROR("SAPControl-HA-ERROR");
    private final String value;

    HAVerificationStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HAVerificationStateType fromValue(String v) {
        for (HAVerificationStateType c: HAVerificationStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
