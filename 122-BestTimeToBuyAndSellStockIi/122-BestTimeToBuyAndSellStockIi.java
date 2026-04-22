// Last updated: 4/22/2026, 3:48:02 PM
class Solution {
    public int maxProfit(int[] prices) {
       

      int profit = 0;

      for(int i = 1 ;i<prices.length;i++)
      {
        if(prices[i] > prices[i-1])
        {
            profit = profit + (prices[i] - prices[i-1]);
            
        }
      }
        return profit;
    }
}