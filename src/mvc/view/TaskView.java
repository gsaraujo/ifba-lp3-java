package mvc.view;

public class TaskView {
    public void printTaskDetails(int id, String title, String description, boolean completed) {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Descrição: " + description);
        System.out.println("Concluída: " + (completed ? "Sim" : "Não"));
    }
}
