package recursion_n_backtracking;

import java.util.*;

class PermuatationsII {

    /*
    https://leetcode.com/problems/permutations-ii/
    Clarifying questions :-

     1. Will array contains duplicate or distinct only.?

     Answer : It might contain duplicates, return all possible unique permutations in any order.

     */

    static HashSet<List<Integer>> set = new HashSet<>();

    public static void permuteUnique(int[] nums) {
        boolean used[] = new boolean[nums.length];
        permute(new ArrayList<Integer>(), nums, used);
        System.out.println(new ArrayList(set));
    }

    public static void permute(List<Integer> permutation, int[] nums, boolean used[]) {

        if (permutation.size() == nums.length) {
            set.add(new ArrayList<Integer>(permutation));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] == true)
                continue;
            permutation.add(nums[i]);
            used[i] = true;
            permute(permutation, nums, used);
            permutation.remove(permutation.size() - 1);
            used[i] = false;
        }

    }
}

