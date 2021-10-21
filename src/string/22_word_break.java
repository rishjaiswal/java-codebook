/*
https://leetcode.com/problems/word-break/
*/

package string;

import java.util.*;

class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Map<String, Boolean> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (String ss : wordDict) {
            set.add(ss);
        }
        return helper(s, set, map);
    }

    public static boolean helper(String s, Set<String> set, Map<String, Boolean> map) {
        if (s.length() == 0) {
            return true;
        }
        if (map.containsKey(s)) {
            return map.get(s);
        }
        for (int i = 0; i <= s.length(); i++) {
            if (set.contains(s.substring(0, i)) && helper(s.substring(i), set, map)) {
                map.put(s.substring(i), true);
                return true;
            }
        }
        map.put(s, false);
        return false;
    }
}