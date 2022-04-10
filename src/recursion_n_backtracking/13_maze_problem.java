package recursion_n_backtracking;

import java.util.*;

class Maze {
    /*
    https://www.geeksforgeeks.org/rat-in-a-maze-problem-when-movement-in-all-possible-directions-is-allowed/

    Clarifying questions :-

    1. Position Source can be at Top or Bottom in grid ?
       Assumption it always pe a top (0,0)

    2. Are there any places where rat cannot go ?
        YES. Gray blocks are dead ends (value = 0).
     */

    public static ArrayList<String> findPath(int[][] m) {
        ArrayList<String> res = new ArrayList<>();
        int n = m.length;
        // dx, dy will be used to follow `DLRU` exploring approach
        // which is lexicographically sorted order
        int[] dx = { 1,  0, 0, -1 };
        int[] dy = { 0, -1, 1,  0 };
        if (m[0][0] == 1) {   // Assumption it always pe a top
            m[0][0]=2;
            findPathHelper(m, n, 0, 0, dx, dy, "",res);
        }
        return res;
    }

    private static void findPathHelper(int[][] m, int n, int x, int y, int[] dx, int[] dy, String path,ArrayList<String> res) {
        if (x == n - 1 && y == n - 1) {
            res.add(path);
            return;
        }
        String dir = "DLRU";
        for (int i = 0; i < 4; i++) {
            int row = x + dx[i];
            int col = y + dy[i];
            if (row >=0  && row < n && col >= 0 && col < n && m[row][col] == 1) {
                m[row][col]=2; // used to track visited cells of matrix
                findPathHelper(m, n, row, col, dx, dy, path + dir.charAt(i),res);
                m[row][col]=1; // mark it unvisited yet explorable
            }

        }
    }

    /*
    Instead of maintaining visited matrix, we can modify the given matrix to treat it as visited matrix.!!

    ### Complexity Analysis:

    Time Complexity: O(3^(n^2)).
    Space Complexity: O(1); Since we are not using visited matrix.

     */
}