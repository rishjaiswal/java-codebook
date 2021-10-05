/*
https://leetcode.com/problems/valid-anagram/
*/

package string;

import java.util.*;

class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap();
        for (char c : s.toCharArray()) {
            if (hm.containsKey(c))
                hm.put(c, hm.get(c) + 1);
            else
                hm.put(c, 1);
        }
        HashMap<Character, Integer> hm2 = new HashMap();
        for (char c : t.toCharArray()) {
            if (hm2.containsKey(c))
                hm2.put(c, hm2.get(c) + 1);
            else
                hm2.put(c, 1);
        }
        return hm.equals(hm2);
    }
}