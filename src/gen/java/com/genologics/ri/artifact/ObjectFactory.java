//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.18 at 10:21:26 AM PDT 
//


package com.genologics.ri.artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.genologics.ri.artifact package. 
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

    private final static QName _Artifacts_QNAME = new QName("http://genologics.com/ri/artifact", "artifacts");
    private final static QName _Details_QNAME = new QName("http://genologics.com/ri/artifact", "details");
    private final static QName _Artifact_QNAME = new QName("http://genologics.com/ri/artifact", "artifact");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.genologics.ri.artifact
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Artifact }
     * 
     */
    public Artifact createArtifact() {
        return new Artifact();
    }

    /**
     * Create an instance of {@link Details }
     * 
     */
    public Details createDetails() {
        return new Details();
    }

    /**
     * Create an instance of {@link Artifacts }
     * 
     */
    public Artifacts createArtifacts() {
        return new Artifacts();
    }

    /**
     * Create an instance of {@link ReagentLabel }
     * 
     */
    public ReagentLabel createReagentLabel() {
        return new ReagentLabel();
    }

    /**
     * Create an instance of {@link ArtifactLink }
     * 
     */
    public ArtifactLink createArtifactLink() {
        return new ArtifactLink();
    }

    /**
     * Create an instance of {@link Artifactgroup }
     * 
     */
    public Artifactgroup createArtifactgroup() {
        return new Artifactgroup();
    }

    /**
     * Create an instance of {@link ParentProcess }
     * 
     */
    public ParentProcess createParentProcess() {
        return new ParentProcess();
    }

    /**
     * Create an instance of {@link ControlType }
     * 
     */
    public ControlType createControlType() {
        return new ControlType();
    }

    /**
     * Create an instance of {@link Sample }
     * 
     */
    public Sample createSample() {
        return new Sample();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Artifacts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri/artifact", name = "artifacts")
    public JAXBElement<Artifacts> createArtifacts(Artifacts value) {
        return new JAXBElement<Artifacts>(_Artifacts_QNAME, Artifacts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Details }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri/artifact", name = "details")
    public JAXBElement<Details> createDetails(Details value) {
        return new JAXBElement<Details>(_Details_QNAME, Details.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Artifact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri/artifact", name = "artifact")
    public JAXBElement<Artifact> createArtifact(Artifact value) {
        return new JAXBElement<Artifact>(_Artifact_QNAME, Artifact.class, null, value);
    }

}
