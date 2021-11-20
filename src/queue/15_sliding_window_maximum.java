/*
https://leetcode.com/problems/sliding-window-maximum/

You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.
*/

package queue;

import java.util.*;

class Window {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null||nums.length==0)
            return new int[0];

        int n=nums.length;
        int result[]=new int[n-k+1];
        // Deque Data structure used as linked list
        // NOTE : 1. Since Deque is an interface, objects cannot be created of the type deque.
        //        2. We always need a class which extends this list in order to create an object.
        Deque<Integer> d= new LinkedList();
        for(int i=0;i<nums.length;i++)
        {
            //Removing first Element on the basis of peek element i.e. first element
            if(!d.isEmpty() && d.peek()==i-k)
                d.remove();
            // Removing last element if it is smaller than current element i.e. nums[i]
            // so that we can store the peek element as largest element
            while(!d.isEmpty() && nums[d.peekLast()]<=nums[i])
                d.removeLast();
            // Add the indexes in linked list
            d.offer(i);
            // Storing maximum element ( top most element) in sliding window result.
            if(i+1>=k)
            {
                result[i+1-k]=nums[d.peek()];
            }
        }
        return result;
    }
}

/**
 Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 Output: [3,3,5,5,6,7]
 Explanation:
 Window position                Max
 ---------------               -----
 [1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
 */
