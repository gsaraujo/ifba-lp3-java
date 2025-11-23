package financeiro.model;

public class Holerite {
    private Funcionario funcionario;
    private double salarioBruto;
    private double descontoInss;
    private double descontoIr;
    private double salarioLiquido;
    private double valorHora;

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
        this.valorHora = this.funcionario.getSalarioBase() / 160;
        double valorHoraExtra = this.valorHora * 1.5;
        double totalHorasExtras = valorHoraExtra * this.funcionario.getHorasExtras();
        System.out.println("Horas extras: " + totalHorasExtras);
        return totalHorasExtras;
        //return valorHoraExtra * this.funcionario.getHorasExtras();
    }

    public double calcularFaltas() {
        // desconto de 8h por falta
        double descontoFalta = this.valorHora * 8;
        double descontoTotalFaltas = descontoFalta * this.funcionario.getFaltas();
        System.out.println("Faltas: " + descontoTotalFaltas);
        return  descontoTotalFaltas;
        //return descontoFalta * this.funcionario.getFaltas();
    }

    public void calcularImpostos() {
        // INSS e IR
        if (this.salarioBruto < 2500) {
            this.descontoIr = 0;
        } else if ((this.salarioBruto >= 2500) && (this.salarioBruto < 5000)) {
            this.descontoIr = (this.salarioBruto - 2500) * 0.1;//0.1 = 10%
        } else if (this.salarioBruto >= 5000) {
            this.descontoIr = (this.salarioBruto - 5000) * 0.2;//0.2 = 20%
        }
        System.out.println("Imposto de renda: " + this.descontoIr);
        this.descontoInss = Math.min(0.11 * salarioBruto, 800.00);//Se 11% do salário bruto for maior que 800, retorna 800 invés do valor de 11% do salário bruto
    }

    public void calcularSalarioLiquido() {
        // deve setar salarioBruto, descontoInss, descontoIr e salarioLiquido
        this.salarioBruto = funcionario.getSalarioBase() + this.calcularHorasExtras() -  this.calcularFaltas();
        this.calcularImpostos();
        this.salarioLiquido = this.salarioBruto - this.descontoIr - this.descontoInss;

    }

}
