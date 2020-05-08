//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 09:17:31 PM CEST 
//


package com.dajevv.soap.loaneligibility;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="yearlyIncome" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="requestedAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="requestedRates" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bikScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="employmentMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "customerName",
        "age",
        "yearlyIncome",
        "requestedAmount",
        "requestedRates",
        "bikScore",
        "employmentMode"
})
@XmlRootElement(name = "CustomerRequest")
public class CustomerRequest {

    @XmlElement(required = true)
    protected String customerName;
    protected int age;
    protected long yearlyIncome;
    protected long requestedAmount;
    protected int requestedRates;
    protected int bikScore;
    @XmlElement(required = true)
    protected String employmentMode;

    /**
     * Gets the value of the customerName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the age property.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the yearlyIncome property.
     */
    public long getYearlyIncome() {
        return yearlyIncome;
    }

    /**
     * Sets the value of the yearlyIncome property.
     */
    public void setYearlyIncome(long value) {
        this.yearlyIncome = value;
    }

    /**
     * Gets the value of the requestedAmount property.
     */
    public long getRequestedAmount() {
        return requestedAmount;
    }

    /**
     * Sets the value of the requestedAmount property.
     */
    public void setRequestedAmount(long value) {
        this.requestedAmount = value;
    }

    /**
     * Gets the value of the requestedRates property.
     */
    public int getRequestedRates() {
        return requestedRates;
    }

    /**
     * Sets the value of the requestedRates property.
     */
    public void setRequestedRates(int value) {
        this.requestedRates = value;
    }

    /**
     * Gets the value of the bikScore property.
     */
    public int getBikScore() {
        return bikScore;
    }

    /**
     * Sets the value of the bikScore property.
     */
    public void setBikScore(int value) {
        this.bikScore = value;
    }

    /**
     * Gets the value of the employmentMode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEmploymentMode() {
        return employmentMode;
    }

    /**
     * Sets the value of the employmentMode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmploymentMode(String value) {
        this.employmentMode = value;
    }

}
