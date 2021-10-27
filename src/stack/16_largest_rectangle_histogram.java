/*
https://leetcode.com/problems/largest-rectangle-in-histogram/
*/


package stack;

import java.util.Stack;

class LargestRectangle {
    public static int largestRectangleArea(int[] heights) {
        int size = heights.length;
        if (size == 0)
            return 0;
        if (size == 1)
            return heights[0];
        Stack<Integer> S = new Stack();
        int maxArea = Integer.MIN_VALUE;
        S.push(0); //adding the first index
        for (int i = 1; i < size; i++) {
            if (heights[i] >= S.peek())
                S.push(i);
            else {
                while (!S.isEmpty() && heights[S.peek()] > heights[i]) {
                    int curr = heights[S.pop()];
                    if (S.isEmpty())
                        maxArea = Math.max(maxArea, curr * i);
                    else {
                        maxArea = Math.max(maxArea, curr * (i - S.peek() - 1));
                    }
                }
                S.push(i);
            }
        }

        if (!S.isEmpty()) {
            int i = size;
            while (!S.isEmpty()) {
                int curr = heights[S.pop()];
                if (S.isEmpty())
                    maxArea = Math.max(maxArea, curr * i);
                else
                    maxArea = Math.max(maxArea, curr * (i - S.peek() - 1));
            }
        }
        return maxArea;
    }
    /*
    1.Create a stack S and add the first index of the arr into S.
    2.Iterate through the array arr and compare the height at the corresponding indices.
    3.If the height is greater or equal to the arr[S.peek()], we can add those indices to the stack.
    4.Else if the height is smaller, we will pop the indices until this condition is met arr[S.peek()] ≤ arr[currentIndex] or the stack becomes empty.
    5.For each popping of the index, we will calculate the area of the largest rectangle possible with the corresponding height taken into account.
    6.We will compare the area with the global max and will update global max if this area is greater.
    7.We will use the formula of width as i (current position where we will push the new data) if the stack is empty and [i-S.peek()-1] is the stack is not empty.
    */
}