// Last updated: 4/22/2026, 3:45:13 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num : arr)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }

       HashSet <Integer> set=new HashSet<>(map.values());

       if(set.size()==map.size())
       {
        return true ;
       }
       else
       {
        return false;
       }
          
        
        
    }
}