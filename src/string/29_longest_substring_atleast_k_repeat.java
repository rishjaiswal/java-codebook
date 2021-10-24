/*
https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
*/


package string;

import java.util.*;

class LongestSubstringKRepeat {
    /*
    Given a string s and an integer k, return the length of the longest substring of s
    such that the frequency of each character in this substring is greater than or equal to k.
     */
    public static int longestSubstring(String s, int k) {
        if (s.length() < k)
            return 0;
        char[] str = s.toCharArray();
        int[] countMap = new int[26];
        for (char c : str)
            countMap[c - 'a']++;

        boolean valid = true;
        int start = 0;
        int maxLen = 0;
        for (int end = 0; end < s.length(); end++) {
            if (countMap[str[end] - 'a'] > 0 && countMap[str[end] - 'a'] < k) {
                String subString = s.substring(start, end);
                maxLen = Math.max(maxLen, longestSubstring(subString, k));
                start = end + 1;
                valid = false;
            }
        }
        if (valid)
            return s.length();
        return Math.max(maxLen, longestSubstring(s.substring(start), k));
    }
}