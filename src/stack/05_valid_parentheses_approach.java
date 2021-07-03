/*
 * Problem : Stacks can be used for checking balancing of symbols.
 */

package stack;

import java.util.Stack;

class validParenthesesApproach {
	/*
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * An input string is valid if: Open brackets must be closed by the same type of
	 * brackets. Open brackets must be closed in the correct order.
	 * 
	 */
	public static boolean isValidSymbol(String s) {
		
		//Empty Case
		if(s == null)
			return false;

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
