package queue;

import java.util.*;

class ImplementQueueSingleStack {
    Stack<Integer> stack;

    public ImplementQueueSingleStack() {
        stack = new Stack();
    }

    public void push(int x) {
        /*
        Enqueue - O(1)
         */
        stack.push(x);
        System.out.println("Enqueue Operation is completed in queue for " + x);
    }


    public void pop() {
        /*
        Dequeue - Recursion
         */
        if (stack.size() < 1) {
            System.out.println("Nothing to deQueue");
        }

        if (stack.size() == 1) {
            System.out.println("Dequeue element from queue is " + stack.pop());
            return;
        }

        int data = stack.pop();
        pop();
        stack.push(data);

    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
