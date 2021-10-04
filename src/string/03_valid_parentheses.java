/*
https://leetcode.com/problems/valid-parentheses/
*/

package string;

import java.util.*;

class ValidParentheses {
    public static boolean isValid(String s) {
        HashMap<Character, Character> hm = new HashMap();
        hm.put(')', '(');
        hm.put('}', '{');
        hm.put(']', '[');

        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (hm.containsKey(c)) {

                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != hm.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }
        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }

    public static boolean isValidOptimised(String s) {
        // Initialize a stack to be used in the algorithm.
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a ) bracket.
            if (c == ')') {
                if(!st.isEmpty() && st.peek() =='(')
                    st.pop();
                else
                    return false;
            }
            // If the current character is a ] bracket.
            else if (c == ']') {
                if(!st.isEmpty() && st.peek() =='[')
                    st.pop();
                else
                    return false;
            }
            // If the current character is a } bracket.
            else if (c == '}') {
                if(!st.isEmpty() && st.peek() =='{')
                    st.pop();
                else
                    return false;
            }
            // If the current character is a ( { [ bracket.
            else {
                st.push(c);
            }
        }
        // If the stack still contains elements, then it is an invalid expression.
        return st.isEmpty();
    }
}