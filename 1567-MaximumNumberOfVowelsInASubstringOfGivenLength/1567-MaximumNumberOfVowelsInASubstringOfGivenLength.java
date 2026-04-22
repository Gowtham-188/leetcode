// Last updated: 4/22/2026, 3:45:00 PM
class Solution {
    public int maxVowels(String s, int k) {
        
        boolean [] vowels=new boolean['z' +1];

          vowels['a']=true;
        vowels['e']=true;
        vowels['i']=true;
        vowels['o']=true;
        vowels['u']=true;
      // String vowels="aeiouAEIOU";

        char [] chars=s.toCharArray();
        int r=0;
        int maxn=0;
        for(;r<k;r++)
        {
            if(vowels[chars[r]])
            {
                maxn++;
            }
        }
       int len=s.length();
       int l=0;
       int n=maxn;

     for(;r<len;l++,r++)
     {
        if(vowels[chars[l]])
        {
            n--;
        }
        if(vowels[chars[r]])
        {
            n++;
        }
        if(maxn<n)
        {
            maxn=n;
        }

     }
     return maxn;
    }
}