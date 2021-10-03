package array;

import array.*;

public class MasterArray {

    public static void main(String args[]) {
        System.out.println("Start execution of the Array programs");
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum is " + KadanesAlogrithm.maxSubArray(nums));
        int[] num_array = {5, 4, -1, 7, 8};
        System.out.println("Maximum subarray sum is " + KadanesAlogrithm.maxSubArray(num_array));
        int[] nums_array = {-2};
        System.out.println("Maximum subarray sum is " + KadanesAlogrithm.maxSubArray(nums_array));
        int[] number_array = {1, 2, 4, 5, 4};
        RepeatAndMissing.printDuplicateMissing(number_array);
        System.out.println("Repeat Number is " + RepeatAndMissing.findDuplicate(number_array));
        System.out.println("Missing Number is " + RepeatAndMissing.findMissing(number_array));
        int[] colors = {0, 1, 2, 1, 0};
        System.out.print("Before Sorting of colors = ");
        for (int i : colors)
            System.out.print(i + " ");
        System.out.println("");
        SortZeroOneTwo.sortColors(colors);
        System.out.print("After Sorting of colors = ");
        for (int i : colors)
            System.out.print(i + " ");
        System.out.println("");
        int[] nums1 = {2, 4, 5, 8, 0, 0, 0, 0, 0};
        int[] nums2 = {1, 3, 6, 7, 9};
        MergeSortedArrays.merge(nums1, nums1.length, nums2, nums2.length);
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.print("Before merge intervals = ");
        for (int i = 0; i < intervals.length; i++) {
            System.out.print("[");
            for (int j = 0; j < intervals[i].length; j++)
                System.out.print(intervals[i][j] + " ");
            System.out.print("]");
        }
        System.out.println("");
        intervals = MergeIntervals.merge(intervals);
        System.out.print("After merge intervals = ");
        for (int i = 0; i < intervals.length; i++) {
            System.out.print("[");
            for (int j = 0; j < intervals[i].length; j++)
                System.out.print(intervals[i][j] + " ");
            System.out.print("]");
        }
        System.out.println("");
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Price after Single Sell is = " + Stock.maxProfit(prices));
        System.out.println("Maximum Price after Maximum Sells are = " + Stock.maxProfitSells(prices));
        System.out.println("Pascal Triangle for number 3  is " + PascalTriangle.generate(3));
        System.out.println("Pascal Triangle for number 5  is " + PascalTriangle.generate(5));
        int[] nums_permutation = {1, 2, 3};
        NextPermutation.nextPermutation(nums_permutation);
        int[] nums_permutation_1 = {3, 2, 1};
        NextPermutation.nextPermutation(nums_permutation_1);
        int[] nums_inversion = {1, 20, 6, 4, 5};
        System.out.println("Number of Inversions using Brute Force Approach is " + InversionArray.getInvCount(nums_inversion));
        System.out.println("Number of Inversions using Optimised Approach is " + InversionArray.getInvCountOptimised(nums_inversion));
        System.out.println("Power of 2 ^ 10 using recursive approach is " + Power.myPowRecursive(2, 10));
        System.out.println("Power of 2 ^ -2 using recursive approach is " + Power.myPowRecursive(2, -2));
        System.out.println("Power of 2 ^ 10 is " + Power.myPow(2, 10));
        System.out.println("Power of 2 ^ -2 is " + Power.myPow(2, -2));
        int[] nums_majority = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element is " + Majority.majorityElement(nums_majority));
        System.out.println("Majority Element using HashMap approach is " + Majority.majorityElementHashMapApproach(nums_majority));
        System.out.println("Majority Element using Optimised approach is " + Majority.majorityElementOptimisedApproach(nums_majority));
        MajorityThree.majorityElement(nums_majority);
        int[] nums_consecutive = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of the longest consecutive elements sequence = " + LongestSequence.longestConsecutive(nums_consecutive));
        int[] nums_one = {1, 1, 0, 1, 1, 1};
        System.out.println("Maximum number of consecutive 1's in the array = " + ConsecutiveOnes.findMaxConsecutiveOnes(nums_one));
        int sub_arr[] = {15, 3, 4, 8, 9, 5, 10, 24};
        int sum = 24;
        System.out.println("Subarray with sum " + sum + " is " + SubArraySum.checkSubArraySum(sub_arr, sum));
        int sub_arr_negative[] = {10, 2, -2, -20, 10};
        int sum_negative = -10;
        System.out.println("Subarray with sum " + sum_negative + " is " + SubArraySum.checkSubArraySumNegative(sub_arr_negative, sum_negative));
        System.out.println("Subarray with count sum is " + SubArrayCountSum.findSubArrayCountSum(sub_arr, sum));
        System.out.println("Subarray with maximum length having sum is " + SubArrayMaximumLengthSum.findMaximumSubarraySum(sub_arr, sum));
    }
}