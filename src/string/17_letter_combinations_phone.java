/*
https://leetcode.com/problems/letter-combinations-of-a-phone-number/
*/

package string;

import java.util.*;

class Combinations {
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList();
        if (digits == null || digits.length() == 0)
            return res;
        String mapping[] = {
                "0",
                "1",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        recursive(digits, res, "", 0, mapping);
        return res;
    }

    public static void recursive(String digits, List<String> result, String f, int index, String[] mapping) {
        if (index == digits.length()) {
            result.add(f);
            return;
        }
        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            recursive(digits, result, f + letters.charAt(i), index + 1, mapping);
        }

    }
}