
package sapcontrol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="softtimeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "host",
    "nr",
    "softtimeout"
})
@XmlRootElement(name = "InstanceStop")
public class InstanceStopElement {

    @XmlElement(required = true)
    protected String host;
    protected int nr;
    @XmlElement(defaultValue = "0")
    protected int softtimeout;

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the value of the nr property.
     * 
     */
    public int getNr() {
        return nr;
    }

    /**
     * Sets the value of the nr property.
     * 
     */
    public void setNr(int value) {
        this.nr = value;
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

}
