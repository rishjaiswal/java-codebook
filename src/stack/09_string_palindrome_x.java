/*
 * Problem : Check whether the string is palindrome. using stack
 */

package stack;

import java.util.Stack;

class checkPalindrome {
	/*
	 * Given an array of characters formed with a’s and b’s. The string is marked
	 * with special character X which represents the middle of the list (for
	 * example: ababa...ababXbabab…..baaa). Check whether the string is palindrome.
	 * 
	 */
	public static boolean isPalindrome(String s) {

		// Base Condition - Empty Case
		if (s == null || s.isEmpty())
			return true;

		// Initialize a stack to be used in the algorithm.
		int i = 0;
		Stack<Character> st = new Stack<>();
		while (i < s.length() && s.charAt(i) != 'X') {
			st.push(s.charAt(i));
			i++;
		}
		// To skip Middle Element - having special character X 
		i++;
		while (!st.isEmpty() && i < s.length()) {
			if (st.pop() != s.charAt(i))
				return false;
			i++;
		}
		return true;
	}
}
