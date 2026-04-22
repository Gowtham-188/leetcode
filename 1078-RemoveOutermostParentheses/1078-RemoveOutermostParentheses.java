// Last updated: 4/22/2026, 3:45:53 PM
class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder str=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++)      //nalla paaru easy than 
        {
            if(s.charAt(i)==')')
            {
                count--;
            }
            if(count!=0)
            {
                str.append(s.charAt(i));

            }
            if(s.charAt(i)=='(')
            {
                count++;
            }
        }
        return str.toString();
    }
}