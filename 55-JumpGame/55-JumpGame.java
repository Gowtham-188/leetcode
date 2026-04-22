// Last updated: 4/22/2026, 3:48:36 PM
class Solution {
    public boolean canJump(int[] nums) {
       
        int goal = nums.length-1;

        for (int i= nums.length-2 ;0<=i ;i--)
        {
            if(i+nums[i] >= goal)
            {
                goal = i;
            }

        }
        
        return goal == 0;
        
    }
}