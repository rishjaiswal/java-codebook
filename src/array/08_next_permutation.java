/*
https://leetcode.com/problems/next-permutation/
*/
package array;

import java.util.*;

class NextPermutation {
    public static void nextPermutation(int[] nums) {
        System.out.print("Before permuations = ");
        for (int i : nums)
            System.out.print(i + " ");
        System.out.println("");

        // Base Condition
        if (nums.length <= 1)
            return;
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
        System.out.print("After permuations = ");
        for (int j : nums)
            System.out.print(j + " ");
        System.out.println("");

    }

    public static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}