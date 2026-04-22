// Last updated: 4/22/2026, 3:46:05 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {



        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]%2==1)
        //     {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //        if(nums[j]%2==0)
        //        {
        //         int temp=nums[i];
        //         nums[i]=nums[j];
        //         nums[j]=temp;
        //         break;
        //        }

        //     }
        //     }
        // }

        // return nums;

        int left=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                int temp=nums[left];
                nums[left]=nums[i];
                nums[i]=temp;
                left++;
            }
        }
        return nums;
        
    }
}