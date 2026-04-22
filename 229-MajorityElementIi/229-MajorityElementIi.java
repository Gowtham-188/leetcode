// Last updated: 4/22/2026, 3:47:13 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {

       HashMap<Integer,Integer> map=new HashMap<>();
  List<Integer> list=new ArrayList<>();
       for(int i=0;i<nums.length;i++)
       {
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
        int n=nums.length/3;

       for(int k:map.keySet())
       {
        if(map.get(k)>n)
        {
           list.add(k);
        }
       }
        return list;
       }
}