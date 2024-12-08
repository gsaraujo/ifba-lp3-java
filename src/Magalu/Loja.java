package Magalu;

public class Loja {
    private String nome;
    private String endereco;
    private String telefone;
    private Estoque estoque;

    public Estoque getEstoque() {
        return estoque;
    }
    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public int computarVenda(Estoque estoque) {
        return 100;
    }

}
