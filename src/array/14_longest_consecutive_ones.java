/*
https://leetcode.com/problems/max-consecutive-ones/
*/

package array;

class ConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int begin = 0;
        int end = 0;
        int result = 0;

        while (end < nums.length) {
            if (nums[end] == 1) {
                result = Math.max(result, end - begin + 1);
                end++;
            } else {
                begin = end; // Since we hit a '0', move start pointer to end and increment both so new window starts from '1'
                begin++;
                end++;
            }
        }
        return result;
    }
}
