/*
 * https://www.geeksforgeeks.org/sort-a-stack-using-recursion/
 */

package recursion;

import java.util.*;

class SortStack {

    // Method to sort stack
    public static void sortStack(Stack<Integer> s) {
        // If stack is not empty
        if (!s.isEmpty()) {
            // Remove the top item
            int x = s.pop();

            // Sort remaining stack
            sortStack(s);

            // Push the top item back in sorted stack
            sortedInsert(s, x);
        }
    }

    // Recursive Method to insert an item x in sorted way
    public static void sortedInsert(Stack<Integer> s, int x) {
        // Base case: Either stack is empty or newly
        // inserted item is greater than top (more than all
        // existing)
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }

        // If top is greater, remove the top item and recur
        int temp = s.pop();
        sortedInsert(s, x);

        // Put back the top item removed earlier
        s.push(temp);
    }

}

/*
 *
 * Time Complexity: O(n2).
In the worst case for every sortstack(), sortedinsert() is called for ‘N’ times recursively for putting element to the right place
* Space Complexity: O(n)
* Use of stack data structure for storing values i.e. for recursive stack space.
 *
 */