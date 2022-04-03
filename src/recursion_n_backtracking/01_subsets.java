package recursion_n_backtracking;

import java.util.*;

class Subsets {

    /*

    https://leetcode.com/problems/subsets/

    Clarifying questions :-

    1. Subsets to find for Integer or Character ?
    2. Do we need unique subsets in case of {1,1,2,3} or not ?
    3. Clarify method signature return subsets or print subsets

     */


    public static void printSubsets(int[] nums) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        int n = nums.length;
        for (int k = 0; k < n + 1; ++k) {
            helper(0, k, new ArrayList<Integer>(), al, nums);
        }
        System.out.println(al);

    }

    public static void helper(int first, int last, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> al, int[] nums) {
        // if the combination is done
        if (curr.size() == last) {
            al.add(new ArrayList(curr));
            return;
        }
        for (int i = first; i < nums.length; ++i) {
            // add i into the current combination
            curr.add(nums[i]);
            // use next integers to complete the combination
            helper(i + 1, last, curr, al, nums);
            // backtrack
            curr.remove(curr.size() - 1);
        }

    }

    /*

    Time Complexity : O(N×2  N  ) to generate all subsets and then copy them into output list.
    Space Complexity : O(N). We are using  O ( N ) O(N) space to maintain curr, and are …

     */
}