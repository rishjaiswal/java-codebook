/*
https://leetcode.com/problems/permutation-in-string/
*/

package string;

class PermutationCheck {
    /*
     One string will be a permutation of another string only if both of them contain the
     same characters with the same frequency. We can consider every possible substring in
     the long string  s2 of the same length as that of s1 and check the frequency
     of occurence of the characters appearing in the two. If the frequencies of every letter
     match exactly, then only  s1's permutation can be a substring of  s2.
     */
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int[] s1map = new int[26];
        for (int i = 0; i < s1.length(); i++)
            s1map[s1.charAt(i) - 'a']++;
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] s2map = new int[26];
            for (int j = 0; j < s1.length(); j++) {
                s2map[s2.charAt(i + j) - 'a']++;
            }
            if (matches(s1map, s2map))
                return true;
        }
        return false;
    }

    public static boolean matches(int[] s1map, int[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i])
                return false;
        }
        return true;
    }
}