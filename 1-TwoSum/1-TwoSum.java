// Last updated: 4/22/2026, 3:49:21 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        for(int i=0;i<nums.length;i++)
        {
           int sum = target-nums[i];

           for(int j=0;j<nums.length;j++)
           {

            if (i==j) continue;
            if(nums[j] == sum)
            {
                return new int[] {i,j};
            }
           }
        }
       
    return new int[] {-1};
  
    }
} 