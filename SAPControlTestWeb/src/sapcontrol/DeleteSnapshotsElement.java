
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
 *         &lt;element name="snapshots" type="{urn:SAPControl}ArrayOfString" minOccurs="0"/>
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
    "snapshots"
})
@XmlRootElement(name = "DeleteSnapshots")
public class DeleteSnapshotsElement {

    @XmlElementRef(name = "snapshots", type = JAXBElement.class)
    protected JAXBElement<ArrayOfStringType> snapshots;

    /**
     * Gets the value of the snapshots property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStringType> getSnapshots() {
        return snapshots;
    }

    /**
     * Sets the value of the snapshots property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}
     *     
     */
    public void setSnapshots(JAXBElement<ArrayOfStringType> value) {
        this.snapshots = value;
    }

}
