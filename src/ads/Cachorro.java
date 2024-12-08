package ads;

public class Cachorro extends Animal {
    private String raca;
    private String porte;
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void oCachorro() {
        System.out.println("O cachorro se chama: " + this.getNome() + " e tem " + this.getIdade() + " anos");

    }
}
