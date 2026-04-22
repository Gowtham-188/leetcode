// Last updated: 4/22/2026, 3:46:29 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int [] ans=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            ans[i]=-1;
            for(int j=1;j<nums.length;j++)
            {
                int idx=(i+j)%nums.length;
                if(nums[i]<nums[idx])
                {
                    ans[i]=nums[idx];
                    break;
                }
            }
        
        }

        return ans;   
    }
}