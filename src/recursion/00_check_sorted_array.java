/*
 * Data Structures and Algorithmic Puzzles
 * 2.9 Recursion: Problems & Solutions
 */

package recursion;

class checkSortedArray {

	/*
	 * Given an array, check whether the array is in sorted order with recursion.
	 */
	public static boolean isArrayInSortedOrder(int[] A, int index) {
		if (A.length == 1 || index == 1 )
			return true;
		return (A[index - 1] < A[index - 2]) ? false : isArrayInSortedOrder(A, index - 1);
	}
}

/*
 * 
 * Time Complexity: O(n). Space Complexity: O(n) for recursive stack space.
 * 
 */