// Last updated: 4/22/2026, 3:47:45 PM
class Solution {
    public int findMin(int[] nums) {
     int left=0;
     int right=nums.length-1;

while(left<right)
{
    int mid=(left+right)/2;

    if(nums[mid]<nums[right])
    {
        right=mid;
    }
    else
    {
        left=mid+1;
    }
}

return nums[left];
    }
}