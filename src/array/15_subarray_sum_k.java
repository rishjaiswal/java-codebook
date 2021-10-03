/*
https://www.geeksforgeeks.org/find-subarray-with-given-sum-in-array-of-integers/
*/

package array;

import java.util.*;

class SubArraySum {
    public static boolean checkSubArraySum(int arr[], int sum) {
        int n = arr.length;
        if (n == 0)
            return false;
        int curr_sum = arr[0];
        int start = 0;
        int end = 0;
        for (int i = 1; i < n; i++) {
            if (sum < curr_sum && i - 1 > start) {
                curr_sum = curr_sum - arr[start];
                start = start + 1;
            }
            if (curr_sum == sum) {
                end = i - 1;
                System.out.println(
                        "Sum found between indexes " + start
                                + " and " + end);
                return true;
            }
            // Add this element to curr_sum
            if (i < n)
                curr_sum = curr_sum + arr[i];
        }
        System.out.println("No subarray found");
        return false;
    }

    public static boolean checkSubArraySumNegative(int arr[], int sum) {
        int n = arr.length;
        if (n == 0)
            return false;
        HashMap<Integer, Integer> hm = new HashMap();
        hm.put(0, -1);
        int curr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            curr_sum = curr_sum + arr[i];
            /* Either code hm.put(0,-1) or below block of code
            if (curr_sum - sum == 0) {
                System.out.println(
                        "Sum found between indexes " + 0
                                + " and " + i );
                return true;
            }
             */
            if (hm.containsKey(curr_sum - sum)) {
                System.out.println(
                        "Sum found between indexes " + (hm.get(curr_sum - sum) + 1)
                                + " and " + i);
                return true;
            } else
                hm.put(curr_sum, i);
        }
        System.out.println("No subarray found");
        return false;
    }
}