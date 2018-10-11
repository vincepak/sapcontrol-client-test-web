
package sapcontrol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogFileConfigOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogFileConfigOperation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SAPControl-SET-LOGFILES"/>
 *     &lt;enumeration value="SAPControl-ADD-LOGFILES"/>
 *     &lt;enumeration value="SAPControl-REMOVE-LOGFILES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LogFileConfigOperation")
@XmlEnum
public enum LogFileConfigOperationType {

    @XmlEnumValue("SAPControl-SET-LOGFILES")
    SAP_CONTROL___SET___LOGFILES("SAPControl-SET-LOGFILES"),
    @XmlEnumValue("SAPControl-ADD-LOGFILES")
    SAP_CONTROL___ADD___LOGFILES("SAPControl-ADD-LOGFILES"),
    @XmlEnumValue("SAPControl-REMOVE-LOGFILES")
    SAP_CONTROL___REMOVE___LOGFILES("SAPControl-REMOVE-LOGFILES");
    private final String value;

    LogFileConfigOperationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogFileConfigOperationType fromValue(String v) {
        for (LogFileConfigOperationType c: LogFileConfigOperationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
