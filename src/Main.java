import estoquelivro.EstoqueLivros;
import estoquelivro.Livro;

public class Main {
    public static void main(String[] args) {


        /*
        * Resolução do problema EstoqueLivros
        * */

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

        System.out.println(estoqueLivros.removerLivro("903"));




    }
}