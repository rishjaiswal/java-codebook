package recursion_n_backtracking;

import java.util.*;

class CombinationSumIII {
    /*
    https://leetcode.com/problems/combination-sum-iii/ Find all valid combinations of k numbers that sum up to n
    Clarifying questions :-
    1. Unique combinations or not?
            list of all possible valid combinations. The list must not contain the same combination twice
    2.The same number may be chosen from candidates an unlimited number of times or not?
            No Each number is used at most once.
    3. Only numbers 1 through 9 are used., Each number is used at most once.
     */

    public static List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> al = new ArrayList<>();
        generate(1,9,al,new ArrayList<Integer>(),k,n);
        return al;
    }

    /*

    Time Complexity : O(9^ K)
    Space Complexity : O(K)

     */

    public static void generate(int start,int end,List<List<Integer>> al, List<Integer> curr, int k , int t) {
        if(t == 0 && curr.size()==k) {
            al.add(new ArrayList(curr));
            return;
        }
        for(int i= start;i<=end;i++){
            curr.add(i);
            generate(i+1,end,al,curr,k,t-i);
            curr.remove(curr.size()-1);
        }

    }
}