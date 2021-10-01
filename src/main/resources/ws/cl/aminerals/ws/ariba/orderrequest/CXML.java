
package cl.aminerals.ws.ariba.orderrequest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Header">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="From">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Credential" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="To">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="Credential">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Correspondent">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Contact" maxOccurs="2" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Name" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
 *                                                           &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Country" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                   &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Email" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="preferredLanguage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Sender">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="Credential">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SharedSecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="UserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Request">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrderRequest">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OrderRequestHeader">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Total">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="Money" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                                                         &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ShipTo">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="Address">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Name" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                   &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="DeliverTo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/>
 *                                                                     &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
 *                                                                     &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="Country" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;simpleContent>
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                             &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/extension>
 *                                                                         &lt;/simpleContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Email" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                   &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Phone" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="TelephoneNumber" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="CountryCode" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;simpleContent>
 *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                       &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                     &lt;/extension>
 *                                                                                   &lt;/simpleContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="BillTo">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="Address">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Name" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                   &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
 *                                                                     &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="Country" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;simpleContent>
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                             &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/extension>
 *                                                                         &lt;/simpleContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="IdReference" maxOccurs="2" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                   &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PaymentTerm" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="payInNumberOfDays" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Contact" maxOccurs="2" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Name" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
 *                                                           &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Country" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                   &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Email" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Phone" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="TelephoneNumber" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="CountryCode" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;simpleContent>
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                             &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/extension>
 *                                                                         &lt;/simpleContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="IdReference" maxOccurs="2" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="buyerVatID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="supplierVatID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="extTransactionCategoryOrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="extCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="extPUName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="extCodTipoFlete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="extDescCodTipoFlete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="extClaseDocSAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="extIncoTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="extIncoTerm2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="extNombreAdminContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="extRutAdminContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="extNotasGenerales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="extClausulasGenerales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="extClausulasEspecificas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="agreementID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="agreementPayloadID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="orderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                     &lt;attribute name="orderID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="orderType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="orderVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="requestedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                     &lt;attribute name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ItemOut" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BlanketItemDetail" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="UnitPrice" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Money" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                   &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Description" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Classification" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ItemID">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SupplierPartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="BuyerPartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ItemDetail" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="UnitPrice">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;all>
 *                                                           &lt;element name="Money" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                                                                   &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/all>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Description" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="ManufacturerPartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="ManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Classification" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="LeadTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="extReqLineNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="extRequester" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="extPRNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="extContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="extBodegaMatRepos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="extDescBodegaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="extNumCotizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Tax" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="Description" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TaxDetail">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;all>
 *                                                           &lt;element name="TaxableAmount">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;all>
 *                                                                     &lt;element name="Money" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;simpleContent>
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                                                                             &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/extension>
 *                                                                         &lt;/simpleContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/all>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="TaxAmount">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;all>
 *                                                                     &lt;element name="Money" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;simpleContent>
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                                                                             &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/extension>
 *                                                                         &lt;/simpleContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/all>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Description" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                   &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/all>
 *                                                         &lt;attribute name="percentageRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Distribution" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="Accounting" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                   &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="DistributionCharge" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Charge" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;all>
 *                                                           &lt;element name="Money" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                                                                   &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/all>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="SpendDetail" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="extService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="MasterAgreementIDInfo" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="agreementID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="requiresServiceEntry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="itemType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="parentLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="requestedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                     &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="deploymentMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
public class CXML {

