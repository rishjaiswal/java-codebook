/*
https://leetcode.com/problems/basic-calculator/
*/

package string;

import java.util.*;

class CalculatorI {
    static int index=0;
    public static int calculate(String s) {
        int result=0;
        int sign=1;
        while(index<s.length()) {
            char c=s.charAt(index++);
            if (Character.isDigit(c)) {
                int num=(c-'0');
                while(index<s.length() && Character.isDigit(s.charAt(index))) {
                    num=num*10+(s.charAt(index)-'0');
                    index++;
                }
                result+=sign*num;
            }else if(c=='+') {
                sign=1;
            } else if(c=='-') {
                sign=-1;
            }else if (c=='(') {
                result+=sign*calculate(s);
            } else if (c==')') {
                return result;
            }
        }
        return result;
    }
}