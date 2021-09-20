/*
https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/
https://leetcode.com/problems/find-the-duplicate-number/
*/


package array;

import java.util.*;

class RepeatAndMissing {
    public static int findDuplicate(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                return abs_val;
        }
        return -1;
    }

    public static int findMissing(int[] arr) {
        int size = arr.length;
        System.out.print("Array after Modification = ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

        // Logic for calculating missing number
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0)
                return (i + 1);
        }
        return -1;
    }

    public static void printDuplicateMissing(int[] arr) {
        Set<Integer> numberSet
                = new HashSet<>();

        int max = arr.length;
        for (int i : arr) {
            if (numberSet.contains(i))
                System.out.println("Repeating = " + i);
            numberSet.add(i);
        }
        System.out.println("Formed hashset = " + numberSet);
        for (int i = 1; i <= max; i++) {
            if (!numberSet.contains(i))
                System.out.println("Missing = " + i);
        }
    }
}
