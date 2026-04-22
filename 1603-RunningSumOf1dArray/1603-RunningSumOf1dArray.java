// Last updated: 4/22/2026, 3:44:54 PM
class Solution {
    public int[] runningSum(int[] nums) {
       
        int sum=nums.length;
         int [] arr=new int[sum];
        int num =0;

    
        for(int i=0;i<nums.length;i++)
        {     
        
           num= num+nums[i];
              arr[i]=num;
           
        }
       return arr;
    }
}