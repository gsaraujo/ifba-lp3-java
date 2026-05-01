package iunidade.biblioteca;

public class Livro {
    public int id;
    public String titulo;
    public String autor;
    public String isbn;

    public Livro(int id, String titulo, String autor, String isbn) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }





    public String toString() {
        return "Titulo: " + this.titulo
        + "\nAutor: " + this.autor
        + "\nISBN: " + this.isbn;
    }
}
