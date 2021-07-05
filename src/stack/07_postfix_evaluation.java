/*
 * Problem : Postfix evaluation using stack stack.
 */

package stack;

import java.util.Stack;

class postFixEvaluation {
	/*
	 * Given a string s in form of postfix and evaluate 
	 * 
	 */
	public static int postfixEvaluation(String s) {

		// Empty Case
		if (s == null || s.isEmpty())
			return 0;

		// Initialize a stack to be used in the algorithm.
		 Stack<Integer> st= new Stack<>();

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				st.push(c -'0');
			}
			else {
				if(st.size()>=2) {
					int b = st.pop();
					int a = st.pop();
					if(c == '*')
						st.push(a*b);
					else if (c == '/')
						st.push(a/b);
					else if (c == '+')
						st.push(a+b);
					else if(c == '-')
						st.push(a-b);
				}
				else {
					//Invalid Expression;
						return -1;
				}
			}
		}
		return st.pop();
	}
}


// Dry-Run Example - 123*+5-

//  1 2 3 
// * 
// 2 3 = 6

// 1 6 + 
// 7

// 7 5 - 
//2 