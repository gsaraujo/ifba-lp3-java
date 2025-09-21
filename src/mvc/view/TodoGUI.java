package mvc.view;


import mvc.model.Todo;
import mvc.model.TodoModel;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class TodoGUI implements Runnable,Observer {
    private final TodoModel model;
    private final JFrame frame = new JFrame("Todo List - Visualizador");
    private final DefaultListModel<String> listModel = new DefaultListModel<>();
    private final JList<String> jList = new JList<>(listModel);


    public TodoGUI(TodoModel model) {
        this.model = model;
    }


    @Override
    public void run() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(jList), BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        // registrar observer após a UI criada
        model.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        SwingUtilities.invokeLater(() -> {
            listModel.clear();
            for (Todo t : model.getTodos()) {
                listModel.addElement(String.format("[%s] %s", t.getTitulo(), t.getDescricao()));
            }
        });
    }
}
