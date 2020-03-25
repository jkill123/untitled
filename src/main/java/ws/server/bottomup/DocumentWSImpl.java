package ws.server.bottomup;

import ws.server.fakeRepo.DocumentRepository;
import ws.server.generated.DocumentType;
import ws.server.generated.DocumentWS;
import ws.server.generated.DocumentsType;
import ws.server.model.Document;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Pinchuk Yevhen
 * @created 24/03/2020 - 20:11
 */
@WebService(endpointInterface = "ws.server.generated.DocumentWS")
public class DocumentWSImpl implements DocumentWS {

    private final DocumentRepository repository = new DocumentRepository();

    public String addDocument(ws.server.generated.DocumentType addRequest) {
        repository.addDocument(addRequest.getId(), addRequest.getPurpose(), addRequest.getAmount(),
                addRequest.getAccountFrom(), addRequest.getAccountTo());
        System.out.println("Doc added");
        return "Doc Added with id :" + addRequest.getId();
    }

    public String deleteDocument(int documentID) {
        repository.deleteDocument(documentID);
        System.out.println("Doc deleted");
        return "Doc deleted with id :" + documentID;
    }

    public ws.server.generated.DocumentType getDocument(int documentId) {
        Document documentById = repository.getDocumentById(documentId);
        if (documentById!=null){
            ws.server.generated.DocumentType documentType = new ws.server.generated.DocumentType();
            documentType.setId(documentById.getId());
            documentType.setPurpose(documentById.getPurpose());
            documentType.setAmount(documentById.getAmount());
            documentType.setAccountFrom(documentById.getAccountFrom());
            documentType.setAccountTo(documentById.getAccountTo());
            System.out.println("Doc get");
            return documentType;
        } else {
            throw new RuntimeException();
        }
    }

    public DocumentsType getAllDocuments() {
        DocumentsType documentsType = new DocumentsType();
        List<Document> documentList = repository.getDocumentList();
        List<DocumentType> list = new ArrayList<DocumentType>();

        for(Document document: documentList){

            DocumentType documentType = new DocumentType();
            documentType.setId(document.getId());
            documentType.setPurpose(document.getPurpose());
            documentType.setAmount(document.getAmount());
            documentType.setAccountFrom(document.getAccountFrom());
            documentType.setAccountTo(document.getAccountTo());
            list.add(documentType);
        }
        documentsType.setDocuments(list);
        return documentsType;
    }
}
