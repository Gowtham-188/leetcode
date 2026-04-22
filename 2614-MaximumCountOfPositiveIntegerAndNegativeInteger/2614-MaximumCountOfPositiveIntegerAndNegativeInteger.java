// Last updated: 4/22/2026, 3:44:05 PM
class Solution {
    public int maximumCount(int[] nums) {
           
        int n=nums.length;   
        int poscount=0;
        int negcount=0;
        int maxcount=0;

        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
                negcount++;
            }
            else if(nums[i]>0)
            {
                poscount++;
            }
        }
      return  maxcount=Math.max(negcount,poscount);
        
        
    }
}