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
	}
}