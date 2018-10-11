
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
 *         &lt;element name="server" type="{urn:SAPControl}ArrayOfWebDispServer" minOccurs="0"/>
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
    "server"
})
@XmlRootElement(name = "WebDispGetServerListResponse")
public class WebDispGetServerListResponseElement {

    @XmlElementRef(name = "server", type = JAXBElement.class)
    protected JAXBElement<ArrayOfWebDispServerType> server;

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWebDispServerType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWebDispServerType> getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWebDispServerType }{@code >}
     *     
     */
    public void setServer(JAXBElement<ArrayOfWebDispServerType> value) {
        this.server = value;
    }

}
