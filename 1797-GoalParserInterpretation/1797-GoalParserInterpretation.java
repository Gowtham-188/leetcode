// Last updated: 4/22/2026, 3:44:43 PM
class Solution {
    public String interpret(String command) {
        
     //   StringBuilder ans=new StringBuilder();

     String ans="";

      for(int i=0;i<command.length();i++)
      {
        if(command.charAt(i)=='G')
        {
           // ans.append('G');
           ans=ans+'G';
        }
        else if(command.charAt(i)=='(' && command.charAt(i+1)==')')
        {
            i++;
           // ans.append('o');
           ans=ans+'o';
        }
        else
        {
            i=i+3;
            // ans.append('a');
            // ans.append('l');
                       ans=ans+'a';
                       ans=ans+'l';


        }

          
      }
      return ans;

    }
}