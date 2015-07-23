//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.18 at 10:21:26 AM PDT 
//


package com.genologics.ri.workflowconfiguration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.genologics.ri.workflowconfiguration package. 
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

    private final static QName _Workflows_QNAME = new QName("http://genologics.com/ri/workflowconfiguration", "workflows");
    private final static QName _Workflow_QNAME = new QName("http://genologics.com/ri/workflowconfiguration", "workflow");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.genologics.ri.workflowconfiguration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Workflow }
     * 
     */
    public Workflow createWorkflow() {
        return new Workflow();
    }

    /**
     * Create an instance of {@link Workflows }
     * 
     */
    public Workflows createWorkflows() {
        return new Workflows();
    }

    /**
     * Create an instance of {@link ProtocolLink }
     * 
     */
    public ProtocolLink createProtocolLink() {
        return new ProtocolLink();
    }

    /**
     * Create an instance of {@link StageLink }
     * 
     */
    public StageLink createStageLink() {
        return new StageLink();
    }

    /**
     * Create an instance of {@link WorkflowLink }
     * 
     */
    public WorkflowLink createWorkflowLink() {
        return new WorkflowLink();
    }

    /**
     * Create an instance of {@link Workflow.Protocols }
     * 
     */
    public Workflow.Protocols createWorkflowProtocols() {
        return new Workflow.Protocols();
    }

    /**
     * Create an instance of {@link Workflow.Stages }
     * 
     */
    public Workflow.Stages createWorkflowStages() {
        return new Workflow.Stages();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Workflows }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri/workflowconfiguration", name = "workflows")
    public JAXBElement<Workflows> createWorkflows(Workflows value) {
        return new JAXBElement<Workflows>(_Workflows_QNAME, Workflows.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Workflow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri/workflowconfiguration", name = "workflow")
    public JAXBElement<Workflow> createWorkflow(Workflow value) {
        return new JAXBElement<Workflow>(_Workflow_QNAME, Workflow.class, null, value);
    }

}