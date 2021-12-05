/*
 *  Sorting - Bubble Sort and
 */


package recursion;


class SortingRecursive {
    public static void sort(int[] arr){
        helper_bubble(arr,arr.length-1,0);
    }

    public static void helper_bubble(int[] a, int start, int end){
        if(start == 0)
            return;
        if(start > end){
            if(a[end] > a[end+1]) {
                int temp = a[end];
                a[end] = a[end+1];
                a[end+1] = temp;
            }
            helper_bubble(a,start,end+1);
        }
        else
            helper_bubble(a,start-1,0);
    }
}