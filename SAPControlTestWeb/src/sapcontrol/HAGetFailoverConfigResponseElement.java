
package sapcontrol;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="HAActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HAProductVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HASAPInterfaceVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HADocumentation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HAActiveNode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HANodes" type="{urn:SAPControl}ArrayOfString"/>
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
    "haActive",
    "haProductVersion",
    "hasapInterfaceVersion",
    "haDocumentation",
    "haActiveNode",
    "haNodes"
})
@XmlRootElement(name = "HAGetFailoverConfigResponse")
public class HAGetFailoverConfigResponseElement {

    @XmlElement(name = "HAActive")
    protected boolean haActive;
    @XmlElementRef(name = "HAProductVersion", type = JAXBElement.class)
    protected JAXBElement<String> haProductVersion;
    @XmlElementRef(name = "HASAPInterfaceVersion", type = JAXBElement.class)
    protected JAXBElement<String> hasapInterfaceVersion;
    @XmlElementRef(name = "HADocumentation", type = JAXBElement.class)
    protected JAXBElement<String> haDocumentation;
    @XmlElementRef(name = "HAActiveNode", type = JAXBElement.class)
    protected JAXBElement<String> haActiveNode;
    @XmlElement(name = "HANodes", required = true)
    protected ArrayOfStringType haNodes;

    /**
     * Gets the value of the haActive property.
     * 
     */
    public boolean isHAActive() {
        return haActive;
    }

    /**
     * Sets the value of the haActive property.
     * 
     */
    public void setHAActive(boolean value) {
        this.haActive = value;
    }

    /**
     * Gets the value of the haProductVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHAProductVersion() {
        return haProductVersion;
    }

    /**
     * Sets the value of the haProductVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHAProductVersion(JAXBElement<String> value) {
        this.haProductVersion = value;
    }

    /**
     * Gets the value of the hasapInterfaceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHASAPInterfaceVersion() {
        return hasapInterfaceVersion;
    }

    /**
     * Sets the value of the hasapInterfaceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHASAPInterfaceVersion(JAXBElement<String> value) {
        this.hasapInterfaceVersion = value;
    }

    /**
     * Gets the value of the haDocumentation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHADocumentation() {
        return haDocumentation;
    }

    /**
     * Sets the value of the haDocumentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHADocumentation(JAXBElement<String> value) {
        this.haDocumentation = value;
    }

    /**
     * Gets the value of the haActiveNode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHAActiveNode() {
        return haActiveNode;
    }

    /**
     * Sets the value of the haActiveNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHAActiveNode(JAXBElement<String> value) {
        this.haActiveNode = value;
    }

    /**
     * Gets the value of the haNodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringType }
     *     
     */
    public ArrayOfStringType getHANodes() {
        return haNodes;
    }

    /**
     * Sets the value of the haNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringType }
     *     
     */
    public void setHANodes(ArrayOfStringType value) {
        this.haNodes = value;
    }

}
