// Last updated: 4/22/2026, 3:47:58 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       
       int costsum=0;
       int gassum=0;
       for(int i=0;i<gas.length;i++)
       {
        costsum=costsum+cost[i];
        gassum=gassum+gas[i];
       }
       if(costsum>gassum)
       {
        return -1;
       }
        int start=0;
        int p=0;
       for(int j=0;j<gas.length;j++)
       {
           p=p+gas[j]-cost[j];  

           if(p<0)  
           {
            p=0;
            start=j+1;

           }
                   
       }

         return start;
        
    }
}