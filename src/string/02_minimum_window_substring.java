/*
https://leetcode.com/problems/minimum-window-substring/
*/


package string;

import java.util.*;

class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        HashMap<Character, Integer> hm = new HashMap();
        for (char c : t.toCharArray()) {
            if (hm.containsKey(c))
                hm.put(c, hm.get(c) + 1);
            else
                hm.put(c, 1);
        }
        int count = 0;
        int beg = 0;
        int start = 0;
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) - 1);
                if (hm.get(s.charAt(i)) >= 0)
                    count++;
            }

            //eliglble window
            while (count == t.length()) {
                //length save
                if (length > i - start + 1) {
                    length = i - start + 1;
                    beg = start;
                }
                if (hm.containsKey(s.charAt(start))) {
                    hm.put(s.charAt(start), hm.get(s.charAt(start)) + 1);
                    if (hm.get(s.charAt(start)) > 0) {
                        count--;
                    }
                }
                start++;
            }
        }
        if (s.length() < length)
            return "";
        return s.substring(beg, beg + length);
    }
}