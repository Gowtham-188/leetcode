// Last updated: 4/22/2026, 3:45:10 PM
class Solution {             
    public int numberOfSteps(int num)
     {
                     
        return gowtham(num,0);
     }                            
                         //0        4
        public int gowtham(int num,int steps)
        {
            if(num==0)
            {
                return steps;
            }
             else if(num%2==0)
            {
                return gowtham(num/2 ,steps+1);
            }
        
             return gowtham(num-1,steps+1);
            
         }
   
}