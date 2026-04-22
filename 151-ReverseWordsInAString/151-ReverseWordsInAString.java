// Last updated: 4/22/2026, 3:47:48 PM
class Solution {
    public String reverseWords(String s) {

      String [] gow=s.split("\\s+");

      int n=gow.length-1;

      StringBuilder ans=new StringBuilder();

      for(int i=n;i>=0;i--)
      {
        ans.append(gow[i]);

        if(i!=0)
        {
            ans.append(" ");
        }
      }
      return ans.toString().trim();
    }
}
