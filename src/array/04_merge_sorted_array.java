/*
https://leetcode.com/problems/merge-sorted-array/
*/


package array;

class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m - 1;
        int i = m - n - 1;
        int j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        while (i >= 0) {
            nums1[k--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        System.out.print("Array after two arrays merge = ");
        for (int l = 0; l < m; l++)
            System.out.print(nums1[l] + " ");
        System.out.println("");
    }
}