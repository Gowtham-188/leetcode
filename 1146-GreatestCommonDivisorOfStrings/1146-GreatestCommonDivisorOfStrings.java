// Last updated: 4/22/2026, 3:45:50 PM
class Solution {
    public String gcdOfStrings(String str1, String str2) {



        int a=str1.length();
        int b=str2.length();

        if(!(str1+str2).equals(str2+str1))
        {
            return "";
        }
        while(b!=0)
        {

            int r=b;           //r=4        r=2
             b=a%b;            //b=6%4=2    b=4%2=0
             a=r;              //a=4        a=2
        }
        return str2.substring(0,a);

       
        
    }
}