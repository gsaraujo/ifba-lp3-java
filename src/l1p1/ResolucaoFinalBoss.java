package l1p1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ResolucaoFinalBoss {
    public static void main(String[] args) {
        ResolucaoFinalBoss obj = new ResolucaoFinalBoss();
        /*System.out.println("Você deseja inserir quantos números? ");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int[] numeros = new int[numero];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero " + (i+1) + ": " );
            numeros[i] = entrada.nextInt();
        }
        System.out.println("E qual o valor alvo (target)? ");
        int target = entrada.nextInt();
        obj.q1(numeros, target);*/
        obj.q3();

    }

    public void q1(int[] array, int target) {
        //Aqui a gente usa um parâmetro na função para poder receber o valor do array que será passado na chamada da função
        //Também precisamos do valor do alvo (target) para poder fazer a comparação.

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("Posição 1: " + i + "\nPosição 2: " + j);
                    return;//Na sala usamos o System.exit(0), mas o return encerra execução do método q1() e devolve o fluxo de execução do programa para o main
                }
            }

        }

    }

    public boolean q2(String minhaString) {
        //Da mesma forma aqui passámos uma String como parâmetro para ser utilizada na validação
        Stack<Character> pilha = new Stack<>();

        if(minhaString.length() < 2) {
            return false;
        }

        for  (int i = 0; i < minhaString.length(); i++) {
            if(pilha.isEmpty()) {
                pilha.push(minhaString.charAt(i));
                continue;
            }
            if (minhaString.charAt(i) == '('
                    || minhaString.charAt(i) == '{'
                    || minhaString.charAt(i) == '[') {
                pilha.push(minhaString.charAt(i));
            }
            else if ((minhaString.charAt(i) == ')' && pilha.peek() == '(')
                    || (minhaString.charAt(i) == '}' && pilha.peek() == '{')
                    || (minhaString.charAt(i) == ']' && pilha.peek() == '[')) {
                pilha.pop();
            } else {
                return false;
            }
        }
        if (pilha.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean q2v2(String s) {
        //uma segunda versão da resolução do problema 2
        Stack <Character> pilha = new Stack<>();

        if(s.length() < 2) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            if(pilha.isEmpty()) {
                pilha.push(s.charAt(i));
                continue;
            }
            switch (s.charAt(i)) {
                case ')':
                    if (pilha.peek() == '(') {
                        pilha.pop();
                        break;
                    }
                    return false;

                case ']':
                    if (pilha.peek() == '[') {
                        pilha.pop();
                        break;
                    }
                    return false;

                case '}':
                    if (pilha.peek() == '{') {
                        pilha.pop();
                        break;
                    }
                    return false;
                default:
                    pilha.push(s.charAt(i));
                    break;

            }

        }
        if(!pilha.isEmpty()) {
            return false;
        }

        return true;
    }

    public void q3() {
        int[] nums = {4, 5, 2, 10, 8};
        int[] resultado = new int[nums.length];
        Stack<Integer> pilha = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!pilha.isEmpty() && pilha.peek() <= nums[i]) {
                pilha.pop();
            }

            //resultado[i] = pilha.isEmpty() ? -1 : pilha.peek();
            if (pilha.isEmpty()) {
                resultado[i] = -1;//Aqui a gente escolheu um número arbitrário para indicar que o número que está naquela posição não possui nenhum elemento a direita que é maior do que ele
                //usando o array da questão como exemplo, o 8 não possui nenhum número a direita que é maior do que ele (já que ele é o último item do array)
                //o número 10 não possui nenhum elemento a direita que é maior do que ele.
                //o número 2 possui dois números maiores do que ele, mas o primeiro é o 10 (feito no else)
                //o número 5 possui dois também, mas o primeiro é o 10 (feito no else)
                //o número 4 possui 3, mas o primeiro é o 5 (feito no else, após adicionar 5 a pilha)
            } else {
                resultado[i] = pilha.peek();
            }
            pilha.push(nums[i]);
        }

        System.out.println(Arrays.toString(resultado));
    }
}
