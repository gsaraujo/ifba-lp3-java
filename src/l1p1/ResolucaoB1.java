package l1p1;

public class ResolucaoB1 {
    public static void main(String[] args) {
        ResolucaoB1 obj = new ResolucaoB1();
        obj.q1();

    }

    public void q1() {
        int[] numeros = {10, 20, 30, 40, 50};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public void q2() {
        int[] numeros = {5, 8, 12, 3, 7};
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }
        System.out.println(soma);
    }

    public void q3() {
        int[] numeros = {1, 4, 7, 8, 10};

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0){
                System.out.println("O numero na posicao " + i + " eh um numero par");
                System.out.println(numeros[i]);
            }
        }

    }

    public void q4() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));;
        }
    }

    public void q5() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(15);
        lista.add(25);
        lista.add(35);
        int soma = 0;
        for (int i = 0; i < lista.size(); i++) {
            soma = soma + lista.get(i);
        }
        System.out.println("Media eh: " + soma/lista.size());

    }

}
