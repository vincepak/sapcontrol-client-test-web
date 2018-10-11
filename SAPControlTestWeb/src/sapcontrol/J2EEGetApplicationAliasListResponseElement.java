
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
 *         &lt;element name="alias" type="{urn:SAPControl}ArrayOfJ2EEApplicationAlias" minOccurs="0"/>
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
    "alias"
})
@XmlRootElement(name = "J2EEGetApplicationAliasListResponse")
public class J2EEGetApplicationAliasListResponseElement {

    @XmlElementRef(name = "alias", type = JAXBElement.class)
    protected JAXBElement<ArrayOfJ2EEApplicationAliasType> alias;

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EEApplicationAliasType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ2EEApplicationAliasType> getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EEApplicationAliasType }{@code >}
     *     
     */
    public void setAlias(JAXBElement<ArrayOfJ2EEApplicationAliasType> value) {
        this.alias = value;
    }

}
