// Last updated: 4/22/2026, 3:45:07 PM
class Solution {
    public int numberOfSubstrings(String s) {


        int count=0;
        int left=0;

        int [] abc=new int[3];

        for(int i=0;i<s.length();i++)
        {
            abc[s.charAt(i)-'a']++;


            while(abc[0]>0 && abc[1]>0 && abc[2]>0)
            {
                count=count+s.length()-i;
                  abc[s.charAt(left)-'a']--;
                  left++;

            }
             

        }

        return count;
        
        
    }
}