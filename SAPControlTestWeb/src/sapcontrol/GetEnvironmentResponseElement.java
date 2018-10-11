
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
 *         &lt;element name="env" type="{urn:SAPControl}ArrayOfString" minOccurs="0"/>
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
    "env"
})
@XmlRootElement(name = "GetEnvironmentResponse")
public class GetEnvironmentResponseElement {

    @XmlElementRef(name = "env", type = JAXBElement.class)
    protected JAXBElement<ArrayOfStringType> env;

    /**
     * Gets the value of the env property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStringType> getEnv() {
        return env;
    }

    /**
     * Sets the value of the env property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}
     *     
     */
    public void setEnv(JAXBElement<ArrayOfStringType> value) {
        this.env = value;
    }

}
