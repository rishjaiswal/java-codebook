/*
https://leetcode.com/problems/sort-colors/
*/


package array;

class SortZeroOneTwo {
    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0, temp = 0;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0: {
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}