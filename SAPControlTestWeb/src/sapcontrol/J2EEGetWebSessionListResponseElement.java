
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
 *         &lt;element name="session" type="{urn:SAPControl}ArrayOfJ2EEWebSession" minOccurs="0"/>
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
    "session"
})
@XmlRootElement(name = "J2EEGetWebSessionListResponse")
public class J2EEGetWebSessionListResponseElement {

    @XmlElementRef(name = "session", type = JAXBElement.class)
    protected JAXBElement<ArrayOfJ2EEWebSessionType> session;

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EEWebSessionType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ2EEWebSessionType> getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EEWebSessionType }{@code >}
     *     
     */
    public void setSession(JAXBElement<ArrayOfJ2EEWebSessionType> value) {
        this.session = value;
    }

}
