package ws.client;

import ws.server.bottomup.DocumentService;

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
        QName qname = new QName("http://bottomup.server.ws/", "DocumentServiceImplService");
        Service service = Service.create(url, qname);
        DocumentService hello = service.getPort(DocumentService.class);
        System.out.println(hello.getHelloString("LOLOLOL"));

        hello.createDoc(1,"sale", 44.0, "AAAAAA","AAAAAAAAAA");
        System.out.println(hello.getDocumentById(1));
    }
}
