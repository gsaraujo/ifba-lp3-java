package iunidade.l1p1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ResolucaoB4 {

    public static void main(String[] args) {
        ResolucaoB4 objeto = new ResolucaoB4();
        objeto.q1();
    }

    public void q1(){
        Stack<Integer> pilha = new Stack<>();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);

        System.out.println("Ante da inversao: " + pilha);

        int[] array = new int[pilha.size()];

        int i = 0;

        while(!pilha.isEmpty()) {
            array[i] = pilha.pop();
            i++;
        }

        for(int j=0; j<array.length; j++){
            pilha.push(array[j]);
        }
        //E se a gente precisar imprimir na mesma ordem da pilha? Como a gente faria?
        System.out.println("Depois da inversao: " + pilha);


    }

    public void q2(){
        Queue<Integer> fila = new LinkedList<>();
        ArrayList<Integer> lista = new ArrayList<>();

        fila.offer(5);
        fila.offer(10);
        fila.offer(15);

        while(!fila.isEmpty()) {
            lista.add(fila.poll());
        }

        System.out.println(lista);

    }

    public  void q3(){
        int[] numeros = {10, 20, 30, 40, 50};
        Stack<Integer> pilha = new Stack<>();

        for (int i = 0; i < numeros.length; i++) {
            pilha.push(numeros[i]);
        }

        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }


    }

    public void q4(){
        ArrayList<Integer> lista = new ArrayList<>();
        Queue<Integer> fila = new LinkedList<>();

        lista.add(10);
        lista.add(3);
        lista.add(30);
        lista.add(47);
        lista.add(50);
        lista.add(19);
        lista.add(20);

        for(int i = 0; i < lista.size(); i++) {
            if (lista.get(i) %2 == 0){
                fila.offer(lista.get(i));
            }
        }

        for(int i = 0; i < lista.size(); i++) {
            if (lista.get(i) %2 != 0){
                fila.offer(lista.get(i));
            }
        }

        System.out.println(fila);

    }
}
