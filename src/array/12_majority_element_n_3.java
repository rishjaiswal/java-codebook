/*
https://leetcode.com/problems/majority-element-ii/
*/


package array;

import java.util.*;

class MajorityThree {
    public static void majorityElement(int[] nums) {
        List<Integer> result = new ArrayList();

        if (nums.length == 0)
            return;
        if (nums.length == 1) {
            System.out.println("Majority Element n/3 time is = " + nums[0]);
            return;
        }

        int count1 = 0;
        int count2 = 0;
        int candidate1 = Integer.MIN_VALUE;
        int candidate2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (candidate1 == n)
                count1++;
            else if (candidate2 == n)
                count2++;
            else if (count1 == 0) {
                candidate1 = n;
                count1++;
            } else if (count2 == 0) {
                candidate2 = n;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int n : nums) {
            if (n == candidate1) count1++;
            if (n == candidate2) count2++;
        }

        int n = nums.length;
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        System.out.print("Majority Elements having n/3 are = ");
        for (int a : result) {
            System.out.print(a + " ");
        }
        System.out.println(" ");
    }
}