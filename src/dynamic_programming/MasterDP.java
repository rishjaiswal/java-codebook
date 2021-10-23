package dynamic_programming;

import dynamic_programming.*;

public class MasterDP {

    public static void main(String args[]) {
        System.out.println("Start execution of the DP programs");
        String sDecode[] = {"0", "226", "12"};
        for (String sd : sDecode) {
            System.out.println("Number of ways for decoding string " + sd + " is " + DecodeDP.numDecodings(sd));
        }
        System.out.println("Minimum number of operations required to convert word1 to word2 are : "+ EditDistanceDP.minDistance("horse","ros"));
    }
}
