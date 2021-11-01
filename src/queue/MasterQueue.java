package queue;

import queue.*;

public class MasterQueue {

    public static void main(String args[]) {
        System.out.println("Start execution of the Queue programs");
        ImplementQueue obj = new ImplementQueue();
        obj.push(10);
        obj.push(20);
        System.out.println("Queue Peek element is " + obj.peek());
        System.out.println("Dequeue element from queue is " + obj.pop());
        System.out.println("Queue Peek element is " + obj.peek());
        System.out.println("Queue is Empty " + obj.empty());
        ImplementQueueSingleStack object = new ImplementQueueSingleStack();
        object.push(10);
        object.push(20);
        object.pop();
        System.out.println("Queue is Empty " + object.empty());
    }
}