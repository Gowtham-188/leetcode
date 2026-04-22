// Last updated: 4/22/2026, 3:47:20 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int n:map.keySet())
        {
            if(map.get(n)>=2)
            {
                return true;
            }
        }
        return false;
        
    }
}