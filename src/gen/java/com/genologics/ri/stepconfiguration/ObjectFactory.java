//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.18 at 10:21:26 AM PDT 
//


package com.genologics.ri.stepconfiguration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.genologics.ri.stepconfiguration package. 
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

    private final static QName _Step_QNAME = new QName("http://genologics.com/ri/stepconfiguration", "step");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.genologics.ri.stepconfiguration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StepSetup }
     * 
     */
    public StepSetup createStepSetup() {
        return new StepSetup();
    }

    /**
     * Create an instance of {@link Step }
     * 
     */
    public Step createStep() {
        return new Step();
    }

    /**
     * Create an instance of {@link NextStep }
     * 
     */
    public NextStep createNextStep() {
        return new NextStep();
    }

    /**
     * Create an instance of {@link Queuefield }
     * 
     */
    public Queuefield createQueuefield() {
        return new Queuefield();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link ProcessType }
     * 
     */
    public ProcessType createProcessType() {
        return new ProcessType();
    }

    /**
     * Create an instance of {@link StepProperty }
     * 
     */
    public StepProperty createStepProperty() {
        return new StepProperty();
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link ControlTypeLink }
     * 
     */
    public ControlTypeLink createControlTypeLink() {
        return new ControlTypeLink();
    }

    /**
     * Create an instance of {@link EppTrigger }
     * 
     */
    public EppTrigger createEppTrigger() {
        return new EppTrigger();
    }

    /**
     * Create an instance of {@link StepSetup.Files }
     * 
     */
    public StepSetup.Files createStepSetupFiles() {
        return new StepSetup.Files();
    }

    /**
     * Create an instance of {@link Step.PermittedContainers }
     * 
     */
    public Step.PermittedContainers createStepPermittedContainers() {
        return new Step.PermittedContainers();
    }

    /**
     * Create an instance of {@link Step.PermittedReagentCategories }
     * 
     */
    public Step.PermittedReagentCategories createStepPermittedReagentCategories() {
        return new Step.PermittedReagentCategories();
    }

    /**
     * Create an instance of {@link Step.PermittedControlTypes }
     * 
     */
    public Step.PermittedControlTypes createStepPermittedControlTypes() {
        return new Step.PermittedControlTypes();
    }

    /**
     * Create an instance of {@link Step.Transitions }
     * 
     */
    public Step.Transitions createStepTransitions() {
        return new Step.Transitions();
    }

    /**
     * Create an instance of {@link Step.QueueFields }
     * 
     */
    public Step.QueueFields createStepQueueFields() {
        return new Step.QueueFields();
    }

    /**
     * Create an instance of {@link Step.StepFields }
     * 
     */
    public Step.StepFields createStepStepFields() {
        return new Step.StepFields();
    }

    /**
     * Create an instance of {@link Step.SampleFields }
     * 
     */
    public Step.SampleFields createStepSampleFields() {
        return new Step.SampleFields();
    }

    /**
     * Create an instance of {@link Step.StepProperties }
     * 
     */
    public Step.StepProperties createStepStepProperties() {
        return new Step.StepProperties();
    }

    /**
     * Create an instance of {@link Step.EppTriggers }
     * 
     */
    public Step.EppTriggers createStepEppTriggers() {
        return new Step.EppTriggers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Step }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri/stepconfiguration", name = "step")
    public JAXBElement<Step> createStep(Step value) {
        return new JAXBElement<Step>(_Step_QNAME, Step.class, null, value);
    }

}
