/*
 * https://leetcode.com/explore/learn/card/recursion-i/255/recursion-memoization/1662/
 */


package dynamic_programming;

class ClimbingStairs {
    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}