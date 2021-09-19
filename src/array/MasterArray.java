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
    }
}