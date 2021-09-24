/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/

package array;

class Stock {
    public static int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int min = prices[0];
        int profit = prices[1] - prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - min > profit) {
                profit = prices[i] - min;
            }
            if (min > prices[i]) {
                min = prices[i];
            }
        }
        if (profit < 0)
            return 0;
        return profit;
    }
    public static int maxProfitSells(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                profit=profit+(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }
}