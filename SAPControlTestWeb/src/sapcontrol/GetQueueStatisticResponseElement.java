
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
 *         &lt;element name="queue" type="{urn:SAPControl}ArrayOfTaskHandlerQueue" minOccurs="0"/>
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
    "queue"
})
@XmlRootElement(name = "GetQueueStatisticResponse")
public class GetQueueStatisticResponseElement {

    @XmlElementRef(name = "queue", type = JAXBElement.class)
    protected JAXBElement<ArrayOfTaskHandlerQueueType> queue;

    /**
     * Gets the value of the queue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskHandlerQueueType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTaskHandlerQueueType> getQueue() {
        return queue;
    }

    /**
     * Sets the value of the queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaskHandlerQueueType }{@code >}
     *     
     */
    public void setQueue(JAXBElement<ArrayOfTaskHandlerQueueType> value) {
        this.queue = value;
    }

}
