package string;

import string.*;

public class MasterString {

    public static void main(String args[]) {
        System.out.println("Start execution of the String programs");
        String s = "abcabcbb";
        System.out.println("Length of the longest substring without repeating characters is " + LongestSubstring.lengthOfLongestSubstring(s));
        String s1 = "ADOBECODEBANC", t1 = "ABC";
        System.out.println("Minimum window substring of s such that every character in t is " + MinimumWindowSubstring.minWindow(s1, t1));
        String s2 = "A", t2 = "AA";
        System.out.println("Minimum window substring of s such that every character in t is " + MinimumWindowSubstring.minWindow(s2, t2));
    }
}