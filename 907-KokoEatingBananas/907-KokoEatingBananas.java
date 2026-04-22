// Last updated: 4/22/2026, 3:46:11 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left=0;
        int right=0;
        for(int i=0;i<piles.length;i++)
        {
            right=Math.max(right,piles[i]);
        }
        int ans=0;
        while(left<=right)
        {
            int mid=left+(right-left)/2; //5
            
           int time=0;
            for(int i=0;i<piles.length;i++)
{
               time+=Math.ceil((double)(piles[i])/mid);
               // time+=((double)(piles[i])/mid);
            }            
            if(time>h)
            {
                left=mid+1;
                
            }
            else
            {
                ans=mid;
                right=mid-1;

            }
            
        }
        return ans;
    }
}