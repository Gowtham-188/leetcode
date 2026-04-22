// Last updated: 4/22/2026, 3:48:13 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

List<List<Integer>> list=new ArrayList<>();

List<Integer> subset=new ArrayList<>();

Arrays.sort(nums);

  
  Createsubset(nums,0,subset,list);

  return list;

        
    }

    public void  Createsubset(int[] nums,int index,
List<Integer>subset,List<List<Integer>> list)
{
    if(index==nums.length)
    {
        list.add(new ArrayList<>(subset) );
        return ;
    }

    subset.add(nums[index]);

    Createsubset(nums,index+1,subset,list);

    subset.remove(subset.size()-1);

    while(index+1<nums.length && nums[index]==nums[index+1])
    {
        index++;
    }
    
    Createsubset(nums,index+1,subset,list);

}
}