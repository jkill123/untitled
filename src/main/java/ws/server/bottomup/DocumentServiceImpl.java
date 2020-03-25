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


    public String getHelloString(String name) {
        return "HELLO LOLOLOLOLOLOLOLL";
    }

    public void createDoc(int id, String purpose, Double amount, String accountFrom, String accountTo) {

    }

    public void deleteDoc(int id) {

    }

    public Document getDocumentById(int id) {
        return new Document();
    }

    public List<Document> getDocumentObjectList() {
        return null;
    }
}
