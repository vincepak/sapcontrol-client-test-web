
package sapcontrol;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebDispServer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebDispServer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hostname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="load" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cur-conn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="peak-conn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="max-conn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sec-port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sec-cur-conn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sec-peak-conn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sec-max-conn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="req-cnt-stateless" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="req-cnt-stateful" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="req-cnt-group" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="resp-time-min" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="resp-time-avg" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="resp-time-last" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ping-time-last" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebDispServer", propOrder = {
    "sid",
    "instance",
    "hostname",
    "protocol",
    "type",
    "status",
    "capacity",
    "load",
    "port",
    "curConn",
    "peakConn",
    "maxConn",
    "secPort",
    "secCurConn",
    "secPeakConn",
    "secMaxConn",
    "reqCntStateless",
    "reqCntStateful",
    "reqCntGroup",
    "respTimeMin",
    "respTimeAvg",
    "respTimeLast",
    "pingTimeLast"
})
public class WebDispServerType {

    @XmlElementRef(name = "sid", type = JAXBElement.class)
    protected JAXBElement<String> sid;
    @XmlElementRef(name = "instance", type = JAXBElement.class)
    protected JAXBElement<String> instance;
    @XmlElementRef(name = "hostname", type = JAXBElement.class)
    protected JAXBElement<String> hostname;
    @XmlElementRef(name = "protocol", type = JAXBElement.class)
    protected JAXBElement<String> protocol;
    @XmlElementRef(name = "type", type = JAXBElement.class)
    protected JAXBElement<String> type;
    @XmlElementRef(name = "status", type = JAXBElement.class)
    protected JAXBElement<String> status;
    protected int capacity;
    protected int load;
    protected int port;
    @XmlElement(name = "cur-conn")
    protected int curConn;
    @XmlElement(name = "peak-conn")
    protected int peakConn;
    @XmlElement(name = "max-conn")
    protected int maxConn;
    @XmlElement(name = "sec-port")
    protected int secPort;
    @XmlElement(name = "sec-cur-conn")
    protected int secCurConn;
    @XmlElement(name = "sec-peak-conn")
    protected int secPeakConn;
    @XmlElement(name = "sec-max-conn")
    protected int secMaxConn;
    @XmlElement(name = "req-cnt-stateless")
    protected long reqCntStateless;
    @XmlElement(name = "req-cnt-stateful")
    protected long reqCntStateful;
    @XmlElement(name = "req-cnt-group")
    protected long reqCntGroup;
    @XmlElement(name = "resp-time-min")
    protected long respTimeMin;
    @XmlElement(name = "resp-time-avg")
    protected long respTimeAvg;
    @XmlElement(name = "resp-time-last")
    protected long respTimeLast;
    @XmlElement(name = "ping-time-last")
    protected long pingTimeLast;

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSid(JAXBElement<String> value) {
        this.sid = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstance() {
        return instance;
    }

    /**
     * Sets the value of the instance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstance(JAXBElement<String> value) {
        this.instance = value;
    }

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHostname(JAXBElement<String> value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtocol(JAXBElement<String> value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     */
    public void setCapacity(int value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the load property.
     * 
     */
    public int getLoad() {
        return load;
    }

    /**
     * Sets the value of the load property.
     * 
     */
    public void setLoad(int value) {
        this.load = value;
    }

    /**
     * Gets the value of the port property.
     * 
     */
    public int getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(int value) {
        this.port = value;
    }

    /**
     * Gets the value of the curConn property.
     * 
     */
    public int getCurConn() {
        return curConn;
    }

    /**
     * Sets the value of the curConn property.
     * 
     */
    public void setCurConn(int value) {
        this.curConn = value;
    }

    /**
     * Gets the value of the peakConn property.
     * 
     */
    public int getPeakConn() {
        return peakConn;
    }

    /**
     * Sets the value of the peakConn property.
     * 
     */
    public void setPeakConn(int value) {
        this.peakConn = value;
    }

    /**
     * Gets the value of the maxConn property.
     * 
     */
    public int getMaxConn() {
        return maxConn;
    }

    /**
     * Sets the value of the maxConn property.
     * 
     */
    public void setMaxConn(int value) {
        this.maxConn = value;
    }

    /**
     * Gets the value of the secPort property.
     * 
     */
    public int getSecPort() {
        return secPort;
    }

    /**
     * Sets the value of the secPort property.
     * 
     */
    public void setSecPort(int value) {
        this.secPort = value;
    }

    /**
     * Gets the value of the secCurConn property.
     * 
     */
    public int getSecCurConn() {
        return secCurConn;
    }

    /**
     * Sets the value of the secCurConn property.
     * 
     */
    public void setSecCurConn(int value) {
        this.secCurConn = value;
    }

    /**
     * Gets the value of the secPeakConn property.
     * 
     */
    public int getSecPeakConn() {
        return secPeakConn;
    }

    /**
     * Sets the value of the secPeakConn property.
     * 
     */
    public void setSecPeakConn(int value) {
        this.secPeakConn = value;
    }

    /**
     * Gets the value of the secMaxConn property.
     * 
     */
    public int getSecMaxConn() {
        return secMaxConn;
    }

    /**
     * Sets the value of the secMaxConn property.
     * 
     */
    public void setSecMaxConn(int value) {
        this.secMaxConn = value;
    }

    /**
     * Gets the value of the reqCntStateless property.
     * 
     */
    public long getReqCntStateless() {
        return reqCntStateless;
    }

    /**
     * Sets the value of the reqCntStateless property.
     * 
     */
    public void setReqCntStateless(long value) {
        this.reqCntStateless = value;
    }

    /**
     * Gets the value of the reqCntStateful property.
     * 
     */
    public long getReqCntStateful() {
        return reqCntStateful;
    }

    /**
     * Sets the value of the reqCntStateful property.
     * 
     */
    public void setReqCntStateful(long value) {
        this.reqCntStateful = value;
    }

    /**
     * Gets the value of the reqCntGroup property.
     * 
     */
    public long getReqCntGroup() {
        return reqCntGroup;
    }

    /**
     * Sets the value of the reqCntGroup property.
     * 
     */
    public void setReqCntGroup(long value) {
        this.reqCntGroup = value;
    }

    /**
     * Gets the value of the respTimeMin property.
     * 
     */
    public long getRespTimeMin() {
        return respTimeMin;
    }

    /**
     * Sets the value of the respTimeMin property.
     * 
     */
    public void setRespTimeMin(long value) {
        this.respTimeMin = value;
    }

    /**
     * Gets the value of the respTimeAvg property.
     * 
     */
    public long getRespTimeAvg() {
        return respTimeAvg;
    }

    /**
     * Sets the value of the respTimeAvg property.
     * 
     */
    public void setRespTimeAvg(long value) {
        this.respTimeAvg = value;
    }

    /**
     * Gets the value of the respTimeLast property.
     * 
     */
    public long getRespTimeLast() {
        return respTimeLast;
    }

    /**
     * Sets the value of the respTimeLast property.
     * 
     */
    public void setRespTimeLast(long value) {
        this.respTimeLast = value;
    }

    /**
     * Gets the value of the pingTimeLast property.
     * 
     */
    public long getPingTimeLast() {
        return pingTimeLast;
    }

    /**
     * Sets the value of the pingTimeLast property.
     * 
     */
    public void setPingTimeLast(long value) {
        this.pingTimeLast = value;
    }

}
