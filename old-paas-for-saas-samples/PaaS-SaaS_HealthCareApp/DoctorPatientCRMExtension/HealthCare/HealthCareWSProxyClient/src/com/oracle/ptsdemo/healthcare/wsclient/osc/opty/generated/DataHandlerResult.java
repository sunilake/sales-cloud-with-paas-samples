
package com.oracle.ptsdemo.healthcare.wsclient.osc.opty.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataHandlerResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataHandlerResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/adf/svc/types/}MethodResult">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataHandlerResult", namespace = "http://xmlns.oracle.com/adf/svc/types/", propOrder = {
    "value"
})
public class DataHandlerResult
    extends MethodResult
{

    @XmlElement(name = "Value")
    protected List<byte[]> value;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getValue() {
        if (value == null) {
            value = new ArrayList<byte[]>();
        }
        return this.value;
    }

}
