package financeiro.controller;

import financeiro.model.Funcionario;
import financeiro.utils.Escritor;
import financeiro.utils.Leitor;
import financeiro.view.MenuConsole;

import java.util.List;

public class FolhaController {
    private MenuConsole menu;
    private Leitor leitor;
    private Escritor escritor;

    public void processarFolha() {
        this.menu = new MenuConsole();
        String arquivoParaLeitura = this.menu.iniciarPrograma();
        leitor = new Leitor(arquivoParaLeitura);

        List<Funcionario> funcionarios = leitor.lerFuncionarios();

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }

        //this.solicitarArquivo();
        //this.lerArquivo();
        //this.calcularFolha();

    }
}
