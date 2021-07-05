/*
 * Problem : Discuss infix to postfix conversion algorithm using stack.
 */

package stack;

import java.util.Stack;

class infixToPostfix {
	/*
	 * Given a string s and convert from infix to postfix conversion algorithm
	 * 
	 */
	public static String postfixConversion(String s) {

		// Empty Case
		if (s == null)
			return null;

		String result = "";

		// Initialize a stack to be used in the algorithm.
		Stack<Character> st = new Stack<Character>();

		// we have to define the operator precedence (or priority) inside the algorithm.
		for (char c : s.toCharArray()) {

			// If the scanned character is an
			// operand, add it to output.
			if (Character.isLetterOrDigit(c))
				result += c;

			// If the scanned character is an '(',
			// push it to the stack.
			else if (c == '(')
				st.push(c);

			// If the scanned character is an ')',
			// pop and output from the stack
			// until an '(' is encountered.
			else if (c == ')') {
				while (!st.isEmpty() && st.peek() != '(')
					result += st.pop();
				st.pop();
			} else // an operator is encountered
			{
				while (!st.isEmpty() && Prec(c) < Prec(st.peek())) {
					result += st.pop();
				}
				st.push(c);
			}
		}

		// pop all the operators from the stack
		while (!st.isEmpty()) {
			if (st.peek() == '(')
				return "Invalid Expression";
			result += st.pop();
		}
		
		return result;
	}
	
	// A utility function to return
	// precedence of a given operator
	// Higher returned value means
	// higher precedence
	public static int Prec(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
			return 2;

		case '^':
			return 3;
		}
		return -1;
	}
	
}
