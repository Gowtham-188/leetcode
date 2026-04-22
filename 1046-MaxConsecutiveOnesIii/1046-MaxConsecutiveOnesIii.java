// Last updated: 4/22/2026, 3:45:55 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
    int j=0;
    int zero=0;
    int size=0;

    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==0)
        {
            zero++;
        }
        while(zero>k)
        {
            if(nums[j]==0)
            {
                zero--;
            }
            j++;
        }
        size=Math.max(size,i-j+1);
    }
    return size;
    }
}