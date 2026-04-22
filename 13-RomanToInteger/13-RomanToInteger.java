// Last updated: 4/22/2026, 3:49:09 PM
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hash=new HashMap<>();
        
        hash.put('I',1);
        hash.put('V', 5);
         hash.put('X',10 );
          hash.put('L', 50);
           hash.put('C',100 );
            hash.put('D',500 );
             hash.put('M',1000 );
int ans=0;                                          //1000  900 1900 1890 1990 1989 1994

   for(int i=0;i<s.length()-1;i++)
   {
    if(hash.get(s.charAt(i))<hash.get(s.charAt(i+1)))
    {
        ans=ans-hash.get(s.charAt(i));
    }

    else
    {
        ans=ans+hash.get(s.charAt(i));
    }
   }

   return ans+hash.get(s.charAt(s.length()-1));

    }
}