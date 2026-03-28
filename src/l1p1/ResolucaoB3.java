package l1p1;

public class ResolucaoB3 {

    public static void main(String[] args) {
        ResolucaoB3 objeto = new ResolucaoB3();
        objeto.q1();
    }

    public void q1(){
        Stack<Integer> pilha = new Stack<>();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        int removido = pilha.pop();

        System.out.println(removido);
    }

    public void q2(){
        Stack<Integer> pilha = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);


        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }


    }

    public void q3(){
        Queue<Integer> fila = new LinkedList<>();

        fila.offer(5);
        fila.offer(10);
        fila.offer(15);

        System.out.println(fila.peek());
    }

    public void q4(){
        Queue<Integer> fila = new LinkedList<>();

        fila.offer(10);
        fila.offer(20);
        fila.offer(30);
        fila.offer(40);

        fila.pool();

        System.out.println(fila);

    }

    public void q5(){
        Stack<Integer> pilha = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        int contador = 0;
        int numAuxiliar = 0;

        while (!pilha.isEmpty()) {
            numAuxiliar = pilha.pop();
            auxiliar.push(numAuxiliar);
            //auxiliar.push(pilha.pop());
            contador++;
        }
        System.out.println("Quantidade de itens da pilha: " + contador);

        while (!auxiliar.isEmpty()) {
            numAuxiliar = auxiliar.pop();
            pilha.push(numAuxiliar);
            //pilha.push(auxiliar.pop());
        }

        System.out.println(pilha);
    }


}
