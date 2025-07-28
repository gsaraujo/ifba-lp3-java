package mvc.view;

import javax.swing.*;
import java.awt.*;

public class TaskViewGUI {
    /**
     * Exibe os detalhes da tarefa em uma janela Swing.
     *
     * @param id          Identificador da tarefa
     * @param title       Título da tarefa
     * @param description Descrição da tarefa
     * @param completed   Status de conclusão da tarefa
     */
    public void showTaskDetails(int id, String title, String description, boolean completed) {
        // Cria o frame principal
        JFrame frame = new JFrame("Detalhes da Tarefa");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 1, 5, 5));
        frame.setResizable(false);

        // Adiciona os labels com as informações
        frame.add(new JLabel("ID: " + id));
        frame.add(new JLabel("Título: " + title));
        frame.add(new JLabel("Descrição: " + description));
        frame.add(new JLabel("Concluída: " + (completed ? "Sim" : "Não")));

        // Ajusta o tamanho automaticamente e centraliza
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
