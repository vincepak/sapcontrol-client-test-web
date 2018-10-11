
package sapcontrol;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="options" type="{urn:SAPControl}StartStopOption"/>
 *         &lt;element name="prioritylevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="softtimeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="waittimeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "options",
    "prioritylevel",
    "softtimeout",
    "waittimeout"
})
@XmlRootElement(name = "StopSystem")
public class StopSystemElement {

    @XmlElement(required = true)
    protected StartStopOptionType options;
    @XmlElementRef(name = "prioritylevel", type = JAXBElement.class)
    protected JAXBElement<String> prioritylevel;
    protected int softtimeout;
    protected int waittimeout;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link StartStopOptionType }
     *     
     */
    public StartStopOptionType getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartStopOptionType }
     *     
     */
    public void setOptions(StartStopOptionType value) {
        this.options = value;
    }

    /**
     * Gets the value of the prioritylevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrioritylevel() {
        return prioritylevel;
    }

    /**
     * Sets the value of the prioritylevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrioritylevel(JAXBElement<String> value) {
        this.prioritylevel = value;
    }

    /**
     * Gets the value of the softtimeout property.
     * 
     */
    public int getSofttimeout() {
        return softtimeout;
    }

    /**
     * Sets the value of the softtimeout property.
     * 
     */
    public void setSofttimeout(int value) {
        this.softtimeout = value;
    }

    /**
     * Gets the value of the waittimeout property.
     * 
     */
    public int getWaittimeout() {
        return waittimeout;
    }

    /**
     * Sets the value of the waittimeout property.
     * 
     */
    public void setWaittimeout(int value) {
        this.waittimeout = value;
    }

}
