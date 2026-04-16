package iiunidade.provaii;

public class Excecao {
    public static void main(String[] args) {
        try {
            //int resultado = 10 /1;
            int resultado = 10/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Erro aritmético");
        } finally {
            System.out.println("Fim do programa");
        }
    }
}
