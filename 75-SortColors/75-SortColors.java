// Last updated: 4/22/2026, 3:48:20 PM
class Solution {
    public void sortColors(int[] nums) {


      for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)

            {
                if(nums[i]>nums[j])
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }

            }
        }
   

     


        
    }

    
}