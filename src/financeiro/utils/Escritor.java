package financeiro.utils;

import financeiro.model.Holerite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Escritor {
    private String arquivoExportacao;
    private File meuArquivo;

    public Escritor(String arquivoExportacao) {
        this.arquivoExportacao = arquivoExportacao;
    }

    public void escreverArquivoExportacao(List<Holerite> holerites) {

        if (arquivoExportacao == null) {
            return;
        }

        try {
            this.meuArquivo = new File(this.arquivoExportacao);
            if(meuArquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso!");
            } else {
                System.out.println("Erro ao criar arquivo!");
            }

        } catch (IOException e) {
            System.out.println("Um erro inesperado aconteceu ao tentar criar o arquivo!");
            throw new RuntimeException(e);
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.meuArquivo));
            //adicionando cabeçalho do arquivo
            String cabecalho = "ID,NOME,SALARIO_BRUTO,DESCONTO_INSS,DESCONTO_IR,SALARIO_LIQUIDO\n";
            bufferedWriter.write(cabecalho);

            for (Holerite holerite : holerites) {
                bufferedWriter.write(String.valueOf(holerite.getFuncionario().getId()));
                bufferedWriter.write(",");
                bufferedWriter.write(holerite.getFuncionario().getNome());
                bufferedWriter.write(",");
                bufferedWriter.write(String.valueOf(holerite.getSalarioBruto()));
                bufferedWriter.write(",");
                bufferedWriter.write(String.valueOf(holerite.getDescontoInss()));
                bufferedWriter.write(",");
                bufferedWriter.write(String.valueOf(holerite.getDescontoIr()));
                bufferedWriter.write(",");
                bufferedWriter.write(String.valueOf(holerite.getSalarioLiquido()));
                bufferedWriter.write("\n");
            }
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("Impossível abrir arquivo para alteração");
        }

    }


}
