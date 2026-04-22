// Last updated: 4/22/2026, 3:47:56 PM
class Solution {
    public int singleNumber(int[] nums) {

        int ones=0; int twos=0;

        for(int num:nums)
        {
            ones=(ones^num)& ~twos;
            twos=(twos^num) & ~ones;
        }

        return ones;
        
    }
}