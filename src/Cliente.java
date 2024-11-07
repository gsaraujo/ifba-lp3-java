import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        String servidor = "localhost";
        int porta = 12345;

        try (Socket socket = new Socket(servidor,porta)){
            System.out.println("Conectado com sucesso!");

            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter saida = new PrintWriter(socket.getOutputStream(), true);
            /*Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o nome do cliente: ");
            String nome = entrada.nextLine();
            //pegando a resposta do servidor
            String respostaServidor = entrada.nextLine();*/

            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Digite uma mensagem: ");
            String mensagem = teclado.readLine();
            saida.println(mensagem);

            String respostaServidor = entrada.readLine();
            System.out.println(respostaServidor);


        } catch(IOException e){
            System.out.println("Erro ao conectar ao servidor");
        }


    }
}