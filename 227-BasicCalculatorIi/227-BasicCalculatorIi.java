// Last updated: 4/22/2026, 3:47:16 PM
class Solution {
    public int calculate(String s) {
      
      Stack <Integer> st = new Stack<>();
      int num = 0;
      char prevoprater = '+';

      for(int i=0;i<=s.length();i++)
      {    
         char ch = (i<s.length()) ? s.charAt(i) : '\0';

         if(Character.isDigit(ch)) 
         {
            num = num*10 +(ch - '0');           
         }

         if(!Character.isDigit(ch) && ch != ' ' || i == s.length())
         {

            if(prevoprater == '+') st.push(num);
            if(prevoprater == '-') st.push(-num);
            if(prevoprater == '*') st.push(st.pop() * num);
            if(prevoprater == '/') st.push(st.pop() / num);

           prevoprater = ch ; 
           num = 0;

         }

      }
      int ans = 0 ;
      while (!st.isEmpty())
      {
        ans = ans+st.pop();
      }

      return ans;

    }
}