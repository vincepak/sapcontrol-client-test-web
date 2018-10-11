
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
 *         &lt;element name="thread" type="{urn:SAPControl}ArrayOfJ2EEThread" minOccurs="0"/>
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
    "thread"
})
@XmlRootElement(name = "J2EEGetThreadListResponse")
public class J2EEGetThreadListResponseElement {

    @XmlElementRef(name = "thread", type = JAXBElement.class)
    protected JAXBElement<ArrayOfJ2EEThreadType> thread;

    /**
     * Gets the value of the thread property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EEThreadType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ2EEThreadType> getThread() {
        return thread;
    }

    /**
     * Sets the value of the thread property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EEThreadType }{@code >}
     *     
     */
    public void setThread(JAXBElement<ArrayOfJ2EEThreadType> value) {
        this.thread = value;
    }

}
