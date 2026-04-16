package iiunidade;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) {

        int porta = 12345;
        //int porta = 80;

        try (ServerSocket servidorSocket = new ServerSocket(porta)) {
            
            System.out.println("iiunidade.Servidor rodando na porta: " + porta);

            Socket clienteSocket = servidorSocket.accept();
            System.out.println("iiunidade.Cliente conectado com sucesso!");

            /*Scanner scanner = new Scanner(System.in);
            String mensagemCliente;
            mensagemCliente = scanner.nextLine();*/

            //BufferedReader entrada = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
            Scanner entrada = new Scanner(clienteSocket.getInputStream());
            PrintWriter saida = new PrintWriter(clienteSocket.getOutputStream(), true);

            //while (!mensagemCliente.equals("exit")) {
            /*String mensagemCliente;
            while ((mensagemCliente = entrada.readLine()) != null)
                System.out.println("O cliente disse: " + mensagemCliente);
                saida.println("O servidor disse que recebeu a mensagem " + mensagemCliente);
            }*/

            String mensagemCliente;
            while ((entrada.hasNextLine())) {
                mensagemCliente = entrada.nextLine();
                System.out.println("iiunidade.Cliente: " + mensagemCliente);
                // Responde para o cliente
                saida.println("iiunidade.Servidor.iiunidade.Servidor: Recebi sua mensagem -> " + toUpperCase(mensagemCliente));
            }
            entrada.close();
            clienteSocket.close();
        } catch (IOException exception) {
            exception.printStackTrace();
            System.out.println("Erro");
        }
    }

    public static String toUpperCase(String mensagem) {
        return mensagem.toUpperCase();
    }


}
