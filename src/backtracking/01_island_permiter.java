/*
https://leetcode.com/problems/island-perimeter/
*/

package backtracking;

class Island {
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