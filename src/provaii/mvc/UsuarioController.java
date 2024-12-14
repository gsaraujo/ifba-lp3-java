package provaii.mvc;

public class UsuarioController {
    private final UsuarioModel usuarioModel;

    public UsuarioController(UsuarioModel usuarioModel) {
        this.usuarioModel = usuarioModel;
    }

    public void alterarNome(String novoNome) {
        if (novoNome == null || novoNome.isEmpty()) {
            System.out.println("Erro: O nome não pode ser vazio ou nulo.");
            return;
        }

        System.out.println("Alterando o nome do usuário...");
        usuarioModel.setNome(novoNome);
    }


    public static void main(String[] args) {
        // Criando o modelo
        UsuarioModel usuarioModel = new UsuarioModel();

        // Adicionando um observador ao modelo
        usuarioModel.addObserver((propertyName, oldValue, newValue) -> {
            System.out.println("Propriedade '" + propertyName + "' mudou de " + oldValue + " para " + newValue);
        });

        // Criando o controller
        UsuarioController usuarioController = new UsuarioController(usuarioModel);

        // Usando o controller para alterar o nome do usuário
        usuarioController.alterarNome("Peter Park");
        usuarioController.alterarNome("MJ");

        // Tentando definir um nome inválido
        usuarioController.alterarNome("");
    }


}

