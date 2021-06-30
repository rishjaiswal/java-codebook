package stack;

import stack.*;

public class MasterStack {

	public static void main(String args[]) {
		System.out.println("Start execution of the Stack programs");
		MinStack obj = new MinStack();
		obj.push(5);
		obj.push(7);
		obj.push(6);
		obj.push(1);
		System.out.println("Top Element is before Pop() : " + obj.top());
		obj.pop();
		System.out.println("Top Element is after Pop() : " + obj.top());
		System.out.println("Minimum Element is : " + obj.getMin());
		System.out.println("Valid Parentheses result is : " + validParentheses.isValid(null));
		System.out.println("Valid Parentheses result is : " + validParentheses.isValid("()[]{}"));
		System.out.println("Valid Parentheses result is : " + validParentheses.isValid("([)]"));
		stackImplementArray st = new stackImplementArray(5);
		System.out.println("Stack capacity is  : " + st.capacity);
		System.out.println("Stack Peek Element is  : " + st.peek());
		System.out.println("Stack size is  : " + st.size());
		System.out.println("Stack is Empty  : " + st.isEmpty());
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println("Stack Peek Element is  : " + st.peek());
		System.out.println("Stack size is  : " + st.size());
		System.out.println("Stack is Empty  : " + st.isEmpty());
		st.push(4);
		st.push(5);
		System.out.println("Stack Peek Element is  : " + st.peek());
		System.out.println("Stack size is  : " + st.size());
		System.out.println("Stack is Empty  : " + st.isEmpty());
		st.push(6);
		System.out.println("Stack Pop Element is  : " + st.pop());
		System.out.println("Stack Peek Element is  : " + st.peek());
		System.out.println("Stack size is  : " + st.size());
		System.out.println("Stack is Empty  : " + st.isEmpty());
		System.out.println("Stack Pop Element is  : " + st.pop());
		System.out.println("Stack Pop Element is  : " + st.pop());
		System.out.println("Stack Pop Element is  : " + st.pop());
		System.out.println("Stack Peek Element is  : " + st.peek());
		System.out.println("Stack size is  : " + st.size());
		System.out.println("Stack is Empty  : " + st.isEmpty());
		System.out.println("Stack Pop Element is  : " + st.pop());
		System.out.println("Stack Pop Element is  : " + st.pop());
		System.out.println("Stack Peek Element is  : " + st.peek());
		System.out.println("Stack size is  : " + st.size());
		System.out.println("Stack is Empty  : " + st.isEmpty());
	}
}