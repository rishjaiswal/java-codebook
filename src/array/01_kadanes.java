/*
https://leetcode.com/problems/maximum-subarray/
*/

package array;

class KadanesAlogrithm {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum > max_sum)
                max_sum = sum;
            if (sum < 0)
                sum = 0;
        }
        return max_sum;
    }
}