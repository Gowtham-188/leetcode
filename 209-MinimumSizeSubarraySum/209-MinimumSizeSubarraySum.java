// Last updated: 4/22/2026, 3:47:24 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left=0;
        int i=0;
        int count=Integer.MAX_VALUE;
        int sum=0;

        for(i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];

            while(sum >=target)
            {
                if(i-left+1 < count)
                {
                    count=i-left+1;
                }

                sum=sum-nums[left];
                left++;
            }


        }

       return count==Integer.MAX_VALUE ?0:count;
        
    }
}