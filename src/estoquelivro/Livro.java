package estoquelivro;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String isbn;

    public Livro(int id, String titulo, String autor, String isbn) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String toString() {

        return String.format(
                "Livro %d {\n" +
                        "  Título: \"%s\"%n" +
                        "  Autor:  %s%n" +
                        "  ISBN:   %s%n" +
                        "}",
                this.id,
                this.titulo,
                this.autor,
                this.isbn
        );

    }
}

