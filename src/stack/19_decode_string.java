/*
https://leetcode.com/explore/learn/card/queue-stack/239/conclusion/1379/

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times.
Note that k is guaranteed to be a positive integer.
*/

package stack;

import java.util.*;

class DecodeString {
    public static String decodeString(String s) {

        if (s.length() == 0 || s == null)
            return s;

        Stack<String> strStk = new Stack<>();
        Stack<Integer> numStk = new Stack<>();
        String decoded = "";

        char[] sChrArr = s.toCharArray();

        int j = 0;
        while (j < sChrArr.length) {
            if (Character.isDigit(sChrArr[j])) {
                int num = 0;
                while (Character.isDigit(sChrArr[j])) {
                    num = num*10 + (sChrArr[j]-'0');
                    j++;
                }
                numStk.push(num);
            } else if (sChrArr[j] == '[') {
                strStk.push(decoded);
                decoded = "";
                j++;
            } else if (sChrArr[j] == ']') {
                String temp = strStk.pop();
                int multiplier = numStk.pop();
                for (int i=0; i < multiplier; i++)
                    temp = temp + decoded;
                decoded = temp;
                j++;
            } else {
                decoded += sChrArr[j++];
            }
        }
        return decoded;
    }
}