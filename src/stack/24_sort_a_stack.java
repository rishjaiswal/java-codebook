/*
https://www.geeksforgeeks.org/sort-stack-using-temporary-stack/

Given an array, print the Next Smaller Element (NSE) for every element.
the NSE for an element x is the first smaller element on the right side of x in array.
Elements for which no smaller element exist (on right side), consider NSE as -1.
*/

package stack;

import java.util.*;

class SortStack {
    // This function return the sorted stack
    public static Stack<Integer> sortstack(Stack<Integer> input) {

        Stack<Integer> tmpStack = new Stack<Integer>();
        while (!input.isEmpty()) {
            // pop out the first element
            int tmp = input.pop();

            // while temporary stack is not empty and
            // top of stack is greater than temp
            while (!tmpStack.isEmpty() && tmpStack.peek()
                    > tmp) {
                // pop from temporary stack and
                // push it to the input stack
                input.push(tmpStack.pop());
            }

            // push temp in temporary of stack
            tmpStack.push(tmp);
        }
        return tmpStack;
    }
}