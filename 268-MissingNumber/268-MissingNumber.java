// Last updated: 4/22/2026, 3:47:09 PM
class Solution {
    public int missingNumber(int[] nums) {
      int n=nums.length;
      int sum=0;
      for(int num:nums)
      {
        sum=sum+num;
      }

       n=n*(n+1)/2;
     
     return n-sum;
    }
}