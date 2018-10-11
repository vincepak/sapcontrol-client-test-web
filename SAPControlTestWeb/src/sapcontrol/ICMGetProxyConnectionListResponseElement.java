
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
 *         &lt;element name="connection" type="{urn:SAPControl}ArrayOfICMProxyConnection" minOccurs="0"/>
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
    "connection"
})
@XmlRootElement(name = "ICMGetProxyConnectionListResponse")
public class ICMGetProxyConnectionListResponseElement {

    @XmlElementRef(name = "connection", type = JAXBElement.class)
    protected JAXBElement<ArrayOfICMProxyConnectionType> connection;

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfICMProxyConnectionType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfICMProxyConnectionType> getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfICMProxyConnectionType }{@code >}
     *     
     */
    public void setConnection(JAXBElement<ArrayOfICMProxyConnectionType> value) {
        this.connection = value;
    }

}
