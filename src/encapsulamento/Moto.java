package encapsulamento;

public class Moto implements Veiculo{
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private boolean ligado;

    public void aMoto(){
        System.out.println("Marca" + marca);
        System.out.println("Modelo" + modelo);
        System.out.println("Cor" + cor);
        System.out.println("Placa" + placa);
        System.out.println("Ligado" + ligado);
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

    }

    @Override
    public void frear() {

    }

    @Override
    public void trocarOleo(String oleo) {

    }

    @Override
    public void trocarBateria(String bateria) {

    }
}
