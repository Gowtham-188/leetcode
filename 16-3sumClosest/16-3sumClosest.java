// Last updated: 4/22/2026, 3:49:06 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
       int result=nums[0]+nums[1]+nums[2];

       for(int i=0;i<nums.length-2;i++)
       {
        int left=i+1;
        int right=nums.length-1;

        while(left<right)
        {
            int sum=nums[i]+nums[left]+nums[right];

            if(Math.abs(target-sum)<Math.abs(target-result))
            {
                result=sum;
            }
            if(target==sum)return target;

            else if(target>sum) 
            left++;
            else
            {
                right--;
            }
        }
       }
       return result;
    }
}