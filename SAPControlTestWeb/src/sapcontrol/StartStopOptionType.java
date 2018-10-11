
package sapcontrol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StartStopOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StartStopOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SAPControl-ALL-INSTANCES"/>
 *     &lt;enumeration value="SAPControl-SCS-INSTANCES"/>
 *     &lt;enumeration value="SAPControl-DIALOG-INSTANCES"/>
 *     &lt;enumeration value="SAPControl-ABAP-INSTANCES"/>
 *     &lt;enumeration value="SAPControl-J2EE-INSTANCES"/>
 *     &lt;enumeration value="SAPControl-PRIORITY-LEVEL"/>
 *     &lt;enumeration value="SAPControl-TREX-INSTANCES"/>
 *     &lt;enumeration value="SAPControl-ENQREP-INSTANCES"/>
 *     &lt;enumeration value="SAPControl-HDB-INSTANCES"/>
 *     &lt;enumeration value="SAPControl-ALLNOHDB-INSTANCES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StartStopOption")
@XmlEnum
public enum StartStopOptionType {

    @XmlEnumValue("SAPControl-ALL-INSTANCES")
    SAP_CONTROL___ALL___INSTANCES("SAPControl-ALL-INSTANCES"),
    @XmlEnumValue("SAPControl-SCS-INSTANCES")
    SAP_CONTROL___SCS___INSTANCES("SAPControl-SCS-INSTANCES"),
    @XmlEnumValue("SAPControl-DIALOG-INSTANCES")
    SAP_CONTROL___DIALOG___INSTANCES("SAPControl-DIALOG-INSTANCES"),
    @XmlEnumValue("SAPControl-ABAP-INSTANCES")
    SAP_CONTROL___ABAP___INSTANCES("SAPControl-ABAP-INSTANCES"),
    @XmlEnumValue("SAPControl-J2EE-INSTANCES")
    SAP_CONTROL___J_2_EE___INSTANCES("SAPControl-J2EE-INSTANCES"),
    @XmlEnumValue("SAPControl-PRIORITY-LEVEL")
    SAP_CONTROL___PRIORITY___LEVEL("SAPControl-PRIORITY-LEVEL"),
    @XmlEnumValue("SAPControl-TREX-INSTANCES")
    SAP_CONTROL___TREX___INSTANCES("SAPControl-TREX-INSTANCES"),
    @XmlEnumValue("SAPControl-ENQREP-INSTANCES")
    SAP_CONTROL___ENQREP___INSTANCES("SAPControl-ENQREP-INSTANCES"),
    @XmlEnumValue("SAPControl-HDB-INSTANCES")
    SAP_CONTROL___HDB___INSTANCES("SAPControl-HDB-INSTANCES"),
    @XmlEnumValue("SAPControl-ALLNOHDB-INSTANCES")
    SAP_CONTROL___ALLNOHDB___INSTANCES("SAPControl-ALLNOHDB-INSTANCES");
    private final String value;

    StartStopOptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StartStopOptionType fromValue(String v) {
        for (StartStopOptionType c: StartStopOptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
