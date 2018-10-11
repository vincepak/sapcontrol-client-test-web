
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
 *         &lt;element name="gc" type="{urn:SAPControl}ArrayOfGCInfo" minOccurs="0"/>
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
    "gc"
})
@XmlRootElement(name = "J2EEGetVMGCHistoryResponse")
public class J2EEGetVMGCHistoryResponseElement {

    @XmlElementRef(name = "gc", type = JAXBElement.class)
    protected JAXBElement<ArrayOfGCInfoType> gc;

    /**
     * Gets the value of the gc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGCInfoType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGCInfoType> getGc() {
        return gc;
    }

    /**
     * Sets the value of the gc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGCInfoType }{@code >}
     *     
     */
    public void setGc(JAXBElement<ArrayOfGCInfoType> value) {
        this.gc = value;
    }

}
