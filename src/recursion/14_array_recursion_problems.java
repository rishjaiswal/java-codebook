/*
 *  To check array is sorted using recursion
 */


package recursion;

class ArrayProblems {

    // To check array is sorted using recursion
    public static boolean isSorted(int arr[]){
       return helper (arr, 0);
    }

    // Helper function for recursion sort
    public static boolean helper(int[] A, int index) {
        if (index == A.length-1 )
            return true;
        return (A[index] > A[index + 1]) ? false : helper(A, index + 1);
    }

    // Linear search using recursion
    public static int search (int arr[], int x) {
        return helper_linear(arr, x , 0);
    }

    // Helper function for recursion linear
    public static int helper_linear(int arr[], int x, int index) {
        if(arr.length == index)
            return -1;
        return (arr[index] == x) ? index : helper_linear(arr, x, index+1);
    }


}