/*
 *  Array Problems using recursion
 */


package recursion;

import java.util.ArrayList;

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

    // Linear search for all element indexes using recursion
    public static ArrayList<Integer> search_double (int arr[], int x) {
        ArrayList<Integer> al = new ArrayList<>();
        helper_linear_double(arr, x , 0, al);
        return al;
    }

    // Helper function for recursion linear - all element indexes
    public static void helper_linear_double(int arr[], int x, int index, ArrayList<Integer> al) {
        if(arr.length == index)
            return;
        if(arr[index]== x)
            al.add(index);
        helper_linear_double(arr, x, index+1, al);
    }

    // Linear search for all element indexes using recursion - Second Approach
    public static ArrayList<Integer> helper_linear_all(int arr[], int x, int index) {
        ArrayList<Integer> al = new ArrayList<>();
        // Base Case
        if (arr.length == index)
            return al;
        // This will contains answer for that functional call only.
        if(arr[index]== x)
            al.add(index);
        // Previous answers to place and add in the final result
        ArrayList<Integer> previous = helper_linear_all(arr, x, index+1);
        al.addAll(previous);
        return al;
    }
}