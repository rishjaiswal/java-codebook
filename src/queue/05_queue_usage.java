package queue;

import java.util.*;

class QueueUsage {

    public static void main(String args[]) {
        /*
         remove() and poll() methods differ only in their behavior when the queue is empty:
         the remove() method throws an exception, while the poll() method returns null.

         Similarly is for peek() and element().

         The offer method inserts an element if possible, otherwise returning false.
         This differs from the Collection.add method, which can fail to add an element only by throwing an unchecked exception.
         */

        Queue<Integer> q = new LinkedList();
        // 2. Get the first element - return null if queue is empty.
        System.out.println("The first element is: " + q.peek());
        //System.out.println("The first element is: " + q.element());
        // 3. Push new element.
        q.offer(5);
        q.offer(13);
        q.offer(8);
        q.offer(6);
        q.add(10);
        // 4. Pop an element.
        q.poll();
        q.remove();
        // 5. Get the first element.
        System.out.println("The first element using peek() is: " + q.peek());
        System.out.println("The first element using element() is: " + q.element());
        // 7. Get the size of the queue.
        System.out.println("The size is: " + q.size());
    }
}