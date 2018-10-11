
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
 *         &lt;element name="file" type="{urn:SAPControl}ArrayOfLogFile" minOccurs="0"/>
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
    "file"
})
@XmlRootElement(name = "ListLogFilesResponse")
public class ListLogFilesResponseElement {

    @XmlElementRef(name = "file", type = JAXBElement.class)
    protected JAXBElement<ArrayOfLogFileType> file;

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLogFileType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLogFileType> getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLogFileType }{@code >}
     *     
     */
    public void setFile(JAXBElement<ArrayOfLogFileType> value) {
        this.file = value;
    }

}
