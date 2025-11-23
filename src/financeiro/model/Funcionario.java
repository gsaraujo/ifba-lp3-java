package financeiro.model;

public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private double salarioBase;
    private int horasExtras;
    private int faltas;

    public Funcionario(int id, String nome, String cargo, double salarioBase, int horasExtras, int faltas) {
        this.id   = id;
        this.nome   = nome;
        this.cargo   = cargo;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
        this.faltas   = faltas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return "Funcionário: " + this.id +
                "\nNome: " + this.nome +
                "\nCargo: " + this.cargo +
                "\nSalário base: " + this.salarioBase;

    }





}
