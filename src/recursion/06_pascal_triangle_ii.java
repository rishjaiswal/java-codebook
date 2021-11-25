/*
 * https://leetcode.com/explore/learn/card/recursion-i/251/scenario-i-recurrence-relation/3234/
 */


package recursion;

import java.util.*;

class PascalTriangle {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> al = new ArrayList<>();
        //we need all the cells of a given row, for eg if row is 4, we need all 4 cells of that row
        //get row is recursive function which needs row index and column index and it can give the corrsponding  cell value
        for (int j = 0; j <= rowIndex; j++) {
            al.add(getRow(rowIndex, j));
        }
        return al;
    }

    //gets any given cell of pascal triangle
    public static int getRow(int rowIndex, int columnIndex) {

        if (rowIndex == columnIndex) {
            return 1;
        }

        if (columnIndex == 0) {
            return 1;
        }
        return getRow(rowIndex - 1, columnIndex - 1) + getRow(rowIndex - 1, columnIndex);
    }

}