/*
https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/
*/


package string;

import java.util.*;

class LongestSubstringKDistinct {
    public static int longestSubstring(String s, int k) {
        int result = 0;
        int start = 0;
        /*
        hashmap is used to track the unique elements in the map.
         When a k+1 character is added to the map, the left pointer needs to move right.
         */
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

            if (map.size() <= k) {
                result = Math.max(result, end - start + 1);
            } else {
                while (map.size() > k) {
                    char l = s.charAt(start);
                    int count = map.get(l);
                    if (count == 1) {
                        map.remove(l);
                    } else {
                        map.put(l, map.get(l) - 1);
                    }
                    start++;
                }
            }
        }
        return result;
    }
}