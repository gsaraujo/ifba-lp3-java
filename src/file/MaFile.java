package file;

import java.io.File;
import java.io.IOException;

public class MaFile {
    private String fileName;

    public MaFile(String fileName) {
        this.fileName = fileName;
    }

    public void criandoArquivo() {

        try {
            File meuArquivo = new File(this.fileName);
            if(meuArquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso!");
            } else {
                System.out.println("Erro ao criar arquivo!");
            }

        } catch (IOException e) {
            System.out.println("Um erro inesperado aconteceu ao tentar criar o arquivo!");
            throw new RuntimeException(e);
        }

    }
}
