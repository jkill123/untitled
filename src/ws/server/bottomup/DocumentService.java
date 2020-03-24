package ws.server.bottomup;


import ws.server.model.Document;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * @author Pinchuk Yevhen
 * @created 24/03/2020 - 17:59
 */
@WebService
public interface DocumentService {

    @WebMethod
    String getHelloString(String name);

    @WebMethod
    void createDoc(int id, String purpose, Double amount, String accountFrom, String accountTo);

    @WebMethod
    void deleteDoc(int id);

    @WebMethod
    Document getDocumentById(int id);

    @WebMethod
    List<Document> getDocumentObjectList();
}
