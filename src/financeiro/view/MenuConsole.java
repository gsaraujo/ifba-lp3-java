package financeiro.view;

import javax.swing.*;

public class MenuConsole {

    public String iniciarPrograma() {
        mostrarMensagem("Iniciando programa");
        String opcao = mostrarMenu();

        if(opcao.equals("1")) {
            return solicitarArquivoImportacao();
        } else if(opcao.equals("2")) {
            mostrarMensagem("Até breve");
            return null;
        }
        return null;
    }

    public String mostrarMenu() {
        return JOptionPane.showInputDialog("\nMenu\n" +
                "1 - Processar Folha\n" +
                "2 - Sair\n");
    }

    public String solicitarArquivoImportacao() {
        String nomeArquivo = JOptionPane.showInputDialog("Digite o nome do arquivo: ");
        return nomeArquivo;
    }

    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }


}
