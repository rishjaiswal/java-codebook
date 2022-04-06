package recursion_n_backtracking;

import java.util.*;

class Combinations {
    /*
    https://leetcode.com/problems/combinations/

    Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].


     */

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> al = new ArrayList<>();
        generate(1,n,al,new ArrayList<Integer>(),k);
        return al;
    }

    public static void generate(int start,int end,List<List<Integer>> al, List<Integer> curr, int k) {
        if(curr.size()==k) {
            al.add(new ArrayList(curr));
            return;
        }
        for(int i= start;i<=end;i++){
            curr.add(i);
            generate(i+1,end,al,curr,k);
            curr.remove(curr.size()-1);
        }

    }
}