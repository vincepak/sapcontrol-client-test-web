
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
 *         &lt;element name="ejbsession" type="{urn:SAPControl}ArrayOfJ2EEEJBSession" minOccurs="0"/>
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
    "ejbsession"
})
@XmlRootElement(name = "J2EEGetEJBSessionListResponse")
public class J2EEGetEJBSessionListResponseElement {

    @XmlElementRef(name = "ejbsession", type = JAXBElement.class)
    protected JAXBElement<ArrayOfJ2EEEJBSessionType> ejbsession;

    /**
     * Gets the value of the ejbsession property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EEEJBSessionType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ2EEEJBSessionType> getEjbsession() {
        return ejbsession;
    }

    /**
     * Sets the value of the ejbsession property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EEEJBSessionType }{@code >}
     *     
     */
    public void setEjbsession(JAXBElement<ArrayOfJ2EEEJBSessionType> value) {
        this.ejbsession = value;
    }

}
