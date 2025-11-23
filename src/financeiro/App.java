package financeiro;

import financeiro.controller.FolhaController;

public class App {

    public static void main(String[] args) {
        FolhaController folhaController = new FolhaController();

        folhaController.processarFolha();
    }
}
