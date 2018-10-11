
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
 *         &lt;element name="heap" type="{urn:SAPControl}ArrayOfHeapInfo" minOccurs="0"/>
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
    "heap"
})
@XmlRootElement(name = "J2EEGetVMHeapInfoResponse")
public class J2EEGetVMHeapInfoResponseElement {

    @XmlElementRef(name = "heap", type = JAXBElement.class)
    protected JAXBElement<ArrayOfHeapInfoType> heap;

    /**
     * Gets the value of the heap property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHeapInfoType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHeapInfoType> getHeap() {
        return heap;
    }

    /**
     * Sets the value of the heap property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHeapInfoType }{@code >}
     *     
     */
    public void setHeap(JAXBElement<ArrayOfHeapInfoType> value) {
        this.heap = value;
    }

}
