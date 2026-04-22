// Last updated: 4/22/2026, 3:47:11 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int [] ans=new int[nums.length];
     

        for(int i=0;i<nums.length;i++)
        {
        ans[i]=1;     
        }
        int left=1;
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=ans[i]*left;
            left=left*nums[i];
        }

        left=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            ans[i]=ans[i]*left;
            left=left*nums[i];
        }

        return ans;
     
    }
}