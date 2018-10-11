
package sapcontrol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STATE-COLOR.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="STATE-COLOR">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SAPControl-GRAY"/>
 *     &lt;enumeration value="SAPControl-GREEN"/>
 *     &lt;enumeration value="SAPControl-YELLOW"/>
 *     &lt;enumeration value="SAPControl-RED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "STATE-COLOR")
@XmlEnum
public enum STATECOLORType {

    @XmlEnumValue("SAPControl-GRAY")
    SAP_CONTROL___GRAY("SAPControl-GRAY"),
    @XmlEnumValue("SAPControl-GREEN")
    SAP_CONTROL___GREEN("SAPControl-GREEN"),
    @XmlEnumValue("SAPControl-YELLOW")
    SAP_CONTROL___YELLOW("SAPControl-YELLOW"),
    @XmlEnumValue("SAPControl-RED")
    SAP_CONTROL___RED("SAPControl-RED");
    private final String value;

    STATECOLORType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STATECOLORType fromValue(String v) {
        for (STATECOLORType c: STATECOLORType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
