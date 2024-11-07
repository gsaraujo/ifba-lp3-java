package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public Server() {

    }
    /*public void start() {
        this.serverSocket = new ServerSocket(8776);
        try {
            this.clientSocket = serverSocket.accept();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.out = new PrintWriter(clientSocket.getOutputStream(), true);
        this.in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String greeting = in.readLine();
        if (greeting != null) {
            out.println("Hello " + greeting);
        } else {
            out.println("I can't understand you");
        }
    }

    public void stop() {
        this.out.close();
        try {
            this.in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            this.clientSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            this.serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/
}
