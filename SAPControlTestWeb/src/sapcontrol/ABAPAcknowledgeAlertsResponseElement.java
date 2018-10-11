
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
 *         &lt;element name="alert" type="{urn:SAPControl}ArrayOfInt" minOccurs="0"/>
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
    "alert"
})
@XmlRootElement(name = "ABAPAcknowledgeAlertsResponse")
public class ABAPAcknowledgeAlertsResponseElement {

    @XmlElementRef(name = "alert", type = JAXBElement.class)
    protected JAXBElement<ArrayOfIntType> alert;

    /**
     * Gets the value of the alert property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIntType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfIntType> getAlert() {
        return alert;
    }

    /**
     * Sets the value of the alert property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIntType }{@code >}
     *     
     */
    public void setAlert(JAXBElement<ArrayOfIntType> value) {
        this.alert = value;
    }

}
