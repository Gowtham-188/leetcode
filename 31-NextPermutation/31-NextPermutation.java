// Last updated: 4/22/2026, 3:48:53 PM
class Solution {
    public void nextPermutation(int[] nums) {

        int i=nums.length-1;

        while(i>0 && nums[i]<=nums[i-1])
        {
            i--;
        }
        if(i==0)
        {
            reverce(nums,0,nums.length-1);
            return ;
        }
         int j=nums.length-1;
        while(j>=i && nums[j]<=nums[i-1])
        {
            j--;
        }

        Swap(nums,i-1,j);
        reverce(nums,i,nums.length-1);
        
    }
    public void Swap(int [] nums,int left,int right)
    {
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }

    public void reverce(int [] nums,int start,int end)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}