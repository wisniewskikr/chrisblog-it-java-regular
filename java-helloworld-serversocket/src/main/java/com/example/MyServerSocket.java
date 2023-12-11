package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {

    private MyServerSocket() {
        throw new IllegalStateException("Utility class");
    }

    public static void displayHelloWorld() throws IOException {

        ServerSocket serverSocket = new ServerSocket(8080);

        while (true) {

            try (Socket client = serverSocket.accept()) {
                handleClient(client);
            }
            
        }
        

    }

    private static void handleClient(Socket client) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        BufferedWriter out = new BufferedWriter((new OutputStreamWriter(client.getOutputStream())));

        in.close();
        out.close();

    }
    
}
