
package sapcontrol;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="restriction" type="{urn:SAPControl}ParameterRestriction"/>
 *         &lt;element name="sub-para" type="{urn:SAPControl}ArrayOfSubProfileParameter" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dynamic-value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="values" type="{urn:SAPControl}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="dynamic-values" type="{urn:SAPControl}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileParameter", propOrder = {
    "name",
    "group",
    "description",
    "unit",
    "restriction",
    "subPara",
    "value",
    "dynamicValue",
    "values",
    "dynamicValues"
})
public class ProfileParameterType {

    @XmlElementRef(name = "name", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "group", type = JAXBElement.class)
    protected JAXBElement<String> group;
    @XmlElementRef(name = "description", type = JAXBElement.class)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "unit", type = JAXBElement.class)
    protected JAXBElement<String> unit;
    @XmlElement(required = true)
    protected ParameterRestrictionType restriction;
    @XmlElementRef(name = "sub-para", type = JAXBElement.class)
    protected JAXBElement<ArrayOfSubProfileParameterType> subPara;
    @XmlElementRef(name = "value", type = JAXBElement.class)
    protected JAXBElement<String> value;
    @XmlElementRef(name = "dynamic-value", type = JAXBElement.class)
    protected JAXBElement<String> dynamicValue;
    @XmlElementRef(name = "values", type = JAXBElement.class)
    protected JAXBElement<ArrayOfStringType> values;
    @XmlElementRef(name = "dynamic-values", type = JAXBElement.class)
    protected JAXBElement<ArrayOfStringType> dynamicValues;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroup(JAXBElement<String> value) {
        this.group = value;
    }

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
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnit(JAXBElement<String> value) {
        this.unit = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterRestrictionType }
     *     
     */
    public ParameterRestrictionType getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterRestrictionType }
     *     
     */
    public void setRestriction(ParameterRestrictionType value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the subPara property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSubProfileParameterType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSubProfileParameterType> getSubPara() {
        return subPara;
    }

    /**
     * Sets the value of the subPara property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSubProfileParameterType }{@code >}
     *     
     */
    public void setSubPara(JAXBElement<ArrayOfSubProfileParameterType> value) {
        this.subPara = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValue(JAXBElement<String> value) {
        this.value = value;
    }

    /**
     * Gets the value of the dynamicValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDynamicValue() {
        return dynamicValue;
    }

    /**
     * Sets the value of the dynamicValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDynamicValue(JAXBElement<String> value) {
        this.dynamicValue = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStringType> getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}
     *     
     */
    public void setValues(JAXBElement<ArrayOfStringType> value) {
        this.values = value;
    }

    /**
     * Gets the value of the dynamicValues property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStringType> getDynamicValues() {
        return dynamicValues;
    }

    /**
     * Sets the value of the dynamicValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStringType }{@code >}
     *     
     */
    public void setDynamicValues(JAXBElement<ArrayOfStringType> value) {
        this.dynamicValues = value;
    }

}
