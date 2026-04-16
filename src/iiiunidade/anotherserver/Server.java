package iiiunidade.anotherserver;

import java.net.*;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            int porta = 12345;//endpoint = IP (localhost) + porta (12345)
            ServerSocket servidorSocket = new ServerSocket(porta);
            System.out.println("iiunidade.Servidor iniciado na porta:  " + porta);

            Socket cliente = servidorSocket.accept();//Isso ativa a "escuta" do servidor/iiiunidade.socket, ele fica aguardando uma conexão. Se nenhuma acontecer o programa não passa desse ponto
            System.out.println("iiunidade.Cliente conectado");

            Scanner scanner = new Scanner(cliente.getInputStream());//vincula o scanner ao fluxo de entrada (onde a pessoa digita) do cliente.
            while (true) {
                String line = scanner.nextLine();
                System.out.println("Mensagem do cliente: " + line);
                //checar se o cliente digitou 'exit' para poder sair
                //poderia ser também if ("exit".equalsIgnoreCase(mensagem)) {
                if (line.equals("exit")) {
                    break;
                }
            }
            servidorSocket.close();
            cliente.close();
            scanner.close();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
