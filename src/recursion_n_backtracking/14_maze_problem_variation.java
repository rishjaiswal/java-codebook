package recursion_n_backtracking;

import java.util.*;

class MazeII {
    /*
    https://www.educative.io/edpresso/what-is-the-maze-problem
    A rat starts at a position (source) and can only move in two directions:

    a. Forward
    b. Down

    The goal is to reach the destination.

    https://www.geeksforgeeks.org/rat-in-a-maze-backtracking-2/

    Clarifying questions :-

    1. Position Source can be at Top or Bottom in grid ?

    2. Are there any places where rat cannot go ?
       YES. Gray blocks are dead ends (value = 0).
    */
    public static void solveMaze(int maze[][]) {
        int N = maze.length;

        int sol[][] = new int[N][N];

        if (solveMazeUtil(maze, 0, 0, sol, N) == false) {
            System.out.print("Solution doesn't exist");
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(
                        " " + sol[i][j] + " ");
            System.out.println();
        }
    }

    public static boolean solveMazeUtil(int maze[][], int x, int y,
                                        int sol[][], int N) {
        // if (x, y is goal) return true
        if (x == N - 1 && y == N - 1
                && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // Check if maze[x][y] is valid
        if (x >= 0 && x < N && y >= 0
                && y < N && maze[x][y] == 1) {
            // mark x, y as part of solution path
            sol[x][y] = 1;

            /* Move forward in x direction */
            if (solveMazeUtil(maze, x + 1, y, sol, N))
                return true;

            /* If moving in x direction doesn't give
            solution then Move down in y direction */
            if (solveMazeUtil(maze, x, y + 1, sol, N))
                return true;

            /* If none of the above movements works then
            BACKTRACK: unmark x, y as part of solution
            path */
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    /*

    Time Complexity: O(2^(n^2)).
        The recursion can run upper-bound 2^(n^2) times.

    Space Complexity: O(n^2).
        Output matrix is required so an extra space of size n*n is needed.
     */
}