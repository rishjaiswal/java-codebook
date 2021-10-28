/*
https://leetcode.com/explore/learn/card/queue-stack/239/conclusion/1387/
*/


package stack;

import java.util.LinkedList;

class ImplementStack {
    LinkedList<Integer> q1;

    public ImplementStack() {
        q1 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
        int sz = q1.size();
        while (sz > 1) {
            q1.add(q1.remove());
            sz--;
        }
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}