package recursion_n_backtracking;

import java.util.*;

class CombinationSumII {
    /*
    https://leetcode.com/problems/combination-sum-ii/

    Clarifying questions :-
    1. Array of Distnict Integers or Duplicate ?
            Can be Duplicate
    2. Unique combinations or not?
            How to clarify its unique or not >>  If the frequency of at least one of the chosen numbers is different.
    3.The same number may be chosen from candidates an unlimited number of times or not?
            No each number in candidates may only be used once in the combination.
    4. Constraints
            1 <= target <= 30
    5. No Negative Elements:
     */

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> al = new ArrayList<>();
        helper_sum(0,al,new ArrayList<Integer>(),candidates,target);
        return al;
    }

    /*

    Time Complexity : o(2 pow n)
    Space Complexity : o(n) // We first build a counter table, which in the worst case will consume it

     */

    public static void helper_sum(int index,List<List<Integer>> al, List<Integer> curr, int[] c , int t) {
        if(t == 0) {
            al.add(new ArrayList(curr));
            return;
        }
        if(t<0)
            return;
        for(int i= index ;i<c.length;i++){
            if(i>index && c[i]==c[i-1]) continue;
            curr.add(c[i]);
            helper_sum(i+1,al,curr,c,t-c[i]);
            curr.remove(curr.size()-1);
        }
    }
}