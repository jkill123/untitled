package ws.server.bottomup;
import ws.server.fakeRepo.DocumentRepository;
import ws.server.model.Document;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * @author Pinchuk Yevhen
 * @created 24/03/2020 - 20:11
 */
@WebService(endpointInterface = "ws.server.bottomup.DocumentService")
public class DocumentServiceImpl implements DocumentService{

    private DocumentRepository documentRepository = new DocumentRepository();

    @WebMethod
    public void createDoc(int id, String purpose, Double amount, String accountFrom, String accountTo) {
        documentRepository.addDocument(id, purpose, amount, accountFrom, accountTo);
    }

    @WebMethod
    public void deleteDoc(int id) {
        documentRepository.deleteDocument(id);
    }

    @WebMethod
    public Document getDocumentById(int id) {
        return documentRepository.getDocumentById(id);
    }

    @WebMethod
    public List<Document> getDocumentObjectList() {
        return documentRepository.getDocumentList();
    }

    @WebMethod
    public String getHelloString(String name) {
        return "Hello, " + name + "!";
    }
}
