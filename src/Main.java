import estoquelivro.EstoqueLivros;
import estoquelivro.Livro;
import mvc.controller.TaskController;
import mvc.controller.TodoController;
import mvc.model.TaskModel;
import mvc.model.TodoModel;
import mvc.view.TaskView;
import mvc.view.TaskViewGUI;
import mvc.view.TodoGUI;
import playlist.Musica;
import playlist.Playlist;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        /*
        * Resolução do problema EstoqueLivros
        *

        EstoqueLivros estoqueLivros = new EstoqueLivros();

        Livro livro = new Livro(1,"O Menino do Pijama Listrado", "John Boyne", "901");
        Livro livro1 = new Livro(2,"Harry Potter 1", "J.K. Rowling", "902");
        Livro livro2 = new Livro(3,"Moby Dick", "Herman Melville", "903");
        Livro livro3 = new Livro(4,"Viva o Povo Brasileiro", "João Ubaldo Ribeiro", "904");
        Livro livro4 = new Livro(5,"A Morte de Ivan Ilitch", "Liev Tolstói", "905");

        estoqueLivros.adicionarLivro(livro);
        estoqueLivros.adicionarLivro(livro1);
        estoqueLivros.adicionarLivro(livro2);
        estoqueLivros.adicionarLivro(livro3);
        estoqueLivros.adicionarLivro(livro4);

        //estoqueLivros.listarTodosLivros();

        Livro busca = estoqueLivros.buscarLivro("viva o povo brasileiro");
        System.out.println(busca.toString());

        Livro buscaInexistente = estoqueLivros.buscarLivro("a revolucao dos bichos");

        if(buscaInexistente == null) {
            System.out.println("\nLivro não encontrado\n");
        }

        estoqueLivros.removerLivro("903");

        estoqueLivros.listarTodosLivros();

        System.out.println(estoqueLivros.removerLivro("903"));*/

        /*
        * Resolução playlist
        * */
        /*
        //Inserção no final

        //Medindo tempo ArrayList
        Playlist playlistEndArray = new Playlist(false);
        long inicioEndArray = System.nanoTime();
        for(int i = 0; i <= 10000; i++) {
            Musica m = new Musica("titulo" + i,"artista", i);
            playlistEndArray.adicionar(m);
        }
        long duracaoEndArray = System.nanoTime() - inicioEndArray;
        System.out.println("Duração da execução: " + duracaoEndArray + " nanosegundos");

        //Medindo tempo LinkedList
        Playlist playlistEndLinked = new Playlist(true);
        long inicioEndLinked = System.nanoTime();
        for(int i = 0; i <= 10000; i++) {
            Musica m = new Musica("titulo" + i,"artista", i);
            playlistEndLinked.adicionar(m);
        }
        long duracaoEndLinked = System.nanoTime() - inicioEndLinked;
        System.out.println("Duração da execução: " + duracaoEndLinked + " nanosegundos");


        //Insercao no inicio

        //Medindo tempo ArrayList
        Playlist playlistIniArray = new Playlist(false);
        long inicioIniArray = System.nanoTime();
        for(int i = 0; i <= 10000; i++) {
            Musica m = new Musica("titulo" + i,"artista", i);
            playlistIniArray.adicionarNoInicio(m);
        }
        long duracaoIniArray = System.nanoTime() - inicioIniArray;
        System.out.println("Duração da execução: " + duracaoIniArray + " nanosegundos");

        //Medindo tempo LinkedList
        Playlist playlistIniLinked = new Playlist(true);
        long inicioIniLinked = System.nanoTime();
        for(int i = 0; i <= 10000; i++) {
            Musica m = new Musica("titulo" + i,"artista", i);
            playlistIniLinked.adicionarNoInicio(m);
        }
        long duracaoIniLinked = System.nanoTime() - inicioIniLinked;
        System.out.println("Duração da execução: " + duracaoIniLinked + " nanosegundos");

        //acessando itens
        //acesso no array
        long inicioAcessoArray = System.nanoTime();
        for(int i = 0; i <= 10000; i++) {
            Musica m = playlistIniArray.acessoPorIndice(i);
        }
        long duracaoAcessoArray = System.nanoTime() - inicioAcessoArray;
        System.out.println("Duração da execução de acesso no array: " + duracaoAcessoArray + " nanosegundos");

        //acesso no linkedlist
        long inicioAcessoLinked = System.nanoTime();
        for(int i = 0; i <= 10000; i++) {
            Musica m = playlistIniLinked.acessoPorIndice(i);
        }
        long duracaoAcessoLinked = System.nanoTime() - inicioAcessoLinked;
        System.out.println("Duração da execução de acesso no linked: " + duracaoAcessoLinked + " nanosegundos");

        //removendo 100 itens
        Random aleatorio = new Random();

        //removendo do arrayList
        long inicioRemocaoArray = System.nanoTime();
        for(int i = 0; i < 100; i++) {
            int intAleatorio = aleatorio.nextInt(10001);
            playlistIniArray.removerPorTitulo("titulo" + intAleatorio);
        }
        long duracaoRemocaoArray = System.nanoTime() - inicioRemocaoArray;
        System.out.println("Duração da execução: " + duracaoRemocaoArray + " nanosegundos");
        System.out.println(playlistIniArray.totalDeFaixas());

        //removendo do linkedlist
        long inicioRemocaoLinked = System.nanoTime();
        for(int i = 0; i < 100; i++) {
            int intAleatorio = aleatorio.nextInt(10001);
            playlistIniLinked.removerPorTitulo("titulo" + intAleatorio);
        }
        long duracaoRemocaoLinked = System.nanoTime() - inicioRemocaoLinked;
        System.out.println("Duração da execução: " + duracaoRemocaoLinked + " nanosegundos");
        System.out.println(playlistIniArray.totalDeFaixas());

         * Fim resolução playlist
         */

        /*
         * Resolução MVC
         */

        /*TaskModel taskModel = new TaskModel(1,"Primeira", "Primeira atividade");

        TaskView taskView = new TaskView();

        TaskController taskController = new TaskController(taskModel, taskView);

        taskController.updateView();

        TaskViewGUI viewGUI = new TaskViewGUI();

        TaskController taskControllerGUI = new TaskController(taskModel, viewGUI);

        taskControllerGUI.updateViewGUI();*/


        /**
         * Prova II - II unidade
         */

        TodoModel todoModel = new TodoModel();

        TodoGUI todoGUI = new TodoGUI(todoModel);
        SwingUtilities.invokeLater(todoGUI);

        todoModel.addObserver(todoGUI);

        TodoController todoController = new TodoController(todoModel);

        todoController.rodarAplicacao();

        System.exit(0);












    }
}