/*
https://leetcode.com/problems/fizz-buzz/
 */

package string;

import java.util.*;

class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> al = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                al.add("FizzBuzz");
            else if (i % 3 == 0) {
                al.add("Fizz");
            } else if (i % 5 == 0) {
                al.add("Buzz");
            } else {
                al.add(Integer.toString(i));
            }
        }
        return al;
    }

    public static List<String> fizzBuzzOptimised(int n) {
        List<String> al = new ArrayList();
        for (int i = 1; i <= n; i++) {
            String res = "";
            if (i % 3 == 0) {
                res = res + "Fizz";
            }
            if (i % 5 == 0) {
                res = res + "Buzz";
            }
            if (res.equals("")) {
                res = res + Integer.toString(i);
            }
            al.add(res);
        }
        return al;
    }
}