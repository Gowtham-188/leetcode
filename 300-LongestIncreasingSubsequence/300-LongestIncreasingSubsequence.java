// Last updated: 4/22/2026, 3:46:59 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
     
       int n=nums.length;
        int length=0;

        int [] arr =new int [n];
        
        for(int i=0;i<n;i++)
        {
           arr[i]=1;
           for(int j=0;j<i;j++)
           {
            if(nums[j]<nums[i] && (1+arr[j])>arr[i])
            {
                arr[i]=1+arr[j];
            }

           } 
           if(arr[i]>length)
           {
            length=arr[i];
           }
        }
        return length;
        
    }
}