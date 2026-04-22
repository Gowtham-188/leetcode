// Last updated: 4/22/2026, 3:46:28 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int sum=0;
        int count=0;

        HashMap<Integer,Integer> map=new HashMap<>();   //0--->1  //0--->1  
                                                        //1--->1  // 1--->1
                                                                     //3-->1   
                                                        //2--->1   //6--->1
                                                        //3--->1
     map.put(0,1);
     for(int i=0;i<nums.length;i++)
     {
        sum=sum+nums[i];

        if(map.containsKey(sum-k))
        {
           count=count+map.get(sum-k);
        }

        map.put(sum,map.getOrDefault(sum,0)+1);
     }

     return count;
    }
}