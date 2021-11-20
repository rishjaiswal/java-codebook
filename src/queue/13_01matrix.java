/*
https://leetcode.com/explore/learn/card/queue-stack/239/conclusion/1388/
*/

package queue;

import java.util.*;

class Matrix {
    public static int[][] updateMatrix(int[][] mat) {
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==0){
                    q.offer(new Pair(i,j));
                }
                else {
                    mat[i][j]=-1;
                }
            }
        }

        int[][] dirs = {{0,-1}, {0,1},{-1,0}, {1,0}};
        while(!q.isEmpty()){
            Pair p = q.poll();
            // Check-out for all neighbours
            for(int[] dir : dirs)
            {
                int value = mat[p.x][p.y];
                int i = p.x + dir[0];
                int j = p.y + dir[1];
                // Check if neighbours are valid and not visited.
                if (i < 0 || i >= mat.length || j<0 || j >=mat[0].length || mat[i][j] != -1)
                    continue;
                q.offer(new Pair(i,j));
                mat[i][j] = value + 1;
            }
        }
        return mat;
    }
}