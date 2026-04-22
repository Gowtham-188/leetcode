// Last updated: 4/22/2026, 3:46:42 PM
class Solution {
    public String decodeString(String s) {

        int n=s.length();
        
        Stack <Integer> numstack=new Stack<>();
        Stack<String > strstack=new Stack<>();
        StringBuilder ans=new StringBuilder();
        int num=0;


        for(int i=0;i<n;i++)
        {
           
           if(Character.isDigit(s.charAt(i)))
           {

                  num=num*10+(s.charAt(i)-'0');
           }
           else if(s.charAt(i)=='[')
           {
             numstack.push(num);
             
             num=0;
             strstack.push(ans.toString());
             ans=new StringBuilder();
           }
          
           else if(s.charAt(i)==']')
           {
             String str=ans.toString();
             ans=new StringBuilder(str.repeat(numstack.pop()));
             StringBuilder temp=ans;
             ans=new StringBuilder(strstack.pop());
             ans=ans.append(temp);      


           }
           else
           {
               ans.append(s.charAt(i));
           }
        }
        return ans.toString();
        
    }
}