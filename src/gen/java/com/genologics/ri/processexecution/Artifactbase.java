//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.18 at 10:21:26 AM PDT 
//


package com.genologics.ri.processexecution;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The base representation of an Artifact in the context of Process execution, defining common elements for both input and output Artifacts.
 *       
 * 
 * <p>Java class for artifactbase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="artifactbase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qc-flag" type="{http://genologics.com/ri/processexecution}qc-flag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "artifactbase", propOrder = {
    "qcFlag"
})
@XmlSeeAlso({
    Input.class,
    Output.class
})
public abstract class Artifactbase {

    @XmlElement(name = "qc-flag")
    protected QcFlag qcFlag;

    /**
     * Gets the value of the qcFlag property.
     * 
     * @return
     *     possible object is
     *     {@link QcFlag }
     *     
     */
    public QcFlag getQcFlag() {
        return qcFlag;
    }

    /**
     * Sets the value of the qcFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link QcFlag }
     *     
     */
    public void setQcFlag(QcFlag value) {
        this.qcFlag = value;
    }

}
