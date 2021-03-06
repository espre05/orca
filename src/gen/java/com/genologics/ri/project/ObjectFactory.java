//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.18 at 10:21:26 AM PDT 
//


package com.genologics.ri.project;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.genologics.ri.project package. 
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

    private final static QName _Projects_QNAME = new QName("http://genologics.com/ri/project", "projects");
    private final static QName _Project_QNAME = new QName("http://genologics.com/ri/project", "project");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.genologics.ri.project
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Projects }
     * 
     */
    public Projects createProjects() {
        return new Projects();
    }

    /**
     * Create an instance of {@link Project }
     * 
     */
    public Project createProject() {
        return new Project();
    }

    /**
     * Create an instance of {@link ProjectLink }
     * 
     */
    public ProjectLink createProjectLink() {
        return new ProjectLink();
    }

    /**
     * Create an instance of {@link Researcher }
     * 
     */
    public Researcher createResearcher() {
        return new Researcher();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Projects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri/project", name = "projects")
    public JAXBElement<Projects> createProjects(Projects value) {
        return new JAXBElement<Projects>(_Projects_QNAME, Projects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Project }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri/project", name = "project")
    public JAXBElement<Project> createProject(Project value) {
        return new JAXBElement<Project>(_Project_QNAME, Project.class, null, value);
    }

}
