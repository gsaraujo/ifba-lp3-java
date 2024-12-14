package provaii;

import java.util.Stack;

public class Metodos {
    public static boolean estaBalanceada(String str) {
        Stack<Character> pilha = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                pilha.push(ch);
            } else if (ch == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();

            }

        }
        return pilha.isEmpty();
    }
    public static void main(String[] args) {
        String test1 = "((()))";//true
        String test2 = "(()";//false

        System.out.println(estaBalanceada(test1));//true
        System.out.println(estaBalanceada(test2));//false

    }
}
