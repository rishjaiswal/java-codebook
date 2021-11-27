/*
 * https://leetcode.com/explore/learn/card/recursion-i/255/recursion-memoization/1662/
 */


package recursion;

class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n==1 || n==2)
            return n;
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public static int climbStairsMemoization(int n) {
        int climb[] = new int[n + 1];
        return climbhelper(n, climb);
    }

    public static int climbhelper(int n, int[] climb) {
        // To avoid calculation again.
        if(climb[n] > 0) {
            return climb[n];
        }
        // Base Case
        if(n<=2) {
            climb[n] = n;
            return climb[n];
        }
        climb[n] = climbhelper(n-1,climb) + climbhelper(n-2,climb);
        return climb[n];
    }
}