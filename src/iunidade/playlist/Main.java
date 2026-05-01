package iunidade.playlist;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         * Resolução iunidade.playlist
         * */

        //Inserção no final

        //Medindo tempo ArrayList
        Playlist playlistEndArray = new Playlist(false);
        long inicioEndArray = System.nanoTime();
        for(int i = 0; i <= 10000; i++) {
            Musica m = new Musica("titulo" + i,"artista", i);
            playlistEndArray.adicionar(m);
        }
        long duracaoEndArray = System.nanoTime() - inicioEndArray;
        System.out.println("Duração da execução de inserção no ArrayList: " + duracaoEndArray + " nanosegundos");

        //Medindo tempo LinkedList
        Playlist playlistEndLinked = new Playlist(true);
        long inicioEndLinked = System.nanoTime();
        for(int i = 0; i <= 10000; i++) {
            Musica m = new Musica("titulo" + i,"artista", i);
            playlistEndLinked.adicionar(m);
        }
        long duracaoEndLinked = System.nanoTime() - inicioEndLinked;
        System.out.println("Duração da execução de inserção no LinkedList: " + duracaoEndLinked + " nanosegundos");


        //Insercao no inicio

        //Medindo tempo ArrayList
        Playlist playlistIniArray = new Playlist(false);
        long inicioIniArray = System.nanoTime();
        for(int i = 0; i <= 10000; i++) {
            Musica m = new Musica("titulo" + i,"artista", i);
            playlistIniArray.adicionarNoInicio(m);
        }
        long duracaoIniArray = System.nanoTime() - inicioIniArray;
        System.out.println("Duração da execução de inserção no início do ArrayList: " + duracaoIniArray + " nanosegundos");

        //Medindo tempo LinkedList
        Playlist playlistIniLinked = new Playlist(true);
        long inicioIniLinked = System.nanoTime();
        for(int i = 0; i <= 10000; i++) {
            Musica m = new Musica("titulo" + i,"artista", i);
            playlistIniLinked.adicionarNoInicio(m);
        }
        long duracaoIniLinked = System.nanoTime() - inicioIniLinked;
        System.out.println("Duração da execução de inserção no início do LinkedList: " + duracaoIniLinked + " nanosegundos");

        //acessando itens
        //acesso no iunidade.array
        long inicioAcessoArray = System.nanoTime();
        for(int i = 0; i <= 10000; i++) {
            Musica m = playlistIniArray.acessoPorIndice(i);
        }
        long duracaoAcessoArray = System.nanoTime() - inicioAcessoArray;
        System.out.println("Duração da execução de acesso no ArrayList: " + duracaoAcessoArray + " nanosegundos");

        //acesso no linkedlist
        long inicioAcessoLinked = System.nanoTime();
        for(int i = 0; i <= 10000; i++) {
            Musica m = playlistIniLinked.acessoPorIndice(i);
        }
        long duracaoAcessoLinked = System.nanoTime() - inicioAcessoLinked;
        System.out.println("Duração da execução de acesso no LinkedList: " + duracaoAcessoLinked + " nanosegundos");

        //removendo 100 itens
        Random aleatorio = new Random();

        //removendo do arrayList
        long inicioRemocaoArray = System.nanoTime();
        for(int i = 0; i < 100; i++) {
            int intAleatorio = aleatorio.nextInt(10001);
            playlistIniArray.removerPorTitulo("titulo" + intAleatorio);
        }
        long duracaoRemocaoArray = System.nanoTime() - inicioRemocaoArray;
        System.out.println("Duração da execução de remocão no ArrayList: " + duracaoRemocaoArray + " nanosegundos");
        System.out.println("Total de faixas no ArrayList" + playlistIniArray.totalDeFaixas());

        //removendo do linkedlist
        long inicioRemocaoLinked = System.nanoTime();
        for(int i = 0; i < 100; i++) {
            int intAleatorio = aleatorio.nextInt(10001);
            playlistIniLinked.removerPorTitulo("titulo" + intAleatorio);
        }
        long duracaoRemocaoLinked = System.nanoTime() - inicioRemocaoLinked;
        System.out.println("Duração da execução de remoção no LinkedList: " + duracaoRemocaoLinked + " nanosegundos");
        System.out.println("Total de faixas na LinkedList: " + playlistIniLinked.totalDeFaixas());

         /* Fim resolução iunidade.playlist */
    }
}
