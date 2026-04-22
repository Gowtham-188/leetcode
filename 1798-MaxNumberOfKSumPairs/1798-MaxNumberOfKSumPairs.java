// Last updated: 4/22/2026, 3:44:39 PM
class Solution {
    public int maxOperations(int[] nums, int k) {
        
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;    //3
        int ans=0;

        while (i<j)
        {
            int temp=nums[i]+nums[j];
            if(temp==k)
            {
                i++;
                j--;
                ans++;

            }
            else if(temp<k)
            {
                i++;
            }
            else
            {
                j--;
            }
        }

        return ans;
    }
}