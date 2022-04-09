package recursion_n_backtracking;

import java.util.*;

class GenerateParentheses {
    /*
    https://leetcode.com/problems/generate-parentheses/
    Input: n = 3
    Output: ["((()))","(()())","(())()","()(())","()()()"]]]


    Clarifying questions :-

     */

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    public static void backtrack(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max) {
            backtrack(ans, cur + "(", open+1, close, max);
        }
        if (close < open) {
            backtrack(ans, cur + ")", open, close+1, max);
        }
    }
}