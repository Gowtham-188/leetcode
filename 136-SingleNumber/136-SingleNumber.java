// Last updated: 4/22/2026, 3:47:57 PM
class Solution {
    public int singleNumber(int[] nums) {



// for(int i=0;i<nums.length;i++)
// {
//     for(int j=i+1;j<nums.length;j++)
//     {

//          if(nums[i]==nums[j])
//          {
//              nums[i]=0;
//              nums[j]=0;
//          }
//     }
// }
// for(int i=0;i<nums.length;i++)
// {
//     if(nums[i]!=0)
//     {
//         return nums[i];
//     }
// }
// return nums[0];

    int ans=0;

    for(int num:nums)
    {
        ans=ans^num;

    }
    return ans;
 }
}