package encapsulamento;

import java.time.LocalDate;

public class Carro implements Veiculo {
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private int ano;
    private boolean ligado;
    private int velocidade;
    private String mesUltimaTrocaOleo;
    private String marcaOleo;
    private String mesUltimaTrocaBateria;
    private String marcaBateria;

    public Carro(String marca, String modelo, String cor, String placa, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.ano = ano;
        this.ligado = false;
        this.velocidade = 0;
    }

    @Override
    public void ligar() {
        this.ligado = true;
    }

    @Override
    public void desligar() {
        this.ligado = false;
    }

    @Override
    public void acelerar() {
        this.velocidade+=10;


    }

    @Override
    public void frear() {
        if((this.ligado == true) && (this.velocidade >= 5)) {
            this.velocidade -= 5;
        } else {
            this.velocidade = 0;
        }

    }

    @Override
    public void trocarOleo(String marcaOleo) {
        LocalDate dataAtual = LocalDate.now();
        String mes = dataAtual.getMonth().toString();
        this.mesUltimaTrocaOleo = mes;
        this.marcaOleo = marcaOleo;

    }

    @Override
    public void trocarBateria(String marcaBateria) {
        LocalDate dataAtual = LocalDate.now();
        String mes = dataAtual.getMonth().toString();
        this.mesUltimaTrocaBateria = mes;
        this.marcaBateria = marcaBateria;

    }

    public void oCarro() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano: " + this.ano);
        System.out.println("Ligado: " + this.ligado);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Mes ultima troca de oleo: " + this.mesUltimaTrocaOleo);
        System.out.println("Mes ultima troca de bateria: " + this.mesUltimaTrocaBateria);
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlaca() {
        return this.placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getAno() {
        return this.ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public boolean getLigado() {
        return this.ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public int getVelocidade() {
        return this.velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public String getMesUltimaTrocaOleo() {
        return this.mesUltimaTrocaOleo;
    }
    public void setMesUltimaTrocaOleo(String mes) {
        this.mesUltimaTrocaOleo = mes;
    }
    public String getMesUltimaTrocaBateria() {
        return this.mesUltimaTrocaBateria;
    }
    public void setMesUltimaTrocaBateria(String mes) {
        this.mesUltimaTrocaBateria = mes;
    }

}
