package iunidade.biblioteca;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EstoqueLivros {
    List<Livro> livros;

    public EstoqueLivros(boolean linkedList) {
        if (linkedList) {
            this.livros = new LinkedList<Livro>();
        } else {
            this.livros = new ArrayList<Livro>();
        }

    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public boolean removerLivroPorIsbn(String isbn) {
        Livro livro = this.buscarLivroPorISBN(isbn);
        if (livro != null) {
            return this.livros.remove(livro);//Quando passamos um objeto para o método remove, ele retorna true, caso o objeto seja removido e false, caso contrário
        }
        return false;
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : this.livros) {
            if (livro.titulo.equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Livro buscarLivroPorISBN(String isbn) {
        for (Livro livro : this.livros) {
            if (livro.isbn.equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    public void listarTodosLivros() {
        for (Livro livro : this.livros) {
            System.out.println(livro);//Isso vai chamar o método toString(), ou seja, vai imprimir da forma que criamos o método na classe Livro
        }
    }
}
