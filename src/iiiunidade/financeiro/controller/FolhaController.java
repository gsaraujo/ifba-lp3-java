package iiiunidade.financeiro.controller;

import iiiunidade.financeiro.model.Funcionario;
import iiiunidade.financeiro.model.Holerite;
import iiiunidade.financeiro.utils.Escritor;
import iiiunidade.financeiro.utils.Leitor;
import iiiunidade.financeiro.view.MenuConsole;

import java.util.ArrayList;
import java.util.List;

public class FolhaController {
    private MenuConsole menu;
    private Leitor leitor;
    private Escritor escritor;

    public void processarFolha() {
        this.menu = new MenuConsole();
        String arquivoParaLeitura = this.menu.iniciarPrograma();
        if (arquivoParaLeitura == null) {
            return;
        }
        leitor = new Leitor(arquivoParaLeitura);

        List<Funcionario> funcionarios = leitor.lerFuncionarios();
        //Lista de holerites que serão exportados para o arquivo de pagamento
        List<Holerite> holerites = new ArrayList<>();

        for (Funcionario funcionario : funcionarios) {
            Holerite holerite = new Holerite(funcionario);
            holerite.calcularSalarioLiquido();
            holerites.add(holerite);
        }

        Escritor escritor = new Escritor("folha_novembro.csv");
        escritor.escreverArquivoExportacao(holerites);

    }
}
