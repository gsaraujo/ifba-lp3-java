
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) {

        int porta = 12345;

        try (ServerSocket servidorSocket = new ServerSocket(porta)) {
            System.out.println("Servidor rodando na porta: " + porta);

            Socket clienteSocket = servidorSocket.accept();
            System.out.println("Cliente conectado com sucesso!");

            /*Scanner scanner = new Scanner(System.in);
            String mensagemCliente;
            mensagemCliente = scanner.nextLine();*/

            BufferedReader entrada = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
            PrintWriter saida = new PrintWriter(clienteSocket.getOutputStream(), true);

            //while (!mensagemCliente.equals("exit")) {
            /*String mensagemCliente;
            while ((mensagemCliente = entrada.readLine()) != null)
                System.out.println("O cliente disse: " + mensagemCliente);
                saida.println("O servidor disse que recebeu a mensagem " + mensagemCliente);
            }*/

            String mensagemCliente;
            while ((mensagemCliente = entrada.readLine()) != null) {
                    System.out.println("Cliente: " + mensagemCliente);
                    // Responde para o cliente
                    saida.println("Servidor.Servidor: Recebi sua mensagem -> " + mensagemCliente);
            }
            clienteSocket.close();
        } catch (IOException exception) {
            exception.printStackTrace();
            System.out.println("Erro");
        }
    }
}
