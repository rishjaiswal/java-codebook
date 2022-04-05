package recursion_n_backtracking;

import java.util.*;

class PermuatationsDuplicate {

    /*
    https://leetcode.com/problems/permutations-ii/
    Clarifying questions :-

     1. Will array contains duplicate or distinct only.?

     Answer : It might contain duplicates, return all possible permutations in any order.
     Need not to have unique

     */

    public static void permuteDuplicate(int[] nums) {
        List<List<Integer>> al = new ArrayList();
        boolean[] used = new boolean[nums.length];
        helper(al, nums, new ArrayList(), used);
        System.out.println(al);
    }

    public static void helper(List<List<Integer>> al, int[] nums, List<Integer> current, boolean[] used) {
        if (current.size() == nums.length) {
            al.add(new ArrayList(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] == true)
                continue;
            current.add(nums[i]);
            used[i] = true;
            helper(al, nums, current, used);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }


}
