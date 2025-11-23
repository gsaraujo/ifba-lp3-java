package financeiro.model;

public class Holerite {
    private Funcionario funcionario;
    private double salarioBruto;
    private double descontoInss;
    private double descontoIr;
    private double salarioLiquido;

    public Holerite(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getDescontoInss() {
        return descontoInss;
    }

    public void setDescontoInss(double descontoInss) {
        this.descontoInss = descontoInss;
    }

    public double getDescontoIr() {
        return descontoIr;
    }

    public void setDescontoIr(double descontoIr) {
        this.descontoIr = descontoIr;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double calcularHorasExtras() {
        // Valor hora normal = salarioBase / 160
        return 0;
    }

    public double calcularFaltas() {
        // desconto de 8h por falta
        return 0;
    }

    public double calcularImpostos(double bruto) {
        // INSS e IR
        return 0;
    }

    public void calcularSalarioLiquido() {
        // deve setar salarioBruto, descontoInss, descontoIr e salarioLiquido
    }

}
