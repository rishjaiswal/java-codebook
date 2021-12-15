class Demo {
    public static void main(String args[]) {
        int cost_1[][] =  {{4, 7, 12}};
        get_total_cost(1, cost_1);
        int cost_3[][] =  {{5, 14, 73}, {1, 543, 875}, {231, 4, 531}, {7, 11, 14}};
        get_total_cost(3,cost_3);
        int cost_2[][] = {{1, 2, 3}, {10, 11, 12}};
        get_total_cost(2, cost_2);

    }

    public static int get_total_cost(int houses, int cost[][]){
        //Base Cases
        if(houses == 0)
            return 0;
        int C[][] = new int[houses][3];
        if(houses == 1) {
           //int c = Math.min(cost[0][0]), cost(0,1) , cost(0,2));
            //C[0][0] = cost[0,0];
            return -1;
        }
        return 0;
        // C[i,j] =  P[i,j] + Math.min(C[i-1],[j+1],C[i-1],j+2]);

    }
}

/***
 *  Rishabh Jaiswal ( rshbh.jaiswal@gmail.com  )
 *
 * Q1.
 * There are a row of N houses, each house can be painted with one of the three colors: red, blue or green.
 * The cost of painting each house with a certain color is different. You have to paint all the houses such that no two adjacent houses have the same color.
 * The cost of painting each house with a certain color is represented by a N x 3 cost matrix A. Find the Minimum Total Cost to paint all houses.
 *
 * Test cases :
 *
 *
 *  {{4,7,12}}
 * {{5,14,73},{1,543,875},{231,4,531},{7,11,14}}
 * {{1,2,3}, {10,11,12}}
 *
 *
 * Ans:
 *
 *
 * {{1,2,3}, {1,574,897}}   --->  1 + 574  >  2+1
 * {{1,2,3}, {10,11,12}}
 *
 * {{5,14,73},{1,543,875},{231,4,531}}
 *
 *
 * Given : Pi,j = price of painting ith house with jth color
 *
 * Suppose
 * Ci,j = minimum total cost of painting all the houses till ith house such that ith house is of jth color (or all i <= k and for all j =(0,1,2))
 *
 * Ck+1,0 =  Ck,0  +  Math.min(Ck+1,1 , Ck+1,2);
 *
 * K = 6;
 * i=6
 *
 * C7,0 =  Math.min(C6,1 , C6,2)            +       P7,0
 *
 *
 * If
 * C[i,j] =  P[i,j] + Math.min(C[i-1],[j+1],C[i-1],j+2]);
 *
 * public static void main(String args[]) {
 *    int cost_1[][] =  {{4, 7, 12}};
 *    get_total_cost(1, cost_1);
 *    int cost_3[][] =  {{5, 14, 73}, {1, 543, 875}, {231, 4, 531}, {7, 11, 14}};
 *    get_total_cost(3,cost_3);
 *    int cost_2[][] = {{1, 2, 3}, {10, 11, 12}};
 *    get_total_cost(2, cost_2);
 *
 * }
 *
 * public static int get_total_cost(int houses, int cost[][]){
 *    //Base Cases
 *    if(houses = 0)
 *        return 0;
 *    int C[][] = new int[houses][3];
 *    if(house = 1) {
 *        int c = Math.min(cost(0,0), cost(0,1) , cost(0,2));
 *        C[0][0] = cost[0,0];
 *        return c;
 *    }
 *
 *    // C[i,j] =  P[i,j] + Math.min(C[i-1],[j+1],C[i-1],j+2]);
 *
 * }
 *
 *
 *
 *
 * Q2.
 * Given a N*2  array A where (A[i][0], A[i][1]) represents the i-th pair.
 * In every pair, the first number is always smaller than the second number.
 * I.e. -> A pair (c, d) can follow another pair (a, b) if b < c ,
 * Similarly in this way a chain of pairs can be formed.
 * Find the length of the longest chain subsequence which can be formed from a given set of pairs.
 *
 * Ans:
 * Test Cases :
 *     Case1.-    {{5, 24},{39, 60},{15, 28},{27, 40},{50, 90}}
 *     Case2.-    {{1, 2},{4, 5},{7, 8},{3, 8},{1, 9}}
 *
 *
 * Explanation:
 * Array given initially ->  (ai,bi) (for i=0 to n-1)
 * Given -> ai < bi
 * Chain -> for any two indexes j,k -> j < k -------> bj < ak
 *
 *  Case1.-    {{5, 24},{39, 60},{15, 28},{27, 40},{50, 90}}
 *
 *
 *
 * {5, 24},{39, 60}
 *   {{5, 24},{39, 60},{15, 28},{27, 40},{50, 90}}
 * Public static int get_longets_chain(int[][] cost) {
 * Int chain =0;
 * for(int i=1;i<cost.length;i++){
 * 	if(a[i][0] > a[i-1][1]
 * 		Chain = chain+1;
 * 	Else
 *
 *
 *
 * }
 *
 * Return 1;
 */