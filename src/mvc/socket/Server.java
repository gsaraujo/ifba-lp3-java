package socket;

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
    public void start(int port) throws IOException {
        this.serverSocket = new ServerSocket(port);
        this.clientSocket = serverSocket.accept();
        this.out = new PrintWriter(clientSocket.getOutputStream(), true);
        this.in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String greeting = in.readLine();
        if(greeting != null && greeting.equals("Hello Server")) {
            out.println("Hello Client!");
        } else {
            out.println("Unrecognized Greeting");
        }
    }

    public void stop() {
        //this.in.close();
        //this.out.close();
        //this.clientSocket.close();
        //this.serverSocket.close();
    }

    public static void main(String[] args) {
        Server server = new Server();
        //server.start(1234);

    }
}
