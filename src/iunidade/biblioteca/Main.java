package iunidade.biblioteca;

public class Main {
    public static void main(String[] args) {
        EstoqueLivros estoqueLivros = new EstoqueLivros(true);
        Livro livro = new Livro(1,"Senhor dos anéis", "J.R.R. Tolkien", "1234");
        Livro livro1 = new Livro(2, "Harry Potter 1", "J.K. Rowling", "1235");
        Livro livro2 = new Livro(2, "Harry Potter 2", "J.K. Rowling", "1236");
        Livro livro3 = new Livro(2, "Harry Potter 3", "J.K. Rowling", "1237");
        Livro livro4 = new Livro(2, "Harry Potter 4", "J.K. Rowling", "1238");

        estoqueLivros.adicionarLivro(livro);
        estoqueLivros.adicionarLivro(livro1);
        estoqueLivros.adicionarLivro(livro2);
        estoqueLivros.adicionarLivro(livro3);
        estoqueLivros.adicionarLivro(livro4);

        estoqueLivros.listarTodosLivros();

        Livro livroPesquisaPorTitulo = estoqueLivros.buscarLivroPorTitulo("Harry Potter 1");

        if (livroPesquisaPorTitulo != null) {
            System.out.println("Livro econtrado. Informações: ");
            System.out.println(livroPesquisaPorTitulo);
        } else {
            System.out.println("Livro não encontrado");
        }

        if (estoqueLivros.removerLivroPorIsbn("1238")) {
            System.out.println("Livro removido com sucesso");
        } else {
            System.out.println("Livro não encotrado para remoção");
        }

        estoqueLivros.listarTodosLivros();

        estoqueLivros.removerLivroPorIsbn("1238");//livro já removido
    }
}
