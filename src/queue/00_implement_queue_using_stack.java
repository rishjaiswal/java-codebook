package queue;

import java.util.*;

class ImplementQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public ImplementQueue() {
        s1 = new Stack();
        s2 = new Stack();
    }

    public void push(int x) {
        /*
        Push - O(n)
         */
        while (!s1.isEmpty())
            s2.push(s1.pop());
        s2.push(x);
        while (!s2.isEmpty())
            s1.push(s2.pop());
        System.out.println("Enqueue Operation is completed in queue for " + x);
    }


    public int pop() {
        /*
        Pop - O(1)
         */
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * ImplementQueue obj = new ImplementQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */