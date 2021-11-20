package queue;

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
        String target = "0202";
        String deadends[] = {"0201", "0101", "0102", "1212", "2002"};
        System.out.println("Minimum total number of turns required to open the lock : " + Lock.openLock(deadends, target));
        System.out.println("Number of ways for perfect squares for number 9 are : " + PerfectSquare.numSquares(9));
        System.out.println("Number of ways for perfect squares for number 7 are : " + PerfectSquare.numSquares(7));
        System.out.println("Number of ways for perfect squares for number 8 are : " + PerfectSquare.numSquares(8));
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        System.out.println("New color for image is " + FloodFill.floodFill_dfs(image, 1, 1, 55)[1][1]);
    }
}
