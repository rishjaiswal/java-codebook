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
		 Stack<Integer> st= new Stack<>();
		 Stack<Character> st2= new Stack<>();

		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {
				st.push(ch -'0');
			}
			else {
				if(st.size()>=2 & !st2.isEmpty())
				{
					char c = st2.pop();
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
				st2.push(ch);
			}
		}
		//For last Evaluation
		if(st.size()>=2 & !st2.isEmpty())
		{
			char c = st2.pop();
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
		return st.pop();
	}
}



