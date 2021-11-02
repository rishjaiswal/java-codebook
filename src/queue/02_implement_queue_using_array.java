package queue;

import java.util.*;

class ImplementQueueUsingArray {

    int arr[];
    int capacity;
    int front, rear;

    public ImplementQueueUsingArray(int cap) {
        capacity = cap;
        arr = new int[10];
        front = 0;
        rear = 0;
    }

    public void enqueue(int x) {
        if (rear == capacity) {
            System.out.println("Enqueue Operation overflow has been done in queue for " + x);
            return;
        }
        arr[rear++] = x;
        System.out.println("Enqueue Operation is completed in queue for " + x);
    }


    public int dequeue() {
        if (front == rear) {
            System.out.println("Dequeue Operation empty has been done in queue for ");
            return -1;
        }
        int x = arr[front];
        for (int i = 0; i < rear - 1; i++) {
            arr[i] = arr[i + 1];
        }
        if (rear < capacity)
            arr[rear] = 0;
        rear--;
        return x;

    }

    public int peek() {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int x = arr[front];
        return x;
    }

    public boolean empty() {
        if (front == rear) {
            return true;
        }
        return false;
    }
}