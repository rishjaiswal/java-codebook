import java.util.*;

class DemoPractice {
    public static void main(String args[]) {
        System.out.println(checkValid("((alf)ls)"));
        System.out.println(checkValid(")(dkk)()"));
        System.out.println(checkValid(""));
        System.out.println(checkValid("())("));
        System.out.println(checkValid("()()"));
        System.out.println(checkValid(")(((a)ac)((())"));
        System.out.println(reverseString("Ab12-c3d-ab-E5FG-"));
    }

    public static boolean checkValid(String x) {
        /**
         * ((alf)ls) – valid
         * )(dkk)() – invalid
         */
        Stack<Character> st = new Stack();
        // Base case
        if (x == null || x.isEmpty())
            return false;

        for (char c : x.toCharArray()) {
            if (c == '(')
                st.push(c);
            else if (c == ')') {
                //if (!st.isEmpty() && st.pop() != '(')
                if (st.isEmpty())
                    return false;
                st.pop();
            }
        }
        return true;
    }

    /**
     * Write a program to reverse string where hyphen should be in same position
     * I/P- "Ab12-c3d-ab-E5FG-"
     * O/P- "GF5E-bad-3c-21bA-"
     */

    public static String reverseString(String s) {
        int i = 0;
        int j = s.length() - 1;
        char a[] = s.toCharArray();
        while (i < j) {
            if (a[i] == '-') {
                i++;
                continue;
            }
            if (a[j] == '-') {
                j--;
                continue;
            }
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(a);
    }
}