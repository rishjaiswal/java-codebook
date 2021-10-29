# Queue

-In a FIFO data structure, the first element added to the queue will be processed first.

1. Enqueue: you can click Enqueue below to see how a new element 6 is added to the queue at the back/tail 
2. Dequeue: you can click Dequeue below to see which element 5 will be removed from front/head
<img src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/05/02/screen-shot-2018-05-02-at-174355.png" alt="Queue" height="100" style="vertical-align:top; margin:40px">


- Queue needs a concrete class for the declaration and the most common classes are the PriorityQueue and LinkedList in Java.
It is to be noted that both the implementations are not thread safe.

// Obj is the type of the object to be stored in Queue
> Queue<Obj> queue = new PriorityQueue<Obj> (); 

// Integer is the type of the object to be stored in Queue
> Queue<Integer> q  = new LinkedList<>();


- PriorityBlockingQueue is one alternative implementation if thread safe implementation is needed.
