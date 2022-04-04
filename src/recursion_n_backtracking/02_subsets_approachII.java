package recursion_n_backtracking;

import java.util.*;

class SubsetsApproachII {

    /*

    https://leetcode.com/problems/subsets/

    Clarifying questions :-

    1.No need to maintain order

    Ordered :[[], [1], [2], [3], [1, 2], [1, 3], [2, 3], [1, 2, 3]]
    Unordered : [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]

     */


    public static void printSubsets(int[] nums) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        helper(0,new ArrayList<Integer>(), al, nums);
        System.out.println(al);

    }

    /*
    DFS Approach
     */
    public static void helper(int index, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> al, int[] nums) {
        al.add(new ArrayList(curr));
        for (int i = index; i < nums.length; i++) {
            // add i into the current combination
            curr.add(nums[i]);
            // use next integers to complete the combination
            helper( i+1, curr, al, nums);
            // backtrack
            curr.remove(curr.size() - 1);
        }

    }

    /*

    Time Complexity : O(N×2  N  ) to generate all subsets and then copy them into output list.
    Space Complexity : O(N). We are using  O ( N ) O(N) space to maintain curr


    Runtime: 1 ms,
    Memory Usage: 43.5 MB

    */

    /* Visualization

    helper(0)

    []  curr [1]

    helper-1 - [1]  curr[1,2]
    helper-2 - [1,2] curr[1,2,3]
    helper-3 - [1,2,3] exit

    helper-2 - curr [1,2]
    helper-1-  curr [1]

    helper(1)

     */
}