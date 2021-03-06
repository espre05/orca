//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.18 at 10:21:26 AM PDT 
//


package com.genologics.ri.processtemplate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.genologics.ri.userdefined.Field;
import com.genologics.ri.userdefined.Type;


/**
 * 
 *         The detailed representation of a Process Template.
 *       
 * 
 * <p>Java class for process-template complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="process-template">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://genologics.com/ri/processtemplate}process-type" minOccurs="0"/>
 *         &lt;element name="technician" type="{http://genologics.com/ri/processtemplate}technician" minOccurs="0"/>
 *         &lt;element name="instrument" type="{http://genologics.com/ri/processtemplate}instrument" minOccurs="0"/>
 *         &lt;element name="process-parameter" type="{http://genologics.com/ri/processtemplate}parameter" minOccurs="0"/>
 *         &lt;element ref="{http://genologics.com/ri/userdefined}type" minOccurs="0"/>
 *         &lt;element ref="{http://genologics.com/ri/userdefined}field" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="is-default" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "process-template", propOrder = {
    "content"
})
public class ProcessTemplate {

    @XmlElementRefs({
        @XmlElementRef(name = "type", namespace = "http://genologics.com/ri/userdefined", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "field", namespace = "http://genologics.com/ri/userdefined", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "is-default", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "process-parameter", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "instrument", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "technician", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "type", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "uri")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Type" is used by two different parts of a schema. See: 
     * line 56 of file:/C:/prem/ClarityLIMS/processtemplate.xsd
     * line 21 of file:/C:/prem/ClarityLIMS/processtemplate.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Type }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Field }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Parameter }{@code >}
     * {@link JAXBElement }{@code <}{@link Instrument }{@code >}
     * {@link JAXBElement }{@code <}{@link Technician }{@code >}
     * {@link JAXBElement }{@code <}{@link ProcessType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

}
