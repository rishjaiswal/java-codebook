package recursion_n_backtracking;

import java.util.*;

class Permuatations {

    /*
    https://leetcode.com/problems/permutations/

    Clarifying questions :-

    1. Subsets to find for Integer or Character ?
    2. Will array contains duplicate or distinct only.?
    Answer : Distnict
    3. Clarify method signature return subsets or print subsets
    4. Do we need to take care of order while printing permutations?
         */

    public static void permute(int[] nums) {
        List<List<Integer>> al = new ArrayList();
        helper(al, nums, new ArrayList());
        System.out.println(al);
    }

    public static void helper(List<List<Integer>> al, int[] nums, List<Integer> current) {
        // if the combination is done base condition
        if (current.size() == nums.length) {
            al.add(new ArrayList(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (current.contains(nums[i]))
                continue;
            // add i into the current combination
            current.add(nums[i]);
            // recursion
            helper(al, nums, current);
            // backtrack
            current.remove(current.size() - 1);
        }
    }

    /*

    Time Complexity : o(n!)
    Space Complexity : o(n)

     */



    /*

    DFS Approach - Visualization : [1,2]

    1 :
    Main helper
    curr  : 1
    helper curr : 1, 2
    al [1,2]
    helper exit
    curr : 2

    curr 2,1
    helper 2,1
    al[2,1]
    helper exit






     */

}
