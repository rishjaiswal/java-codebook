package queue;

import java.util.*;

class MovingAverage {
    private Queue<Integer> q;
    private int maxsize;
    private double sum;
    public MovingAverage(int size){
        q = new LinkedList<Integer>();
        maxsize = size;
        sum = 0.0;
    }

    public double next(int value){
        if(q.size() == maxsize){
            sum = sum - q.remove();
        }
        q.add(value);
        sum = sum + value;
        return sum / q.size();
    }
}