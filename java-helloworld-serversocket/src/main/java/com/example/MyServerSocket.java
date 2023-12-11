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

        String line = in.readLine();
        String[] header = line.split(" ");
        if (header[0].equals("GET")) {
            handleGetMethod(header[1], out);
        }

        in.close();
        out.close();

    }

    private static void handleGetMethod(String path, BufferedWriter out) throws IOException {

        String response = "Hello World!";
        
        if (!"/".equals(path)) {
            return;
        }        

        out.write("HTTP/1.1 " + 200 + "\r\n");
        out.write("Content-Length: " + response.length() + "\r\n");
        out.write("\r\n");
        out.write(response);
        out.flush();

    }
    
}
