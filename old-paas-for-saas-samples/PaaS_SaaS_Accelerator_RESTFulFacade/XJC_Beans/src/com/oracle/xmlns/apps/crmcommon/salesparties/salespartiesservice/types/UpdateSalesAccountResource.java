//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.24 at 02:08:50 PM BST 
//


package com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.crmcommon.salesparties.salespartiesservice.SalesAccountResource;


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
 *         &lt;element name="salesAccountResource" type="{http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/}SalesAccountResource"/>
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
    "salesAccountResource"
})
@XmlRootElement(name = "updateSalesAccountResource")
public class UpdateSalesAccountResource {

    @XmlElement(required = true)
    protected SalesAccountResource salesAccountResource;

    /**
     * Gets the value of the salesAccountResource property.
     * 
     * @return
     *     possible object is
     *     {@link SalesAccountResource }
     *     
     */
    public SalesAccountResource getSalesAccountResource() {
        return salesAccountResource;
    }

    /**
     * Sets the value of the salesAccountResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesAccountResource }
     *     
     */
    public void setSalesAccountResource(SalesAccountResource value) {
        this.salesAccountResource = value;
    }

}
