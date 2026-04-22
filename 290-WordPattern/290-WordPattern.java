// Last updated: 4/22/2026, 3:47:01 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character,String > map = new HashMap<>();

        String[] s1  = s.split(" ");

        if(pattern.length() != s1.length) return false;

        for(int i=0;i<pattern.length();i++)
        {
            if(!map.containsKey(pattern.charAt(i)))
            {
                if(map.containsValue(s1[i])) return false;
                map.put(pattern.charAt(i),s1[i]);
            }

            

            if(!map.get(pattern.charAt(i)).equals(s1[i]))
            {
                return false;

            }
        }

        return true;
        
    }
}