/*
https://leetcode.com/problems/decode-ways/
*/

package dynamic_programming;

class DecodeDP {
    public static int numDecodings(String s) {
        // Base Case
        if (s == null || s.length() == 0)
            return 0;
        int[] dp = new int[s.length() + 1];
        // Numbers of way to decode of string length 0 which is 1 because there is no way to decode empty string
        dp[0] = 1;
        // No way to Decode if we have 0 as one character e.g - since "6" is different from "06".
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= s.length(); i++) {
            int oneDigit = Integer.valueOf(s.substring(i - 1, i));
            int twoDigit = Integer.valueOf(s.substring(i - 2, i));
            if (oneDigit >= 1) {
                dp[i] += dp[i - 1];
            }
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }
}

/* Dry -Run

// 0 2
Return 0

// 26
B F
Z




 */