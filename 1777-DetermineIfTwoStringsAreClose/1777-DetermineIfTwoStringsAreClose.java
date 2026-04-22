// Last updated: 4/22/2026, 3:44:46 PM
class Solution {
    public boolean closeStrings(String word1, String word2) {

        int f1[]=new int[26];
        int f2[]=new int [26];

        for(int i=0;i<word1.length();i++)
        {
            char ch=word1.charAt(i);
            f1[ch-'a']=f1[ch-'a']+1;

        }
        
        for(int i=0;i<word2.length();i++)
        {
            char ch=word2.charAt(i);
            f2[ch-'a']=f2[ch-'a']+1;
        }
    //check letter same 
        for(int i=0;i<26;i++)
        {
            if(f1[i]!=0 && f2[i]==0 || f1[i]==0 && f2[i]!=0)
            {
                return false;
            }
        }
//check size

Arrays.sort(f1);
Arrays.sort(f2);

   return Arrays.equals(f1,f2);

        
    }
}