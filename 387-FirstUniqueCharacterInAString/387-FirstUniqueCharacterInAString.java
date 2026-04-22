// Last updated: 4/22/2026, 3:46:45 PM
class Solution {
    public int firstUniqChar(String s) {

        int n=s.length();

        char ans[]=s.toCharArray();   // {l,e,e,t,c,o,d,e}
        
        HashMap<Character,Integer> map=new HashMap<>();

        for(char a:ans )
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }

        for(int i=0;i<n;i++)
        {
            if(map.get(ans[i])==1)
            {
                return i;
            }
        }
        return -1;



        


        
    }
}