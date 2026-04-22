// Last updated: 4/22/2026, 3:49:08 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0) return "";

         String st = strs[0];

        for(int i=0;i<strs.length;i++)
        {

            while(strs[i].indexOf(st) != 0)
            {
                st = st.substring(0,st.length()-1);
                
                if(st.isEmpty())
                {
                    return "";
                }
            }
           

           

        }

        return st;
        
    }
}