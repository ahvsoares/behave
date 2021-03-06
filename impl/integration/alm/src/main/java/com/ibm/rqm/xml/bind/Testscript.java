//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.13 at 12:00:05 PM BRT 
//


package com.ibm.rqm.xml.bind;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://jazz.net/xmlns/alm/qm/v0.1/}reportableArtifact">
 *       &lt;sequence>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/}snapshot" minOccurs="0"/>
 *         &lt;element name="webId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/}alias" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}title"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}description"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/}creationDate"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/v0.1/}updated"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/v0.1/}state"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}creator"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/v0.1/}owner"/>
 *         &lt;element name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/}approvals" minOccurs="0"/>
 *         &lt;element name="scripttype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/}variables"/>
 *         &lt;element name="includeBuiltInVars" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="steps">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/testscript/v0.1/}step" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="datapool" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
 *                 &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/}customAttributes" minOccurs="0"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/}esignatures" minOccurs="0"/>
 *         &lt;element name="category" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="term" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="termUUID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="valueUUID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="workitem" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="rel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/}copiedFrom" minOccurs="0"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/}copiedRoot" minOccurs="0"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/}relatedChangeRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/}recordselectioncriteria" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "snapshot",
    "webId",
    "alias",
    "title",
    "description",
    "creationDate",
    "updated",
    "state",
    "creator",
    "owner",
    "locked",
    "approvals",
    "scripttype",
    "variables",
    "includeBuiltInVars",
    "steps",
    "datapool",
    "customAttributes",
    "esignatures",
    "category",
    "workitem",
    "copiedFrom",
    "copiedRoot",
    "relatedChangeRequest",
    "recordselectioncriteria"
})
@XmlRootElement(name = "testscript")
public class Testscript
    extends ReportableArtifact
{

    protected Snapshot snapshot;
    protected Integer webId;
    protected List<Alias> alias;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String title;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String description;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/v0.1/", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updated;
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/v0.1/", required = true)
    protected State state;
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected Creator creator;
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/v0.1/", required = true)
    protected Owner owner;
    protected Boolean locked;
    protected Approvals approvals;
    protected String scripttype;
    @XmlElement(required = true)
    protected Variables variables;
    protected Boolean includeBuiltInVars;
    @XmlElement(required = true)
    protected Testscript.Steps steps;
    protected Testscript.Datapool datapool;
    protected CustomAttributes customAttributes;
    protected Esignatures esignatures;
    protected List<Testscript.Category> category;
    protected List<Testscript.Workitem> workitem;
    protected CopiedFrom copiedFrom;
    protected CopiedRoot copiedRoot;
    protected List<RelatedChangeRequest> relatedChangeRequest;
    protected List<Recordselectioncriteria> recordselectioncriteria;

    /**
     * [READ-ONLY] Snapshot metadata associated with the snapshot of the test script.  Note, supported only for test script snapshots.
     * 
     * @return
     *     possible object is
     *     {@link Snapshot }
     *     
     */
    public Snapshot getSnapshot() {
        return snapshot;
    }

    /**
     * Sets the value of the snapshot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Snapshot }
     *     
     */
    public void setSnapshot(Snapshot value) {
        this.snapshot = value;
    }

    /**
     * Gets the value of the webId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWebId() {
        return webId;
    }

    /**
     * Sets the value of the webId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWebId(Integer value) {
        this.webId = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Alias }
     * 
     * 
     */
    public List<Alias> getAlias() {
        if (alias == null) {
            alias = new ArrayList<Alias>();
        }
        return this.alias;
    }

    /**
     * A name given to the testscript.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * An account of the testscript.
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
     * Sets the value of the description property.
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
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * [READ-ONLY] XML dateTime of the last update of the testscript.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdated(XMLGregorianCalendar value) {
        this.updated = value;
    }

    /**
     * An ID or name of the current state of the test script.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setState(State value) {
        this.state = value;
    }

    /**
     * [IMMUTABLE] The contributor that created the test script.
     * 
     * @return
     *     possible object is
     *     {@link Creator }
     *     
     */
    public Creator getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Creator }
     *     
     */
    public void setCreator(Creator value) {
        this.creator = value;
    }

    /**
     * The contributor that owns the test script.
     * 
     * @return
     *     possible object is
     *     {@link Owner }
     *     
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Owner }
     *     
     */
    public void setOwner(Owner value) {
        this.owner = value;
    }

    /**
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }

    /**
     * A collection of approvals that are associated with the test script.
     * 
     * @return
     *     possible object is
     *     {@link Approvals }
     *     
     */
    public Approvals getApprovals() {
        return approvals;
    }

    /**
     * Sets the value of the approvals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Approvals }
     *     
     */
    public void setApprovals(Approvals value) {
        this.approvals = value;
    }

    /**
     * Gets the value of the scripttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScripttype() {
        return scripttype;
    }

    /**
     * Sets the value of the scripttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScripttype(String value) {
        this.scripttype = value;
    }

    /**
     * Gets the value of the variables property.
     * 
     * @return
     *     possible object is
     *     {@link Variables }
     *     
     */
    public Variables getVariables() {
        return variables;
    }

    /**
     * Sets the value of the variables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Variables }
     *     
     */
    public void setVariables(Variables value) {
        this.variables = value;
    }

    /**
     * Gets the value of the includeBuiltInVars property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeBuiltInVars() {
        return includeBuiltInVars;
    }

    /**
     * Sets the value of the includeBuiltInVars property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeBuiltInVars(Boolean value) {
        this.includeBuiltInVars = value;
    }

    /**
     * Gets the value of the steps property.
     * 
     * @return
     *     possible object is
     *     {@link Testscript.Steps }
     *     
     */
    public Testscript.Steps getSteps() {
        return steps;
    }

    /**
     * Sets the value of the steps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Testscript.Steps }
     *     
     */
    public void setSteps(Testscript.Steps value) {
        this.steps = value;
    }

    /**
     * Gets the value of the datapool property.
     * 
     * @return
     *     possible object is
     *     {@link Testscript.Datapool }
     *     
     */
    public Testscript.Datapool getDatapool() {
        return datapool;
    }

    /**
     * Sets the value of the datapool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Testscript.Datapool }
     *     
     */
    public void setDatapool(Testscript.Datapool value) {
        this.datapool = value;
    }

    /**
     * User defined custom attribute name/value data on this artifact.
     * 
     * @return
     *     possible object is
     *     {@link CustomAttributes }
     *     
     */
    public CustomAttributes getCustomAttributes() {
        return customAttributes;
    }

    /**
     * Sets the value of the customAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomAttributes }
     *     
     */
    public void setCustomAttributes(CustomAttributes value) {
        this.customAttributes = value;
    }

    /**
     * Gets the value of the esignatures property.
     * 
     * @return
     *     possible object is
     *     {@link Esignatures }
     *     
     */
    public Esignatures getEsignatures() {
        return esignatures;
    }

    /**
     * Sets the value of the esignatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Esignatures }
     *     
     */
    public void setEsignatures(Esignatures value) {
        this.esignatures = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Testscript.Category }
     * 
     * 
     */
    public List<Testscript.Category> getCategory() {
        if (category == null) {
            category = new ArrayList<Testscript.Category>();
        }
        return this.category;
    }

    /**
     * Gets the value of the workitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkitem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Testscript.Workitem }
     * 
     * 
     */
    public List<Testscript.Workitem> getWorkitem() {
        if (workitem == null) {
            workitem = new ArrayList<Testscript.Workitem>();
        }
        return this.workitem;
    }

    /**
     * [READ-ONLY] Link to the test script from which this test script was copied.
     * 
     * @return
     *     possible object is
     *     {@link CopiedFrom }
     *     
     */
    public CopiedFrom getCopiedFrom() {
        return copiedFrom;
    }

    /**
     * Sets the value of the copiedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopiedFrom }
     *     
     */
    public void setCopiedFrom(CopiedFrom value) {
        this.copiedFrom = value;
    }

    /**
     * [READ-ONLY] Link to the test script from which this test script was ultimately derived.
     * 
     * @return
     *     possible object is
     *     {@link CopiedRoot }
     *     
     */
    public CopiedRoot getCopiedRoot() {
        return copiedRoot;
    }

    /**
     * Sets the value of the copiedRoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopiedRoot }
     *     
     */
    public void setCopiedRoot(CopiedRoot value) {
        this.copiedRoot = value;
    }

    /**
     * Gets the value of the relatedChangeRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedChangeRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedChangeRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedChangeRequest }
     * 
     * 
     */
    public List<RelatedChangeRequest> getRelatedChangeRequest() {
        if (relatedChangeRequest == null) {
            relatedChangeRequest = new ArrayList<RelatedChangeRequest>();
        }
        return this.relatedChangeRequest;
    }

    /**
     * Gets the value of the recordselectioncriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordselectioncriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordselectioncriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Recordselectioncriteria }
     * 
     * 
     */
    public List<Recordselectioncriteria> getRecordselectioncriteria() {
        if (recordselectioncriteria == null) {
            recordselectioncriteria = new ArrayList<Recordselectioncriteria>();
        }
        return this.recordselectioncriteria;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="term" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="termUUID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="valueUUID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Category {

        @XmlAttribute
        protected String term;
        @XmlAttribute
        protected String value;
        @XmlAttribute
        protected String termUUID;
        @XmlAttribute
        protected String valueUUID;

        /**
         * Gets the value of the term property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTerm() {
            return term;
        }

        /**
         * Sets the value of the term property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTerm(String value) {
            this.term = value;
        }

        /**
         * Gets the value of the value property.
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
         * Sets the value of the value property.
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
         * Gets the value of the termUUID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTermUUID() {
            return termUUID;
        }

        /**
         * Sets the value of the termUUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTermUUID(String value) {
            this.termUUID = value;
        }

        /**
         * Gets the value of the valueUUID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValueUUID() {
            return valueUUID;
        }

        /**
         * Sets the value of the valueUUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValueUUID(String value) {
            this.valueUUID = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
     *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Datapool {

        @XmlAttribute(namespace = "http://schema.ibm.com/vega/2008/")
        protected String id;
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String href;

        /**
         * [READ-ONLY] The UUID of the datapool.
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
         * Sets the value of the id property.
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
         * Gets the value of the href property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHref() {
            return href;
        }

        /**
         * Sets the value of the href property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHref(String value) {
            this.href = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/testscript/v0.1/}step" maxOccurs="unbounded"/>
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
        "step"
    })
    public static class Steps {

        @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/v0.1/testscript/v0.1/", required = true)
        protected List<Step> step;

        /**
         * A step embedded in the test script.Gets the value of the step property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the step property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStep().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Step }
         * 
         * 
         */
        public List<Step> getStep() {
            if (step == null) {
                step = new ArrayList<Step>();
            }
            return this.step;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="rel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Workitem {

        @XmlAttribute
        protected String rel;
        @XmlAttribute
        protected String summary;
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String href;

        /**
         * Gets the value of the rel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRel() {
            return rel;
        }

        /**
         * Sets the value of the rel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRel(String value) {
            this.rel = value;
        }

        /**
         * Gets the value of the summary property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSummary() {
            return summary;
        }

        /**
         * Sets the value of the summary property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSummary(String value) {
            this.summary = value;
        }

        /**
         * Gets the value of the href property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHref() {
            return href;
        }

        /**
         * Sets the value of the href property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHref(String value) {
            this.href = value;
        }

    }

}
