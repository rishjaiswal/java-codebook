/*
https://leetcode.com/problems/implement-strstr/
*/

package string;

class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0)
            return 0;
        if (haystack == null)
            return -1;
        int m = haystack.length();
        int n = needle.length();
        for (int i = 0; i <= m - n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j))
                    break;
            }
            if (j == n)
                return i;
        }
        // will also return here if haystack string is empty.
        return -1;
    }
}
