// Last updated: 4/22/2026, 3:48:01 PM
class Solution {
    public boolean isPalindrome(String s) {

       int left=0;
       int right =s.length()-1;
     while (left<=right){
       if(!isvalidcarecter(s.charAt(left)))
       {
          left++;
       }
       else if(!isvalidcarecter(s.charAt(right)))
       {
        right--;
       }
       else
       {
        if(lowercase(s.charAt(left)) != lowercase(s.charAt(right)))
        {
            return false;

        }
         left++;
         right--;
       }
     }

       return true;
       }

      public  char  lowercase(char c)
       {
        if(c<=90)
        {
            return (char)(c+32);
        }
        return c;
       }



       private boolean isvalidcarecter(char c)
       {
        return ((c>=48&&c<=57 )||( c>=65&&c<=90)|| (c>=97&&c<=122));
        
    }
    }