
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
 *         &lt;element name="msg" type="{urn:SAPControl}ArrayOfJ2EEClusterMsg" minOccurs="0"/>
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
    "msg"
})
@XmlRootElement(name = "J2EEGetClusterMsgListResponse")
public class J2EEGetClusterMsgListResponseElement {

    @XmlElementRef(name = "msg", type = JAXBElement.class)
    protected JAXBElement<ArrayOfJ2EEClusterMsgType> msg;

    /**
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EEClusterMsgType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ2EEClusterMsgType> getMsg() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EEClusterMsgType }{@code >}
     *     
     */
    public void setMsg(JAXBElement<ArrayOfJ2EEClusterMsgType> value) {
        this.msg = value;
    }

}
