//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.05.30 at 01:20:57 PM EDT 
//


package opin.dictionary.dictDefSimple;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for entryAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entryAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subjective" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reliability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priorpolarity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="example" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="causative" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="invariant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="intensity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="morphosyn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sp_target" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sp_valence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sp_intensity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sp_confidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sp2_target" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sp2_valence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sp2_intensity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sp2_confidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fr_source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fr_target" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fr_intensity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fr_valence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fr_confidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fr2_source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fr2_target" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fr2_intensity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fr2_valence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fr2_confidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patterntype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origpaths" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origtypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polannsrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="len" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="RFE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polarity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="othertypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polarplus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highprec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MISS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metadata" type="{}metadataType" minOccurs="0"/>
 *         &lt;element name="lastmodified" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="origin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entryAttributesType", propOrder = {

})
public class EntryAttributesType {

    protected String name;
    protected Boolean subjective;
    protected String reliability;
    protected String confidence;
    protected String priorpolarity;
    protected String subType;
    protected String example;
    protected Boolean causative;
    protected Boolean invariant;
    protected String intensity;
    protected String morphosyn;
    protected String domain;
    protected String role;
    protected String referential;
    @XmlElement(name = "sp_target")
    protected String spTarget;
    @XmlElement(name = "sp_valence")
    protected String spValence;
    @XmlElement(name = "sp_intensity")
    protected String spIntensity;
    @XmlElement(name = "sp_confidence")
    protected String spConfidence;
    @XmlElement(name = "sp2_target")
    protected String sp2Target;
    @XmlElement(name = "sp2_valence")
    protected String sp2Valence;
    @XmlElement(name = "sp2_intensity")
    protected String sp2Intensity;
    @XmlElement(name = "sp2_confidence")
    protected String sp2Confidence;
    @XmlElement(name = "fr_source")
    protected String frSource;
    @XmlElement(name = "fr_target")
    protected String frTarget;
    @XmlElement(name = "fr_intensity")
    protected String frIntensity;
    @XmlElement(name = "fr_valence")
    protected String frValence;
    @XmlElement(name = "fr_confidence")
    protected String frConfidence;
    @XmlElement(name = "fr2_source")
    protected String fr2Source;
    @XmlElement(name = "fr2_target")
    protected String fr2Target;
    @XmlElement(name = "fr2_intensity")
    protected String fr2Intensity;
    @XmlElement(name = "fr2_valence")
    protected String fr2Valence;
    @XmlElement(name = "fr2_confidence")
    protected String fr2Confidence;
    protected String regex;
    protected String patterntype;
    protected String origpaths;
    protected String origtypes;
    protected String polannsrc;
    protected BigInteger len;
    @XmlElement(name = "RFE")
    protected String rfe;
    protected String polarity;
    protected String othertypes;
    protected String polarplus;
    protected String highprec;
    @XmlElement(name = "MISS")
    protected String miss;
    protected MetadataType metadata;
    protected XMLGregorianCalendar lastmodified;
    @XmlAttribute(required = true)
    protected String origin;

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the subjective property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubjective() {
        return subjective;
    }

