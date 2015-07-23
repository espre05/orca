//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.18 at 10:21:26 AM PDT 
//


package com.genologics.ri.processtype;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.genologics.ri.processtype package. 
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

    private final static QName _ProcessTypes_QNAME = new QName("http://genologics.com/ri/processtype", "process-types");
    private final static QName _ProcessType_QNAME = new QName("http://genologics.com/ri/processtype", "process-type");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.genologics.ri.processtype
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessType }
     * 
     */
    public ProcessType createProcessType() {
        return new ProcessType();
    }

    /**
     * Create an instance of {@link ProcessTypes }
     * 
     */
    public ProcessTypes createProcessTypes() {
        return new ProcessTypes();
    }

    /**
     * Create an instance of {@link Parameter }
     * 
     */
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link TypeDefinition }
     * 
     */
    public TypeDefinition createTypeDefinition() {
        return new TypeDefinition();
    }

    /**
     * Create an instance of {@link ProcessTypeAttribute }
     * 
     */
    public ProcessTypeAttribute createProcessTypeAttribute() {
        return new ProcessTypeAttribute();
    }

    /**
     * Create an instance of {@link ProcessTypeLink }
     * 
     */
    public ProcessTypeLink createProcessTypeLink() {
        return new ProcessTypeLink();
    }

    /**
     * Create an instance of {@link ProcessInput }
     * 
     */
    public ProcessInput createProcessInput() {
        return new ProcessInput();
    }

    /**
     * Create an instance of {@link ProcessOutput }
     * 
     */
    public ProcessOutput createProcessOutput() {
        return new ProcessOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri/processtype", name = "process-types")
    public JAXBElement<ProcessTypes> createProcessTypes(ProcessTypes value) {
        return new JAXBElement<ProcessTypes>(_ProcessTypes_QNAME, ProcessTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri/processtype", name = "process-type")
    public JAXBElement<ProcessType> createProcessType(ProcessType value) {
        return new JAXBElement<ProcessType>(_ProcessType_QNAME, ProcessType.class, null, value);
    }

}
