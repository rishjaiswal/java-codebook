/*
However, it might bring some undesired penalty to the performance, e.g. duplicate calculations, if we do not use it wisely.
For instance, at the end of the previous chapter, we have encountered the duplicate calculations problem in Pascal's Triangle,
where some intermediate results are calculated multiple times.

We will propose a common technique called memoization that can be used to avoid this problem.

To eliminate the duplicate calculation in the above case, as many of you would have figured out, one of the ideas would be to store
the intermediate results in the cache so that we could reuse them later without re-calculation.
*/


package recursion;

import java.util.*;

class PascalTriangleMemoization {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> al = new ArrayList<>();
        int[][] dp = new int[34][34];

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        for (int j = 0; j <= rowIndex; j++) {
            al.add(getRow(rowIndex, j, dp));
        }
        return al;
    }

    //gets any given cell of pascal triangle
    public static int getRow(int rowIndex, int columnIndex, int[][] dp) {

        if (dp[rowIndex][columnIndex] != -1) {
            return dp[rowIndex][columnIndex];
        }

        if (rowIndex == columnIndex || columnIndex == 0) {
            dp[rowIndex][columnIndex] = 1;
            return dp[rowIndex][columnIndex];
        }

        dp[rowIndex][columnIndex] = getRow(rowIndex - 1, columnIndex - 1, dp) + getRow(rowIndex - 1, columnIndex, dp);
        return dp[rowIndex][columnIndex];
    }
}

