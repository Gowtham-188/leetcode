// Last updated: 4/22/2026, 3:44:55 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int zero=0;
        int maxcount=0;

        for(int r=0;r<nums.length;r++)
        {
            if(nums[r]==0)
            {
                zero++;
            }
            while(zero>1)
            {
                if(nums[l]==0)
                {
                    zero--;
                }
                l++;
            }
            maxcount=Math.max(maxcount,r-l+1-zero);
        }
        return (maxcount==nums.length)? maxcount-1:maxcount;
    }
}