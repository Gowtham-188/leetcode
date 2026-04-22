// Last updated: 4/22/2026, 3:44:13 PM
class Solution {
    public String removeStars(String s) {
        int n=s.length();

        Stack<Character> stack=new Stack<>();

        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);

            if(ch!='*')
            {
                stack.push(ch);

            }
            else
            {
                stack.pop();

            }
        }

        StringBuilder sp=new StringBuilder();
         
         while (!stack.isEmpty())
         {
            sp.append(stack.pop());
         }

         sp.reverse();
         return sp.toString() ;
        
    }
}