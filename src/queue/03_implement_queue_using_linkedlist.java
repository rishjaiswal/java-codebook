package queue;

class LinkedListNode {
    int data;
    LinkedListNode next;

    LinkedListNode(int d) {
        data = d;
        next = null;
    }
}


class ImplementQueueUsingLL {
    LinkedListNode rear;
    LinkedListNode front;
    int length;

    ImplementQueueUsingLL() {
        front = null;
        rear = null;
        length = 0;
    }

    /**
     * Insert an element into the queue.
     */
    public void enQueue(int x) {
        LinkedListNode curr = new LinkedListNode(x);
        if (rear == null) {
            front = curr;
            rear = curr;
            return;
        }
        rear.next = curr;
        rear = curr;
    }


    /**
     * Delete an element from the queue.
     */
    public int deQueue() {
        if (front == null) {
            return -1;
        }
        int x = front.data;
        front = front.next;
        // If front becomes NULL, then change rear also as NULL
        if (front == null)
            rear = null;
        return x;

    }

    /**
     * Get the front item from the queue.
     */
    public int peek() {
        return front.data;
    }

    /**
     * Checks whether the queue is empty or not.
     */
    public boolean isEmpty() {
        return front == null;
    }
}