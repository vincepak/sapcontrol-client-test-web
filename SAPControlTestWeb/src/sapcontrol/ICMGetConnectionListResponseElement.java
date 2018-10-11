
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
 *         &lt;element name="connection" type="{urn:SAPControl}ArrayOfICMConnection" minOccurs="0"/>
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
@XmlRootElement(name = "ICMGetConnectionListResponse")
public class ICMGetConnectionListResponseElement {

    @XmlElementRef(name = "connection", type = JAXBElement.class)
    protected JAXBElement<ArrayOfICMConnectionType> connection;

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfICMConnectionType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfICMConnectionType> getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfICMConnectionType }{@code >}
     *     
     */
    public void setConnection(JAXBElement<ArrayOfICMConnectionType> value) {
        this.connection = value;
    }

}
