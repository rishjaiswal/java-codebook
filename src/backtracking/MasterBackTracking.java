package backtracking;

import backtracking.*;

public class MasterBackTracking {

    public static void main(String args[]) {
        System.out.println("Start execution of the BackTracking programs");
        System.out.println("Generate Parentheses result for number 3 is "+ GenerateParenthesisBackTracking.generateParenthesis(3));
        String sPalindromePermutation[] = {"aab", "abc"};
        for (String spal : sPalindromePermutation) {
            System.out.println("Palindrome Partitioning result for String " + spal + " is " + PalindromePartitionBackTracking.partition(spal));
        }
    }
}
