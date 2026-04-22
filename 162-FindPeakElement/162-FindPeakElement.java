// Last updated: 4/22/2026, 3:47:43 PM
class Solution {
    public int findPeakElement(int[] nums) {

        int left=0;
        int right=nums.length-1;

        while(left<right)
        {
            int mid=(left+right)/2;
            if(nums[mid]>nums[mid+1])
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
        }
    return left;
        
    }
}