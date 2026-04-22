// Last updated: 4/22/2026, 3:48:26 PM
class Solution {
    public String addBinary(String a, String b) {


        int left=a.length()-1;
        int right=b.length()-1;
        int carry=0;
       String ans="";
       int ld1=0;
       int ld2=0;
       int sum=0;

        while(left>=0 || right>=0 || carry !=0)
        {
            ld1=0;
            ld2=0;

            if(left>=0)
            {
                ld1=(a.charAt(left)-48);
                 left--;
            }
            if(right>=0)
            {
                ld2=(b.charAt(right)-48);
                 right--;
            }
            sum=ld1+ld2+carry;
            
            carry=sum/2;
            sum=sum%2;
            ans=sum+ans;
        
        

            
        }
        return ans;
        
    }
}