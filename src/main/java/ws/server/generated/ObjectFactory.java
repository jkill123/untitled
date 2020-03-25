
package ws.server.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.server.generated package. 
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

    private final static QName _Document_QNAME = new QName("http://www.pinchuk.com/DocumentSchema", "Document");
    private final static QName _Documents_QNAME = new QName("http://www.pinchuk.com/DocumentSchema", "Documents");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.server.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDocument }
     * 
     */
    public GetDocument createGetDocument() {
        return new GetDocument();
    }

    /**
     * Create an instance of {@link DeleteDocumentResponse }
     * 
     */
    public DeleteDocumentResponse createDeleteDocumentResponse() {
        return new DeleteDocumentResponse();
    }

    /**
     * Create an instance of {@link DeleteDocument }
     * 
     */
    public DeleteDocument createDeleteDocument() {
        return new DeleteDocument();
    }

    /**
     * Create an instance of {@link GetDocumentResponse }
     * 
     */
    public GetDocumentResponse createGetDocumentResponse() {
        return new GetDocumentResponse();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link GetAllDocuments }
     * 
     */
    public GetAllDocuments createGetAllDocuments() {
        return new GetAllDocuments();
    }

    /**
     * Create an instance of {@link GetAllDocumentsResponse }
     * 
     */
    public GetAllDocumentsResponse createGetAllDocumentsResponse() {
        return new GetAllDocumentsResponse();
    }

    /**
     * Create an instance of {@link DocumentsType }
     * 
     */
    public DocumentsType createDocumentsType() {
        return new DocumentsType();
    }

    /**
     * Create an instance of {@link AddDocument }
     * 
     */
    public AddDocument createAddDocument() {
        return new AddDocument();
    }

    /**
     * Create an instance of {@link AddDocumentResponse }
     * 
     */
    public AddDocumentResponse createAddDocumentResponse() {
        return new AddDocumentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pinchuk.com/DocumentSchema", name = "Document")
    public JAXBElement<DocumentType> createDocument(DocumentType value) {
        return new JAXBElement<DocumentType>(_Document_QNAME, DocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pinchuk.com/DocumentSchema", name = "Documents")
    public JAXBElement<DocumentsType> createDocuments(DocumentsType value) {
        return new JAXBElement<DocumentsType>(_Documents_QNAME, DocumentsType.class, null, value);
    }

}
