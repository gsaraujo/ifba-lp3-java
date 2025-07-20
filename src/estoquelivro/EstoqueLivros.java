package estoquelivro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EstoqueLivros {
    private List<Livro> livros;

    public EstoqueLivros() {
        this.livros = new ArrayList<Livro>();
        //this.livros = new LinkedList<Livro>();
    }

    public boolean adicionarLivro(Livro livro) {
        return livros.add(livro);
    }

    public boolean removerLivro(String isbn) {

        for (Livro livro : livros) {
            if (isbn.equalsIgnoreCase(livro.getIsbn())) {
                return livros.remove(livro);
            }
        }

        return false;

    }

    public Livro buscarLivro(String titulo) {

        for  (Livro livro : livros) {
            if(titulo.equalsIgnoreCase(livro.getTitulo())) {
                return livro;
            }
        }

        return null;

    }

    public void listarTodosLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.toString());
        }
    }
}

