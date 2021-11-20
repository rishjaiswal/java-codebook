/*
https://www.geeksforgeeks.org/next-smaller-element/

Given an array, print the Next Smaller Element (NSE) for every element.
the NSE for an element x is the first smaller element on the right side of x in array.
Elements for which no smaller element exist (on right side), consider NSE as -1.
*/

package stack;

import java.util.*;

class NextSmaller {
    public static int[] getNSE(int nums[])
    {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; --i) {
            while (!stack.empty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            res[i] = stack.empty() ? -1 : nums[stack.peek()];
            stack.push(i);
        }
        return res;
    }
}