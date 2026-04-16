package iiiunidade.financeiro;

import iiiunidade.financeiro.controller.FolhaController;

public class App {

    public static void main(String[] args) {
        FolhaController folhaController = new FolhaController();

        folhaController.processarFolha();
    }
}
