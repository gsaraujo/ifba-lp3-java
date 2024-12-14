package provaii;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Pilha {
    private int[] pilha;
    private int topo;

    //Pilha com Array
    public Pilha(int tamanho) {
        pilha = new int[tamanho];
        topo = -1;
    }

    public void adiciona(int valor) {
        if (topo == pilha.length-1) {
            System.out.println("Pilha cheia");
        }
        pilha[++topo] = valor;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        }
        return pilha[topo--];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    //pilha com ArrayList
    //Maior consumo de memória
    //Perda de performance ao crescer
    //Facilidade de uso
    //Tamanho dinâmico
    private ArrayList<Integer> pilhaAL;

    public Pilha() {
        pilhaAL = new ArrayList<>();
    }

    public void adicionaAL(int valor) {//DS -> Pilha.push
        pilhaAL.add(valor);
    }

    public int removeAL() {//DS -> Pilha.pop
        if (isEmptyAL()) {
            System.out.println("Pilha vazia");
        }
        return pilhaAL.remove(pilhaAL.size()-1);
    }

    public boolean isEmptyAL() {
        return pilhaAL.isEmpty();
    }

    public void printQueue(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.remove();
        queue.add(4);

        System.out.println(queue);
    }

    public static void inverterPilha(Stack<Integer> pilha) {
        //Verifica se a pilha está vazia ou se ela tem apenas um elemento
        if (pilha == null || pilha.size() <= 1) {
            return; // Não há o que inverter, já é a resposta.
        }

        //Pilha auxiliar
        Stack<Integer> pilhaAuxiliar = new Stack<>();

        //Move todos os elementos da pilha original para a pilha auxiliar
        while (!pilha.isEmpty()) {
            int valor = pilha.pop();
            pilhaAuxiliar.push(valor);
            /*
            Forma ótima: pilhaAuxiliar.push(pilha.pop());
            * */
        }

        //Move de volta da pilha auxiliar para a pilha original
        while (!pilhaAuxiliar.isEmpty()) {
            int valor = pilhaAuxiliar.pop();
            pilha.push(valor);
            /*
            * Forma ótima: pilha.push(pilhaAuxiliar.pop());
            * */
        }
    }

    public static void main(String[] args) {
        Pilha p = new Pilha();
        p.printQueue();

    }
}
