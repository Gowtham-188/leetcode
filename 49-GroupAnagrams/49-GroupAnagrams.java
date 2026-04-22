// Last updated: 4/22/2026, 3:48:41 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap< String , List<String> > map=new HashMap<>();

        for(String gowtham:strs)
        {
            char []chars=gowtham.toCharArray();
            Arrays.sort(chars);

            String sortwords=new String (chars);

            if(!map.containsKey(sortwords))
            {
                map.put(sortwords,new ArrayList());
            }
            map.get(sortwords).add(gowtham);
        }
          return new ArrayList(map.values());
        
        
    }
}