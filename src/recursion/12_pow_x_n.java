/*
 * https://leetcode.com/explore/learn/card/recursion-i/256/complexity-analysis/2380/
 */


package recursion;

class Power {
    public static double myPow(double x, int n) {
        // Base Case
        if (n == 0)
            return 1;
        // Memoization
        double faith = myPow(x, n / 2);
        double ans = faith * faith;
        if (n % 2 == -1)
            ans *= 1 / x;
        else if (n % 2 == 1)
            ans *= x;
        return ans;
    }
}