
package com.bankservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCurrentCusAccNo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCurrentCusAccNo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCurrentCusAccNo", propOrder = {
    "accNO"
})
public class GetCurrentCusAccNo {

    protected String accNO;

    /**
     * Gets the value of the accNO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccNO() {
        return accNO;
    }

    /**
     * Sets the value of the accNO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccNO(String value) {
        this.accNO = value;
    }

}
