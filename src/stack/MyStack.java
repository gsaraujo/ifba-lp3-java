package stack;

import java.util.ArrayList;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(109);
        System.out.println(stack.peek());

        if (!stack.empty()) {
            System.out.println("Stack is not empty");
        } else {
            System.out.println("Stack is empty");
        }

        System.out.println(stack.pop());

        if (!stack.empty()) {
            System.out.println("Stack is not empty");
        } else {
            System.out.println("Stack is empty");
        }


        /*stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());

        if (!stack.empty()) {
            System.out.println("Stack is not empty");
        }

        System.out.println(stack.pop());
        if (!stack.empty()) {
            System.out.println("Stack is not empty");
        }

        System.out.println(stack.peek());

        if (!stack.empty()) {
            System.out.println("Stack is not empty");
        }

        System.out.println(stack.pop());*/

        //Inverter uma pilha utilizando array
        Stack<Integer> reverseStack = new Stack<>();
        //adicionando itens a stack
        for(int i = 0; i < 10; i++) {
            reverseStack.push(i*10);
        }
        System.out.println(reverseStack);

        ArrayList<Integer> invertedStack = new ArrayList<>();

        while (!reverseStack.isEmpty()) {
            invertedStack.add(reverseStack.pop());
        }

        for (int i = 0; i < invertedStack.size(); i++) {
            reverseStack.push(invertedStack.get(i));
        }

        System.out.println(reverseStack);





    }
}
