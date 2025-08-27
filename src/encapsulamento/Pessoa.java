package encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;
    public String sobrenome;
    protected String cpf;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public void aPessoa() {
        //System.out.println("Pessoa " + nome + " " + idade + " " + sobrenome);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("CPF: " + cpf);

    }
    protected void cumprimentar() {
        System.out.println("Olá, meu nome é: " + this.nome);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSobrenome() {
        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
