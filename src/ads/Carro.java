package ads;

public class Carro implements Veiculo{

    public boolean ligar() {
        return false;
    }

    @Override
    public boolean ligar(String gasolina) {
        if(gasolina.equals("Gasolina")) {
            return false;
        }
        return true;
    }

    @Override
    public boolean desligar() {
        return false;
    }

    @Override
    public void acelerar() {

    }
}
