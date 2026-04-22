// Last updated: 4/22/2026, 3:44:37 PM
class Solution {
    public int totalMoney(int n) {
        
        int start=1;
        int sum=0;
        int temp=1;

        if(n<7)return n*(n+1)/2;

        for(int i=1;i<=n;i++)
        {  
              sum=sum+start;
            if(i%7==0)
            {
               start=temp+1;
               temp++;
            }
            else  start++;
        }
        return sum;

        
    }
}