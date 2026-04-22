// Last updated: 4/22/2026, 3:49:15 PM
class Solution {
    public int reverse(int x) {
               boolean sign=true;

               if(x<0)
               {
                   sign=false;
               }   
               x=Math.abs(x);           //123
               long  rev=0;

               while (x>0) 
               {
                   rev=(rev*10)+(x%10);   //0+3=3 //30+1.3=31.3//
                                          //313+0.123=313.123
                   x=x/10;                //123/10=12.3 //1.23//0.123
               
              if(rev>Integer.MAX_VALUE|| rev<Integer.MIN_VALUE)
              {
               return 0;
              }

               }
               if(sign==false)
               {
                return  -1*(int)rev;
               }

        return (int)rev;
    }
}



