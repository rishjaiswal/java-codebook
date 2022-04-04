package recursion_n_backtracking;

import java.util.*;

class SubsetsII {

    /*
    https://leetcode.com/problems/subsets-ii/

    Clarifying questions :-

    1.  Do we need unique subsets in case of {1,1,2,3} or not ?

    Answer :
    The solution set must not contain duplicate subsets. Return the solution in any order.


     */

    public static void printsubsetsWithDup(int[] nums) {
        ArrayList<ArrayList<Integer>> al = new ArrayList();
        Arrays.sort(nums);
        helper(0, new ArrayList<Integer>(), al, nums);
        System.out.println(al);

    }

    /*
    DFS Approach
     */

    public static void helper(int index, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> al, int[] nums) {
        al.add(new ArrayList(curr));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1])
                continue;
            curr.add(nums[i]);
            helper(i + 1, curr, al, nums);
            curr.remove(curr.size() - 1);
        }
    }
}