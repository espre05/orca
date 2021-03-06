//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.18 at 10:21:26 AM PDT 
//


package com.genologics.ri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.genologics.ri package. 
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

    private final static QName _Index_QNAME = new QName("http://genologics.com/ri", "index");
    private final static QName _Links_QNAME = new QName("http://genologics.com/ri", "links");
    private final static QName _Externalid_QNAME = new QName("http://genologics.com/ri", "externalid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.genologics.ri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Index }
     * 
     */
    public Index createIndex() {
        return new Index();
    }

    /**
     * Create an instance of {@link Externalid }
     * 
     */
    public Externalid createExternalid() {
        return new Externalid();
    }

    /**
     * Create an instance of {@link Links }
     * 
     */
    public Links createLinks() {
        return new Links();
    }

    /**
     * Create an instance of {@link Page }
     * 
     */
    public Page createPage() {
        return new Page();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Container }
     * 
     */
    public Container createContainer() {
        return new Container();
    }

    /**
     * Create an instance of {@link Link }
     * 
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Index }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri", name = "index")
    public JAXBElement<Index> createIndex(Index value) {
        return new JAXBElement<Index>(_Index_QNAME, Index.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Links }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri", name = "links")
    public JAXBElement<Links> createLinks(Links value) {
        return new JAXBElement<Links>(_Links_QNAME, Links.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Externalid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri", name = "externalid")
    public JAXBElement<Externalid> createExternalid(Externalid value) {
        return new JAXBElement<Externalid>(_Externalid_QNAME, Externalid.class, null, value);
    }

}
