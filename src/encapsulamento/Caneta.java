package encapsulamento;

public class Caneta {
    public String modelo;
    public String cor;
    String marca;//public for package
    private float ponta;
    protected float carga;
    public float preco;
    boolean tampada;

    @Override
    public String toString() {
        return "Caneta{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", ponta=" + ponta +
                ", carga=" + carga +
                ", preco=" + preco +
                ", tampada=" + tampada +
                '}';
    }
    public void aCaneta() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Preco: " + this.preco);
        System.out.println("Tampada: " + this.tampada);
    }

    void rabiscar() {
        if(this.tampada == true) {
            System.out.println("Caneta tampada, não é possível rabiscar");
        } else {
            System.out.println("Rabiscar");
        }

    }

    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }



}
