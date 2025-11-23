package financeiro.utils;

import financeiro.model.Funcionario;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Leitor {
    private File leitorArquivo;


    public Leitor(String arquivo) {
        this.leitorArquivo = new File(arquivo);
    }

    public List<Funcionario> lerFuncionarios() {

        if (this.leitorArquivo.exists()) {
            try {
                BufferedReader lerArquivo = new BufferedReader(new FileReader(this.leitorArquivo));
                String linhaLida = "";
                List<Funcionario> funcionarios = new ArrayList<>();
                //descartar cabeçalho
                lerArquivo.readLine();
                while ((linhaLida = lerArquivo.readLine()) != null) {
                    String[] informacoes = linhaLida.split(",");
                    Funcionario funcionario = new Funcionario(
                            Integer.parseInt(informacoes[0]),
                            informacoes[1],
                            informacoes[2],
                            Double.parseDouble(informacoes[3]),
                            Integer.parseInt(informacoes[4]),
                            Integer.parseInt(informacoes[5])
                    );

                    funcionarios.add(funcionario);
                }
                return funcionarios;

            } catch (FileNotFoundException e) {
                System.out.println("Arquivo não encontrado!");
                throw new RuntimeException(e);
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo!");
                throw new RuntimeException(e);
            }



        }

        return null;
        //this.leitorArquivo = new File(this.leitorArquivo.getAbsolutePath());
    }
}
