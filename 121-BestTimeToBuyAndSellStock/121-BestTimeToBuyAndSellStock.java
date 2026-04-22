// Last updated: 4/22/2026, 3:48:04 PM
class Solution {
    public int maxProfit(int[] prices) 
    {
       int n=prices.length;
       int buyprice=prices[0];
       int profit=0;
       int ans=0;

       for(int i=1;i<n;i++)
       {

        if(buyprice>prices[i])
        {
            buyprice=prices[i];
        }
        else
        {

      profit=prices[i]-buyprice;

      ans=Math.max(ans,profit);
         }


       }

       return ans;
    }
}
