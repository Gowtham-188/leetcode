// Last updated: 4/22/2026, 3:47:03 PM
class Solution {
    public void moveZeroes(int[] nums) {
        
        int left=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[left]=nums[i];
                left++;

            }
        }
         for(int j=left;j<nums.length;j++)
         {
            nums[j]=0;
         }

     
      }
    }
