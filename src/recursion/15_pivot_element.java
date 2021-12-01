/*
 *  https://leetcode.com/problems/search-in-rotated-sorted-array/
 *  https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 *  https://www.ideserve.co.in/learn/find-pivot-in-a-sorted-rotated-array
 */


package recursion;


class ArrayPivotRotate {
    // Search in Rotated Sorted Array
    public static int search_rotate(int arr[],int target){
        return helper(arr,0,arr.length-1,target);
    }

    // Optimised Binary Search
    public static int helper(int arr[],int start , int end,int target){
        if(start>end)
            return -1;
        int mid = (start+end)/2;
        if(arr[mid]==target)
            return mid;
        // If first part is sorted
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<=arr[mid])
                return helper(arr,start,mid-1,target);
            return helper(arr,mid+1,end,target);
        }
        // Second part is sorted
        if(target>=arr[mid] && target<=arr[end])
            return helper(arr,mid+1,end,target);
        return helper(arr,start,mid-1,target);
    }

    // Find Minimum in Rotated Sorted Array
    public static int findMin(int[] arr) {
        return helper_find_min(arr,0,arr.length-1);
    }

    public static int helper_find_min(int[] arr, int start,int end){
        // Base case when array is not rotated at all and its sorted only.
        if(start > end)
            return arr[0];
        //Check if there is now one element
        if(start == end)
            return arr[start];
        int mid = (start+end)/2;
        //Check if mid+1 is minimum element
        if(mid<end && arr[mid+1]<arr[mid])
            return arr[mid+1];
        //Check if mid itself is minimum element
        if(start<mid && arr[mid] < arr[mid-1])
            return arr[mid];
        if(arr[end] > arr[mid])
            return helper_find_min(arr,start,mid-1);
        return helper_find_min(arr,mid+1,end);
    }

    // Find pivot element in rotated sorted array
    //    For array   3, 4, 5, 6, 1, 2 it returns
    //       3 (index of 6)
    public static int findPivot(int arr[]) {
        return helper_find_pivot(arr,0,arr.length-1);
    }

    public static int helper_find_pivot(int[] arr, int start,int end){
        // Base case when array is not rotated at all and its sorted only.
        if(start> end)
            return -1;
        //Check if there is now one element
        if(start == end)
            return start;
        int mid = (start+end)/2;
        //Check if mid+1 is minimum element
        if(mid<end && arr[mid+1]<arr[mid])
            return mid;
        //Check if mid itself is minimum element
        if(start<mid && arr[mid] < arr[mid-1])
            return mid-1;
        if(arr[end] > arr[mid])
            return helper_find_pivot(arr,start,mid-1);
        return helper_find_pivot(arr,mid+1,end);
    }
}