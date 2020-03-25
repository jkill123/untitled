
package ws.server.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Documents" type="{http://www.pinchuk.com/DocumentSchema}DocumentType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentsType", namespace = "http://www.pinchuk.com/DocumentSchema", propOrder = {
    "documents"
})
public class DocumentsType {

    @XmlElement(name = "Documents", namespace = "http://www.pinchuk.com/DocumentSchema", required = true)
    protected List<DocumentType> documents;

    /**
     * Gets the value of the documents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType }
     * 
     * 
     */
    public List<DocumentType> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<DocumentType>();
        }
        return this.documents;
    }

    public void setDocuments(List<DocumentType> documents) {
        this.documents = documents;
    }

    @Override
    public String toString() {
        return "DocumentsType{" +
                "documents=" + documents +
                '}';
    }
}
