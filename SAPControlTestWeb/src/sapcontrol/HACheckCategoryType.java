
package sapcontrol;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HACheckCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HACheckCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SAPControl-SAP-CONFIGURATION"/>
 *     &lt;enumeration value="SAPControl-SAP-STATE"/>
 *     &lt;enumeration value="SAPControl-HA-CONFIGURATION"/>
 *     &lt;enumeration value="SAPControl-HA-STATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HACheckCategory")
@XmlEnum
public enum HACheckCategoryType {

    @XmlEnumValue("SAPControl-SAP-CONFIGURATION")
    SAP_CONTROL___SAP___CONFIGURATION("SAPControl-SAP-CONFIGURATION"),
    @XmlEnumValue("SAPControl-SAP-STATE")
    SAP_CONTROL___SAP___STATE("SAPControl-SAP-STATE"),
    @XmlEnumValue("SAPControl-HA-CONFIGURATION")
    SAP_CONTROL___HA___CONFIGURATION("SAPControl-HA-CONFIGURATION"),
    @XmlEnumValue("SAPControl-HA-STATE")
    SAP_CONTROL___HA___STATE("SAPControl-HA-STATE");
    private final String value;

    HACheckCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HACheckCategoryType fromValue(String v) {
        for (HACheckCategoryType c: HACheckCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
