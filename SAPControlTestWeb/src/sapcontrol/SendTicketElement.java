
package sapcontrol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="proof" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="challenge" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "proof",
    "challenge"
})
@XmlRootElement(name = "SendTicket")
public class SendTicketElement {

    @XmlElement(required = true)
    protected String proof;
    @XmlElement(required = true)
    protected String challenge;

    /**
     * Gets the value of the proof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProof() {
        return proof;
    }

    /**
     * Sets the value of the proof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProof(String value) {
        this.proof = value;
    }

    /**
     * Gets the value of the challenge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallenge() {
        return challenge;
    }

    /**
     * Sets the value of the challenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallenge(String value) {
        this.challenge = value;
    }

}
