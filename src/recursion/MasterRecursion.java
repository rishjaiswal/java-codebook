package recursion;

import java.util.Arrays;
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
		System.out.println("Power (5,3) is : " + Power.myPow(5.0, 3));
		System.out.println("Power (5,-3) is : " + Power.myPow(5.0, -3));
		int arr[] = {1, 2, 3, 4, 5, 5};
		System.out.println("Array is sorted or not : " + ArrayProblems.isSorted(arr));
		int arr1[] = {1, 2, 6, 4, 5};
		System.out.println("Array is sorted or not : " + ArrayProblems.isSorted(arr1));
		int x1[] = {5, 8, 1, 3};
		for (int x : x1) {
			System.out.println("Linear search for " + x + " index is present in array or not  : " + ArrayProblems.search(arr, x));
			System.out.println("Linear search for " + x + " index is present in array or not : " + ArrayProblems.search(arr1, x));
		}
		for (int x : x1) {
			System.out.println("Linear search for " + x + " indexes are present in array or not  : " + ArrayProblems.search_double(arr, x));
			System.out.println("Linear search for " + x + " indexes are present in array or not : " + ArrayProblems.helper_linear_all(arr,x,0));
		}
		int y[] = {4,5,1,2,3};
		System.out.println("Search in rotated sorted array index for element 5 is " + ArrayPivotRotate.search_rotate(y,5));
		System.out.println("Search in rotated sorted array index for element 7 is " + ArrayPivotRotate.search_rotate(y,7));
		System.out.println("Pivot element index in rotated sorted array is " + ArrayPivotRotate.findPivot(y));
		System.out.println("Pivot element in rotated sorted array is " + y[ArrayPivotRotate.findPivot(y)]);
		System.out.println("Minimum element in rotated sorted array is " + ArrayPivotRotate.findMin(y));
		System.out.println("Star Print : ");
		PatternRecursive.print_star(5,0);
		System.out.println("Star Reverse Print : ");
		PatternRecursive.print_reverse_star(5,0);
		int a[] = {1,3,4,2,1};
		SortingRecursive.sort(a);
		System.out.println("Array after Sorting using Bubble Sort is ");
		System.out.println(Arrays.toString(a));
	}
}