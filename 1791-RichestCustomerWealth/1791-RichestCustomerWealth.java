// Last updated: 4/22/2026, 3:44:44 PM
class Solution {
      int sum=0;
    public int maximumWealth(int[][] accounts) {
      
        for(int i=0;i<accounts.length;i++)
        {
            int value=0;
           for(int j=0;j<accounts[i].length;j++)
           {
              value=value+accounts[i][j];
           }
         
              sum=Math.max(sum,value);
        }
        return sum;
    }
}