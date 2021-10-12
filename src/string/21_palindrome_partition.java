/*
https://leetcode.com/problems/palindrome-partitioning/
*/

package string;

import java.util.*;

class PalindromePartition {
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList();
        dfs(s, 0, result, new ArrayList());
        return result;
    }

    public static void dfs(String s, int start, List<List<String>> result, List<String> curr) {
        //Condition to stop bactracking
        if (start == s.length()) {
            result.add(new ArrayList(curr));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                curr.add(s.substring(start, i + 1));
                dfs(s, i + 1, result, curr);
                curr.remove(curr.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}

/*

Time Complexity :  O ( N ⋅ 2 pow N ) , where  N  is the length of string s
This is the worst-case time complexity when all the possible substrings are palindrome.

Hence, there could be 2 pow N   possible substring  in the worst case. For each substring, it takes
O(N) time to generate substring and determine if it a palindrome or not.


Space Complexity:
O(N), where N is the length of the string s
This space will be used to store the recursion stack.
The maximum depth of the recursive call stack is 3 which is equivalent to N

 */