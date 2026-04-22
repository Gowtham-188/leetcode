// Last updated: 4/22/2026, 3:44:27 PM
class Solution {
    public int longestBeautifulSubstring(String word) {
     

        int count=1;
        int left=1;
        int max=0;

for(int i=1;i<word.length();i++)
        {
            if(word.charAt(i)==word.charAt(i-1))
            {   
               
                    count++;
               
               
            }
            else if(word.charAt(i-1)<word.charAt(i))
            {
                  left++;
                  count++;
            }
          else 
          {
           left=1;
           count=1;

          }
       if(left==5)
       {
        max=Math.max(max,count);
       }

        }
        return max;
    }
}