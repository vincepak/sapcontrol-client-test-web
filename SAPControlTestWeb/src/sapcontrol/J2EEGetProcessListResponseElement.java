
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
 *         &lt;element name="process" type="{urn:SAPControl}ArrayOfJ2EEProcess" minOccurs="0"/>
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
    "process"
})
@XmlRootElement(name = "J2EEGetProcessListResponse")
public class J2EEGetProcessListResponseElement {

    @XmlElementRef(name = "process", type = JAXBElement.class)
    protected JAXBElement<ArrayOfJ2EEProcessType> process;

    /**
     * Gets the value of the process property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EEProcessType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ2EEProcessType> getProcess() {
        return process;
    }

    /**
     * Sets the value of the process property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EEProcessType }{@code >}
     *     
     */
    public void setProcess(JAXBElement<ArrayOfJ2EEProcessType> value) {
        this.process = value;
    }

}
