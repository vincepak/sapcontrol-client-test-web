
package sapcontrol;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="check" type="{urn:SAPControl}ArrayOfHACheck" minOccurs="0"/>
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
    "check"
})
@XmlRootElement(name = "HACheckConfigResponse")
public class HACheckConfigResponseElement {

    @XmlElementRef(name = "check", type = JAXBElement.class)
    protected JAXBElement<ArrayOfHACheckType> check;

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHACheckType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHACheckType> getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHACheckType }{@code >}
     *     
     */
    public void setCheck(JAXBElement<ArrayOfHACheckType> value) {
        this.check = value;
    }

}
