// Last updated: 4/22/2026, 3:45:57 PM
class Solution {
    public int helper(int[] nums, int k) {

int l=0;
int r=0;
int count=0;

HashMap<Integer,Integer> map=new HashMap<>();

while(r<nums.length)
{
    map.put(nums[r],map.getOrDefault(nums[r],0)+1);
    
    while(map.size()>k)
    {
        map.put(nums[l],map.get(nums[l])-1);

        if(map.get(nums[l])==0)
        {
            map.remove(nums[l]);
        }
        l=l+1;
    }
    count =count+(l-r+1);
    r=r+1;
}
return count;

        
        
    }

     public int subarraysWithKDistinct(int[] nums, int k) {
        int ans1 = helper(nums,k);
        int ans2 = helper(nums,k-1);
        return ans2 - ans1;
    }
}