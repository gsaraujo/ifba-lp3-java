package mvc.controller;

import mvc.model.TaskModel;
import mvc.view.TaskView;
import mvc.view.TaskViewGUI;

public class TaskController {
    private TaskModel model;
    private TaskView view;
    private TaskViewGUI viewGUI;

    public TaskController(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    public TaskController(TaskModel model, TaskViewGUI viewGUI) {
        this.model = model;
        this.viewGUI = viewGUI;
    }

    public void setTaskDescription(String description) {
        model.setDescription(description);
    }

    public void setTaskCompleted(boolean completed) {
        model.setCompleted(completed);
    }

    public void updateView() {
        view.printTaskDetails(model.getId(), model.getTitle(), model.getDescription(), model.isCompleted());
    }

    public void updateViewGUI() {
        viewGUI.showTaskDetails(model.getId(), model.getTitle(), model.getDescription(), model.isCompleted());

    }
}
