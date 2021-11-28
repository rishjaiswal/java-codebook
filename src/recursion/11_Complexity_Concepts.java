package recursion;

class Complexity{

    /**
     * Time Complexity :
     Given a recursion algorithm, its time complexity
     O(T) is typically the product of the number of recursion invocations (denoted as R)
     and the time complexity of calculation (denoted as O(s)) that incurs along with each recursion call: O(T)=R∗O(s)

     * Space Complexity :
     There are mainly two parts of the space consumption that one should bear in mind when
     calculating the space complexity of a recursive algorithm: recursion related and non-recursion related space.

         a) Recursion Related Space
         The recursion related space refers to the memory cost that is incurred directly by the recursion,
         i.e. the stack to keep track of recursive function calls.

         a) The returning address of the function call. Once the function call is completed, the program must know where to return to, i.e. the line of code after the function call.
         b) The parameters that are passed to the function call.
         c) The local variables within the function call.


         b) Non-Recursion Related Space
         the non-recursion related space refers to the memory space that is not directly related to recursion,
         which typically includes the space (normally in heap) that is allocated for the global variables.

     Please refer below examples for Time and Space Complexity :-
     */


    /**
     * Example - 1
     * printReverse(str) = printReverse(str[1...n]) + print(str[0])
     *
     * Time Complexity :
     * To sum up, the overall time complexity of our recursive function printReverse(str) would be
     * O(printReverse)=n∗O(1)=O(n).
     *
     * Since At the end of each recursion, we simply print the leading character,
     * therefore the time complexity of this particular operation is constant, i.e.O(1).
     *
     * Space Complexity :
     *  We don't have extra memory usage outside the recursive call, since we simply print a character.
     *  For each recursive call, let's assume it can use space up to a constant value.
     *  And the recursive calls will chain up to n times, where n is the size of the input string.
     *  So the space complexity of this recursive algorithm is O(n).
     *
     */

    /**
     * Example - 2
     * f(n) = f(n-1) + f(n-2)
     *
     * The execution tree of a recursive function would form an n-ary tree,
     * with n as the number of times recursion appears in the recurrence relation.
     * For instance, the execution of the Fibonacci function would form a binary tree,
     *
     * Time Complexity :
     * a full binary tree with n levels, the total number of nodes would be 2 pow n  −1.
     * As a result, we can estimate that the time complexity for f(n) would be o(2 pow n)
     *
     * Space Complexity :  Recursive calls : o(n)
     * We only care about how many stack frames there are at a time. Once a function returns,
     * it's no longer using stack space. Put another way, you want the length of the longest chain of recursive calls.
     *
     *
     *
     * Second Approach : Using Memoization
     * Caching and reusing the intermediate results, memoization can greatly reduce the number of recursion calls,
     * i.e. reducing the number of branches in the execution tree.
     *
     * the Fibonacci number f(n) would depend on all n-1 precedent Fibonacci numbers. As a result, the recursion to
     * calculate f(n) would be invoked n-1 times to calculate all the precedent numbers that it depends on.
     *
     *  Time Complexity : O(1)∗n=O(n).
     *  Memoization not only optimizes the time complexity of algorithm, but also simplifies the calculation of time complexity.
     *
     *
     *  Space Complexity :  Each value in fib will be calculated only once, so your space complexity will be o(n),
     *  where n is the input number to fib (the memoization array will hold n numbers).
     *
     *  Recursive calls : o(n)
     *
     *  NOTE: Recursive algorithm with memoization to solve the Fibonacci number problem, we used a map to keep track of all intermediate
     *  Fibonacci numbers that occurred during the recursive calls.
     *  Therefore, in the space complexity analysis, we must take the space cost incurred by the memoization into consideration.
     */


}