    /**
     * Sets the value of the subjective property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubjective(Boolean value) {
        this.subjective = value;
    }

    /**
     * Gets the value of the reliability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReliability() {
        return reliability;
    }

    /**
     * Sets the value of the reliability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReliability(String value) {
        this.reliability = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidence(String value) {
        this.confidence = value;
    }

    /**
     * Gets the value of the priorpolarity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorpolarity() {
        return priorpolarity;
    }

    /**
     * Sets the value of the priorpolarity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorpolarity(String value) {
        this.priorpolarity = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Gets the value of the example property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExample() {
        return example;
    }

    /**
     * Sets the value of the example property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExample(String value) {
        this.example = value;
    }

    /**
     * Gets the value of the causative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCausative() {
        return causative;
    }

    /**
     * Sets the value of the causative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCausative(Boolean value) {
        this.causative = value;
    }

    /**
     * Gets the value of the invariant property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvariant() {
        return invariant;
    }

    /**
     * Sets the value of the invariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvariant(Boolean value) {
        this.invariant = value;
    }

    /**
     * Gets the value of the intensity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntensity() {
        return intensity;
    }

    /**
     * Sets the value of the intensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntensity(String value) {
        this.intensity = value;
    }

    /**
     * Gets the value of the morphosyn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMorphosyn() {
        return morphosyn;
    }

    /**
     * Sets the value of the morphosyn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMorphosyn(String value) {
        this.morphosyn = value;
    }

    /**
     * Gets the value of the domain property.
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
     * Sets the value of the domain property.
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
     * Gets the value of the role property.
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
     * Sets the value of the role property.
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
     * Gets the value of the referential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferential() {
        return referential;
    }

    /**
     * Sets the value of the referential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferential(String value) {
        this.referential = value;
    }

    /**
     * Gets the value of the spTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpTarget() {
        return spTarget;
    }

    /**
     * Sets the value of the spTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpTarget(String value) {
        this.spTarget = value;
    }

    /**
     * Gets the value of the spValence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpValence() {
        return spValence;
    }

    /**
     * Sets the value of the spValence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpValence(String value) {
        this.spValence = value;
    }

    /**
     * Gets the value of the spIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpIntensity() {
        return spIntensity;
    }

    /**
     * Sets the value of the spIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpIntensity(String value) {
        this.spIntensity = value;
    }

    /**
     * Gets the value of the spConfidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpConfidence() {
        return spConfidence;
    }

    /**
     * Sets the value of the spConfidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpConfidence(String value) {
        this.spConfidence = value;
    }

    /**
     * Gets the value of the sp2Target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSp2Target() {
        return sp2Target;
    }

    /**
     * Sets the value of the sp2Target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSp2Target(String value) {
        this.sp2Target = value;
    }

    /**
     * Gets the value of the sp2Valence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSp2Valence() {
        return sp2Valence;
    }

    /**
     * Sets the value of the sp2Valence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSp2Valence(String value) {
        this.sp2Valence = value;
    }

    /**
     * Gets the value of the sp2Intensity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSp2Intensity() {
        return sp2Intensity;
    }

    /**
     * Sets the value of the sp2Intensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSp2Intensity(String value) {
        this.sp2Intensity = value;
    }

    /**
     * Gets the value of the sp2Confidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSp2Confidence() {
        return sp2Confidence;
    }

    /**
     * Sets the value of the sp2Confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSp2Confidence(String value) {
        this.sp2Confidence = value;
    }

    /**
     * Gets the value of the frSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrSource() {
        return frSource;
    }

    /**
     * Sets the value of the frSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrSource(String value) {
        this.frSource = value;
    }

    /**
     * Gets the value of the frTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrTarget() {
        return frTarget;
    }

    /**
     * Sets the value of the frTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrTarget(String value) {
        this.frTarget = value;
    }

    /**
     * Gets the value of the frIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrIntensity() {
        return frIntensity;
    }

    /**
     * Sets the value of the frIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrIntensity(String value) {
        this.frIntensity = value;
    }

    /**
     * Gets the value of the frValence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrValence() {
        return frValence;
    }

    /**
     * Sets the value of the frValence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrValence(String value) {
        this.frValence = value;
    }

    /**
     * Gets the value of the frConfidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrConfidence() {
        return frConfidence;
    }

    /**
     * Sets the value of the frConfidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrConfidence(String value) {
        this.frConfidence = value;
    }

    /**
     * Gets the value of the fr2Source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFr2Source() {
        return fr2Source;
    }

    /**
     * Sets the value of the fr2Source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFr2Source(String value) {
        this.fr2Source = value;
    }

    /**
     * Gets the value of the fr2Target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFr2Target() {
        return fr2Target;
    }

    /**
     * Sets the value of the fr2Target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFr2Target(String value) {
        this.fr2Target = value;
    }

    /**
     * Gets the value of the fr2Intensity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFr2Intensity() {
        return fr2Intensity;
    }

    /**
     * Sets the value of the fr2Intensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFr2Intensity(String value) {
        this.fr2Intensity = value;
    }

    /**
     * Gets the value of the fr2Valence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFr2Valence() {
        return fr2Valence;
    }

    /**
     * Sets the value of the fr2Valence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFr2Valence(String value) {
        this.fr2Valence = value;
    }

    /**
     * Gets the value of the fr2Confidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFr2Confidence() {
        return fr2Confidence;
    }

    /**
     * Sets the value of the fr2Confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFr2Confidence(String value) {
        this.fr2Confidence = value;
    }

    /**
     * Gets the value of the regex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegex() {
        return regex;
    }

    /**
     * Sets the value of the regex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegex(String value) {
        this.regex = value;
    }

    /**
     * Gets the value of the patterntype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatterntype() {
        return patterntype;
    }

    /**
     * Sets the value of the patterntype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatterntype(String value) {
        this.patterntype = value;
    }

    /**
     * Gets the value of the origpaths property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigpaths() {
        return origpaths;
    }

    /**
     * Sets the value of the origpaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigpaths(String value) {
        this.origpaths = value;
    }

    /**
     * Gets the value of the origtypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigtypes() {
        return origtypes;
    }

    /**
     * Sets the value of the origtypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigtypes(String value) {
        this.origtypes = value;
    }

    /**
     * Gets the value of the polannsrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolannsrc() {
        return polannsrc;
    }

    /**
     * Sets the value of the polannsrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolannsrc(String value) {
        this.polannsrc = value;
    }

    /**
     * Gets the value of the len property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLen() {
        return len;
    }

    /**
     * Sets the value of the len property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLen(BigInteger value) {
        this.len = value;
    }

    /**
     * Gets the value of the rfe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFE() {
        return rfe;
    }

    /**
     * Sets the value of the rfe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFE(String value) {
        this.rfe = value;
    }

    /**
     * Gets the value of the polarity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolarity() {
        return polarity;
    }

    /**
     * Sets the value of the polarity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolarity(String value) {
        this.polarity = value;
    }

    /**
     * Gets the value of the othertypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthertypes() {
        return othertypes;
    }

    /**
     * Sets the value of the othertypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthertypes(String value) {
        this.othertypes = value;
    }

    /**
     * Gets the value of the polarplus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolarplus() {
        return polarplus;
    }

    /**
     * Sets the value of the polarplus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolarplus(String value) {
        this.polarplus = value;
    }

    /**
     * Gets the value of the highprec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighprec() {
        return highprec;
    }

    /**
     * Sets the value of the highprec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighprec(String value) {
        this.highprec = value;
    }

    /**
     * Gets the value of the miss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMISS() {
        return miss;
    }

    /**
     * Sets the value of the miss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMISS(String value) {
        this.miss = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataType }
     *     
     */
    public MetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataType }
     *     
     */
    public void setMetadata(MetadataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the lastmodified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastmodified() {
        return lastmodified;
    }

    /**
     * Sets the value of the lastmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastmodified(XMLGregorianCalendar value) {
        this.lastmodified = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

}
