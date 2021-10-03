/*
https://www.geeksforgeeks.org/longest-sub-array-sum-k/
https://www.techiedelight.com/find-maximum-length-sub-array-having-given-sum/
*/

package array;

import java.util.HashMap;

class SubArrayMaximumLengthSum {
    public static int findMaximumSubarraySum(int arr[], int sum) {
        int n = arr.length;
        if (n == 0)
            return 0;
        HashMap<Integer, Integer> hm = new HashMap();
        int count = 0;
        int curr_sum = 0;
        hm.put(0, -1);
        for (int i = 0; i < n; i++) {
            curr_sum += arr[i];
            if (hm.containsKey(curr_sum - sum)) {
                count = Math.max(count, i - hm.get(curr_sum - sum));
            }
            hm.put(curr_sum, i);
        }
        return count;
    }
}