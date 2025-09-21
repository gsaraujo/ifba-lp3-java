package mvc.controller;

import mvc.model.Todo;
import mvc.model.TodoModel;

import java.util.Scanner;

public class TodoController {
    private TodoModel todoModel;
    private Scanner scanner = new Scanner(System.in);

    public TodoController(TodoModel model) {
        this.todoModel = model;
    }

    public void rodarAplicacao() {
        boolean emExecucao = true;
        while(emExecucao) {
            imprimirMenu();
            String opcao = scanner.nextLine();
            switch (opcao) {
                case "1":
                    addTodo();
                    break;
                case "2":
                    removerTodo();
                    break;
                case "3":
                    listarTodo();
                    break;
                case "0":
                    emExecucao = false;
                    break;
                default:
                    System.out.println("Opção inválida. Escolha outra opção");
            }
        }
        System.out.println("Encerrando aplicação...");
    }

    public void imprimirMenu(){
        System.out.println(" --- Todo List CLI --- ");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Remover tarefa por id");
        System.out.println("3 - Listar tarefas");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

    public void addTodo() {
        try {
            System.out.println("Digite o título: ");
            String titulo = scanner.nextLine();
            System.out.println("Descrição: ");
            String descricao = scanner.nextLine();
            Todo todo = this.todoModel.addTodo(titulo,descricao);
            System.out.println("Todo criada: " + todo);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Erro ao adicionar tarefa, ausência de parâmetros: " + illegalArgumentException.getMessage());
        }
    }

    public void removerTodo(){
        System.out.println("Digite o id da tarefa para ser removida: ");
        String input = scanner.nextLine();
        try {
            int id = Integer.parseInt(input);
            this.todoModel.removeById(id);
            System.out.println("Removido com sucesso!");
        } catch(NumberFormatException numberFormatException) {
            System.out.println("Erro ao remover tarefa - Erro de conversão " + numberFormatException.getMessage());
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("Erro ao remover tarefa - Erro de indexOutOfBounds " + indexOutOfBoundsException.getMessage());
        }
    }

    public void listarTodo() {
        todoModel.listarTodos();
    }

}
