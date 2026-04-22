// Last updated: 4/22/2026, 3:44:50 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int count=0;
        int n=nums.length-1;//5 ithu last 3 element ku i value poga venanu 

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j]&&i<j)
                {
                    count++;
                }
            }
        }
        return count;
    }
}