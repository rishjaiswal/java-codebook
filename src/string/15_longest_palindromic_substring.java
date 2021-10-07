/*
https://leetcode.com/problems/longest-palindromic-substring/
*/

package string;

class LongestPalindromic {
    public static String longestPalindrome(String str) {
        if (str == null || str.length() < 1) return "";
        int start = 0;
        int maxLength = 1;
        int length = str.length();
        int low, high;
        for (int i = 1; i < length; ++i){
            //Even Length palindrome center as i
            low = i - 1;
            high = i;
            while (low >= 0 && high < length && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 >= maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
            //Odd Length palindrome center as i
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < length && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 >= maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
        }
        return str.substring(start, start + maxLength);
    }

    public static String longestPalindromeOptimised(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    /* Dry-Run
    // c b b d
    1,1, 0 2 2-0-1 = 1
    1,2 , 0,3 3-0-1 = 2

    1 -(1-1)/2
    1+ 1/2
    start = 1-(2-1)/2
    end = 1+ 2/2
     */

    public static int expandAroundCenterOptimsed(String s, int left, int right) {
        int L = left, R = right;
        int maxLength = 1;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            if (maxLength <= R - L + 1)
                maxLength = R - L + 1;
            L--;
            R++;
        }
        return maxLength;
    }
}