/*
https://leetcode.com/problems/rotting-oranges/

You are given an m x n grid where each cell can have one of three values:

0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange.
If this is impossible, return -1.
 */

package queue;

import java.util.*;

class Oranges {
    public static int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        int days = 0;
        int count_fresh = 0;
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // Put the position of all rotten oranges in queue
                if (grid[i][j] == 2)
                    q.offer(new Pair(i, j));
                // Count the number of fresh oranges
                if (grid[i][j] == 1)
                    count_fresh++;
            }
        }
        if (count_fresh == 0)
            return 0;

        int[][] dirs = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        int count= 0;

        while (!q.isEmpty()) {
            // increment day
            count++;
            int size = q.size();
            // Check for single day - all possibilities for rotten oranges
            for (int l = 0; l < size; l++) {
                Pair p = q.poll();
                // Check-out for all neighbours
                for (int[] dir : dirs) {
                    int value = grid[p.x][p.y];
                    int i = p.x + dir[0];
                    int j = p.y + dir[1];
                    // Check if neighbours are valid and orange is fresh or not
                    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || grid[i][j] == 2)
                        continue;
                    grid[i][j] = 2;
                    q.offer(new Pair(i, j));
                    count_fresh--;
                }
            }
            if (count_fresh == 0)
                return count;
        }
        return count_fresh == 0 ? count : -1;
    }
}

/**
 *
 Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
 Output: 4

 NOTE :
 1. The BFS Strategy prioritizes the breadth over depth (wider before it goes deeper).
 On the other hand, the DFS strategy prioritizes depth over breadth.

 2. These strategies tell us, with DFS, we usually process one single node at each step,
 while in BFS, we could process multiple clusters of nodes. Imagine several rotten oranges are distributed in
 different corners in the grid;

 3. We know that rotten oranges will contaminate their neighbors first before
 the contamination propagates to other fresh oranges. With BFS, at each step (iteration),
 we can figure out all the oranges that would be contaminated in the next round (minute).

Intiution :

 We want to check the neighbors for the rotten oranges. We can think of checking one single unit of the
 top, down, left, and right from each rotten orange coordination until it reaches the farthest fresh oranges.
 With the BFS (queue) idea, we can find all the fresh oranges going to get contaminated.

 Complexity:
 The time complexity is O(N), where N is the size of the grid. First, we scan the grid to get the queue’s initial values,
 which would take O(N) time. With the BFS process, the worst case would run through all the grid cells once and only once, O(N).
 The overall time complexity would be O(N) +O(N)=O(N)

 The space complexity is O(N), where N is the size of the grid. In the worst case, the grid is filled with rotten oranges.
 As a result, the queue would be initialized with all the cells in the grid.
 As a result, the queue would be initialized with all the cells in the grid.


 */