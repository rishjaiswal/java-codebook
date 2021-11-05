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
        ImplementQueueUsingArray obj_array = new ImplementQueueUsingArray(2);
        System.out.println("Queue is empty " + obj_array.empty());
        obj_array.enqueue(10);
        obj_array.enqueue(20);
        System.out.println("Queue Peek element is " + obj_array.peek());
        obj_array.enqueue(30);
        System.out.println("Dequeue element from queue is " + obj_array.dequeue());
        System.out.println("Queue is Empty " + obj_array.empty());
        System.out.println("Queue Peek element is " + obj_array.peek());
        MovingAverage m = new MovingAverage(3);
        System.out.println("Moving element from average is " + m.next(1));
        System.out.println("Moving element from average is " + m.next(10));
        System.out.println("Moving element from average is " + m.next(3));
        System.out.println("Moving element from average is " + m.next(5));
    }
}