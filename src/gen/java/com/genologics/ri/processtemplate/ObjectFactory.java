//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.18 at 10:21:26 AM PDT 
//


package com.genologics.ri.processtemplate;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.genologics.ri.processtemplate package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProcessTemplates_QNAME = new QName("http://genologics.com/ri/processtemplate", "process-templates");
    private final static QName _ProcessTemplate_QNAME = new QName("http://genologics.com/ri/processtemplate", "process-template");
    private final static QName _ProcessTemplateTechnician_QNAME = new QName("", "technician");
    private final static QName _ProcessTemplateName_QNAME = new QName("", "name");
    private final static QName _ProcessTemplateIsDefault_QNAME = new QName("", "is-default");
    private final static QName _ProcessTemplateInstrument_QNAME = new QName("", "instrument");
    private final static QName _ProcessTemplateType_QNAME = new QName("", "type");
    private final static QName _ProcessTemplateProcessParameter_QNAME = new QName("", "process-parameter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.genologics.ri.processtemplate
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessTemplates }
     * 
     */
    public ProcessTemplates createProcessTemplates() {
        return new ProcessTemplates();
    }

    /**
     * Create an instance of {@link ProcessTemplate }
     * 
     */
    public ProcessTemplate createProcessTemplate() {
        return new ProcessTemplate();
    }

    /**
     * Create an instance of {@link ProcessType }
     * 
     */
    public ProcessType createProcessType() {
        return new ProcessType();
    }

    /**
     * Create an instance of {@link Technician }
     * 
     */
    public Technician createTechnician() {
        return new Technician();
    }

    /**
     * Create an instance of {@link Parameter }
     * 
     */
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link ProcessTemplateLink }
     * 
     */
    public ProcessTemplateLink createProcessTemplateLink() {
        return new ProcessTemplateLink();
    }

    /**
     * Create an instance of {@link Instrument }
     * 
     */
    public Instrument createInstrument() {
        return new Instrument();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessTemplates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri/processtemplate", name = "process-templates")
    public JAXBElement<ProcessTemplates> createProcessTemplates(ProcessTemplates value) {
        return new JAXBElement<ProcessTemplates>(_ProcessTemplates_QNAME, ProcessTemplates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessTemplate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri/processtemplate", name = "process-template")
    public JAXBElement<ProcessTemplate> createProcessTemplate(ProcessTemplate value) {
        return new JAXBElement<ProcessTemplate>(_ProcessTemplate_QNAME, ProcessTemplate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Technician }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "technician", scope = ProcessTemplate.class)
    public JAXBElement<Technician> createProcessTemplateTechnician(Technician value) {
        return new JAXBElement<Technician>(_ProcessTemplateTechnician_QNAME, Technician.class, ProcessTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name", scope = ProcessTemplate.class)
    public JAXBElement<String> createProcessTemplateName(String value) {
        return new JAXBElement<String>(_ProcessTemplateName_QNAME, String.class, ProcessTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "is-default", scope = ProcessTemplate.class)
    public JAXBElement<Boolean> createProcessTemplateIsDefault(Boolean value) {
        return new JAXBElement<Boolean>(_ProcessTemplateIsDefault_QNAME, Boolean.class, ProcessTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Instrument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "instrument", scope = ProcessTemplate.class)
    public JAXBElement<Instrument> createProcessTemplateInstrument(Instrument value) {
        return new JAXBElement<Instrument>(_ProcessTemplateInstrument_QNAME, Instrument.class, ProcessTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type", scope = ProcessTemplate.class)
    public JAXBElement<ProcessType> createProcessTemplateType(ProcessType value) {
        return new JAXBElement<ProcessType>(_ProcessTemplateType_QNAME, ProcessType.class, ProcessTemplate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "process-parameter", scope = ProcessTemplate.class)
    public JAXBElement<Parameter> createProcessTemplateProcessParameter(Parameter value) {
        return new JAXBElement<Parameter>(_ProcessTemplateProcessParameter_QNAME, Parameter.class, ProcessTemplate.class, value);
    }

}