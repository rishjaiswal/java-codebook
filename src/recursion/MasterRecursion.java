package recursion;

import java.util.Stack;

public class MasterRecursion {

	public static void main(String args[]) {
		System.out.println("Start execution of the Recursion programs");
		int A[] = { 1, 2, 3, 4, 5 };
		int B[] = { 1, 3, 2, 5, 4 };
		System.out.println("Array A is sorted : " + checkSortedArray.isArrayInSortedOrder(A, 4));
		System.out.println("Array A is sorted : " + checkSortedArray.isArrayInSortedOrder(B, 4));
		Stack<Integer> st = new Stack<>();
		st.push(2);
		st.push(4);
		st.push(1);
		System.out.println("Stack before sorting : " + st);
		SortStack.sortStack(st);
		System.out.println("Stack after sorting : " + st);
		String s = "Rishabh";
		System.out.println("String before reverse method using recursion : " + s);
		RecursionString.reverseString(s.toCharArray());
		System.out.println("Pascal Triangle is : " + PascalTriangle.getRow(4));
		System.out.println("Pascal Triangle using Memoization is : " + PascalTriangleMemoization.getRow(4));
		System.out.println("Fibnocci number is : " + Fibnocci.fib(6));
		System.out.println("Fibnocci number using Memoization is : " + Fibnocci.fibMemoization(6));
		System.out.println("Steps to reach the top at staircase : " + ClimbingStairs.climbStairs(10));
		System.out.println("Steps to reach the top at staircase : " + ClimbingStairs.climbStairsMemoization(10));
	}
}