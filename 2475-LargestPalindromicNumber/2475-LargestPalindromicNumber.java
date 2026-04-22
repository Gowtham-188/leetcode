// Last updated: 4/22/2026, 3:44:12 PM
class Solution {
    public String largestPalindromic(String num) {

        int [] v=new int[10];
        for(int i=0;i<num.length();i++)
        {
            v[(int)num.charAt(i)-48]++;
        }
         
         StringBuffer st=new StringBuffer();
         int single=-1;
        for(int j=9;j>=0;j--) 
        {
            if(st.length()==0 && j==0) continue;
            while(v[j]>1)
            {
                st.append((char)(j+48));
                v[j]=v[j]-2;
            }
            if(v[j]==1 && single==-1)
            {
                single=j;
            }

        }
        if(st.length()==0 && single==-1) return "0";
        int i=st.length()-1;
        if(single!=-1){
         st.append((char)(single+48));
        }
        for(;i>=0;i--)
        {
           st.append(st.charAt(i));
        }

        return st.toString();
        
    }
}