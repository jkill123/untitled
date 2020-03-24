package ws.server.config;

import ws.server.bottomup.DocumentServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * @author Pinchuk Yevhen
 * @created 24/03/2020 - 18:18
 */
public class DocumentServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/doc", new DocumentServiceImpl());
    }
}