    @XmlElement(name = "Header", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
    protected CXML.Header header;
    @XmlElement(name = "Request", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
    protected CXML.Request request;

    /**
     * Obtiene el valor de la propiedad header.
     * 
     * @return
     *     possible object is
     *     {@link CXML.Header }
     *     
     */
    public CXML.Header getHeader() {
        return header;
    }

    /**
     * Define el valor de la propiedad header.
     * 
     * @param value
     *     allowed object is
     *     {@link CXML.Header }
     *     
     */
    public void setHeader(CXML.Header value) {
        this.header = value;
    }

    /**
     * Obtiene el valor de la propiedad request.
     * 
     * @return
     *     possible object is
     *     {@link CXML.Request }
     *     
     */
    public CXML.Request getRequest() {
        return request;
    }

    /**
     * Define el valor de la propiedad request.
     * 
     * @param value
     *     allowed object is
     *     {@link CXML.Request }
     *     
     */
    public void setRequest(CXML.Request value) {
        this.request = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="From">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Credential" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="To">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="Credential">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Correspondent">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Contact" maxOccurs="2" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Name" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
     *                                                 &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Country" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                         &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Email" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="preferredLanguage" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Sender">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="Credential">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SharedSecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="UserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Header {

        @XmlElement(name = "From", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
        protected CXML.Header.From from;
        @XmlElement(name = "To", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
        protected CXML.Header.To to;
        @XmlElement(name = "Sender", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
        protected CXML.Header.Sender sender;

        /**
         * Obtiene el valor de la propiedad from.
         * 
         * @return
         *     possible object is
         *     {@link CXML.Header.From }
         *     
         */
        public CXML.Header.From getFrom() {
            return from;
        }

        /**
         * Define el valor de la propiedad from.
         * 
         * @param value
         *     allowed object is
         *     {@link CXML.Header.From }
         *     
         */
        public void setFrom(CXML.Header.From value) {
            this.from = value;
        }

        /**
         * Obtiene el valor de la propiedad to.
         * 
         * @return
         *     possible object is
         *     {@link CXML.Header.To }
         *     
         */
        public CXML.Header.To getTo() {
            return to;
        }

        /**
         * Define el valor de la propiedad to.
         * 
         * @param value
         *     allowed object is
         *     {@link CXML.Header.To }
         *     
         */
        public void setTo(CXML.Header.To value) {
            this.to = value;
        }

        /**
         * Obtiene el valor de la propiedad sender.
         * 
         * @return
         *     possible object is
         *     {@link CXML.Header.Sender }
         *     
         */
        public CXML.Header.Sender getSender() {
            return sender;
        }

        /**
         * Define el valor de la propiedad sender.
         * 
         * @param value
         *     allowed object is
         *     {@link CXML.Header.Sender }
         *     
         */
        public void setSender(CXML.Header.Sender value) {
            this.sender = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Credential" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "credential"
        })
        public static class From {

            @XmlElement(name = "Credential", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
            protected List<CXML.Header.From.Credential> credential;

            /**
             * Gets the value of the credential property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the credential property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCredential().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CXML.Header.From.Credential }
             * 
             * 
             */
            public List<CXML.Header.From.Credential> getCredential() {
                if (credential == null) {
                    credential = new ArrayList<CXML.Header.From.Credential>();
                }
                return this.credential;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "identity"
            })
            public static class Credential {

                @XmlElementRef(name = "Identity", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> identity;
                @XmlAttribute(name = "Domain")
                protected String domain;

                /**
                 * Obtiene el valor de la propiedad identity.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getIdentity() {
                    return identity;
                }

                /**
                 * Define el valor de la propiedad identity.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setIdentity(JAXBElement<String> value) {
                    this.identity = value;
                }

                /**
                 * Obtiene el valor de la propiedad domain.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDomain() {
                    return domain;
                }

                /**
                 * Define el valor de la propiedad domain.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDomain(String value) {
                    this.domain = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="Credential">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SharedSecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="UserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Sender {

            @XmlElement(name = "Credential", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
            protected CXML.Header.Sender.Credential credential;
            @XmlElementRef(name = "UserAgent", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
            protected JAXBElement<String> userAgent;

            /**
             * Obtiene el valor de la propiedad credential.
             * 
             * @return
             *     possible object is
             *     {@link CXML.Header.Sender.Credential }
             *     
             */
            public CXML.Header.Sender.Credential getCredential() {
                return credential;
            }

            /**
             * Define el valor de la propiedad credential.
             * 
             * @param value
             *     allowed object is
             *     {@link CXML.Header.Sender.Credential }
             *     
             */
            public void setCredential(CXML.Header.Sender.Credential value) {
                this.credential = value;
            }

            /**
             * Obtiene el valor de la propiedad userAgent.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getUserAgent() {
                return userAgent;
            }

            /**
             * Define el valor de la propiedad userAgent.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setUserAgent(JAXBElement<String> value) {
                this.userAgent = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SharedSecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "identity",
                "sharedSecret"
            })
            public static class Credential {

                @XmlElementRef(name = "Identity", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> identity;
                @XmlElementRef(name = "SharedSecret", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> sharedSecret;
                @XmlAttribute(name = "Domain")
                protected String domain;

                /**
                 * Obtiene el valor de la propiedad identity.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getIdentity() {
                    return identity;
                }

                /**
                 * Define el valor de la propiedad identity.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setIdentity(JAXBElement<String> value) {
                    this.identity = value;
                }

                /**
                 * Obtiene el valor de la propiedad sharedSecret.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getSharedSecret() {
                    return sharedSecret;
                }

                /**
                 * Define el valor de la propiedad sharedSecret.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setSharedSecret(JAXBElement<String> value) {
                    this.sharedSecret = value;
                }

                /**
                 * Obtiene el valor de la propiedad domain.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDomain() {
                    return domain;
                }

                /**
                 * Define el valor de la propiedad domain.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDomain(String value) {
                    this.domain = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="Credential">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Correspondent">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Contact" maxOccurs="2" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Name" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
         *                                       &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Country" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                               &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Email" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="preferredLanguage" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/all>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class To {

            @XmlElement(name = "Credential", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
            protected CXML.Header.To.Credential credential;
            @XmlElement(name = "Correspondent", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
            protected CXML.Header.To.Correspondent correspondent;

            /**
             * Obtiene el valor de la propiedad credential.
             * 
             * @return
             *     possible object is
             *     {@link CXML.Header.To.Credential }
             *     
             */
            public CXML.Header.To.Credential getCredential() {
                return credential;
            }

            /**
             * Define el valor de la propiedad credential.
             * 
             * @param value
             *     allowed object is
             *     {@link CXML.Header.To.Credential }
             *     
             */
            public void setCredential(CXML.Header.To.Credential value) {
                this.credential = value;
            }

            /**
             * Obtiene el valor de la propiedad correspondent.
             * 
             * @return
             *     possible object is
             *     {@link CXML.Header.To.Correspondent }
             *     
             */
            public CXML.Header.To.Correspondent getCorrespondent() {
                return correspondent;
            }

            /**
             * Define el valor de la propiedad correspondent.
             * 
             * @param value
             *     allowed object is
             *     {@link CXML.Header.To.Correspondent }
             *     
             */
            public void setCorrespondent(CXML.Header.To.Correspondent value) {
                this.correspondent = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Contact" maxOccurs="2" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Name" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
             *                             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Country" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                     &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Email" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="preferredLanguage" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "contact"
            })
            public static class Correspondent {

                @XmlElement(name = "Contact", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                protected List<CXML.Header.To.Correspondent.Contact> contact;
                @XmlAttribute(name = "preferredLanguage")
                protected String preferredLanguage;

                /**
                 * Gets the value of the contact property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the contact property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContact().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CXML.Header.To.Correspondent.Contact }
                 * 
                 * 
                 */
                public List<CXML.Header.To.Correspondent.Contact> getContact() {
                    if (contact == null) {
                        contact = new ArrayList<CXML.Header.To.Correspondent.Contact>();
                    }
                    return this.contact;
                }

                /**
                 * Obtiene el valor de la propiedad preferredLanguage.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreferredLanguage() {
                    return preferredLanguage;
                }

                /**
                 * Define el valor de la propiedad preferredLanguage.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreferredLanguage(String value) {
                    this.preferredLanguage = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Name" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
                 *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Country" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                           &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Email" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "name",
                    "postalAddress",
                    "email"
                })
                public static class Contact {

                    @XmlElementRef(name = "Name", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<CXML.Header.To.Correspondent.Contact.Name> name;
                    @XmlElement(name = "PostalAddress", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                    protected List<CXML.Header.To.Correspondent.Contact.PostalAddress> postalAddress;
                    @XmlElementRef(name = "Email", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<CXML.Header.To.Correspondent.Contact.Email> email;
                    @XmlAttribute(name = "role")
                    protected String role;
                    @XmlAttribute(name = "addressID")
                    protected String addressID;

                    /**
                     * Obtiene el valor de la propiedad name.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Header.To.Correspondent.Contact.Name }{@code >}
                     *     
                     */
                    public JAXBElement<CXML.Header.To.Correspondent.Contact.Name> getName() {
                        return name;
                    }

                    /**
                     * Define el valor de la propiedad name.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Header.To.Correspondent.Contact.Name }{@code >}
                     *     
                     */
                    public void setName(JAXBElement<CXML.Header.To.Correspondent.Contact.Name> value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the postalAddress property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the postalAddress property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPostalAddress().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link CXML.Header.To.Correspondent.Contact.PostalAddress }
                     * 
                     * 
                     */
                    public List<CXML.Header.To.Correspondent.Contact.PostalAddress> getPostalAddress() {
                        if (postalAddress == null) {
                            postalAddress = new ArrayList<CXML.Header.To.Correspondent.Contact.PostalAddress>();
                        }
                        return this.postalAddress;
                    }

                    /**
                     * Obtiene el valor de la propiedad email.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Header.To.Correspondent.Contact.Email }{@code >}
                     *     
                     */
                    public JAXBElement<CXML.Header.To.Correspondent.Contact.Email> getEmail() {
                        return email;
                    }

                    /**
                     * Define el valor de la propiedad email.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Header.To.Correspondent.Contact.Email }{@code >}
                     *     
                     */
                    public void setEmail(JAXBElement<CXML.Header.To.Correspondent.Contact.Email> value) {
                        this.email = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad role.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRole() {
                        return role;
                    }

                    /**
                     * Define el valor de la propiedad role.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRole(String value) {
                        this.role = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad addressID.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAddressID() {
                        return addressID;
                    }

                    /**
                     * Define el valor de la propiedad addressID.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAddressID(String value) {
                        this.addressID = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Email {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "name")
                        protected String name;

                        /**
                         * Obtiene el valor de la propiedad value.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Define el valor de la propiedad value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad name.
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
                         * Define el valor de la propiedad name.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setName(String value) {
                            this.name = value;
                        }

                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Name {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "xmlLang")
                        protected String xmlLang;

                        /**
                         * Obtiene el valor de la propiedad value.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Define el valor de la propiedad value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad xmlLang.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getXmlLang() {
                            return xmlLang;
                        }

                        /**
                         * Define el valor de la propiedad xmlLang.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setXmlLang(String value) {
                            this.xmlLang = value;
                        }

                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
                     *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Country" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                 &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "street",
                        "city",
                        "state",
                        "postalCode",
                        "country"
                    })
                    public static class PostalAddress {

                        @XmlElement(name = "Street", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                        protected List<String> street;
                        @XmlElementRef(name = "City", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> city;
                        @XmlElementRef(name = "State", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> state;
                        @XmlElementRef(name = "PostalCode", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> postalCode;
                        @XmlElementRef(name = "Country", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<CXML.Header.To.Correspondent.Contact.PostalAddress.Country> country;

                        /**
                         * Gets the value of the street property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the street property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getStreet().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link String }
                         * 
                         * 
                         */
                        public List<String> getStreet() {
                            if (street == null) {
                                street = new ArrayList<String>();
                            }
                            return this.street;
                        }

                        /**
                         * Obtiene el valor de la propiedad city.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getCity() {
                            return city;
                        }

                        /**
                         * Define el valor de la propiedad city.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setCity(JAXBElement<String> value) {
                            this.city = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad state.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getState() {
                            return state;
                        }

                        /**
                         * Define el valor de la propiedad state.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setState(JAXBElement<String> value) {
                            this.state = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad postalCode.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getPostalCode() {
                            return postalCode;
                        }

                        /**
                         * Define el valor de la propiedad postalCode.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setPostalCode(JAXBElement<String> value) {
                            this.postalCode = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad country.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Header.To.Correspondent.Contact.PostalAddress.Country }{@code >}
                         *     
                         */
                        public JAXBElement<CXML.Header.To.Correspondent.Contact.PostalAddress.Country> getCountry() {
                            return country;
                        }

                        /**
                         * Define el valor de la propiedad country.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Header.To.Correspondent.Contact.PostalAddress.Country }{@code >}
                         *     
                         */
                        public void setCountry(JAXBElement<CXML.Header.To.Correspondent.Contact.PostalAddress.Country> value) {
                            this.country = value;
                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;simpleContent>
                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *       &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/extension>
                         *   &lt;/simpleContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "value"
                        })
                        public static class Country {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "isoCountryCode")
                            protected String isoCountryCode;

                            /**
                             * Obtiene el valor de la propiedad value.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getValue() {
                                return value;
                            }

                            /**
                             * Define el valor de la propiedad value.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setValue(String value) {
                                this.value = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad isoCountryCode.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getIsoCountryCode() {
                                return isoCountryCode;
                            }

                            /**
                             * Define el valor de la propiedad isoCountryCode.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setIsoCountryCode(String value) {
                                this.isoCountryCode = value;
                            }

                        }

                    }

                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="Domain" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "identity"
            })
            public static class Credential {

                @XmlElementRef(name = "Identity", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> identity;
                @XmlAttribute(name = "Domain")
                protected String domain;

                /**
                 * Obtiene el valor de la propiedad identity.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getIdentity() {
                    return identity;
                }

                /**
                 * Define el valor de la propiedad identity.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setIdentity(JAXBElement<String> value) {
                    this.identity = value;
                }

                /**
                 * Obtiene el valor de la propiedad domain.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDomain() {
                    return domain;
                }

                /**
                 * Define el valor de la propiedad domain.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDomain(String value) {
                    this.domain = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OrderRequest">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OrderRequestHeader">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Total">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="Money" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                                               &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ShipTo">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="Address">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Name" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                         &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="DeliverTo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/>
     *                                                           &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
     *                                                           &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="Country" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;simpleContent>
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                   &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/extension>
     *                                                               &lt;/simpleContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Email" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                         &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Phone" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="TelephoneNumber" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="CountryCode" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;simpleContent>
     *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                             &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                           &lt;/extension>
     *                                                                         &lt;/simpleContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="BillTo">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="Address">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Name" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                         &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
     *                                                           &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="Country" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;simpleContent>
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                   &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/extension>
     *                                                               &lt;/simpleContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="IdReference" maxOccurs="2" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                         &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PaymentTerm" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="payInNumberOfDays" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Contact" maxOccurs="2" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Name" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
     *                                                 &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Country" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                         &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Email" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Phone" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="TelephoneNumber" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="CountryCode" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;simpleContent>
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                   &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/extension>
     *                                                               &lt;/simpleContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="IdReference" maxOccurs="2" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="buyerVatID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="supplierVatID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="extTransactionCategoryOrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="extCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="extPUName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="extCodTipoFlete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="extDescCodTipoFlete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="extClaseDocSAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="extIncoTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="extIncoTerm2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="extNombreAdminContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="extRutAdminContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="extNotasGenerales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="extClausulasGenerales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="extClausulasEspecificas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="agreementID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="agreementPayloadID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="orderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                           &lt;attribute name="orderID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="orderType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="orderVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="requestedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                           &lt;attribute name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ItemOut" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BlanketItemDetail" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="UnitPrice" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Money" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                         &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Description" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Classification" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ItemID">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SupplierPartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="BuyerPartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ItemDetail" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="UnitPrice">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;all>
     *                                                 &lt;element name="Money" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                                                         &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/all>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Description" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="ManufacturerPartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="ManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Classification" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="LeadTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="extReqLineNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="extRequester" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="extPRNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="extContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="extBodegaMatRepos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="extDescBodegaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="extNumCotizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Tax" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="Description" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="TaxDetail">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;all>
     *                                                 &lt;element name="TaxableAmount">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;all>
     *                                                           &lt;element name="Money" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;simpleContent>
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                                                                   &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/extension>
     *                                                               &lt;/simpleContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/all>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="TaxAmount">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;all>
     *                                                           &lt;element name="Money" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;simpleContent>
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                                                                   &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/extension>
     *                                                               &lt;/simpleContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/all>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Description" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                         &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/all>
     *                                               &lt;attribute name="percentageRate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Distribution" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="Accounting" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                         &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="DistributionCharge" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Charge" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;all>
     *                                                 &lt;element name="Money" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                                                         &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/all>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/all>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="SpendDetail" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="extService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="MasterAgreementIDInfo" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="agreementID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="requiresServiceEntry" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="itemType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="parentLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="requestedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                           &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="deploymentMode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orderRequest"
    })
    public static class Request {

        @XmlElement(name = "OrderRequest", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
        protected CXML.Request.OrderRequest orderRequest;
        @XmlAttribute(name = "deploymentMode")
        protected String deploymentMode;

        /**
         * Obtiene el valor de la propiedad orderRequest.
         * 
         * @return
         *     possible object is
         *     {@link CXML.Request.OrderRequest }
         *     
         */
        public CXML.Request.OrderRequest getOrderRequest() {
            return orderRequest;
        }

        /**
         * Define el valor de la propiedad orderRequest.
         * 
         * @param value
         *     allowed object is
         *     {@link CXML.Request.OrderRequest }
         *     
         */
        public void setOrderRequest(CXML.Request.OrderRequest value) {
            this.orderRequest = value;
        }

        /**
         * Obtiene el valor de la propiedad deploymentMode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeploymentMode() {
            return deploymentMode;
        }

        /**
         * Define el valor de la propiedad deploymentMode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeploymentMode(String value) {
            this.deploymentMode = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="OrderRequestHeader">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Total">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="Money" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *                                     &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ShipTo">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="Address">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Name" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                               &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="DeliverTo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/>
         *                                                 &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
         *                                                 &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="Country" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;simpleContent>
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                         &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/extension>
         *                                                     &lt;/simpleContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Email" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Phone" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="TelephoneNumber" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="CountryCode" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;simpleContent>
         *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                   &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                 &lt;/extension>
         *                                                               &lt;/simpleContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="BillTo">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="Address">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Name" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                               &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
         *                                                 &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="Country" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;simpleContent>
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                         &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/extension>
         *                                                     &lt;/simpleContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="IdReference" maxOccurs="2" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                               &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PaymentTerm" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="payInNumberOfDays" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Contact" maxOccurs="2" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Name" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
         *                                       &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Country" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                               &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Email" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Phone" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="TelephoneNumber" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="CountryCode" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;simpleContent>
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                         &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/extension>
         *                                                     &lt;/simpleContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="IdReference" maxOccurs="2" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="buyerVatID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="supplierVatID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="extTransactionCategoryOrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="extCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="extPUName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="extCodTipoFlete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="extDescCodTipoFlete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="extClaseDocSAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="extIncoTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="extIncoTerm2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="extNombreAdminContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="extRutAdminContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="extNotasGenerales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="extClausulasGenerales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="extClausulasEspecificas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="agreementID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="agreementPayloadID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="orderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                 &lt;attribute name="orderID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="orderType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="orderVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="requestedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                 &lt;attribute name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ItemOut" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BlanketItemDetail" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="UnitPrice" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Money" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                               &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Description" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Classification" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ItemID">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="SupplierPartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="BuyerPartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ItemDetail" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="UnitPrice">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;all>
         *                                       &lt;element name="Money" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *                                               &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/all>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Description" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="ManufacturerPartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="ManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Classification" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="LeadTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="extReqLineNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="extRequester" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="extPRNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="extContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="extBodegaMatRepos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="extDescBodegaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="extNumCotizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Tax" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="Description" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="TaxDetail">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;all>
         *                                       &lt;element name="TaxableAmount">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;all>
         *                                                 &lt;element name="Money" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;simpleContent>
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *                                                         &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/extension>
         *                                                     &lt;/simpleContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/all>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="TaxAmount">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;all>
         *                                                 &lt;element name="Money" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;simpleContent>
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *                                                         &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/extension>
         *                                                     &lt;/simpleContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/all>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Description" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                               &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/all>
         *                                     &lt;attribute name="percentageRate" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Distribution" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="Accounting" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                               &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="DistributionCharge" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Charge" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;all>
         *                                       &lt;element name="Money" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *                                               &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/all>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/all>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="SpendDetail" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="extService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="MasterAgreementIDInfo" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="agreementID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="requiresServiceEntry" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="itemType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="parentLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="requestedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                 &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "orderRequestHeader",
            "itemOut"
        })
        public static class OrderRequest {

            @XmlElement(name = "OrderRequestHeader", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
            protected CXML.Request.OrderRequest.OrderRequestHeader orderRequestHeader;
            @XmlElement(name = "ItemOut", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
            protected List<CXML.Request.OrderRequest.ItemOut> itemOut;

            /**
             * Obtiene el valor de la propiedad orderRequestHeader.
             * 
             * @return
             *     possible object is
             *     {@link CXML.Request.OrderRequest.OrderRequestHeader }
             *     
             */
            public CXML.Request.OrderRequest.OrderRequestHeader getOrderRequestHeader() {
                return orderRequestHeader;
            }

            /**
             * Define el valor de la propiedad orderRequestHeader.
             * 
             * @param value
             *     allowed object is
             *     {@link CXML.Request.OrderRequest.OrderRequestHeader }
             *     
             */
            public void setOrderRequestHeader(CXML.Request.OrderRequest.OrderRequestHeader value) {
                this.orderRequestHeader = value;
            }

            /**
             * Gets the value of the itemOut property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the itemOut property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItemOut().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CXML.Request.OrderRequest.ItemOut }
             * 
             * 
             */
            public List<CXML.Request.OrderRequest.ItemOut> getItemOut() {
                if (itemOut == null) {
                    itemOut = new ArrayList<CXML.Request.OrderRequest.ItemOut>();
                }
                return this.itemOut;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="BlanketItemDetail" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="UnitPrice" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Money" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                     &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Description" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Classification" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ItemID">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="SupplierPartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="BuyerPartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ItemDetail" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="UnitPrice">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;all>
             *                             &lt;element name="Money" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
             *                                     &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/all>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Description" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="ManufacturerPartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="ManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Classification" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="LeadTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="extReqLineNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="extRequester" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="extPRNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="extContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="extBodegaMatRepos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="extDescBodegaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="extNumCotizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Tax" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="Description" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="TaxDetail">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;all>
             *                             &lt;element name="TaxableAmount">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;all>
             *                                       &lt;element name="Money" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;simpleContent>
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
             *                                               &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/extension>
             *                                           &lt;/simpleContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/all>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="TaxAmount">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;all>
             *                                       &lt;element name="Money" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;simpleContent>
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
             *                                               &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/extension>
             *                                           &lt;/simpleContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/all>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Description" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                     &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/all>
             *                           &lt;attribute name="percentageRate" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Distribution" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="Accounting" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                     &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="DistributionCharge" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Charge" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;all>
             *                             &lt;element name="Money" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
             *                                     &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/all>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="SpendDetail" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="extService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="MasterAgreementIDInfo" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="agreementID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="requiresServiceEntry" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="itemType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="parentLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="requestedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *       &lt;attribute name="quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "blanketItemDetail",
                "comments",
                "itemID",
                "itemDetail",
                "tax",
                "distribution",
                "spendDetail",
                "masterAgreementIDInfo"
            })
            public static class ItemOut {

                @XmlElement(name = "BlanketItemDetail", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                protected List<CXML.Request.OrderRequest.ItemOut.BlanketItemDetail> blanketItemDetail;
                @XmlElementRef(name = "Comments", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> comments;
                @XmlElement(name = "ItemID", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
                protected CXML.Request.OrderRequest.ItemOut.ItemID itemID;
                @XmlElementRef(name = "ItemDetail", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<CXML.Request.OrderRequest.ItemOut.ItemDetail> itemDetail;
                @XmlElementRef(name = "Tax", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<CXML.Request.OrderRequest.ItemOut.Tax> tax;
                @XmlElementRef(name = "Distribution", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<CXML.Request.OrderRequest.ItemOut.Distribution> distribution;
                @XmlElementRef(name = "SpendDetail", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<CXML.Request.OrderRequest.ItemOut.SpendDetail> spendDetail;
                @XmlElementRef(name = "MasterAgreementIDInfo", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<CXML.Request.OrderRequest.ItemOut.MasterAgreementIDInfo> masterAgreementIDInfo;
                @XmlAttribute(name = "requiresServiceEntry")
                protected String requiresServiceEntry;
                @XmlAttribute(name = "itemType")
                protected String itemType;
                @XmlAttribute(name = "parentLineNumber")
                protected String parentLineNumber;
                @XmlAttribute(name = "requestedDeliveryDate")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar requestedDeliveryDate;
                @XmlAttribute(name = "quantity")
                protected BigDecimal quantity;
                @XmlAttribute(name = "lineNumber")
                protected String lineNumber;

                /**
                 * Gets the value of the blanketItemDetail property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the blanketItemDetail property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBlanketItemDetail().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CXML.Request.OrderRequest.ItemOut.BlanketItemDetail }
                 * 
                 * 
                 */
                public List<CXML.Request.OrderRequest.ItemOut.BlanketItemDetail> getBlanketItemDetail() {
                    if (blanketItemDetail == null) {
                        blanketItemDetail = new ArrayList<CXML.Request.OrderRequest.ItemOut.BlanketItemDetail>();
                    }
                    return this.blanketItemDetail;
                }

                /**
                 * Obtiene el valor de la propiedad comments.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getComments() {
                    return comments;
                }

                /**
                 * Define el valor de la propiedad comments.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setComments(JAXBElement<String> value) {
                    this.comments = value;
                }

                /**
                 * Obtiene el valor de la propiedad itemID.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CXML.Request.OrderRequest.ItemOut.ItemID }
                 *     
                 */
                public CXML.Request.OrderRequest.ItemOut.ItemID getItemID() {
                    return itemID;
                }

                /**
                 * Define el valor de la propiedad itemID.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CXML.Request.OrderRequest.ItemOut.ItemID }
                 *     
                 */
                public void setItemID(CXML.Request.OrderRequest.ItemOut.ItemID value) {
                    this.itemID = value;
                }

                /**
                 * Obtiene el valor de la propiedad itemDetail.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.ItemDetail }{@code >}
                 *     
                 */
                public JAXBElement<CXML.Request.OrderRequest.ItemOut.ItemDetail> getItemDetail() {
                    return itemDetail;
                }

                /**
                 * Define el valor de la propiedad itemDetail.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.ItemDetail }{@code >}
                 *     
                 */
                public void setItemDetail(JAXBElement<CXML.Request.OrderRequest.ItemOut.ItemDetail> value) {
                    this.itemDetail = value;
                }

                /**
                 * Obtiene el valor de la propiedad tax.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Tax }{@code >}
                 *     
                 */
                public JAXBElement<CXML.Request.OrderRequest.ItemOut.Tax> getTax() {
                    return tax;
                }

                /**
                 * Define el valor de la propiedad tax.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Tax }{@code >}
                 *     
                 */
                public void setTax(JAXBElement<CXML.Request.OrderRequest.ItemOut.Tax> value) {
                    this.tax = value;
                }

                /**
                 * Obtiene el valor de la propiedad distribution.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Distribution }{@code >}
                 *     
                 */
                public JAXBElement<CXML.Request.OrderRequest.ItemOut.Distribution> getDistribution() {
                    return distribution;
                }

                /**
                 * Define el valor de la propiedad distribution.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Distribution }{@code >}
                 *     
                 */
                public void setDistribution(JAXBElement<CXML.Request.OrderRequest.ItemOut.Distribution> value) {
                    this.distribution = value;
                }

                /**
                 * Obtiene el valor de la propiedad spendDetail.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.SpendDetail }{@code >}
                 *     
                 */
                public JAXBElement<CXML.Request.OrderRequest.ItemOut.SpendDetail> getSpendDetail() {
                    return spendDetail;
                }

                /**
                 * Define el valor de la propiedad spendDetail.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.SpendDetail }{@code >}
                 *     
                 */
                public void setSpendDetail(JAXBElement<CXML.Request.OrderRequest.ItemOut.SpendDetail> value) {
                    this.spendDetail = value;
                }

                /**
                 * Obtiene el valor de la propiedad masterAgreementIDInfo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.MasterAgreementIDInfo }{@code >}
                 *     
                 */
                public JAXBElement<CXML.Request.OrderRequest.ItemOut.MasterAgreementIDInfo> getMasterAgreementIDInfo() {
                    return masterAgreementIDInfo;
                }

                /**
                 * Define el valor de la propiedad masterAgreementIDInfo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.MasterAgreementIDInfo }{@code >}
                 *     
                 */
                public void setMasterAgreementIDInfo(JAXBElement<CXML.Request.OrderRequest.ItemOut.MasterAgreementIDInfo> value) {
                    this.masterAgreementIDInfo = value;
                }

                /**
                 * Obtiene el valor de la propiedad requiresServiceEntry.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRequiresServiceEntry() {
                    return requiresServiceEntry;
                }

                /**
                 * Define el valor de la propiedad requiresServiceEntry.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRequiresServiceEntry(String value) {
                    this.requiresServiceEntry = value;
                }

                /**
                 * Obtiene el valor de la propiedad itemType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItemType() {
                    return itemType;
                }

                /**
                 * Define el valor de la propiedad itemType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItemType(String value) {
                    this.itemType = value;
                }

                /**
                 * Obtiene el valor de la propiedad parentLineNumber.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getParentLineNumber() {
                    return parentLineNumber;
                }

                /**
                 * Define el valor de la propiedad parentLineNumber.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setParentLineNumber(String value) {
                    this.parentLineNumber = value;
                }

                /**
                 * Obtiene el valor de la propiedad requestedDeliveryDate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getRequestedDeliveryDate() {
                    return requestedDeliveryDate;
                }

                /**
                 * Define el valor de la propiedad requestedDeliveryDate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setRequestedDeliveryDate(XMLGregorianCalendar value) {
                    this.requestedDeliveryDate = value;
                }

                /**
                 * Obtiene el valor de la propiedad quantity.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getQuantity() {
                    return quantity;
                }

                /**
                 * Define el valor de la propiedad quantity.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setQuantity(BigDecimal value) {
                    this.quantity = value;
                }

                /**
                 * Obtiene el valor de la propiedad lineNumber.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLineNumber() {
                    return lineNumber;
                }

                /**
                 * Define el valor de la propiedad lineNumber.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLineNumber(String value) {
                    this.lineNumber = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="UnitPrice" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Money" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                           &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Description" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Classification" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "unitPrice",
                    "description",
                    "unitOfMeasure",
                    "classification"
                })
                public static class BlanketItemDetail {

                    @XmlElementRef(name = "UnitPrice", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.UnitPrice> unitPrice;
                    @XmlElementRef(name = "Description", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.Description> description;
                    @XmlElementRef(name = "UnitOfMeasure", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> unitOfMeasure;
                    @XmlElementRef(name = "Classification", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.Classification> classification;

                    /**
                     * Obtiene el valor de la propiedad unitPrice.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.UnitPrice }{@code >}
                     *     
                     */
                    public JAXBElement<CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.UnitPrice> getUnitPrice() {
                        return unitPrice;
                    }

                    /**
                     * Define el valor de la propiedad unitPrice.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.UnitPrice }{@code >}
                     *     
                     */
                    public void setUnitPrice(JAXBElement<CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.UnitPrice> value) {
                        this.unitPrice = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad description.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.Description }{@code >}
                     *     
                     */
                    public JAXBElement<CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.Description> getDescription() {
                        return description;
                    }

                    /**
                     * Define el valor de la propiedad description.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.Description }{@code >}
                     *     
                     */
                    public void setDescription(JAXBElement<CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.Description> value) {
                        this.description = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad unitOfMeasure.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getUnitOfMeasure() {
                        return unitOfMeasure;
                    }

                    /**
                     * Define el valor de la propiedad unitOfMeasure.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setUnitOfMeasure(JAXBElement<String> value) {
                        this.unitOfMeasure = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad classification.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.Classification }{@code >}
                     *     
                     */
                    public JAXBElement<CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.Classification> getClassification() {
                        return classification;
                    }

                    /**
                     * Define el valor de la propiedad classification.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.Classification }{@code >}
                     *     
                     */
                    public void setClassification(JAXBElement<CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.Classification> value) {
                        this.classification = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Classification {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "domain")
                        protected String domain;

                        /**
                         * Obtiene el valor de la propiedad value.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Define el valor de la propiedad value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad domain.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDomain() {
                            return domain;
                        }

                        /**
                         * Define el valor de la propiedad domain.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDomain(String value) {
                            this.domain = value;
                        }

                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Description {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "lang")
                        protected String lang;

                        /**
                         * Obtiene el valor de la propiedad value.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Define el valor de la propiedad value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad lang.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getLang() {
                            return lang;
                        }

                        /**
                         * Define el valor de la propiedad lang.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setLang(String value) {
                            this.lang = value;
                        }

                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Money" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                 &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "money"
                    })
                    public static class UnitPrice {

                        @XmlElementRef(name = "Money", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.UnitPrice.Money> money;

                        /**
                         * Obtiene el valor de la propiedad money.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.UnitPrice.Money }{@code >}
                         *     
                         */
                        public JAXBElement<CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.UnitPrice.Money> getMoney() {
                            return money;
                        }

                        /**
                         * Define el valor de la propiedad money.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.UnitPrice.Money }{@code >}
                         *     
                         */
                        public void setMoney(JAXBElement<CXML.Request.OrderRequest.ItemOut.BlanketItemDetail.UnitPrice.Money> value) {
                            this.money = value;
                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;simpleContent>
                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/extension>
                         *   &lt;/simpleContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "value"
                        })
                        public static class Money {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "currency")
                            protected String currency;

                            /**
                             * Obtiene el valor de la propiedad value.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getValue() {
                                return value;
                            }

                            /**
                             * Define el valor de la propiedad value.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setValue(String value) {
                                this.value = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad currency.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCurrency() {
                                return currency;
                            }

                            /**
                             * Define el valor de la propiedad currency.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCurrency(String value) {
                                this.currency = value;
                            }

                        }

                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;all>
                 *         &lt;element name="Accounting" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                           &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="DistributionCharge" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Charge" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;all>
                 *                   &lt;element name="Money" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                 *                           &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/all>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class Distribution {

                    @XmlElementRef(name = "Accounting", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<CXML.Request.OrderRequest.ItemOut.Distribution.Accounting> accounting;
                    @XmlElementRef(name = "Charge", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<CXML.Request.OrderRequest.ItemOut.Distribution.Charge> charge;

                    /**
                     * Obtiene el valor de la propiedad accounting.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Distribution.Accounting }{@code >}
                     *     
                     */
                    public JAXBElement<CXML.Request.OrderRequest.ItemOut.Distribution.Accounting> getAccounting() {
                        return accounting;
                    }

                    /**
                     * Define el valor de la propiedad accounting.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Distribution.Accounting }{@code >}
                     *     
                     */
                    public void setAccounting(JAXBElement<CXML.Request.OrderRequest.ItemOut.Distribution.Accounting> value) {
                        this.accounting = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad charge.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Distribution.Charge }{@code >}
                     *     
                     */
                    public JAXBElement<CXML.Request.OrderRequest.ItemOut.Distribution.Charge> getCharge() {
                        return charge;
                    }

                    /**
                     * Define el valor de la propiedad charge.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Distribution.Charge }{@code >}
                     *     
                     */
                    public void setCharge(JAXBElement<CXML.Request.OrderRequest.ItemOut.Distribution.Charge> value) {
                        this.charge = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Segment" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                 &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="DistributionCharge" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "segment"
                    })
                    public static class Accounting {

                        @XmlElement(name = "Segment", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                        protected List<CXML.Request.OrderRequest.ItemOut.Distribution.Accounting.Segment> segment;
                        @XmlAttribute(name = "DistributionCharge")
                        protected String distributionCharge;

                        /**
                         * Gets the value of the segment property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the segment property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getSegment().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link CXML.Request.OrderRequest.ItemOut.Distribution.Accounting.Segment }
                         * 
                         * 
                         */
                        public List<CXML.Request.OrderRequest.ItemOut.Distribution.Accounting.Segment> getSegment() {
                            if (segment == null) {
                                segment = new ArrayList<CXML.Request.OrderRequest.ItemOut.Distribution.Accounting.Segment>();
                            }
                            return this.segment;
                        }

                        /**
                         * Obtiene el valor de la propiedad distributionCharge.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDistributionCharge() {
                            return distributionCharge;
                        }

                        /**
                         * Define el valor de la propiedad distributionCharge.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDistributionCharge(String value) {
                            this.distributionCharge = value;
                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;simpleContent>
                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/extension>
                         *   &lt;/simpleContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "value"
                        })
                        public static class Segment {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "description")
                            protected String description;
                            @XmlAttribute(name = "id")
                            protected String id;
                            @XmlAttribute(name = "type")
                            protected String type;

                            /**
                             * Obtiene el valor de la propiedad value.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getValue() {
                                return value;
                            }

                            /**
                             * Define el valor de la propiedad value.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setValue(String value) {
                                this.value = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad description.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getDescription() {
                                return description;
                            }

                            /**
                             * Define el valor de la propiedad description.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setDescription(String value) {
                                this.description = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad id.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getId() {
                                return id;
                            }

                            /**
                             * Define el valor de la propiedad id.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setId(String value) {
                                this.id = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad type.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getType() {
                                return type;
                            }

                            /**
                             * Define el valor de la propiedad type.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setType(String value) {
                                this.type = value;
                            }

                        }

                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;all>
                     *         &lt;element name="Money" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                     *                 &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/all>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {

                    })
                    public static class Charge {

                        @XmlElementRef(name = "Money", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<CXML.Request.OrderRequest.ItemOut.Distribution.Charge.Money> money;

                        /**
                         * Obtiene el valor de la propiedad money.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Distribution.Charge.Money }{@code >}
                         *     
                         */
                        public JAXBElement<CXML.Request.OrderRequest.ItemOut.Distribution.Charge.Money> getMoney() {
                            return money;
                        }

                        /**
                         * Define el valor de la propiedad money.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Distribution.Charge.Money }{@code >}
                         *     
                         */
                        public void setMoney(JAXBElement<CXML.Request.OrderRequest.ItemOut.Distribution.Charge.Money> value) {
                            this.money = value;
                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;simpleContent>
                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                         *       &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/extension>
                         *   &lt;/simpleContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "value"
                        })
                        public static class Money {

                            @XmlValue
                            protected BigDecimal value;
                            @XmlAttribute(name = "alternateAmount")
                            protected String alternateAmount;
                            @XmlAttribute(name = "alternateCurrency")
                            protected String alternateCurrency;
                            @XmlAttribute(name = "currency")
                            protected String currency;

                            /**
                             * Obtiene el valor de la propiedad value.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getValue() {
                                return value;
                            }

                            /**
                             * Define el valor de la propiedad value.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setValue(BigDecimal value) {
                                this.value = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad alternateAmount.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getAlternateAmount() {
                                return alternateAmount;
                            }

                            /**
                             * Define el valor de la propiedad alternateAmount.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setAlternateAmount(String value) {
                                this.alternateAmount = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad alternateCurrency.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getAlternateCurrency() {
                                return alternateCurrency;
                            }

                            /**
                             * Define el valor de la propiedad alternateCurrency.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setAlternateCurrency(String value) {
                                this.alternateCurrency = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad currency.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCurrency() {
                                return currency;
                            }

                            /**
                             * Define el valor de la propiedad currency.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCurrency(String value) {
                                this.currency = value;
                            }

                        }

                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;all>
                 *         &lt;element name="UnitPrice">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;all>
                 *                   &lt;element name="Money" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                 *                           &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/all>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Description" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="ManufacturerPartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="ManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Classification" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="LeadTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="extReqLineNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="extRequester" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="extPRNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="extContractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="extBodegaMatRepos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="extDescBodegaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="extNumCotizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class ItemDetail {

                    @XmlElement(name = "UnitPrice", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
                    protected CXML.Request.OrderRequest.ItemOut.ItemDetail.UnitPrice unitPrice;
                    @XmlElementRef(name = "Description", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<CXML.Request.OrderRequest.ItemOut.ItemDetail.Description> description;
                    @XmlElementRef(name = "UnitOfMeasure", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> unitOfMeasure;
                    @XmlElementRef(name = "ManufacturerPartID", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> manufacturerPartID;
                    @XmlElementRef(name = "ManufacturerName", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> manufacturerName;
                    @XmlElementRef(name = "Classification", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<CXML.Request.OrderRequest.ItemOut.ItemDetail.Classification> classification;
                    @XmlElementRef(name = "LeadTime", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> leadTime;
                    @XmlElementRef(name = "extReqLineNum", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> extReqLineNum;
                    @XmlElementRef(name = "extRequester", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> extRequester;
                    @XmlElementRef(name = "extPRNum", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> extPRNum;
                    @XmlElementRef(name = "extContractId", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> extContractId;
                    @XmlElementRef(name = "extBodegaMatRepos", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> extBodegaMatRepos;
                    @XmlElementRef(name = "extDescBodegaDestino", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> extDescBodegaDestino;
                    @XmlElementRef(name = "extNumCotizacion", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> extNumCotizacion;

                    /**
                     * Obtiene el valor de la propiedad unitPrice.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CXML.Request.OrderRequest.ItemOut.ItemDetail.UnitPrice }
                     *     
                     */
                    public CXML.Request.OrderRequest.ItemOut.ItemDetail.UnitPrice getUnitPrice() {
                        return unitPrice;
                    }

                    /**
                     * Define el valor de la propiedad unitPrice.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CXML.Request.OrderRequest.ItemOut.ItemDetail.UnitPrice }
                     *     
                     */
                    public void setUnitPrice(CXML.Request.OrderRequest.ItemOut.ItemDetail.UnitPrice value) {
                        this.unitPrice = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad description.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.ItemDetail.Description }{@code >}
                     *     
                     */
                    public JAXBElement<CXML.Request.OrderRequest.ItemOut.ItemDetail.Description> getDescription() {
                        return description;
                    }

                    /**
                     * Define el valor de la propiedad description.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.ItemDetail.Description }{@code >}
                     *     
                     */
                    public void setDescription(JAXBElement<CXML.Request.OrderRequest.ItemOut.ItemDetail.Description> value) {
                        this.description = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad unitOfMeasure.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getUnitOfMeasure() {
                        return unitOfMeasure;
                    }

                    /**
                     * Define el valor de la propiedad unitOfMeasure.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setUnitOfMeasure(JAXBElement<String> value) {
                        this.unitOfMeasure = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad manufacturerPartID.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getManufacturerPartID() {
                        return manufacturerPartID;
                    }

                    /**
                     * Define el valor de la propiedad manufacturerPartID.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setManufacturerPartID(JAXBElement<String> value) {
                        this.manufacturerPartID = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad manufacturerName.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getManufacturerName() {
                        return manufacturerName;
                    }

                    /**
                     * Define el valor de la propiedad manufacturerName.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setManufacturerName(JAXBElement<String> value) {
                        this.manufacturerName = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad classification.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.ItemDetail.Classification }{@code >}
                     *     
                     */
                    public JAXBElement<CXML.Request.OrderRequest.ItemOut.ItemDetail.Classification> getClassification() {
                        return classification;
                    }

                    /**
                     * Define el valor de la propiedad classification.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.ItemDetail.Classification }{@code >}
                     *     
                     */
                    public void setClassification(JAXBElement<CXML.Request.OrderRequest.ItemOut.ItemDetail.Classification> value) {
                        this.classification = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad leadTime.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getLeadTime() {
                        return leadTime;
                    }

                    /**
                     * Define el valor de la propiedad leadTime.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setLeadTime(JAXBElement<String> value) {
                        this.leadTime = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad extReqLineNum.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getExtReqLineNum() {
                        return extReqLineNum;
                    }

                    /**
                     * Define el valor de la propiedad extReqLineNum.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setExtReqLineNum(JAXBElement<String> value) {
                        this.extReqLineNum = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad extRequester.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getExtRequester() {
                        return extRequester;
                    }

                    /**
                     * Define el valor de la propiedad extRequester.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setExtRequester(JAXBElement<String> value) {
                        this.extRequester = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad extPRNum.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getExtPRNum() {
                        return extPRNum;
                    }

                    /**
                     * Define el valor de la propiedad extPRNum.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setExtPRNum(JAXBElement<String> value) {
                        this.extPRNum = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad extContractId.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getExtContractId() {
                        return extContractId;
                    }

                    /**
                     * Define el valor de la propiedad extContractId.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setExtContractId(JAXBElement<String> value) {
                        this.extContractId = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad extBodegaMatRepos.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getExtBodegaMatRepos() {
                        return extBodegaMatRepos;
                    }

                    /**
                     * Define el valor de la propiedad extBodegaMatRepos.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setExtBodegaMatRepos(JAXBElement<String> value) {
                        this.extBodegaMatRepos = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad extDescBodegaDestino.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getExtDescBodegaDestino() {
                        return extDescBodegaDestino;
                    }

                    /**
                     * Define el valor de la propiedad extDescBodegaDestino.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setExtDescBodegaDestino(JAXBElement<String> value) {
                        this.extDescBodegaDestino = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad extNumCotizacion.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getExtNumCotizacion() {
                        return extNumCotizacion;
                    }

                    /**
                     * Define el valor de la propiedad extNumCotizacion.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setExtNumCotizacion(JAXBElement<String> value) {
                        this.extNumCotizacion = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Classification {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "domain")
                        protected String domain;

                        /**
                         * Obtiene el valor de la propiedad value.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Define el valor de la propiedad value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad domain.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDomain() {
                            return domain;
                        }

                        /**
                         * Define el valor de la propiedad domain.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDomain(String value) {
                            this.domain = value;
                        }

                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Description {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "xmlLang")
                        protected String xmlLang;

                        /**
                         * Obtiene el valor de la propiedad value.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Define el valor de la propiedad value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad xmlLang.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getXmlLang() {
                            return xmlLang;
                        }

                        /**
                         * Define el valor de la propiedad xmlLang.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setXmlLang(String value) {
                            this.xmlLang = value;
                        }

                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;all>
                     *         &lt;element name="Money" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                     *                 &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/all>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {

                    })
                    public static class UnitPrice {

                        @XmlElementRef(name = "Money", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<CXML.Request.OrderRequest.ItemOut.ItemDetail.UnitPrice.Money> money;

                        /**
                         * Obtiene el valor de la propiedad money.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.ItemDetail.UnitPrice.Money }{@code >}
                         *     
                         */
                        public JAXBElement<CXML.Request.OrderRequest.ItemOut.ItemDetail.UnitPrice.Money> getMoney() {
                            return money;
                        }

                        /**
                         * Define el valor de la propiedad money.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.ItemDetail.UnitPrice.Money }{@code >}
                         *     
                         */
                        public void setMoney(JAXBElement<CXML.Request.OrderRequest.ItemOut.ItemDetail.UnitPrice.Money> value) {
                            this.money = value;
                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;simpleContent>
                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                         *       &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/extension>
                         *   &lt;/simpleContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "value"
                        })
                        public static class Money {

                            @XmlValue
                            protected BigDecimal value;
                            @XmlAttribute(name = "alternateAmount")
                            protected String alternateAmount;
                            @XmlAttribute(name = "alternateCurrency")
                            protected String alternateCurrency;
                            @XmlAttribute(name = "currency")
                            protected String currency;

                            /**
                             * Obtiene el valor de la propiedad value.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public BigDecimal getValue() {
                                return value;
                            }

                            /**
                             * Define el valor de la propiedad value.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigDecimal }
                             *     
                             */
                            public void setValue(BigDecimal value) {
                                this.value = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad alternateAmount.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getAlternateAmount() {
                                return alternateAmount;
                            }

                            /**
                             * Define el valor de la propiedad alternateAmount.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setAlternateAmount(String value) {
                                this.alternateAmount = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad alternateCurrency.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getAlternateCurrency() {
                                return alternateCurrency;
                            }

                            /**
                             * Define el valor de la propiedad alternateCurrency.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setAlternateCurrency(String value) {
                                this.alternateCurrency = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad currency.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCurrency() {
                                return currency;
                            }

                            /**
                             * Define el valor de la propiedad currency.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCurrency(String value) {
                                this.currency = value;
                            }

                        }

                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="SupplierPartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="BuyerPartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "supplierPartID",
                    "buyerPartID"
                })
                public static class ItemID {

                    @XmlElementRef(name = "SupplierPartID", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> supplierPartID;
                    @XmlElementRef(name = "BuyerPartID", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> buyerPartID;

                    /**
                     * Obtiene el valor de la propiedad supplierPartID.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getSupplierPartID() {
                        return supplierPartID;
                    }

                    /**
                     * Define el valor de la propiedad supplierPartID.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setSupplierPartID(JAXBElement<String> value) {
                        this.supplierPartID = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad buyerPartID.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getBuyerPartID() {
                        return buyerPartID;
                    }

                    /**
                     * Define el valor de la propiedad buyerPartID.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setBuyerPartID(JAXBElement<String> value) {
                        this.buyerPartID = value;
                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="agreementID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class MasterAgreementIDInfo {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "agreementID")
                    protected String agreementID;

                    /**
                     * Obtiene el valor de la propiedad value.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Define el valor de la propiedad value.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad agreementID.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAgreementID() {
                        return agreementID;
                    }

                    /**
                     * Define el valor de la propiedad agreementID.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAgreementID(String value) {
                        this.agreementID = value;
                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="extService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "extService"
                })
                public static class SpendDetail {

                    @XmlElementRef(name = "extService", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> extService;

                    /**
                     * Obtiene el valor de la propiedad extService.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getExtService() {
                        return extService;
                    }

                    /**
                     * Define el valor de la propiedad extService.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setExtService(JAXBElement<String> value) {
                        this.extService = value;
                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;all>
                 *         &lt;element name="Description" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="TaxDetail">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;all>
                 *                   &lt;element name="TaxableAmount">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;all>
                 *                             &lt;element name="Money" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;simpleContent>
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                 *                                     &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/extension>
                 *                                 &lt;/simpleContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/all>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="TaxAmount">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;all>
                 *                             &lt;element name="Money" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;simpleContent>
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                 *                                     &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/extension>
                 *                                 &lt;/simpleContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/all>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Description" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                           &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/all>
                 *                 &lt;attribute name="percentageRate" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class Tax {

                    @XmlElementRef(name = "Description", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<CXML.Request.OrderRequest.ItemOut.Tax.Description> description;
                    @XmlElement(name = "TaxDetail", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
                    protected CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail taxDetail;

                    /**
                     * Obtiene el valor de la propiedad description.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Tax.Description }{@code >}
                     *     
                     */
                    public JAXBElement<CXML.Request.OrderRequest.ItemOut.Tax.Description> getDescription() {
                        return description;
                    }

                    /**
                     * Define el valor de la propiedad description.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Tax.Description }{@code >}
                     *     
                     */
                    public void setDescription(JAXBElement<CXML.Request.OrderRequest.ItemOut.Tax.Description> value) {
                        this.description = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad taxDetail.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail }
                     *     
                     */
                    public CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail getTaxDetail() {
                        return taxDetail;
                    }

                    /**
                     * Define el valor de la propiedad taxDetail.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail }
                     *     
                     */
                    public void setTaxDetail(CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail value) {
                        this.taxDetail = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Description {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "xmlLang")
                        protected String xmlLang;

                        /**
                         * Obtiene el valor de la propiedad value.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Define el valor de la propiedad value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad xmlLang.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getXmlLang() {
                            return xmlLang;
                        }

                        /**
                         * Define el valor de la propiedad xmlLang.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setXmlLang(String value) {
                            this.xmlLang = value;
                        }

                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;all>
                     *         &lt;element name="TaxableAmount">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;all>
                     *                   &lt;element name="Money" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;simpleContent>
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                     *                           &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/extension>
                     *                       &lt;/simpleContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/all>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="TaxAmount">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;all>
                     *                   &lt;element name="Money" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;simpleContent>
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                     *                           &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/extension>
                     *                       &lt;/simpleContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/all>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Description" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                 &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/all>
                     *       &lt;attribute name="percentageRate" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {

                    })
                    public static class TaxDetail {

                        @XmlElement(name = "TaxableAmount", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
                        protected CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxableAmount taxableAmount;
                        @XmlElement(name = "TaxAmount", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
                        protected CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxAmount taxAmount;
                        @XmlElementRef(name = "Description", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.Description> description;
                        @XmlAttribute(name = "percentageRate")
                        protected String percentageRate;
                        @XmlAttribute(name = "category")
                        protected String category;
                        @XmlAttribute(name = "purpose")
                        protected String purpose;

                        /**
                         * Obtiene el valor de la propiedad taxableAmount.
                         * 
                         * @return
                         *     possible object is
                         *     {@link CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxableAmount }
                         *     
                         */
                        public CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxableAmount getTaxableAmount() {
                            return taxableAmount;
                        }

                        /**
                         * Define el valor de la propiedad taxableAmount.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxableAmount }
                         *     
                         */
                        public void setTaxableAmount(CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxableAmount value) {
                            this.taxableAmount = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad taxAmount.
                         * 
                         * @return
                         *     possible object is
                         *     {@link CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxAmount }
                         *     
                         */
                        public CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxAmount getTaxAmount() {
                            return taxAmount;
                        }

                        /**
                         * Define el valor de la propiedad taxAmount.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxAmount }
                         *     
                         */
                        public void setTaxAmount(CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxAmount value) {
                            this.taxAmount = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad description.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.Description }{@code >}
                         *     
                         */
                        public JAXBElement<CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.Description> getDescription() {
                            return description;
                        }

                        /**
                         * Define el valor de la propiedad description.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.Description }{@code >}
                         *     
                         */
                        public void setDescription(JAXBElement<CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.Description> value) {
                            this.description = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad percentageRate.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPercentageRate() {
                            return percentageRate;
                        }

                        /**
                         * Define el valor de la propiedad percentageRate.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPercentageRate(String value) {
                            this.percentageRate = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad category.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCategory() {
                            return category;
                        }

                        /**
                         * Define el valor de la propiedad category.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCategory(String value) {
                            this.category = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad purpose.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPurpose() {
                            return purpose;
                        }

                        /**
                         * Define el valor de la propiedad purpose.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPurpose(String value) {
                            this.purpose = value;
                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;simpleContent>
                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *       &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/extension>
                         *   &lt;/simpleContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "value"
                        })
                        public static class Description {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "xmlLang")
                            protected String xmlLang;

                            /**
                             * Obtiene el valor de la propiedad value.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getValue() {
                                return value;
                            }

                            /**
                             * Define el valor de la propiedad value.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setValue(String value) {
                                this.value = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad xmlLang.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getXmlLang() {
                                return xmlLang;
                            }

                            /**
                             * Define el valor de la propiedad xmlLang.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setXmlLang(String value) {
                                this.xmlLang = value;
                            }

                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;all>
                         *         &lt;element name="Money" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;simpleContent>
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                         *                 &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/extension>
                         *             &lt;/simpleContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/all>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {

                        })
                        public static class TaxableAmount {

                            @XmlElementRef(name = "Money", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                            protected JAXBElement<CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxableAmount.Money> money;

                            /**
                             * Obtiene el valor de la propiedad money.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxableAmount.Money }{@code >}
                             *     
                             */
                            public JAXBElement<CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxableAmount.Money> getMoney() {
                                return money;
                            }

                            /**
                             * Define el valor de la propiedad money.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxableAmount.Money }{@code >}
                             *     
                             */
                            public void setMoney(JAXBElement<CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxableAmount.Money> value) {
                                this.money = value;
                            }


                            /**
                             * <p>Clase Java para anonymous complex type.
                             * 
                             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;simpleContent>
                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                             *       &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/extension>
                             *   &lt;/simpleContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "value"
                            })
                            public static class Money {

                                @XmlValue
                                protected BigDecimal value;
                                @XmlAttribute(name = "alternateAmount")
                                protected String alternateAmount;
                                @XmlAttribute(name = "alternateCurrency")
                                protected String alternateCurrency;
                                @XmlAttribute(name = "currency")
                                protected String currency;

                                /**
                                 * Obtiene el valor de la propiedad value.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getValue() {
                                    return value;
                                }

                                /**
                                 * Define el valor de la propiedad value.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setValue(BigDecimal value) {
                                    this.value = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad alternateAmount.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getAlternateAmount() {
                                    return alternateAmount;
                                }

                                /**
                                 * Define el valor de la propiedad alternateAmount.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setAlternateAmount(String value) {
                                    this.alternateAmount = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad alternateCurrency.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getAlternateCurrency() {
                                    return alternateCurrency;
                                }

                                /**
                                 * Define el valor de la propiedad alternateCurrency.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setAlternateCurrency(String value) {
                                    this.alternateCurrency = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad currency.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCurrency() {
                                    return currency;
                                }

                                /**
                                 * Define el valor de la propiedad currency.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCurrency(String value) {
                                    this.currency = value;
                                }

                            }

                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;all>
                         *         &lt;element name="Money" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;simpleContent>
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                         *                 &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/extension>
                         *             &lt;/simpleContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/all>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {

                        })
                        public static class TaxAmount {

                            @XmlElementRef(name = "Money", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                            protected JAXBElement<CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxAmount.Money> money;

                            /**
                             * Obtiene el valor de la propiedad money.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxAmount.Money }{@code >}
                             *     
                             */
                            public JAXBElement<CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxAmount.Money> getMoney() {
                                return money;
                            }

                            /**
                             * Define el valor de la propiedad money.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxAmount.Money }{@code >}
                             *     
                             */
                            public void setMoney(JAXBElement<CXML.Request.OrderRequest.ItemOut.Tax.TaxDetail.TaxAmount.Money> value) {
                                this.money = value;
                            }


                            /**
                             * <p>Clase Java para anonymous complex type.
                             * 
                             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;simpleContent>
                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                             *       &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/extension>
                             *   &lt;/simpleContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "value"
                            })
                            public static class Money {

                                @XmlValue
                                protected BigDecimal value;
                                @XmlAttribute(name = "alternateAmount")
                                protected String alternateAmount;
                                @XmlAttribute(name = "alternateCurrency")
                                protected String alternateCurrency;
                                @XmlAttribute(name = "currency")
                                protected String currency;

                                /**
                                 * Obtiene el valor de la propiedad value.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getValue() {
                                    return value;
                                }

                                /**
                                 * Define el valor de la propiedad value.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setValue(BigDecimal value) {
                                    this.value = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad alternateAmount.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getAlternateAmount() {
                                    return alternateAmount;
                                }

                                /**
                                 * Define el valor de la propiedad alternateAmount.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setAlternateAmount(String value) {
                                    this.alternateAmount = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad alternateCurrency.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getAlternateCurrency() {
                                    return alternateCurrency;
                                }

                                /**
                                 * Define el valor de la propiedad alternateCurrency.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setAlternateCurrency(String value) {
                                    this.alternateCurrency = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad currency.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCurrency() {
                                    return currency;
                                }

                                /**
                                 * Define el valor de la propiedad currency.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCurrency(String value) {
                                    this.currency = value;
                                }

                            }

                        }

                    }

                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Total">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="Money" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
             *                           &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ShipTo">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="Address">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Name" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                     &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="DeliverTo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/>
             *                                       &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
             *                                       &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="Country" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;simpleContent>
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                               &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/extension>
             *                                           &lt;/simpleContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Email" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Phone" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="TelephoneNumber" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="CountryCode" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;simpleContent>
             *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                         &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                       &lt;/extension>
             *                                                     &lt;/simpleContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="BillTo">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="Address">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Name" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                     &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
             *                                       &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="Country" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;simpleContent>
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                               &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/extension>
             *                                           &lt;/simpleContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="IdReference" maxOccurs="2" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                     &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/all>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PaymentTerm" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="payInNumberOfDays" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Contact" maxOccurs="2" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Name" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
             *                             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Country" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                     &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Email" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Phone" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="TelephoneNumber" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="CountryCode" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;simpleContent>
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                               &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/extension>
             *                                           &lt;/simpleContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="IdReference" maxOccurs="2" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="buyerVatID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="supplierVatID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="extTransactionCategoryOrType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="extCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="extPUName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="extCodTipoFlete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="extDescCodTipoFlete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="extClaseDocSAP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="extIncoTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="extIncoTerm2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="extNombreAdminContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="extRutAdminContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="extNotasGenerales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="extClausulasGenerales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="extClausulasEspecificas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="agreementID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="agreementPayloadID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="orderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *       &lt;attribute name="orderID" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="orderType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="orderVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="requestedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *       &lt;attribute name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "total",
                "shipTo",
                "billTo",
                "paymentTerm",
                "contact",
                "buyerVatID",
                "supplierVatID",
                "comments",
                "extTransactionCategoryOrType",
                "extCompanyCode",
                "extPUName",
                "extCodTipoFlete",
                "extDescCodTipoFlete",
                "extClaseDocSAP",
                "extIncoTerm",
                "extIncoTerm2",
                "extNombreAdminContrato",
                "extRutAdminContrato",
                "extNotasGenerales",
                "extClausulasGenerales",
                "extClausulasEspecificas"
            })
            public static class OrderRequestHeader {

                @XmlElement(name = "Total", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
                protected CXML.Request.OrderRequest.OrderRequestHeader.Total total;
                @XmlElement(name = "ShipTo", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
                protected CXML.Request.OrderRequest.OrderRequestHeader.ShipTo shipTo;
                @XmlElement(name = "BillTo", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
                protected CXML.Request.OrderRequest.OrderRequestHeader.BillTo billTo;
                @XmlElementRef(name = "PaymentTerm", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.PaymentTerm> paymentTerm;
                @XmlElement(name = "Contact", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                protected List<CXML.Request.OrderRequest.OrderRequestHeader.Contact> contact;
                @XmlElementRef(name = "buyerVatID", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> buyerVatID;
                @XmlElementRef(name = "supplierVatID", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> supplierVatID;
                @XmlElementRef(name = "Comments", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> comments;
                @XmlElementRef(name = "extTransactionCategoryOrType", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> extTransactionCategoryOrType;
                @XmlElementRef(name = "extCompanyCode", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> extCompanyCode;
                @XmlElementRef(name = "extPUName", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> extPUName;
                @XmlElementRef(name = "extCodTipoFlete", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> extCodTipoFlete;
                @XmlElementRef(name = "extDescCodTipoFlete", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> extDescCodTipoFlete;
                @XmlElementRef(name = "extClaseDocSAP", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> extClaseDocSAP;
                @XmlElementRef(name = "extIncoTerm", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> extIncoTerm;
                @XmlElementRef(name = "extIncoTerm2", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> extIncoTerm2;
                @XmlElementRef(name = "extNombreAdminContrato", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> extNombreAdminContrato;
                @XmlElementRef(name = "extRutAdminContrato", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> extRutAdminContrato;
                @XmlElementRef(name = "extNotasGenerales", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> extNotasGenerales;
                @XmlElementRef(name = "extClausulasGenerales", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> extClausulasGenerales;
                @XmlElementRef(name = "extClausulasEspecificas", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                protected JAXBElement<String> extClausulasEspecificas;
                @XmlAttribute(name = "agreementID")
                protected String agreementID;
                @XmlAttribute(name = "agreementPayloadID")
                protected String agreementPayloadID;
                @XmlAttribute(name = "orderDate")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar orderDate;
                @XmlAttribute(name = "orderID")
                protected String orderID;
                @XmlAttribute(name = "orderType")
                protected String orderType;
                @XmlAttribute(name = "orderVersion")
                protected String orderVersion;
                @XmlAttribute(name = "type")
                protected String type;
                @XmlAttribute(name = "requestedDeliveryDate")
                protected String requestedDeliveryDate;
                @XmlAttribute(name = "effectiveDate")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar effectiveDate;
                @XmlAttribute(name = "expirationDate")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar expirationDate;

                /**
                 * Obtiene el valor de la propiedad total.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CXML.Request.OrderRequest.OrderRequestHeader.Total }
                 *     
                 */
                public CXML.Request.OrderRequest.OrderRequestHeader.Total getTotal() {
                    return total;
                }

                /**
                 * Define el valor de la propiedad total.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CXML.Request.OrderRequest.OrderRequestHeader.Total }
                 *     
                 */
                public void setTotal(CXML.Request.OrderRequest.OrderRequestHeader.Total value) {
                    this.total = value;
                }

                /**
                 * Obtiene el valor de la propiedad shipTo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CXML.Request.OrderRequest.OrderRequestHeader.ShipTo }
                 *     
                 */
                public CXML.Request.OrderRequest.OrderRequestHeader.ShipTo getShipTo() {
                    return shipTo;
                }

                /**
                 * Define el valor de la propiedad shipTo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CXML.Request.OrderRequest.OrderRequestHeader.ShipTo }
                 *     
                 */
                public void setShipTo(CXML.Request.OrderRequest.OrderRequestHeader.ShipTo value) {
                    this.shipTo = value;
                }

                /**
                 * Obtiene el valor de la propiedad billTo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CXML.Request.OrderRequest.OrderRequestHeader.BillTo }
                 *     
                 */
                public CXML.Request.OrderRequest.OrderRequestHeader.BillTo getBillTo() {
                    return billTo;
                }

                /**
                 * Define el valor de la propiedad billTo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CXML.Request.OrderRequest.OrderRequestHeader.BillTo }
                 *     
                 */
                public void setBillTo(CXML.Request.OrderRequest.OrderRequestHeader.BillTo value) {
                    this.billTo = value;
                }

                /**
                 * Obtiene el valor de la propiedad paymentTerm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.PaymentTerm }{@code >}
                 *     
                 */
                public JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.PaymentTerm> getPaymentTerm() {
                    return paymentTerm;
                }

                /**
                 * Define el valor de la propiedad paymentTerm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.PaymentTerm }{@code >}
                 *     
                 */
                public void setPaymentTerm(JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.PaymentTerm> value) {
                    this.paymentTerm = value;
                }

                /**
                 * Gets the value of the contact property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the contact property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContact().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CXML.Request.OrderRequest.OrderRequestHeader.Contact }
                 * 
                 * 
                 */
                public List<CXML.Request.OrderRequest.OrderRequestHeader.Contact> getContact() {
                    if (contact == null) {
                        contact = new ArrayList<CXML.Request.OrderRequest.OrderRequestHeader.Contact>();
                    }
                    return this.contact;
                }

                /**
                 * Obtiene el valor de la propiedad buyerVatID.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getBuyerVatID() {
                    return buyerVatID;
                }

                /**
                 * Define el valor de la propiedad buyerVatID.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setBuyerVatID(JAXBElement<String> value) {
                    this.buyerVatID = value;
                }

                /**
                 * Obtiene el valor de la propiedad supplierVatID.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getSupplierVatID() {
                    return supplierVatID;
                }

                /**
                 * Define el valor de la propiedad supplierVatID.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setSupplierVatID(JAXBElement<String> value) {
                    this.supplierVatID = value;
                }

                /**
                 * Obtiene el valor de la propiedad comments.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getComments() {
                    return comments;
                }

                /**
                 * Define el valor de la propiedad comments.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setComments(JAXBElement<String> value) {
                    this.comments = value;
                }

                /**
                 * Obtiene el valor de la propiedad extTransactionCategoryOrType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getExtTransactionCategoryOrType() {
                    return extTransactionCategoryOrType;
                }

                /**
                 * Define el valor de la propiedad extTransactionCategoryOrType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setExtTransactionCategoryOrType(JAXBElement<String> value) {
                    this.extTransactionCategoryOrType = value;
                }

                /**
                 * Obtiene el valor de la propiedad extCompanyCode.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getExtCompanyCode() {
                    return extCompanyCode;
                }

                /**
                 * Define el valor de la propiedad extCompanyCode.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setExtCompanyCode(JAXBElement<String> value) {
                    this.extCompanyCode = value;
                }

                /**
                 * Obtiene el valor de la propiedad extPUName.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getExtPUName() {
                    return extPUName;
                }

                /**
                 * Define el valor de la propiedad extPUName.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setExtPUName(JAXBElement<String> value) {
                    this.extPUName = value;
                }

                /**
                 * Obtiene el valor de la propiedad extCodTipoFlete.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getExtCodTipoFlete() {
                    return extCodTipoFlete;
                }

                /**
                 * Define el valor de la propiedad extCodTipoFlete.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setExtCodTipoFlete(JAXBElement<String> value) {
                    this.extCodTipoFlete = value;
                }

                /**
                 * Obtiene el valor de la propiedad extDescCodTipoFlete.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getExtDescCodTipoFlete() {
                    return extDescCodTipoFlete;
                }

                /**
                 * Define el valor de la propiedad extDescCodTipoFlete.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setExtDescCodTipoFlete(JAXBElement<String> value) {
                    this.extDescCodTipoFlete = value;
                }

                /**
                 * Obtiene el valor de la propiedad extClaseDocSAP.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getExtClaseDocSAP() {
                    return extClaseDocSAP;
                }

                /**
                 * Define el valor de la propiedad extClaseDocSAP.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setExtClaseDocSAP(JAXBElement<String> value) {
                    this.extClaseDocSAP = value;
                }

                /**
                 * Obtiene el valor de la propiedad extIncoTerm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getExtIncoTerm() {
                    return extIncoTerm;
                }

                /**
                 * Define el valor de la propiedad extIncoTerm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setExtIncoTerm(JAXBElement<String> value) {
                    this.extIncoTerm = value;
                }

                /**
                 * Obtiene el valor de la propiedad extIncoTerm2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getExtIncoTerm2() {
                    return extIncoTerm2;
                }

                /**
                 * Define el valor de la propiedad extIncoTerm2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setExtIncoTerm2(JAXBElement<String> value) {
                    this.extIncoTerm2 = value;
                }

                /**
                 * Obtiene el valor de la propiedad extNombreAdminContrato.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getExtNombreAdminContrato() {
                    return extNombreAdminContrato;
                }

                /**
                 * Define el valor de la propiedad extNombreAdminContrato.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setExtNombreAdminContrato(JAXBElement<String> value) {
                    this.extNombreAdminContrato = value;
                }

                /**
                 * Obtiene el valor de la propiedad extRutAdminContrato.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getExtRutAdminContrato() {
                    return extRutAdminContrato;
                }

                /**
                 * Define el valor de la propiedad extRutAdminContrato.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setExtRutAdminContrato(JAXBElement<String> value) {
                    this.extRutAdminContrato = value;
                }

                /**
                 * Obtiene el valor de la propiedad extNotasGenerales.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getExtNotasGenerales() {
                    return extNotasGenerales;
                }

                /**
                 * Define el valor de la propiedad extNotasGenerales.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setExtNotasGenerales(JAXBElement<String> value) {
                    this.extNotasGenerales = value;
                }

                /**
                 * Obtiene el valor de la propiedad extClausulasGenerales.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getExtClausulasGenerales() {
                    return extClausulasGenerales;
                }

                /**
                 * Define el valor de la propiedad extClausulasGenerales.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setExtClausulasGenerales(JAXBElement<String> value) {
                    this.extClausulasGenerales = value;
                }

                /**
                 * Obtiene el valor de la propiedad extClausulasEspecificas.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getExtClausulasEspecificas() {
                    return extClausulasEspecificas;
                }

                /**
                 * Define el valor de la propiedad extClausulasEspecificas.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setExtClausulasEspecificas(JAXBElement<String> value) {
                    this.extClausulasEspecificas = value;
                }

                /**
                 * Obtiene el valor de la propiedad agreementID.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAgreementID() {
                    return agreementID;
                }

                /**
                 * Define el valor de la propiedad agreementID.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAgreementID(String value) {
                    this.agreementID = value;
                }

                /**
                 * Obtiene el valor de la propiedad agreementPayloadID.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAgreementPayloadID() {
                    return agreementPayloadID;
                }

                /**
                 * Define el valor de la propiedad agreementPayloadID.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAgreementPayloadID(String value) {
                    this.agreementPayloadID = value;
                }

                /**
                 * Obtiene el valor de la propiedad orderDate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getOrderDate() {
                    return orderDate;
                }

                /**
                 * Define el valor de la propiedad orderDate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setOrderDate(XMLGregorianCalendar value) {
                    this.orderDate = value;
                }

                /**
                 * Obtiene el valor de la propiedad orderID.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrderID() {
                    return orderID;
                }

                /**
                 * Define el valor de la propiedad orderID.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrderID(String value) {
                    this.orderID = value;
                }

                /**
                 * Obtiene el valor de la propiedad orderType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrderType() {
                    return orderType;
                }

                /**
                 * Define el valor de la propiedad orderType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrderType(String value) {
                    this.orderType = value;
                }

                /**
                 * Obtiene el valor de la propiedad orderVersion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrderVersion() {
                    return orderVersion;
                }

                /**
                 * Define el valor de la propiedad orderVersion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrderVersion(String value) {
                    this.orderVersion = value;
                }

                /**
                 * Obtiene el valor de la propiedad type.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Define el valor de la propiedad type.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Obtiene el valor de la propiedad requestedDeliveryDate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRequestedDeliveryDate() {
                    return requestedDeliveryDate;
                }

                /**
                 * Define el valor de la propiedad requestedDeliveryDate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRequestedDeliveryDate(String value) {
                    this.requestedDeliveryDate = value;
                }

                /**
                 * Obtiene el valor de la propiedad effectiveDate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getEffectiveDate() {
                    return effectiveDate;
                }

                /**
                 * Define el valor de la propiedad effectiveDate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setEffectiveDate(XMLGregorianCalendar value) {
                    this.effectiveDate = value;
                }

                /**
                 * Obtiene el valor de la propiedad expirationDate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getExpirationDate() {
                    return expirationDate;
                }

                /**
                 * Define el valor de la propiedad expirationDate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setExpirationDate(XMLGregorianCalendar value) {
                    this.expirationDate = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;all>
                 *         &lt;element name="Address">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Name" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                           &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
                 *                             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="Country" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;simpleContent>
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                     &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/extension>
                 *                                 &lt;/simpleContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="IdReference" maxOccurs="2" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                           &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class BillTo {

                    @XmlElement(name = "Address", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
                    protected CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address address;

                    /**
                     * Obtiene el valor de la propiedad address.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address }
                     *     
                     */
                    public CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address getAddress() {
                        return address;
                    }

                    /**
                     * Define el valor de la propiedad address.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address }
                     *     
                     */
                    public void setAddress(CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address value) {
                        this.address = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Name" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                 &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
                     *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="Country" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;simpleContent>
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                           &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/extension>
                     *                       &lt;/simpleContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="IdReference" maxOccurs="2" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                 &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "name",
                        "postalAddress",
                        "idReference"
                    })
                    public static class Address {

                        @XmlElementRef(name = "Name", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.Name> name;
                        @XmlElement(name = "PostalAddress", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                        protected List<CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.PostalAddress> postalAddress;
                        @XmlElement(name = "IdReference", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                        protected List<CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.IdReference> idReference;
                        @XmlAttribute(name = "addressID")
                        protected String addressID;
                        @XmlAttribute(name = "isoCountryCode")
                        protected String isoCountryCode;

                        /**
                         * Obtiene el valor de la propiedad name.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.Name }{@code >}
                         *     
                         */
                        public JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.Name> getName() {
                            return name;
                        }

                        /**
                         * Define el valor de la propiedad name.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.Name }{@code >}
                         *     
                         */
                        public void setName(JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.Name> value) {
                            this.name = value;
                        }

                        /**
                         * Gets the value of the postalAddress property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the postalAddress property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getPostalAddress().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.PostalAddress }
                         * 
                         * 
                         */
                        public List<CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.PostalAddress> getPostalAddress() {
                            if (postalAddress == null) {
                                postalAddress = new ArrayList<CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.PostalAddress>();
                            }
                            return this.postalAddress;
                        }

                        /**
                         * Gets the value of the idReference property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the idReference property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIdReference().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.IdReference }
                         * 
                         * 
                         */
                        public List<CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.IdReference> getIdReference() {
                            if (idReference == null) {
                                idReference = new ArrayList<CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.IdReference>();
                            }
                            return this.idReference;
                        }

                        /**
                         * Obtiene el valor de la propiedad addressID.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAddressID() {
                            return addressID;
                        }

                        /**
                         * Define el valor de la propiedad addressID.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAddressID(String value) {
                            this.addressID = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad isoCountryCode.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getIsoCountryCode() {
                            return isoCountryCode;
                        }

                        /**
                         * Define el valor de la propiedad isoCountryCode.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setIsoCountryCode(String value) {
                            this.isoCountryCode = value;
                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;simpleContent>
                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *       &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/extension>
                         *   &lt;/simpleContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "value"
                        })
                        public static class IdReference {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "domain")
                            protected String domain;
                            @XmlAttribute(name = "identifier")
                            protected String identifier;

                            /**
                             * Obtiene el valor de la propiedad value.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getValue() {
                                return value;
                            }

                            /**
                             * Define el valor de la propiedad value.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setValue(String value) {
                                this.value = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad domain.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getDomain() {
                                return domain;
                            }

                            /**
                             * Define el valor de la propiedad domain.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setDomain(String value) {
                                this.domain = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad identifier.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getIdentifier() {
                                return identifier;
                            }

                            /**
                             * Define el valor de la propiedad identifier.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setIdentifier(String value) {
                                this.identifier = value;
                            }

                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;simpleContent>
                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *       &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/extension>
                         *   &lt;/simpleContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "value"
                        })
                        public static class Name {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "xmlLang")
                            protected String xmlLang;

                            /**
                             * Obtiene el valor de la propiedad value.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getValue() {
                                return value;
                            }

                            /**
                             * Define el valor de la propiedad value.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setValue(String value) {
                                this.value = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad xmlLang.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getXmlLang() {
                                return xmlLang;
                            }

                            /**
                             * Define el valor de la propiedad xmlLang.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setXmlLang(String value) {
                                this.xmlLang = value;
                            }

                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
                         *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="Country" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;simpleContent>
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                 &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/extension>
                         *             &lt;/simpleContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "street",
                            "city",
                            "municipality",
                            "state",
                            "postalCode",
                            "country"
                        })
                        public static class PostalAddress {

                            @XmlElement(name = "Street", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                            protected List<String> street;
                            @XmlElementRef(name = "City", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                            protected JAXBElement<String> city;
                            @XmlElementRef(name = "Municipality", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                            protected JAXBElement<String> municipality;
                            @XmlElementRef(name = "State", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                            protected JAXBElement<String> state;
                            @XmlElementRef(name = "PostalCode", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                            protected JAXBElement<String> postalCode;
                            @XmlElementRef(name = "Country", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                            protected JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.PostalAddress.Country> country;

                            /**
                             * Gets the value of the street property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the street property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getStreet().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link String }
                             * 
                             * 
                             */
                            public List<String> getStreet() {
                                if (street == null) {
                                    street = new ArrayList<String>();
                                }
                                return this.street;
                            }

                            /**
                             * Obtiene el valor de la propiedad city.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public JAXBElement<String> getCity() {
                                return city;
                            }

                            /**
                             * Define el valor de la propiedad city.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public void setCity(JAXBElement<String> value) {
                                this.city = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad municipality.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public JAXBElement<String> getMunicipality() {
                                return municipality;
                            }

                            /**
                             * Define el valor de la propiedad municipality.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public void setMunicipality(JAXBElement<String> value) {
                                this.municipality = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad state.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public JAXBElement<String> getState() {
                                return state;
                            }

                            /**
                             * Define el valor de la propiedad state.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public void setState(JAXBElement<String> value) {
                                this.state = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad postalCode.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public JAXBElement<String> getPostalCode() {
                                return postalCode;
                            }

                            /**
                             * Define el valor de la propiedad postalCode.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public void setPostalCode(JAXBElement<String> value) {
                                this.postalCode = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad country.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.PostalAddress.Country }{@code >}
                             *     
                             */
                            public JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.PostalAddress.Country> getCountry() {
                                return country;
                            }

                            /**
                             * Define el valor de la propiedad country.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.PostalAddress.Country }{@code >}
                             *     
                             */
                            public void setCountry(JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.BillTo.Address.PostalAddress.Country> value) {
                                this.country = value;
                            }


                            /**
                             * <p>Clase Java para anonymous complex type.
                             * 
                             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;simpleContent>
                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *       &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/extension>
                             *   &lt;/simpleContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "value"
                            })
                            public static class Country {

                                @XmlValue
                                protected String value;
                                @XmlAttribute(name = "isoCountryCode")
                                protected String isoCountryCode;

                                /**
                                 * Obtiene el valor de la propiedad value.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getValue() {
                                    return value;
                                }

                                /**
                                 * Define el valor de la propiedad value.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setValue(String value) {
                                    this.value = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad isoCountryCode.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getIsoCountryCode() {
                                    return isoCountryCode;
                                }

                                /**
                                 * Define el valor de la propiedad isoCountryCode.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setIsoCountryCode(String value) {
                                    this.isoCountryCode = value;
                                }

                            }

                        }

                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Name" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
                 *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Country" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                           &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Email" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Phone" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="TelephoneNumber" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="CountryCode" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;simpleContent>
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                     &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/extension>
                 *                                 &lt;/simpleContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="IdReference" maxOccurs="2" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "name",
                    "postalAddress",
                    "email",
                    "phone",
                    "idReference"
                })
                public static class Contact {

                    @XmlElementRef(name = "Name", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Contact.Name> name;
                    @XmlElement(name = "PostalAddress", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                    protected List<CXML.Request.OrderRequest.OrderRequestHeader.Contact.PostalAddress> postalAddress;
                    @XmlElementRef(name = "Email", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Contact.Email> email;
                    @XmlElement(name = "Phone", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                    protected List<CXML.Request.OrderRequest.OrderRequestHeader.Contact.Phone> phone;
                    @XmlElement(name = "IdReference", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                    protected List<CXML.Request.OrderRequest.OrderRequestHeader.Contact.IdReference> idReference;
                    @XmlAttribute(name = "role")
                    protected String role;
                    @XmlAttribute(name = "addressID")
                    protected String addressID;

                    /**
                     * Obtiene el valor de la propiedad name.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.Contact.Name }{@code >}
                     *     
                     */
                    public JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Contact.Name> getName() {
                        return name;
                    }

                    /**
                     * Define el valor de la propiedad name.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.Contact.Name }{@code >}
                     *     
                     */
                    public void setName(JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Contact.Name> value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the postalAddress property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the postalAddress property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPostalAddress().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link CXML.Request.OrderRequest.OrderRequestHeader.Contact.PostalAddress }
                     * 
                     * 
                     */
                    public List<CXML.Request.OrderRequest.OrderRequestHeader.Contact.PostalAddress> getPostalAddress() {
                        if (postalAddress == null) {
                            postalAddress = new ArrayList<CXML.Request.OrderRequest.OrderRequestHeader.Contact.PostalAddress>();
                        }
                        return this.postalAddress;
                    }

                    /**
                     * Obtiene el valor de la propiedad email.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.Contact.Email }{@code >}
                     *     
                     */
                    public JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Contact.Email> getEmail() {
                        return email;
                    }

                    /**
                     * Define el valor de la propiedad email.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.Contact.Email }{@code >}
                     *     
                     */
                    public void setEmail(JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Contact.Email> value) {
                        this.email = value;
                    }

                    /**
                     * Gets the value of the phone property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the phone property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPhone().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link CXML.Request.OrderRequest.OrderRequestHeader.Contact.Phone }
                     * 
                     * 
                     */
                    public List<CXML.Request.OrderRequest.OrderRequestHeader.Contact.Phone> getPhone() {
                        if (phone == null) {
                            phone = new ArrayList<CXML.Request.OrderRequest.OrderRequestHeader.Contact.Phone>();
                        }
                        return this.phone;
                    }

                    /**
                     * Gets the value of the idReference property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the idReference property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getIdReference().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link CXML.Request.OrderRequest.OrderRequestHeader.Contact.IdReference }
                     * 
                     * 
                     */
                    public List<CXML.Request.OrderRequest.OrderRequestHeader.Contact.IdReference> getIdReference() {
                        if (idReference == null) {
                            idReference = new ArrayList<CXML.Request.OrderRequest.OrderRequestHeader.Contact.IdReference>();
                        }
                        return this.idReference;
                    }

                    /**
                     * Obtiene el valor de la propiedad role.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRole() {
                        return role;
                    }

                    /**
                     * Define el valor de la propiedad role.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRole(String value) {
                        this.role = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad addressID.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAddressID() {
                        return addressID;
                    }

                    /**
                     * Define el valor de la propiedad addressID.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAddressID(String value) {
                        this.addressID = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Email {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "name")
                        protected String name;

                        /**
                         * Obtiene el valor de la propiedad value.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Define el valor de la propiedad value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad name.
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
                         * Define el valor de la propiedad name.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setName(String value) {
                            this.name = value;
                        }

                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class IdReference {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "domain")
                        protected String domain;
                        @XmlAttribute(name = "identifier")
                        protected String identifier;

                        /**
                         * Obtiene el valor de la propiedad value.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Define el valor de la propiedad value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad domain.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDomain() {
                            return domain;
                        }

                        /**
                         * Define el valor de la propiedad domain.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDomain(String value) {
                            this.domain = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad identifier.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getIdentifier() {
                            return identifier;
                        }

                        /**
                         * Define el valor de la propiedad identifier.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setIdentifier(String value) {
                            this.identifier = value;
                        }

                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="xmlLang" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Name {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "xmlLang")
                        protected String xmlLang;

                        /**
                         * Obtiene el valor de la propiedad value.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Define el valor de la propiedad value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad xmlLang.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getXmlLang() {
                            return xmlLang;
                        }

                        /**
                         * Define el valor de la propiedad xmlLang.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setXmlLang(String value) {
                            this.xmlLang = value;
                        }

                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="TelephoneNumber" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="CountryCode" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;simpleContent>
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                           &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/extension>
                     *                       &lt;/simpleContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "telephoneNumber"
                    })
                    public static class Phone {

                        @XmlElementRef(name = "TelephoneNumber", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Contact.Phone.TelephoneNumber> telephoneNumber;

                        /**
                         * Obtiene el valor de la propiedad telephoneNumber.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.Contact.Phone.TelephoneNumber }{@code >}
                         *     
                         */
                        public JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Contact.Phone.TelephoneNumber> getTelephoneNumber() {
                            return telephoneNumber;
                        }

                        /**
                         * Define el valor de la propiedad telephoneNumber.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.Contact.Phone.TelephoneNumber }{@code >}
                         *     
                         */
                        public void setTelephoneNumber(JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Contact.Phone.TelephoneNumber> value) {
                            this.telephoneNumber = value;
                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="CountryCode" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;simpleContent>
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                 &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/extension>
                         *             &lt;/simpleContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "areaOrCityCode",
                            "number",
                            "countryCode"
                        })
                        public static class TelephoneNumber {

                            @XmlElementRef(name = "AreaOrCityCode", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                            protected JAXBElement<String> areaOrCityCode;
                            @XmlElementRef(name = "Number", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                            protected JAXBElement<String> number;
                            @XmlElementRef(name = "CountryCode", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                            protected JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Contact.Phone.TelephoneNumber.CountryCode> countryCode;

                            /**
                             * Obtiene el valor de la propiedad areaOrCityCode.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public JAXBElement<String> getAreaOrCityCode() {
                                return areaOrCityCode;
                            }

                            /**
                             * Define el valor de la propiedad areaOrCityCode.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public void setAreaOrCityCode(JAXBElement<String> value) {
                                this.areaOrCityCode = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad number.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public JAXBElement<String> getNumber() {
                                return number;
                            }

                            /**
                             * Define el valor de la propiedad number.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public void setNumber(JAXBElement<String> value) {
                                this.number = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad countryCode.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.Contact.Phone.TelephoneNumber.CountryCode }{@code >}
                             *     
                             */
                            public JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Contact.Phone.TelephoneNumber.CountryCode> getCountryCode() {
                                return countryCode;
                            }

                            /**
                             * Define el valor de la propiedad countryCode.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.Contact.Phone.TelephoneNumber.CountryCode }{@code >}
                             *     
                             */
                            public void setCountryCode(JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Contact.Phone.TelephoneNumber.CountryCode> value) {
                                this.countryCode = value;
                            }


                            /**
                             * <p>Clase Java para anonymous complex type.
                             * 
                             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;simpleContent>
                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *       &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/extension>
                             *   &lt;/simpleContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "value"
                            })
                            public static class CountryCode {

                                @XmlValue
                                protected String value;
                                @XmlAttribute(name = "isoCountryCode")
                                protected String isoCountryCode;

                                /**
                                 * Obtiene el valor de la propiedad value.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getValue() {
                                    return value;
                                }

                                /**
                                 * Define el valor de la propiedad value.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setValue(String value) {
                                    this.value = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad isoCountryCode.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getIsoCountryCode() {
                                    return isoCountryCode;
                                }

                                /**
                                 * Define el valor de la propiedad isoCountryCode.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setIsoCountryCode(String value) {
                                    this.isoCountryCode = value;
                                }

                            }

                        }

                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
                     *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Country" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                 &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "street",
                        "city",
                        "municipality",
                        "state",
                        "postalCode",
                        "country"
                    })
                    public static class PostalAddress {

                        @XmlElement(name = "Street", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                        protected List<String> street;
                        @XmlElementRef(name = "City", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> city;
                        @XmlElementRef(name = "Municipality", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> municipality;
                        @XmlElementRef(name = "State", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> state;
                        @XmlElementRef(name = "PostalCode", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<String> postalCode;
                        @XmlElementRef(name = "Country", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Contact.PostalAddress.Country> country;

                        /**
                         * Gets the value of the street property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the street property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getStreet().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link String }
                         * 
                         * 
                         */
                        public List<String> getStreet() {
                            if (street == null) {
                                street = new ArrayList<String>();
                            }
                            return this.street;
                        }

                        /**
                         * Obtiene el valor de la propiedad city.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getCity() {
                            return city;
                        }

                        /**
                         * Define el valor de la propiedad city.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setCity(JAXBElement<String> value) {
                            this.city = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad municipality.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getMunicipality() {
                            return municipality;
                        }

                        /**
                         * Define el valor de la propiedad municipality.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setMunicipality(JAXBElement<String> value) {
                            this.municipality = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad state.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getState() {
                            return state;
                        }

                        /**
                         * Define el valor de la propiedad state.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setState(JAXBElement<String> value) {
                            this.state = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad postalCode.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public JAXBElement<String> getPostalCode() {
                            return postalCode;
                        }

                        /**
                         * Define el valor de la propiedad postalCode.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link String }{@code >}
                         *     
                         */
                        public void setPostalCode(JAXBElement<String> value) {
                            this.postalCode = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad country.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.Contact.PostalAddress.Country }{@code >}
                         *     
                         */
                        public JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Contact.PostalAddress.Country> getCountry() {
                            return country;
                        }

                        /**
                         * Define el valor de la propiedad country.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.Contact.PostalAddress.Country }{@code >}
                         *     
                         */
                        public void setCountry(JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Contact.PostalAddress.Country> value) {
                            this.country = value;
                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;simpleContent>
                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *       &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/extension>
                         *   &lt;/simpleContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "value"
                        })
                        public static class Country {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "isoCountryCode")
                            protected String isoCountryCode;

                            /**
                             * Obtiene el valor de la propiedad value.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getValue() {
                                return value;
                            }

                            /**
                             * Define el valor de la propiedad value.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setValue(String value) {
                                this.value = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad isoCountryCode.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getIsoCountryCode() {
                                return isoCountryCode;
                            }

                            /**
                             * Define el valor de la propiedad isoCountryCode.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setIsoCountryCode(String value) {
                                this.isoCountryCode = value;
                            }

                        }

                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="payInNumberOfDays" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class PaymentTerm {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "payInNumberOfDays")
                    protected String payInNumberOfDays;

                    /**
                     * Obtiene el valor de la propiedad value.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Define el valor de la propiedad value.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad payInNumberOfDays.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPayInNumberOfDays() {
                        return payInNumberOfDays;
                    }

                    /**
                     * Define el valor de la propiedad payInNumberOfDays.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPayInNumberOfDays(String value) {
                        this.payInNumberOfDays = value;
                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;all>
                 *         &lt;element name="Address">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Name" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                           &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="DeliverTo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/>
                 *                             &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
                 *                             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="Country" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;simpleContent>
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                     &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/extension>
                 *                                 &lt;/simpleContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Email" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Phone" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="TelephoneNumber" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="CountryCode" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;simpleContent>
                 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                               &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                             &lt;/extension>
                 *                                           &lt;/simpleContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class ShipTo {

                    @XmlElement(name = "Address", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", required = true, nillable = true)
                    protected CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address address;

                    /**
                     * Obtiene el valor de la propiedad address.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address }
                     *     
                     */
                    public CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address getAddress() {
                        return address;
                    }

                    /**
                     * Define el valor de la propiedad address.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address }
                     *     
                     */
                    public void setAddress(CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address value) {
                        this.address = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Name" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                 &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="PostalAddress" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="DeliverTo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/>
                     *                   &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
                     *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="Country" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;simpleContent>
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                           &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/extension>
                     *                       &lt;/simpleContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Email" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Phone" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="TelephoneNumber" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="CountryCode" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;simpleContent>
                     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                     &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                   &lt;/extension>
                     *                                 &lt;/simpleContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="addressID" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "name",
                        "postalAddress",
                        "email",
                        "phone"
                    })
                    public static class Address {

                        @XmlElementRef(name = "Name", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Name> name;
                        @XmlElement(name = "PostalAddress", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                        protected List<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.PostalAddress> postalAddress;
                        @XmlElementRef(name = "Email", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                        protected JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Email> email;
                        @XmlElement(name = "Phone", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                        protected List<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Phone> phone;
                        @XmlAttribute(name = "addressID")
                        protected String addressID;
                        @XmlAttribute(name = "isoCountryCode")
                        protected String isoCountryCode;

                        /**
                         * Obtiene el valor de la propiedad name.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Name }{@code >}
                         *     
                         */
                        public JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Name> getName() {
                            return name;
                        }

                        /**
                         * Define el valor de la propiedad name.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Name }{@code >}
                         *     
                         */
                        public void setName(JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Name> value) {
                            this.name = value;
                        }

                        /**
                         * Gets the value of the postalAddress property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the postalAddress property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getPostalAddress().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.PostalAddress }
                         * 
                         * 
                         */
                        public List<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.PostalAddress> getPostalAddress() {
                            if (postalAddress == null) {
                                postalAddress = new ArrayList<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.PostalAddress>();
                            }
                            return this.postalAddress;
                        }

                        /**
                         * Obtiene el valor de la propiedad email.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Email }{@code >}
                         *     
                         */
                        public JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Email> getEmail() {
                            return email;
                        }

                        /**
                         * Define el valor de la propiedad email.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Email }{@code >}
                         *     
                         */
                        public void setEmail(JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Email> value) {
                            this.email = value;
                        }

                        /**
                         * Gets the value of the phone property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the phone property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getPhone().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Phone }
                         * 
                         * 
                         */
                        public List<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Phone> getPhone() {
                            if (phone == null) {
                                phone = new ArrayList<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Phone>();
                            }
                            return this.phone;
                        }

                        /**
                         * Obtiene el valor de la propiedad addressID.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAddressID() {
                            return addressID;
                        }

                        /**
                         * Define el valor de la propiedad addressID.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAddressID(String value) {
                            this.addressID = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad isoCountryCode.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getIsoCountryCode() {
                            return isoCountryCode;
                        }

                        /**
                         * Define el valor de la propiedad isoCountryCode.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setIsoCountryCode(String value) {
                            this.isoCountryCode = value;
                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;simpleContent>
                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/extension>
                         *   &lt;/simpleContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "value"
                        })
                        public static class Email {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "name")
                            protected String name;

                            /**
                             * Obtiene el valor de la propiedad value.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getValue() {
                                return value;
                            }

                            /**
                             * Define el valor de la propiedad value.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setValue(String value) {
                                this.value = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad name.
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
                             * Define el valor de la propiedad name.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setName(String value) {
                                this.name = value;
                            }

                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;simpleContent>
                         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/extension>
                         *   &lt;/simpleContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "value"
                        })
                        public static class Name {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "lang")
                            protected String lang;

                            /**
                             * Obtiene el valor de la propiedad value.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getValue() {
                                return value;
                            }

                            /**
                             * Define el valor de la propiedad value.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setValue(String value) {
                                this.value = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad lang.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getLang() {
                                return lang;
                            }

                            /**
                             * Define el valor de la propiedad lang.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setLang(String value) {
                                this.lang = value;
                            }

                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="TelephoneNumber" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="CountryCode" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;simpleContent>
                         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                           &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                         &lt;/extension>
                         *                       &lt;/simpleContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "telephoneNumber"
                        })
                        public static class Phone {

                            @XmlElementRef(name = "TelephoneNumber", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                            protected JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Phone.TelephoneNumber> telephoneNumber;

                            /**
                             * Obtiene el valor de la propiedad telephoneNumber.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Phone.TelephoneNumber }{@code >}
                             *     
                             */
                            public JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Phone.TelephoneNumber> getTelephoneNumber() {
                                return telephoneNumber;
                            }

                            /**
                             * Define el valor de la propiedad telephoneNumber.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Phone.TelephoneNumber }{@code >}
                             *     
                             */
                            public void setTelephoneNumber(JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Phone.TelephoneNumber> value) {
                                this.telephoneNumber = value;
                            }


                            /**
                             * <p>Clase Java para anonymous complex type.
                             * 
                             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="CountryCode" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;simpleContent>
                             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                 &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *               &lt;/extension>
                             *             &lt;/simpleContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "areaOrCityCode",
                                "number",
                                "countryCode"
                            })
                            public static class TelephoneNumber {

                                @XmlElementRef(name = "AreaOrCityCode", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                                protected JAXBElement<String> areaOrCityCode;
                                @XmlElementRef(name = "Number", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                                protected JAXBElement<String> number;
                                @XmlElementRef(name = "CountryCode", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                                protected JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Phone.TelephoneNumber.CountryCode> countryCode;

                                /**
                                 * Obtiene el valor de la propiedad areaOrCityCode.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                                 *     
                                 */
                                public JAXBElement<String> getAreaOrCityCode() {
                                    return areaOrCityCode;
                                }

                                /**
                                 * Define el valor de la propiedad areaOrCityCode.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                                 *     
                                 */
                                public void setAreaOrCityCode(JAXBElement<String> value) {
                                    this.areaOrCityCode = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad number.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                                 *     
                                 */
                                public JAXBElement<String> getNumber() {
                                    return number;
                                }

                                /**
                                 * Define el valor de la propiedad number.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                                 *     
                                 */
                                public void setNumber(JAXBElement<String> value) {
                                    this.number = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad countryCode.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Phone.TelephoneNumber.CountryCode }{@code >}
                                 *     
                                 */
                                public JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Phone.TelephoneNumber.CountryCode> getCountryCode() {
                                    return countryCode;
                                }

                                /**
                                 * Define el valor de la propiedad countryCode.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Phone.TelephoneNumber.CountryCode }{@code >}
                                 *     
                                 */
                                public void setCountryCode(JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.Phone.TelephoneNumber.CountryCode> value) {
                                    this.countryCode = value;
                                }


                                /**
                                 * <p>Clase Java para anonymous complex type.
                                 * 
                                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;simpleContent>
                                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *       &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *     &lt;/extension>
                                 *   &lt;/simpleContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "value"
                                })
                                public static class CountryCode {

                                    @XmlValue
                                    protected String value;
                                    @XmlAttribute(name = "isoCountryCode")
                                    protected String isoCountryCode;

                                    /**
                                     * Obtiene el valor de la propiedad value.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getValue() {
                                        return value;
                                    }

                                    /**
                                     * Define el valor de la propiedad value.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setValue(String value) {
                                        this.value = value;
                                    }

                                    /**
                                     * Obtiene el valor de la propiedad isoCountryCode.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getIsoCountryCode() {
                                        return isoCountryCode;
                                    }

                                    /**
                                     * Define el valor de la propiedad isoCountryCode.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setIsoCountryCode(String value) {
                                        this.isoCountryCode = value;
                                    }

                                }

                            }

                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="DeliverTo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/>
                         *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
                         *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="Country" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;simpleContent>
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                 &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/extension>
                         *             &lt;/simpleContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "deliverTo",
                            "street",
                            "city",
                            "state",
                            "postalCode",
                            "country"
                        })
                        public static class PostalAddress {

                            @XmlElement(name = "DeliverTo", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                            protected List<String> deliverTo;
                            @XmlElement(name = "Street", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", nillable = true)
                            protected List<String> street;
                            @XmlElementRef(name = "City", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                            protected JAXBElement<String> city;
                            @XmlElementRef(name = "State", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                            protected JAXBElement<String> state;
                            @XmlElementRef(name = "PostalCode", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                            protected JAXBElement<String> postalCode;
                            @XmlElementRef(name = "Country", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                            protected JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.PostalAddress.Country> country;

                            /**
                             * Gets the value of the deliverTo property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the deliverTo property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getDeliverTo().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link String }
                             * 
                             * 
                             */
                            public List<String> getDeliverTo() {
                                if (deliverTo == null) {
                                    deliverTo = new ArrayList<String>();
                                }
                                return this.deliverTo;
                            }

                            /**
                             * Gets the value of the street property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the street property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getStreet().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link String }
                             * 
                             * 
                             */
                            public List<String> getStreet() {
                                if (street == null) {
                                    street = new ArrayList<String>();
                                }
                                return this.street;
                            }

                            /**
                             * Obtiene el valor de la propiedad city.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public JAXBElement<String> getCity() {
                                return city;
                            }

                            /**
                             * Define el valor de la propiedad city.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public void setCity(JAXBElement<String> value) {
                                this.city = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad state.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public JAXBElement<String> getState() {
                                return state;
                            }

                            /**
                             * Define el valor de la propiedad state.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public void setState(JAXBElement<String> value) {
                                this.state = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad postalCode.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public JAXBElement<String> getPostalCode() {
                                return postalCode;
                            }

                            /**
                             * Define el valor de la propiedad postalCode.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link String }{@code >}
                             *     
                             */
                            public void setPostalCode(JAXBElement<String> value) {
                                this.postalCode = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad country.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.PostalAddress.Country }{@code >}
                             *     
                             */
                            public JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.PostalAddress.Country> getCountry() {
                                return country;
                            }

                            /**
                             * Define el valor de la propiedad country.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.PostalAddress.Country }{@code >}
                             *     
                             */
                            public void setCountry(JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.ShipTo.Address.PostalAddress.Country> value) {
                                this.country = value;
                            }


                            /**
                             * <p>Clase Java para anonymous complex type.
                             * 
                             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;simpleContent>
                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *       &lt;attribute name="isoCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/extension>
                             *   &lt;/simpleContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "value"
                            })
                            public static class Country {

                                @XmlValue
                                protected String value;
                                @XmlAttribute(name = "isoCountryCode")
                                protected String isoCountryCode;

                                /**
                                 * Obtiene el valor de la propiedad value.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getValue() {
                                    return value;
                                }

                                /**
                                 * Define el valor de la propiedad value.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setValue(String value) {
                                    this.value = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad isoCountryCode.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getIsoCountryCode() {
                                    return isoCountryCode;
                                }

                                /**
                                 * Define el valor de la propiedad isoCountryCode.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setIsoCountryCode(String value) {
                                    this.isoCountryCode = value;
                                }

                            }

                        }

                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;all>
                 *         &lt;element name="Money" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                 *                 &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/all>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {

                })
                public static class Total {

                    @XmlElementRef(name = "Money", namespace = "http://ws.aminerals.cl/Ariba/OrderRequest", type = JAXBElement.class, required = false)
                    protected JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Total.Money> money;

                    /**
                     * Obtiene el valor de la propiedad money.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.Total.Money }{@code >}
                     *     
                     */
                    public JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Total.Money> getMoney() {
                        return money;
                    }

                    /**
                     * Define el valor de la propiedad money.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link CXML.Request.OrderRequest.OrderRequestHeader.Total.Money }{@code >}
                     *     
                     */
                    public void setMoney(JAXBElement<CXML.Request.OrderRequest.OrderRequestHeader.Total.Money> value) {
                        this.money = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                     *       &lt;attribute name="alternateAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="alternateCurrency" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Money {

                        @XmlValue
                        protected BigDecimal value;
                        @XmlAttribute(name = "alternateAmount")
                        protected String alternateAmount;
                        @XmlAttribute(name = "alternateCurrency")
                        protected String alternateCurrency;
                        @XmlAttribute(name = "currency")
                        protected String currency;

                        /**
                         * Obtiene el valor de la propiedad value.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getValue() {
                            return value;
                        }

                        /**
                         * Define el valor de la propiedad value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setValue(BigDecimal value) {
                            this.value = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad alternateAmount.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAlternateAmount() {
                            return alternateAmount;
                        }

                        /**
                         * Define el valor de la propiedad alternateAmount.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAlternateAmount(String value) {
                            this.alternateAmount = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad alternateCurrency.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAlternateCurrency() {
                            return alternateCurrency;
                        }

                        /**
                         * Define el valor de la propiedad alternateCurrency.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAlternateCurrency(String value) {
                            this.alternateCurrency = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad currency.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCurrency() {
                            return currency;
                        }

                        /**
                         * Define el valor de la propiedad currency.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCurrency(String value) {
                            this.currency = value;
                        }

                    }

                }

            }

        }

    }

}
