package another.server;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            //endpoint = IP (localhost) + porta (12345)
            String server = "localhost";
            int port = 12345;

            Socket socket = new Socket(server, port);//criação do socket no cliente -> quando a conexão é aceita pelo servidor (pelo socket do servidor)
            System.out.println("Conectado com sucesso");

            //entrada de informações (o que o usuário digita)
            Scanner scanner = new Scanner(System.in);

            //para enviar dados para o servidor
            OutputStream outputStream = socket.getOutputStream();//o socket.getOutputStream() faz algumas verificações e retornar um new OutputStream(); vinculado ao servidor. Ou seja, é um "canal" para enviar informações do cliente para o servidor.
            PrintWriter printWriter = new PrintWriter(outputStream);//é quem escreve/"envia" a mensagem propriamente dita.

            while(true) {
                System.out.println("Digite a mensagem (digite 'exit' para sair): ");
                String line = scanner.nextLine();
                printWriter.println(line);
                printWriter.flush();//faz a limpeza do "canal" de comunicação

                //checar se o cliente digitou 'exit' para poder sair
                //poderia ser também if ("exit".equalsIgnoreCase(mensagem)) {
                if(line.equals("exit")) {
                    break;
                }

            }

            printWriter.close();
            socket.close();
            scanner.close();
            System.out.println("Conexão encerrada com sucesso");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
