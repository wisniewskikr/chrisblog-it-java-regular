package com.example;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class MyHttpServer {

    private MyHttpServer() {
        throw new IllegalStateException("Utility class");
    }

    public static void displayHelloWorld() throws IOException {

        HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080), 0);
        httpServer.createContext("/", new HttpHandler() {

            @Override
            public void handle(HttpExchange exchange) throws IOException {
                exchange.sendResponseHeaders(200, 0);
                OutputStream outputStream = exchange.getResponseBody();
                outputStream.write("Hello World!".getBytes());
                outputStream.close();
            }
            
        });

        System.out.println("Server is working ...");
        httpServer.start();
        

    }
    
}
