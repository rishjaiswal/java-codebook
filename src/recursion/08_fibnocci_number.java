/*
 * https://leetcode.com/explore/learn/card/recursion-i/255/recursion-memoization/1661/
 */


package recursion;


class Fibnocci {
    public static int fib(int n) {
        // Base Case
        if ( n <=1 )
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static int fibMemoization(int n) {
        int fib[] = new int[n+1];
        fib_helper(n,fib);
        return fib[n];
    }

    public static int fib_helper(int n , int[] fib){
        if(n <=1 ) {
            fib[n] = n;
            return fib[n] ;
        }
        fib[n] = fib_helper(n-1, fib) + fib_helper(n-2, fib) ;
        return fib[n];
    }
}