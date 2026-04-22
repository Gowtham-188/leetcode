// Last updated: 4/22/2026, 3:46:39 PM
class Solution {
    public boolean canPartition(int[] nums) {

      int total=0;
      for(int n:nums)
      {
           total=total+n;
      }
      if(total%2!=0)
      {
        return false;
      }

      int target=total/2; //11
      boolean [] db=new boolean [target+1];

      db[0]=true;

      for(int n:nums)
      {
        for(int i=target;i>=n;i--)
        {
           if (db[i]) continue;

           if (db[i-n]) db[i] = true;

           if (db[target]) return true;           
        }
      }

    // for(int i=0;i<nums.length;i++)
    // {
    //     if(nums[i]==target)
    //     {
    //         return true;
    //     }
    // }

      return false;  
        
    }
}