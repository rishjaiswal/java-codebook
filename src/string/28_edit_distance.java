/*
https://leetcode.com/problems/edit-distance/
*/


package string;

class EditDistance {
    public static int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];

        /*
         *
         *  Initialization
         *      dp[0][c] = c
         *      dp[r][0] = r
         *
         *          ""     "c"      "d"      "e"
         *  ""      0       1        2        3
         *  "a"     1
         *  "b"     2
         *  "c"     3

         */
        for(int r=0; r<dp.length; r++){
            dp[r][0] = r;
        }

        for(int c=0; c<dp[0].length; c++){
            dp[0][c] = c;
        }

        /*
         *  Calculation for dp[r][c]
         *      When word1[r-1] == word2[r-1] that means the last character will not cose additional operation
         *      Copy the value from dp[r-1][c-1]
         *
         *      Otherwise, it must take some operation, so it is
         *      1 + Min( dp[r-1][c], dp[r][c-1], dp[r-1][c-1])
         */

        for(int r=1; r<dp.length; r++){
            for(int c=1; c<dp[0].length; c++){
                if(word1.charAt(r-1) == word2.charAt(c-1)){
                    dp[r][c] = dp[r-1][c-1];
                }else{
                    dp[r][c] = 1 + Math.min(
                            dp[r-1][c-1],
                            Math.min(
                                    dp[r-1][c],
                                    dp[r][c-1]
                            )
                    );
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}

/*
O(nm) time, O(nm) space.
 */