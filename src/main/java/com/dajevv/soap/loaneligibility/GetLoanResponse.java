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
 *         &lt;element name="Loan" type="{http://www.dajevv.com/soap/loanEligibility}Loan"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "loan"
})
@XmlRootElement(name = "getLoanResponse")
public class GetLoanResponse {

    @XmlElement(name = "Loan", required = true)
    protected Loan loan;

    /**
     * Gets the value of the loan property.
     *
     * @return possible object is
     * {@link Loan }
     */
    public Loan getLoan() {
        return loan;
    }

    /**
     * Sets the value of the loan property.
     *
     * @param value allowed object is
     *              {@link Loan }
     */
    public void setLoan(Loan value) {
        this.loan = value;
    }

}
