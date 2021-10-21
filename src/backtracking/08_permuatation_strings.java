/*
https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1
*/

package backtracking;

class PermutationsBack {
    /* Function to print permutations of string
        This function takes three parameters:
        1. String
        2. Starting index of the string
        3. Ending index of the string.
    */
    public static void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}

/*

Algorithm Paradigm: Backtracking

Time Complexity: O(n*n!)
Note that there are n! permutations and it requires O(n) time to print a permutation.
 */