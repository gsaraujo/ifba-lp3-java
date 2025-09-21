package mvc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class TodoModel extends Observable {
    private List<Todo> todos = new ArrayList<>();


    public Todo addTodo(String title, String description) {
        Todo todo = new Todo(title, description);
        todos.add(todo);
        setChanged();
        notifyObservers(this.todos);
        return todo;
    }

    public void removeById(int id) {
        todos.remove(id);
    }

    public void listarTodos() {
        for (Todo td : this.todos) {
            System.out.println(this.todos.indexOf(td));//Imprime o id do todo. Para essa atividade, esse será o id da tarefa.
            System.out.println(td);
        }
    }

    public List<Todo> getTodos() {
        return this.todos;
    }


}
