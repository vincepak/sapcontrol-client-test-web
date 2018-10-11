
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
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datcol-param" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="analyse-severity-level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="analyse-starttime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="analyse-endtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="analyze-maxentries" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxentries" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="logfiles" type="{urn:SAPControl}ArrayOfString"/>
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
    "description",
    "datcolParam",
    "analyseSeverityLevel",
    "analyseStarttime",
    "analyseEndtime",
    "analyzeMaxentries",
    "maxentries",
    "logfiles"
})
@XmlRootElement(name = "CreateSnapshot")
public class CreateSnapshotElement {

    @XmlElementRef(name = "description", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "datcol-param", type = JAXBElement.class)
    protected JAXBElement<String> datcolParam;
    @XmlElement(name = "analyse-severity-level", defaultValue = "2")
    protected int analyseSeverityLevel;
    @XmlElementRef(name = "analyse-starttime", type = JAXBElement.class)
    protected JAXBElement<String> analyseStarttime;
    @XmlElementRef(name = "analyse-endtime", type = JAXBElement.class)
    protected JAXBElement<String> analyseEndtime;
    @XmlElement(name = "analyze-maxentries", defaultValue = "10000")
    protected int analyzeMaxentries;
    @XmlElement(defaultValue = "-10000")
    protected int maxentries;
    @XmlElement(required = true)
    protected ArrayOfStringType logfiles;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the datcolParam property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDatcolParam() {
        return datcolParam;
    }

    /**
     * Sets the value of the datcolParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDatcolParam(JAXBElement<String> value) {
        this.datcolParam = value;
    }

    /**
     * Gets the value of the analyseSeverityLevel property.
     * 
     */
    public int getAnalyseSeverityLevel() {
        return analyseSeverityLevel;
    }

    /**
     * Sets the value of the analyseSeverityLevel property.
     * 
     */
    public void setAnalyseSeverityLevel(int value) {
        this.analyseSeverityLevel = value;
    }

    /**
     * Gets the value of the analyseStarttime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnalyseStarttime() {
        return analyseStarttime;
    }

    /**
     * Sets the value of the analyseStarttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnalyseStarttime(JAXBElement<String> value) {
        this.analyseStarttime = value;
    }

    /**
     * Gets the value of the analyseEndtime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnalyseEndtime() {
        return analyseEndtime;
    }

    /**
     * Sets the value of the analyseEndtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnalyseEndtime(JAXBElement<String> value) {
        this.analyseEndtime = value;
    }

    /**
     * Gets the value of the analyzeMaxentries property.
     * 
     */
    public int getAnalyzeMaxentries() {
        return analyzeMaxentries;
    }

    /**
     * Sets the value of the analyzeMaxentries property.
     * 
     */
    public void setAnalyzeMaxentries(int value) {
        this.analyzeMaxentries = value;
    }

    /**
     * Gets the value of the maxentries property.
     * 
     */
    public int getMaxentries() {
        return maxentries;
    }

    /**
     * Sets the value of the maxentries property.
     * 
     */
    public void setMaxentries(int value) {
        this.maxentries = value;
    }

    /**
     * Gets the value of the logfiles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringType }
     *     
     */
    public ArrayOfStringType getLogfiles() {
        return logfiles;
    }

    /**
     * Sets the value of the logfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringType }
     *     
     */
    public void setLogfiles(ArrayOfStringType value) {
        this.logfiles = value;
    }

}
