// Last updated: 4/22/2026, 3:46:56 PM
class Solution {
    public int coinChange(int[] coins, int amount) {

        int [] arr=new int[amount+1];

        Arrays.fill(arr,amount+1);

        arr[0]=0;

        

        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<coins.length;j++)
            {
                if(i-coins[j]>=0)
                {
             arr[i]=Math.min(arr[i],1+arr[i-coins[j]]);
                }
            }
        }
        return arr[amount]!=amount+1 ?arr[amount]  :-1;
    }
}