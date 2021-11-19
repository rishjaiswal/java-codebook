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

package backtracking;

class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor)
            return image;
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    public static void fill(int[][] image, int i, int j, int color, int newColor) {
        /*
        1. Start at the initial click and continuously change the current pixel to the new color
        if the current cell is equal to the initial starting color.
        2. We are doing through a standard dfs, checking if we are within the bounds of the array and if the current
        cell matches the starting color.
        3. If both these checks pass, we set the current cell to the new color and continue traversing its neighbors.
         */
        if (i < 0 || i >= image.length || j < 0 || j >= image[i].length || image[i][j] != color)
            return;
        image[i][j] = newColor;
        fill(image, i + 1, j, color, newColor);
        fill(image, i - 1, j, color, newColor);
        fill(image, i, j + 1, color, newColor);
        fill(image, i, j - 1, color, newColor);
    }
}