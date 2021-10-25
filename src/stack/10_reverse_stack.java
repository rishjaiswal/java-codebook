/*
 * Problem : To reverse the contents of the stack using only stack
 */

package stack;

import java.util.Stack;

class reverseStack {
	/*
	 * To reverse the contents of the stack using only stack operations (push and
	 * pop)?
	 */
	public static Stack<Integer> reverse(stackImplementArray s) {
		// initialize extra stack
		Stack<Integer> extraStack = new Stack<Integer>();
		int n = s.size();

		for (int i = 0; i < n; i++) {
			// access the top element
			int element = s.peek();
			// remove the top element
			s.pop();
			// push the element into the extra stack
			extraStack.push(element);
		}

		// return the extraStack which is reversed
		return extraStack;
	}
}

