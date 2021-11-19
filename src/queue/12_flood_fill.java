/*
https://leetcode.com/explore/learn/card/queue-stack/239/conclusion/1393/
An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
You are also given three integers sr, sc, and newColor.
You should perform a flood fill on the image starting from the pixel image[sr][sc].


To perform a flood fill, consider the starting pixel, plus any pixels connected
4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected
4-directionally to those pixels (also with the same color), and so on.
Replace the color of all of the aforementioned pixels with newColor.

*/

package queue;

import java.util.*;

class FloodFill {
    public static int[][] floodFill_dfs(int[][] image, int sr, int sc, int newColor) {
        /*
        Please refer DFS approach on backtracking package as well having 10_flood_fill.java
        */
        if (image[sr][sc] == newColor)
            return image;
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    public static void fill(int[][] image, int i, int j, int color, int newColor) {
        if (i < 0 || i >= image.length || j < 0 || j >= image[i].length || image[i][j] != color)
            return;
        image[i][j] = newColor;
        fill(image, i + 1, j, color, newColor);
        fill(image, i - 1, j, color, newColor);
        fill(image, i, j + 1, color, newColor);
        fill(image, i, j - 1, color, newColor);
    }

    public static int[][] floodFill_bfs(int[][] image, int sr, int sc, int newColor) {
        /*
         Solution would be complex using Queue.
         */
        int color = image[sr][sc];
        if (image[sr][sc] == newColor)
            return image;
        Queue<Pair> q = new LinkedList<>();
        int[][] dirs = {{0,-1}, {0,1},{-1,0}, {1,0}};
        q.offer(new Pair(sr,sc));
        while(!q.isEmpty()){
            Pair p = q.poll();
            image[p.x][p.y]= newColor;
            for(int[] dir : dirs)
            {
                int i = p.x + dir[0];
                int j = p.y + dir[1];
                if (i < 0 || i >= image.length || j < 0 || j >= image[i].length || image[i][j] != color)
                    continue;
                q.offer(new Pair(i,j));
            }
        }
        return image;
    }
}

class Pair {
    int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}