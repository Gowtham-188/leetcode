// Last updated: 4/22/2026, 3:44:51 PM
class Solution {
    public int numSplits(String s) {
        HashMap <Character,Integer> left=new HashMap<>();
           HashMap <Character,Integer> right=new HashMap<>();
         
           for(int i=0;i<s.length();i++)
           {
            left.put(s.charAt(i),left.getOrDefault(s.charAt(i),0)+1);
           }
         int  count=0;
           for(int i=0;i<s.length();i++)
           {
            char curr=s.charAt(i);

            right.put(curr,right.getOrDefault(curr,0)+1);
            left.put(curr,left.getOrDefault(curr,0)-1);
          
          if(left.get(curr)==0)
          {
            left.remove(s.charAt(i));
          }

          if(left.size()==right.size())
          {
            count++;
          }
           }
             return count;
    }                                               
}

