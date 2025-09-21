package mvc.model;

public class Todo {
    private String titulo;
    private String descricao;

    public Todo(String title, String description) {
        if(title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Título da tarefa não pode ser vazio");
        }
        this.titulo = title;
        this.descricao = description;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "To-do: " + titulo + ": " + descricao;
    }
}
