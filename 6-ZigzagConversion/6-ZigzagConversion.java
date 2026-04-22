// Last updated: 4/22/2026, 3:49:16 PM
class Solution {
    public String convert(String s, int numRows) {

        if(numRows>=s.length() || numRows==1)
        {
            return s;
        }
        
       int clength=(numRows*2)-2;

       StringBuilder[] st=new StringBuilder[numRows];

      for(int i=0;i<numRows;i++)
      {
          st[i]=new StringBuilder();
      }
      int pos=0;
      for(int i=0;i<s.length();i++)
      {  
         pos=i%clength;
         if(pos>=numRows)
         {
            pos=clength-pos;
         }
         st[pos].append(s.charAt(i));
      }

      StringBuilder ss=new StringBuilder();
      for(int j=0;j<st.length;j++)
      {
        ss.append(st[j]);
      }

      return ss.toString();

        
    }
}