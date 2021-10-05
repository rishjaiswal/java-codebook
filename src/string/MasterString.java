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
        String sarray[] = {"42", "-42", "4193 with words", "    4193", "3.14"};
        for (String sa : sarray)
            System.out.println("Atoi Calculation for string " + sa + " is " + Atoi.getAtoi(sa));
        String svalid[] = {"()[]{}", "([)]", "{[]}"};
        for (String sv : svalid) {
            System.out.println("Valid Parentheses Result for string " + sv + " is " + ValidParentheses.isValid(sv));
            System.out.println("Valid Parentheses Result using Optimised Approach for string " + sv + " is " + ValidParentheses.isValidOptimised(sv));
        }
        String svalidPalindrome [] = {"A man, a plan, a canal: Panama", "race a car"};
        for (String svp : svalidPalindrome) {
            System.out.println("Valid Palindrome Result for string " + svp + " is " + ValidPalindrome.isPalindrome(svp));
        }
        String sroman[] = {"LVIII", "IX", "III"};
        for (String sr : sroman) {
            System.out.println("Integer Result for roman string " + sr + " is " + Roman.romanToInt(sr));
        }
        String slcp[] = {"flower", "flow", "flight"};
        System.out.println("Longest Common prefix string is " + Prefix.longestCommonPrefix(slcp));
        System.out.println("Longest Common prefix string using Optimised Approach is " + Prefix.longestCommonPrefixOptimsed(slcp));
        System.out.println("Implementation of strstr() is " + ImplementStrStr.strStr("hello", "ll"));
        System.out.println("Anagram result is " + ValidAnagram.isAnagram("anagram", "nagaram"));
        System.out.println("Unique character of string " + s1 + " is " + Unique.firstUniqChar(s1));
    }
}