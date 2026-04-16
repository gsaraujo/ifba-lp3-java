package iunidade.l1p1;

import java.util.ArrayList;
import java.util.Scanner;

public class ResolucaoB2 {
    public static void main(String[] args) {
        ResolucaoB2 resolucaoB2 = new ResolucaoB2();

    }

    public void q1() {
        int[] numeros = {4, 9, 1, 7, 3};

        int maiorNumero = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (maiorNumero < numeros[i]) {
                maiorNumero = numeros[i];
            }
        }
        System.out.println(maiorNumero);

    }

    public void q2() {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] invertidos = new int[numeros.length];

        for (int i = numeros.length-1; i >=0 ; i--) {
            invertidos[numeros.length-1-i] = numeros[i];

        }
        for (int i =0 ; i < numeros.length ; i++) {
            System.out.println(invertidos[i]);
        }
    }

    public void q3() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        for (int i = 0; i < lista.size(); i++) {
            if (30 == lista.get(i)) {
                lista.remove(i);
                continue;
            }
            System.out.println(lista.get(i));
        }
    }

    public void q4() {
        int[] numeros = {2, 4, 6, 8, 10,15};
        int numeroUsuario = 15;
        //ou você pode pedir para o usuário indicar qual número ele quer procurar
        Scanner entrada = new Scanner(System.in);
        numeroUsuario = entrada.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if(numeroUsuario == numeros[i]) {
                System.out.println("Numero encontrado");
            }
        }
    }

    public void q5() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(77);
        lista.add(50);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)%2 == 0) {
                continue;
            } else {
                lista.set(i, 0);
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
