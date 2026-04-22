// Last updated: 4/22/2026, 3:49:12 PM
class Solution {
    public boolean isPalindrome(int x) {


    //     String s=String.valueOf(x);

    //     int left=0,right=s.length()-1;

    //     while (left<right)
    //     {
    //         if(s.charAt(left)==s.charAt(right))
    //         {
    //             left++;
    //             right--;
    //         }
    //         else return false;
    //     }
    //    return true;
    //.....................................................

    if(x<0)return false;
    int rev = 0 ;
    int xcopy = x ;

    while (x > 0)
    {
        rev = (rev * 10) + (x % 10) ; //last lement 1

        x = x/10;
    }

    return rev==xcopy;

    

        
    }
}