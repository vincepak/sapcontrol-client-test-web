
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
 *         &lt;element name="operation" type="{urn:SAPControl}LogFileConfigOperation"/>
 *         &lt;element name="logfiles" type="{urn:SAPControl}ArrayOfString" minOccurs="0"/>
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
    "operation",
    "logfiles"
})
@XmlRootElement(name = "ConfigureLogFileList")
public class ConfigureLogFileListElement {

    @XmlElement(required = true)
    protected LogFileConfigOperationType operation;
    @XmlElementRef(name = "logfiles", type = JAXBElement.class)
    protected JAXBElement<ArrayOfStringType> logfiles;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link LogFileConfigOperationType }
     *     
     */
    public LogFileConfigOperationType getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogFileConfigOperationType }
     *     
     */
    public void setOperation(LogFileConfigOperationType value) {
        this.operation = value;
    }

    /**
     * Gets the value of the logfiles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStringType> getLogfiles() {
        return logfiles;
    }

    /**
     * Sets the value of the logfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}
     *     
     */
    public void setLogfiles(JAXBElement<ArrayOfStringType> value) {
        this.logfiles = value;
    }

}
