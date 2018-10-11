
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
 *         &lt;element name="cache" type="{urn:SAPControl}ArrayOfJ2EECache2" minOccurs="0"/>
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
    "cache"
})
@XmlRootElement(name = "J2EEGetCacheStatistic2Response")
public class J2EEGetCacheStatistic2ResponseElement {

    @XmlElementRef(name = "cache", type = JAXBElement.class)
    protected JAXBElement<ArrayOfJ2EECache2Type> cache;

    /**
     * Gets the value of the cache property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EECache2Type }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJ2EECache2Type> getCache() {
        return cache;
    }

    /**
     * Sets the value of the cache property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJ2EECache2Type }{@code >}
     *     
     */
    public void setCache(JAXBElement<ArrayOfJ2EECache2Type> value) {
        this.cache = value;
    }

}
