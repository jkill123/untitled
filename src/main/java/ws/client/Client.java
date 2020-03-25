package ws.client;


import ws.server.generated.DocumentWS;
import ws.server.generated.DocumentsType;
import ws.server.model.Document;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Pinchuk Yevhen
 * @created 24/03/2020 - 22:19
 */
public class Client {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/doc?wsdl");
        QName qname = new QName("http://bottomup.server.ws/", "DocumentWSImplService");
        Service service = Service.create(url, qname);
        DocumentWS hello = service.getPort(DocumentWS.class);

        // add document
        ws.server.generated.DocumentType documentType = new ws.server.generated.DocumentType();
        documentType.setId(1);
        documentType.setPurpose("TestPurpose");
        documentType.setAmount(322.0);
        documentType.setAccountFrom("AAAAAAAAAA");
        documentType.setAccountTo("AAAAAAAAAA");

        hello.addDocument(documentType);

        documentType.setId(2);
        documentType.setPurpose("TestPurpose2");
        documentType.setAmount(222.0);
        documentType.setAccountFrom("bbbbbbbbbb");
        documentType.setAccountTo("bbbbbbbbbb");
        hello.addDocument(documentType);


        //get document
        ws.server.generated.DocumentType getDocumentType = hello.getDocument(documentType.getId());
        Document document = new Document();
        document.setId(getDocumentType.getId());
        document.setPurpose(getDocumentType.getPurpose());
        document.setAmount(getDocumentType.getAmount());
        document.setAccountFrom(getDocumentType.getAccountFrom());
        document.setAccountTo(getDocumentType.getAccountTo());
        System.out.println(document);

        // delete document
//        System.out.println(hello.deleteDocument(1));
//        System.out.println(hello.getDocument(1));
        // get all documents

        DocumentsType allDocuments = hello.getAllDocuments();
        System.out.println(allDocuments);
    }
}
