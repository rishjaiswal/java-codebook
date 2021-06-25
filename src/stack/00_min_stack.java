/*
 * https://leetcode.com/explore/learn/card/queue-stack/230/usage-stack/1360/
 */

package stack;

class Elem {
	public int value;
	public int min;
	public Elem next;

	public Elem(int v, int m) {
		value = v;
		min = m;
		next = null;
	}
}

class MinStack {

	/*
	 * Design a stack that supports push, pop, top, and retrieving the minimum
	 * element in constant time.
	 */

	public Elem top;

	public MinStack() {

	}

	public void push(int val) {
		if (top == null) {
			top = new Elem(val, val);
		} else {
			Elem e = new Elem(val, Math.min(val, top.min));
			e.next = top;
			top = e;
		}
	}

	public void pop() {
		if (top == null)
			return;
		Elem temp = top.next;
		top.next = null;
		top = temp;

	}

	public int top() {
		if (top == null)
			return -1;
		return top.value;
	}

	public int getMin() {
		if (top == null)
			return -1;
		return top.min;
	}
}
