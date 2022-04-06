package recursion_n_backtracking;

import java.util.*;

class CombinationSum {
    /*
    https://leetcode.com/problems/combination-sum/

    Clarifying questions :-
    1. Array of Distnict Integers or Duplicate ?
            Distnict Only. No Duplicated
    2. Unique combinations or not?
            How to clarify its unique or not >>  If the frequency of at least one of the chosen numbers is different.
    3.The same number may be chosen from candidates an unlimited number of times or not?
            Yes we can choose unlimited number of times
            e.g - candidates = [2,3,6,7], target = 7
            [[2,2,3],[7]] 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
    4. Constraints
            1 <= target <= 500
    5. No Negative Elements:
     */

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> al = new ArrayList<>();
        helper_sum(0,al,new ArrayList<Integer>(),candidates,target);
        return al;
    }

    /*

    Time Complexity : o(2 pow n)
    Space Complexity : o(t)  for storing the path, which could be t long at most for target

     */


    public static void helper_sum(int index,List<List<Integer>> al, List<Integer> curr, int[] c , int t) {
        if(t == 0) {
            al.add(new ArrayList(curr));
            return;
        }
        if(t<0)
            return;
        for(int i= index ;i<c.length;i++){
            curr.add(c[i]);
            helper_sum(i,al,curr,c,t-c[i]);
            curr.remove(curr.size()-1);
        }
    }
}