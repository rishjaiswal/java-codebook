package string;

import string.*;

import java.util.ArrayList;

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
        String svalidPalindrome[] = {"A man, a plan, a canal: Panama", "race a car"};
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
        System.out.println("Duplicate character of string " + s1 + " is " + Duplicate.firstRepeatChar(s1));
        String sExcel[] = {"FXSHRXW", "AB", "ZY", "A"};
        for (String se : sExcel)
            System.out.println("Excel Sheet Number of  " + se + " is " + Excel.titleToNumber(se));
        String sPalindrome[] = {"babad", "cbbd"};
        for (String sp : sPalindrome) {
            System.out.println("Palindromic Substring of string " + sp + " is " + LongestPalindromic.longestPalindrome(sp));
            System.out.println("Palindromic Substring of string " + sp + " is " + LongestPalindromic.longestPalindromeOptimised(sp));
        }
        String sDecode[] = {"0", "226", "12"};
        for (String sd : sDecode) {
            System.out.println("Number of ways for decoding string " + sd + " is " + Decode.numDecodings(sd));
        }
        System.out.println("Generate Parentheses result for number 3 is " + GenerateParenthesis.generateParenthesis(3));
        System.out.println("Count and Say result for number 5 is " + CountandSay.countAndSay(5));
        String sPalindromePermutation[] = {"aab", "abc"};
        for (String spal : sPalindromePermutation) {
            System.out.println("Palindrome Partitioning result for String " + spal + " is " + PalindromePartition.partition(spal));
        }
        ArrayList<String> words_dict = new ArrayList<>();
        words_dict.add("leet");
        words_dict.add("code");
        System.out.println("Word Break Result is " + WordBreak.wordBreak("leetcode", words_dict));
        System.out.print("Permutations of String ABC are : ");
        Permutations.permute("ABC", 0, 2);
        System.out.println("");
        System.out.println("Permutation in String result is " + PermutationCheck.checkInclusion("ab", "eidbaooo"));
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println("Largest Number from {3, 30, 34, 5, 9} is " + Largest.largestNumber(nums));
        System.out.println("CalculatorI result for (1+(4+5+2)-3)+(6+8) is " + CalculatorI.calculate("(1+(4+5+2)-3)+(6+8"));
        System.out.println("CalculatorII result for 33+2*2 is " + CalculatorII.calculate("3+2*2"));
        System.out.println("Minimum number of operations required to convert word1 to word2 are : "+ EditDistance.minDistance("horse","ros"));
        System.out.println("Longest Substring Length with at Least K Repeat Characters is " + LongestSubstringKRepeat.longestSubstring("aabbbbcaabb", 2));
        System.out.println("Longest Substring Length with at Most K Distinct/Unique Characters is " + LongestSubstringKDistinct.longestSubstring("abcadcacacaca", 3));
    }
}