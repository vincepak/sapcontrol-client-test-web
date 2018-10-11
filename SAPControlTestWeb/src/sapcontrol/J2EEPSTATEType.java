
package sapcontrol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for J2EE-PSTATE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="J2EE-PSTATE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SAPControl-J2EE-STOPPED"/>
 *     &lt;enumeration value="SAPControl-J2EE-STARTING"/>
 *     &lt;enumeration value="SAPControl-J2EE-CORE-RUNNING"/>
 *     &lt;enumeration value="SAPControl-J2EE-RUNNING"/>
 *     &lt;enumeration value="SAPControl-J2EE-STOPPING"/>
 *     &lt;enumeration value="SAPControl-J2EE-MAINTENANCE"/>
 *     &lt;enumeration value="SAPControl-J2EE-UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "J2EE-PSTATE")
@XmlEnum
public enum J2EEPSTATEType {

    @XmlEnumValue("SAPControl-J2EE-STOPPED")
    SAP_CONTROL___J_2_EE___STOPPED("SAPControl-J2EE-STOPPED"),
    @XmlEnumValue("SAPControl-J2EE-STARTING")
    SAP_CONTROL___J_2_EE___STARTING("SAPControl-J2EE-STARTING"),
    @XmlEnumValue("SAPControl-J2EE-CORE-RUNNING")
    SAP_CONTROL___J_2_EE___CORE___RUNNING("SAPControl-J2EE-CORE-RUNNING"),
    @XmlEnumValue("SAPControl-J2EE-RUNNING")
    SAP_CONTROL___J_2_EE___RUNNING("SAPControl-J2EE-RUNNING"),
    @XmlEnumValue("SAPControl-J2EE-STOPPING")
    SAP_CONTROL___J_2_EE___STOPPING("SAPControl-J2EE-STOPPING"),
    @XmlEnumValue("SAPControl-J2EE-MAINTENANCE")
    SAP_CONTROL___J_2_EE___MAINTENANCE("SAPControl-J2EE-MAINTENANCE"),
    @XmlEnumValue("SAPControl-J2EE-UNKNOWN")
    SAP_CONTROL___J_2_EE___UNKNOWN("SAPControl-J2EE-UNKNOWN");
    private final String value;

    J2EEPSTATEType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static J2EEPSTATEType fromValue(String v) {
        for (J2EEPSTATEType c: J2EEPSTATEType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
