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
		System.out.println("Stack Pop Element is  : " + st.pop());
		st.push(7);
		st.push(8);
		st.push(9);
		st.push(10);
		stackImplementArrayDynamic dst = new stackImplementArrayDynamic(5);
		System.out.println("Stack capacity is  : " + dst.capacity);
		System.out.println("Stack Peek Element is  : " + dst.peek());
		System.out.println("Stack size is  : " + dst.size());
		System.out.println("Stack is Empty  : " + dst.isEmpty());
		dst.push(1);
		dst.push(2);
		dst.push(3);
		System.out.println("Stack Peek Element is  : " + dst.peek());
		System.out.println("Stack size is  : " + dst.size());
		System.out.println("Stack is Empty  : " + dst.isEmpty());
		dst.push(4);
		dst.push(5);
		System.out.println("Stack Peek Element is  : " + dst.peek());
		System.out.println("Stack size is  : " + dst.size());
		System.out.println("Stack is Empty  : " + dst.isEmpty());
		dst.push(6);
		System.out.println("Stack Pop Element is  : " + dst.pop());
		System.out.println("Stack Peek Element is  : " + dst.peek());
		System.out.println("Stack size is  : " + dst.size());
		System.out.println("Stack is Empty  : " + dst.isEmpty());
		System.out.println("Stack Pop Element is  : " + dst.pop());
		System.out.println("Stack Pop Element is  : " + dst.pop());
		System.out.println("Stack Pop Element is  : " + dst.pop());
		System.out.println("Stack Peek Element is  : " + dst.peek());
		System.out.println("Stack size is  : " + dst.size());
		System.out.println("Stack is Empty  : " + dst.isEmpty());
		System.out.println("Stack Pop Element is  : " + dst.pop());
		System.out.println("Stack Pop Element is  : " + dst.pop());
		System.out.println("Stack Peek Element is  : " + dst.peek());
		System.out.println("Stack size is  : " + dst.size());
		System.out.println("Stack is Empty  : " + dst.isEmpty());
		System.out.println("Stack Pop Element is  : " + dst.pop());
		stackImplementLinkedList sst = new stackImplementLinkedList();
		System.out.println("Stack Peek Element is  : " + sst.peek());
		System.out.println("Stack size is  : " + sst.size());
		System.out.println("Stack is Empty  : " + sst.isEmpty());
		sst.push(1);
		sst.push(2);
		sst.push(3);
		System.out.println("Stack Peek Element is  : " + sst.peek());
		System.out.println("Stack size is  : " + sst.size());
		System.out.println("Stack is Empty  : " + sst.isEmpty());
		sst.push(4);
		sst.push(5);
		System.out.println("Stack Peek Element is  : " + sst.peek());
		System.out.println("Stack size is  : " + sst.size());
		System.out.println("Stack is Empty  : " + sst.isEmpty());
		sst.push(6);
		System.out.println("Stack Pop Element is  : " + sst.pop());
		System.out.println("Stack Peek Element is  : " + sst.peek());
		System.out.println("Stack size is  : " + sst.size());
		System.out.println("Stack is Empty  : " + sst.isEmpty());
		System.out.println("Stack Pop Element is  : " + sst.pop());
		System.out.println("Stack Pop Element is  : " + sst.pop());
		System.out.println("Stack Pop Element is  : " + sst.pop());
		System.out.println("Stack Peek Element is  : " + sst.peek());
		System.out.println("Stack size is  : " + sst.size());
		System.out.println("Stack is Empty  : " + sst.isEmpty());
		System.out.println("Stack Pop Element is  : " + sst.pop());
		System.out.println("Stack Pop Element is  : " + sst.pop());
		System.out.println("Stack Peek Element is  : " + sst.peek());
		System.out.println("Stack size is  : " + sst.size());
		System.out.println("Stack is Empty  : " + sst.isEmpty());
		System.out.println("Stack Pop Element is  : " + sst.pop());
		System.out.println("Valid Parentheses result is : " + validParenthesesApproach.isValidSymbol(null));
		System.out.println("Valid Parentheses result is : " + validParenthesesApproach.isValidSymbol("()[]{}"));
		System.out.println("Valid Parentheses result is : " + validParenthesesApproach.isValidSymbol("([)]"));
		System.out.println("PostFix Conversion result is : " + infixToPostfix.postfixConversion(""));
		System.out.println("PostFix Conversion result is : " + infixToPostfix.postfixConversion("A*B-(C+D)+E"));
		System.out.println("PostFix Conversion result is : " + infixToPostfix.postfixConversion("A*B"));
		System.out.println("PostFix Conversion result is : " + infixToPostfix.postfixConversion("(A*B)+C"));
		System.out.println("PostFix Evaluation result is : " + postFixEvaluation.postfixEvaluation(""));
		System.out.println("PostFix Evaluation result is : " + postFixEvaluation.postfixEvaluation("123*+5-"));
		System.out.println("InFix Evaluation result is : " + inFixEvaluation.infixEvaluation(""));
		System.out.println("InFix Evaluation result is : " + inFixEvaluation.infixEvaluation("2*3+1-5"));
		System.out.println("InFix Evaluation result is : " + inFixEvaluation.infixEvaluation("1+2*3-5"));
		System.out.println("Palindrome Result is "+ checkPalindrome.isPalindrome("ABXA"));
		System.out.println("Palindrome Result is "+ checkPalindrome.isPalindrome("ABXBA"));
		System.out.println("Palindrome Result is "+ checkPalindrome.isPalindrome("121X121"));
		System.out.println("Stack after Reverse " + reverseStack.reverse(st));
		int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
		System.out.print("Number of days you have to wait after the ith day to get a warmer temperature are ");
		for (int x : dailyTemperatures.dailyTemperatures(temperatures))
			System.out.print(x + " ");
		System.out.println("");
	}
}