/*
https://leetcode.com/problems/largest-number/
*/

package string;

import java.util.Arrays;
import java.util.Comparator;

class Largest {
    public static String largestNumber(int[] nums) {
        // Get input integers as strings.
        String[] asStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            //asStrs[i] = String.valueOf(nums[i]);
            asStrs[i] = Integer.toString(nums[i]);
        }

        // Sort strings according to custom comparator.
        // Once the array is sorted, the most "signficant" number will be at the front
        Arrays.sort(asStrs, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        String order1 = o1 + o2;
                        String order2 = o2 + o1 ;
                        return order2.compareTo(order1);
                    }
                });

                // If, after being sorted, the largest number is `0`, the entire number
                // is zero.
        if (asStrs[0].equals("0")) {
            return "0";
        }

        // Build largest number from sorted array.
        String largestNumberStr = new String();
        for (String numAsStr : asStrs) {
            largestNumberStr += numAsStr;
        }

        return largestNumberStr;
    }
}

/*

Time complexity :
O(nlgn)

Although we are doing extra work in our comparator, it is only by a constant factor.
Therefore, the overall runtime is dominated by the complexity of sort, which is O(nlgn)

Space complexity :
O(n)

 */