
package ws.server.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetDocumentResponse" type="{http://www.pinchuk.com/DocumentSchema}DocumentType"/>
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
    "getDocumentResponse"
})
@XmlRootElement(name = "GetDocumentResponse")
public class GetDocumentResponse {

    @XmlElement(name = "GetDocumentResponse", required = true)
    protected DocumentType getDocumentResponse;

    /**
     * Gets the value of the getDocumentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getGetDocumentResponse() {
        return getDocumentResponse;
    }

    /**
     * Sets the value of the getDocumentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setGetDocumentResponse(DocumentType value) {
        this.getDocumentResponse = value;
    }

}
