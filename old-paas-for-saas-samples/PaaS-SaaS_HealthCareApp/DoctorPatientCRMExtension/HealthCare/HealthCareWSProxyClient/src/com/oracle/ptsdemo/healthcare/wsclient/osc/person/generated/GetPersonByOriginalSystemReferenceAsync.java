
package com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated;

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
 *         &lt;element name="findCriteria" type="{http://xmlns.oracle.com/adf/svc/types/}FindCriteria"/>
 *         &lt;element name="bindOrigSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bindOrigSystemReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="findControl" type="{http://xmlns.oracle.com/adf/svc/types/}FindControl"/>
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
    "findCriteria",
    "bindOrigSystem",
    "bindOrigSystemReference",
    "findControl"
})
@XmlRootElement(name = "getPersonByOriginalSystemReferenceAsync")
public class GetPersonByOriginalSystemReferenceAsync {

    @XmlElement(required = true)
    protected FindCriteria findCriteria;
    @XmlElement(required = true)
    protected String bindOrigSystem;
    @XmlElement(required = true)
    protected String bindOrigSystemReference;
    @XmlElement(required = true)
    protected FindControl findControl;

    /**
     * Gets the value of the findCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FindCriteria }
     *     
     */
    public FindCriteria getFindCriteria() {
        return findCriteria;
    }

    /**
     * Sets the value of the findCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindCriteria }
     *     
     */
    public void setFindCriteria(FindCriteria value) {
        this.findCriteria = value;
    }

    /**
     * Gets the value of the bindOrigSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindOrigSystem() {
        return bindOrigSystem;
    }

    /**
     * Sets the value of the bindOrigSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindOrigSystem(String value) {
        this.bindOrigSystem = value;
    }

    /**
     * Gets the value of the bindOrigSystemReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindOrigSystemReference() {
        return bindOrigSystemReference;
    }

    /**
     * Sets the value of the bindOrigSystemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindOrigSystemReference(String value) {
        this.bindOrigSystemReference = value;
    }

    /**
     * Gets the value of the findControl property.
     * 
     * @return
     *     possible object is
     *     {@link FindControl }
     *     
     */
    public FindControl getFindControl() {
        return findControl;
    }

    /**
     * Sets the value of the findControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindControl }
     *     
     */
    public void setFindControl(FindControl value) {
        this.findControl = value;
    }

}
