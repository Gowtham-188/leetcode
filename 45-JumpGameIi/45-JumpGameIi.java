// Last updated: 4/22/2026, 3:48:45 PM
class Solution {
    public int jump(int[] nums) {

           int ans=0;
           int end=0;
           int farthest=0;

           for(int i=0;i<nums.length-1;i++)
           {
            farthest=Math.max(farthest,i+nums[i]); //4

            if(farthest>=nums.length-1)  
            {
                ans++;
                break;
            }
            if(i==end)
            {
                ans++;
                end=farthest;
            }
           }

           return ans;
        
    }
}