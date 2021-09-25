/*
https://leetcode.com/problems/pascals-triangle/
*/


package array;

import java.util.*;

class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList();
        List<Integer> a = new ArrayList();
        a.add(1);
        al.add(a);
        int row = 2;
        for (int i = 1; i < numRows; i++) {
            a = new ArrayList();
            List<Integer> pre = al.get(i - 1);
            for (int j = 0; j < row; j++) {
                if (j == 0 || j == row - 1) {
                    a.add(1);
                    continue;
                }
                a.add(pre.get(j) + pre.get(j - 1));
            }
            al.add(a);
            row++;
        }
        return al;
    }
}