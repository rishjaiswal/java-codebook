/*
 * Problem : Infix evaluation using stack
 */

package stack;

import java.util.Stack;

class inFixEvaluation {
	/*
	 * Given a string s in form of Infix and evaluate
	 * 
	 */
	public static int infixEvaluation(String s) {

		// Empty Case
		if (s == null || s.isEmpty())
			return 0;

		// Initialize a stack to be used in the algorithm.
		Stack<Integer> st = new Stack<>();
		Stack<Character> st2 = new Stack<>();

		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {
				st.push(ch - '0');
			} else {
				// Prec(st2.peek()) >= Prec(ch) - must be follow for operator precednce
				if (st.size() >= 2 && !st2.isEmpty() && Prec(st2.peek()) >= Prec(ch)) {
					char c = st2.pop();
					int b = st.pop();
					int a = st.pop();
					if (c == '*')
						st.push(a * b);
					else if (c == '/')
						st.push(a / b);
					else if (c == '+')
						st.push(a + b);
					else if (c == '-')
						st.push(a - b);
				}
				st2.push(ch);
			}
		}
		// For last Evaluation
		while (st.size() >= 2 & !st2.isEmpty()) {
			char c = st2.pop();
			int b = st.pop();
			int a = st.pop();
			if (c == '*')
				st.push(a * b);
			else if (c == '/')
				st.push(a / b);
			else if (c == '+')
				st.push(a + b);
			else if (c == '-')
				st.push(a - b);
		}
		return st.pop();
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
