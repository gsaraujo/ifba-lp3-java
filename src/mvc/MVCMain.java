package mvc;

import mvc.controller.TaskController;
import mvc.model.TaskModel;
import mvc.view.TaskView;
import mvc.view.TaskViewGUI;

public class MVCMain {
    public static void main(String[] args) {

        TaskModel taskModel = new TaskModel(1, "Primeira","Primeira da Tarefa");
        TaskViewGUI taskViewGUI = new TaskViewGUI();
        TaskView taskView = new TaskView();
        TaskController taskController = new TaskController(taskModel, taskView); //Construtor TaskView
        TaskController taskControllerGUI = new TaskController(taskModel, taskViewGUI);
        taskController.updateView();
        taskControllerGUI.updateViewGUI();
    }
}