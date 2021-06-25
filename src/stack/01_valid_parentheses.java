/*
 * https://leetcode.com/explore/learn/card/queue-stack/230/usage-stack/1361/
 */

package stack;

import java.util.HashMap;
import java.util.Stack;

class validParentheses {
	/*
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * An input string is valid if: Open brackets must be closed by the same type of
	 * brackets. Open brackets must be closed in the correct order.
	 * 
	 */
	public static boolean isValid(String s) {
		
		//Empty Case
		if(s == null)
			return false;

		// Hash table that takes care of the mappings.
		HashMap<Character, Character> mappings;

		// Initialize hash map with mappings. This simply makes the code easier to read.
		mappings = new HashMap<Character, Character>();
		mappings.put(')', '(');
		mappings.put('}', '{');
		mappings.put(']', '[');

		// Initialize a stack to be used in the algorithm.
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			// If the current character is a closing bracket.
			if (mappings.containsKey(c)) {

				// Get the top element of the stack. If the stack is empty, set a dummy value of
				// '#'
				char topElement = stack.empty() ? '#' : stack.pop();

				// If the mapping for this bracket doesn't match the stack's top element, return
				// false.
				if (topElement != mappings.get(c)) {
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
}
