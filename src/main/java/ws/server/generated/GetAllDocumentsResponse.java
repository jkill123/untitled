
package ws.server.generated;

import ws.server.generated.DocumentsType;

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
 *         &lt;element name="GetDocumentsResponse" type="{http://www.pinchuk.com/DocumentSchema}DocumentsType"/>
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
    "getDocumentsResponse"
})
@XmlRootElement(name = "GetAllDocumentsResponse")
public class GetAllDocumentsResponse {

    @XmlElement(name = "GetDocumentsResponse", required = true)
    protected DocumentsType getDocumentsResponse;

    /**
     * Gets the value of the getDocumentsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentsType }
     *     
     */
    public DocumentsType getGetDocumentsResponse() {
        return getDocumentsResponse;
    }

    /**
     * Sets the value of the getDocumentsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsType }
     *     
     */
    public void setGetDocumentsResponse(DocumentsType value) {
        this.getDocumentsResponse = value;
    }

}
