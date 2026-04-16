package iunidade.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<>();

        queue.offer('(');
        queue.offer('[');
        queue.offer(']');

        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else  {
            System.out.println("Queue is not empty");
        }

        System.out.println(queue.poll());
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }
        System.out.println(queue.peek());

    }
}
