//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.07.10 at 10:06:49 AM EDT 
//


package opin.dictionary.Merged;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mw complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mw">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cs.pitt.edu/mpqa/}entryBaseType">
 *       &lt;sequence>
 *         &lt;element name="entryDefinition" type="{http://www.cs.pitt.edu/mpqa/}entryDefinitionMwType"/>
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
    "entryDefinition"
})
public class OriginalMw
    extends EntryBaseType
{

    @XmlElement(required = true)
    protected EntryDefinitionMwType entryDefinition;

    /**
     * Gets the value of the entryDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link EntryDefinitionMwType }
     *     
     */
    public EntryDefinitionMwType getEntryDefinition() {
        return entryDefinition;
    }

    /**
     * Sets the value of the entryDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryDefinitionMwType }
     *     
     */
    public void setEntryDefinition(EntryDefinitionMwType value) {
        this.entryDefinition = value;
    }

}
