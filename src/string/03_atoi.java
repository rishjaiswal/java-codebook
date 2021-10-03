/*
https://leetcode.com/problems/string-to-integer-atoi/
*/

package string;

class Atoi {
    public static int getAtoi(String s) {
        boolean flag = true;
        double result = 0;
        int index = 0;
        while(index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
        for (int i = index; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                flag = false;
            }
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                result = result * 10 + (s.charAt(i) - '0');
            }
            if(s.charAt(i) == '.')
                return (int) result;
        }
        if (result > Integer.MAX_VALUE) {
            if (flag == false)
                return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }

        if (flag == false)
            return -1 * (int) result;
        return (int) result;

    }
}