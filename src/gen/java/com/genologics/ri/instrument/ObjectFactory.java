//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.18 at 10:21:26 AM PDT 
//


package com.genologics.ri.instrument;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.genologics.ri.instrument package. 
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

    private final static QName _Instruments_QNAME = new QName("http://genologics.com/ri/instrument", "instruments");
    private final static QName _Instrument_QNAME = new QName("http://genologics.com/ri/instrument", "instrument");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.genologics.ri.instrument
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Instrument }
     * 
     */
    public Instrument createInstrument() {
        return new Instrument();
    }

    /**
     * Create an instance of {@link Instruments }
     * 
     */
    public Instruments createInstruments() {
        return new Instruments();
    }

    /**
     * Create an instance of {@link InstrumentLink }
     * 
     */
    public InstrumentLink createInstrumentLink() {
        return new InstrumentLink();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Instruments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri/instrument", name = "instruments")
    public JAXBElement<Instruments> createInstruments(Instruments value) {
        return new JAXBElement<Instruments>(_Instruments_QNAME, Instruments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Instrument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://genologics.com/ri/instrument", name = "instrument")
    public JAXBElement<Instrument> createInstrument(Instrument value) {
        return new JAXBElement<Instrument>(_Instrument_QNAME, Instrument.class, null, value);
    }

}
