/*
 * https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1440/
 */

package recursion;


class RecursionString {
    public static void reverseString(char[] s) {
        helper(0, s.length - 1, s);
        System.out.println("String after reverse method using recursion : " + String.valueOf(s));
    }

    public static void helper(int start, int end, char[] s) {

        //Base Case
        if (start >= end) {
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        helper(++start, --end, s);
    }
}