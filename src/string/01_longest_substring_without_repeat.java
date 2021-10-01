/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/


package string;

import java.util.*;

class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        char a[] = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap();
        String max = "";
        int len = 0;
        for (int i = 0; i < a.length; i++) {
            if (!hm.containsKey(a[i]))
                hm.put(a[i], i);
            else {
                i = hm.get(a[i]);
                hm.clear();
            }
            if (len < hm.size()) {
                max = hm.keySet().toString();
                len = hm.size();
            }
        }
        System.out.println("Maximum SubString is = " + max);
        return len;
    }
}