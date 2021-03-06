//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.18 at 10:21:26 AM PDT 
//


package com.genologics.ri.sample;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.genologics.ri.Externalid;
import com.genologics.ri.file.File;
import com.genologics.ri.userdefined.Field;
import com.genologics.ri.userdefined.Type;


/**
 * 
 *         <p>The base representation of a Sample, defining common elements for both Sample and Sample creation.</p>
 *       
 * 
 * <p>Java class for samplebase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="samplebase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date-received" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date-completed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="project" type="{http://genologics.com/ri/sample}project" minOccurs="0"/>
 *         &lt;element name="control-type" type="{http://genologics.com/ri/sample}controlType" minOccurs="0"/>
 *         &lt;element name="submitter" type="{http://genologics.com/ri/sample}submitter" minOccurs="0"/>
 *         &lt;element name="artifact" type="{http://genologics.com/ri/sample}artifact" minOccurs="0"/>
 *         &lt;element name="biosource" type="{http://genologics.com/ri/sample}biosource" minOccurs="0"/>
 *         &lt;element ref="{http://genologics.com/ri/userdefined}type" minOccurs="0"/>
 *         &lt;element ref="{http://genologics.com/ri/userdefined}field" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://genologics.com/ri}externalid" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://genologics.com/ri/file}file" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="limsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "samplebase", propOrder = {
    "name",
    "dateReceived",
    "dateCompleted",
    "project",
    "controlType",
    "submitter",
    "artifact",
    "biosource",
    "type",
    "field",
    "externalid",
    "file"
})
@XmlSeeAlso({
    Samplecreation.class,
    Sample.class
})
public class Samplebase {

    protected String name;
    @XmlElement(name = "date-received")
    protected String dateReceived;
    @XmlElement(name = "date-completed")
    protected String dateCompleted;
    protected Project project;
    @XmlElement(name = "control-type")
    protected ControlType controlType;
    protected Submitter submitter;
    protected Artifact artifact;
    protected Biosource biosource;
    @XmlElement(namespace = "http://genologics.com/ri/userdefined")
    protected Type type;
    @XmlElement(namespace = "http://genologics.com/ri/userdefined")
    protected List<Field> field;
    @XmlElement(namespace = "http://genologics.com/ri")
    protected List<Externalid> externalid;
    @XmlElement(namespace = "http://genologics.com/ri/file")
    protected List<File> file;
    @XmlAttribute(name = "limsid")
    protected String limsid;
    @XmlAttribute(name = "uri")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the dateReceived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateReceived() {
        return dateReceived;
    }

    /**
     * Sets the value of the dateReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateReceived(String value) {
        this.dateReceived = value;
    }

    /**
     * Gets the value of the dateCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCompleted() {
        return dateCompleted;
    }

    /**
     * Sets the value of the dateCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCompleted(String value) {
        this.dateCompleted = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link Project }
     *     
     */
    public Project getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project }
     *     
     */
    public void setProject(Project value) {
        this.project = value;
    }

    /**
     * Gets the value of the controlType property.
     * 
     * @return
     *     possible object is
     *     {@link ControlType }
     *     
     */
    public ControlType getControlType() {
        return controlType;
    }

    /**
     * Sets the value of the controlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlType }
     *     
     */
    public void setControlType(ControlType value) {
        this.controlType = value;
    }

    /**
     * Gets the value of the submitter property.
     * 
     * @return
     *     possible object is
     *     {@link Submitter }
     *     
     */
    public Submitter getSubmitter() {
        return submitter;
    }

    /**
     * Sets the value of the submitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Submitter }
     *     
     */
    public void setSubmitter(Submitter value) {
        this.submitter = value;
    }

    /**
     * Gets the value of the artifact property.
     * 
     * @return
     *     possible object is
     *     {@link Artifact }
     *     
     */
    public Artifact getArtifact() {
        return artifact;
    }

    /**
     * Sets the value of the artifact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Artifact }
     *     
     */
    public void setArtifact(Artifact value) {
        this.artifact = value;
    }

    /**
     * Gets the value of the biosource property.
     * 
     * @return
     *     possible object is
     *     {@link Biosource }
     *     
     */
    public Biosource getBiosource() {
        return biosource;
    }

    /**
     * Sets the value of the biosource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Biosource }
     *     
     */
    public void setBiosource(Biosource value) {
        this.biosource = value;
    }

    /**
     * 
     *             The user-defined type of the Sample.
     * <br/>Always returns with GET: No
     * <br/>Creatable with POST: Yes
     * <br/>Required for POST: No, unless the UDT has been configured as required.
     * <br/>Updatable with PUT: Yes
     * <br/>Required for PUT: No, unless the UDT has been configured as required. If a current UDT is not provided, existing values are deleted.
     *           
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
    }

    /**
     * 
     *             The user-defined fields of the Sample.
     * <br/>Always returns with GET: No
     * <br/>Creatable with POST: Yes
     * <br/>Required for POST: No, unless the UDF has been configured as required.
     * <br/>Updatable with PUT: Yes
     * <br/>Required for PUT: No, unless the UDF has been configured as required. If a current UDF is not provided, existing values are deleted.
     *           Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Field }
     * 
     * 
     */
    public List<Field> getField() {
        if (field == null) {
            field = new ArrayList<Field>();
        }
        return this.field;
    }

    /**
     * 
     *             Each external id is an identifier that allows looking up related information about the Sample from an external system.
     * <br/>Always returns with GET: No
     * <br/>Creatable with POST: Yes
     * <br/>Required for POST: No
     * <br/>Updatable with PUT: Yes
     * <br/>Required for PUT: No
     *           Gets the value of the externalid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Externalid }
     * 
     * 
     */
    public List<Externalid> getExternalid() {
        if (externalid == null) {
            externalid = new ArrayList<Externalid>();
        }
        return this.externalid;
    }

    /**
     * 
     *             Each file provides a URI linking to the detailed representation of a file associated with the Sample.
     * <br/>Always returns with GET: No, however if one or more files are attached to a given Sample they will be returned.
     * <br/>Creatable with POST: No
     * <br/>Required for POST: No
     * <br/>Updatable with PUT: No
     * <br/>Required for PUT: No, files cannot be modified through the Samples resource. Use the Files resource instead.
     *           Gets the value of the file property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the file property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link File }
     * 
     * 
     */
    public List<File> getFile() {
        if (file == null) {
            file = new ArrayList<File>();
        }
        return this.file;
    }

    /**
     * Gets the value of the limsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimsid() {
        return limsid;
    }

    /**
     * Sets the value of the limsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimsid(String value) {
        this.limsid = value;
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
