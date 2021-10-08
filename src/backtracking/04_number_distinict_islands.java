/*
https://leetcode.com/problems/number-of-distinct-islands/
*/

package backtracking;

import java.util.*;

class IslandDistinctNumber {

    /*
     Time Complexity : O(m*N)
     Space Complexity : 0 (m*n)
     */

    public int numDistinctIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        Set<String> s = new HashSet();
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    s.add(computePath(grid, i, j, "X"));
                }
            }
        }
        return count;
    }

    public String computePath(char[][] grid, int i, int j, String direction) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
            return "O";
        grid[i][j] = '0';
        String down = computePath(grid, i + 1, j, "D");
        String up = computePath(grid, i - 1, j, "U");
        String right = computePath(grid, i, j + 1, "R");
        String left = computePath(grid, i, j - 1, "L");
        return direction + down + up + right + left;
    }
}