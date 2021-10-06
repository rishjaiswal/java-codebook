/*
https://leetcode.com/problems/excel-sheet-column-number/
*/

package string;

import java.util.*;

class Excel {
    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i =0; i<columnTitle.length(); i++)
            result = result*26 +(columnTitle.toLowerCase().charAt(i)-'a'+1);

        return result;
    }
}