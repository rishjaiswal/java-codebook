/*
http://buttercola.blogspot.com/2015/09/leetcode-walls-and-gates.html
 */

package queue;

import java.util.*;

class Gates {
    /***
     *
     * You are given a m x n 2D grid initialized with these three possible values.
     * -1 - A wall or an obstacle.
     * 0 - A gate.
     * INF - Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF
     * as you may assume that the distance to a gate is less than 2147483647.
     *
     *
     * Fill each empty room with the distance to its nearest gate.
     * `If it is impossible to reach a gate, it should be filled with INF.
     *
     * For example, given the 2D grid:
     * INF  -1  0  INF
     * INF INF INF  -1
     * INF  -1 INF  -1
     *   0  -1 INF INF
     *
     * After running your function, the 2D grid should be:
     *   3  -1   0   1
     *   2   2   1  -1
     *   1  -1   2  -1
     *   0  -1   3   4
     *
     *   It is very classic backtracking problem. We can start from each gate (0 point),
     *   and searching for its neighbors
     */
    public void wallsAndGates(int[][] rooms) {
        /*
        Please refer DFS approach on backtracking package having 09_walls_and_gates.java
         */
        if (rooms == null || rooms.length == 0) {
            return;
        }

        int m = rooms.length;
        int n = rooms[0].length;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rooms[i][j] == 0) {
                    wallsAndGatesHelper(i, j, 0, rooms, queue);
                }
            }
        }
    }

    private void wallsAndGatesHelper(int row, int col, int distance, int[][] rooms, Queue<Integer> queue) {
        fill(row, col, distance, rooms, queue);

        int m = rooms.length;
        int n = rooms[0].length;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cord = queue.poll();
                int x = cord / n;
                int y = cord % n;

                fill(x - 1, y, distance + 1, rooms, queue);
                fill(x + 1, y, distance + 1, rooms, queue);
                fill(x, y - 1, distance + 1, rooms, queue);
                fill(x, y + 1, distance + 1, rooms, queue);

            }
            distance++;
        }
    }

    private void fill(int row, int col, int distance, int[][] rooms, Queue<Integer> queue) {
        int m = rooms.length;
        int n = rooms[0].length;

        if (row < 0 || row >= m || col < 0 || col >= n || rooms[row][col] == -1 || rooms[row][col] < distance) {
            return;
        }
        rooms[row][col] = distance;
        int cord = row * n + col;
        queue.offer(cord);
    }
}