/*
https://leetcode.com/problems/merge-intervals/
*/


package array;

import java.util.*;

class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0 || intervals.length == 1)
            return intervals;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int k = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[k][1] >= intervals[i][0]) {
                intervals[k][1] = Math.max(intervals[i][1], intervals[k][1]);
            } else {
                ++k;
                intervals[k][0] = intervals[i][0];
                intervals[k][1] = intervals[i][1];
            }
        }
        return Arrays.copyOf(intervals, k + 1);
    }
}