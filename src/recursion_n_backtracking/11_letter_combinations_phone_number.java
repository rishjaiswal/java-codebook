package recursion_n_backtracking;

import java.util.*;

class LetterCombinations {
    /*
    https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    Input: digits = "23"
    Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

    Clarifying questions :-

    1. Empty array or numbers - Behaviour?
        Input: digits = "" , Output: []

    2. Constraints
        0 <= digits.length <= 4
        digits[i] is a digit in the range ['2', '9'].

     */
    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList();
        //Base-Condition
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