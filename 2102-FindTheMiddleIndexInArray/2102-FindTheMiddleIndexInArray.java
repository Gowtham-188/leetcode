// Last updated: 4/22/2026, 3:44:24 PM
class Solution {
    public int findMiddleIndex(int[] nums) {


        int sum=0;
        for(int i:nums)sum=sum+i;
        int left=0;
        for(int i=0;i<nums.length;i++)
        {
            if(left==sum-left-nums[i])return i;
            left=left+nums[i];
        }
        return -1;

        
    }
}