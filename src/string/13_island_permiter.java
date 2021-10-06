/*
https://leetcode.com/problems/island-perimeter/
*/

package string;

import java.util.*;

class Island {
    public static int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    res = res + 4;
                    if (i > 0 && grid[i - 1][j] == 1)
                        res = res - 2;
                    if (j > 0 && grid[i][j - 1] == 1)
                        res = res - 2;
                }
            }
        }
        return res;
    }

    public static int islandPerimeterOptimised(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // Since there is exactly one island mentioned in problem statement.
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j);
                }
            }
        }
        return -1;
    }

    public static int dfs(int[][] grid, int i, int j) {
        int x = 0;
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
            return 1;
        if (grid[i][j] == -1)
            return x;
        grid[i][j] = -1;
        x += dfs(grid, i + 1, j);
        x += dfs(grid, i - 1, j);
        x += dfs(grid, i, j + 1);
        x += dfs(grid, i, j - 1);
        return x;
    }
}