// Last updated: 8/7/2026, 9:16:41 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3
4        int buyprice = Integer.MAX_VALUE;
5        int profit = 0;
6
7        for(int i=0;i<prices.length;i++) {
8
9            if(buyprice > prices[i]) 
10            {
11                buyprice = prices[i];
12            }
13
14           profit =  Math.max(profit , prices[i] - buyprice);
15
16        
17        }
18        return profit;
19        
20    }
21}