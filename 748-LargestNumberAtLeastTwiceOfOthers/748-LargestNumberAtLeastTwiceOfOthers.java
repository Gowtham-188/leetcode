// Last updated: 4/22/2026, 3:46:15 PM
class Solution {
    public int dominantIndex(int[] nums) {


        int max=0, second=0, maxindex=0;

        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                second=max;
                max=nums[i];
                maxindex=i;
            }
            else if(second<nums[i])
            {
                second=nums[i];
            }
        } 

        return max>=2*second?maxindex:-1;
         
         
         
           
    }
}