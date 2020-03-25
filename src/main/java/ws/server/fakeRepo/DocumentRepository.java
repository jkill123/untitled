package ws.server.fakeRepo;


import ws.server.model.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pinchuk Yevhen
 * @created 24/03/2020 - 14:52
 */

public class DocumentRepository {

    private List<Document> documentList = new ArrayList<Document>();

    private Document createSDocumentObject(int id, String purpose, Double amount, String accountFrom, String accountTo) {
        System.out.println("server create document");
        return new Document(id, purpose, amount, accountFrom, accountTo);
    }

    public List<Document> getDocumentList() {
        System.out.println("server get all documents");
        return documentList;
    }

    public Document getDocumentById(int id) {
        System.out.println("server get document by id");
        for (Document document : documentList) {
            if (document.getId() == id) {
                return document;
            }
        }
        throw new RuntimeException();
    }

    public void addDocument(int id, String purpose, Double amount, String accountFrom, String accountTo) {
        System.out.println("Server add Document");
        documentList.add(createSDocumentObject(id, purpose, amount, accountFrom, accountTo));
    }

    public void deleteDocument(int id) {
        System.out.println("server delete document");
        for (Document document : documentList) {
            if (document.getId() == id) {
               documentList.remove(document);
            }
        }
    }
}
