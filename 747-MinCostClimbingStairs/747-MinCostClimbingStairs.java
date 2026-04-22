// Last updated: 4/22/2026, 3:46:17 PM
class Solution {
    public int minCostClimbingStairs(int[] cost) {

         int[] db = new int [cost.length];

         db[0] = cost[0];
         db[1] = cost[1];
         

         for(int i=2 ; i<cost.length;i++ )
         {
          db[i] = + cost[i] + Math.min(db[i-2],db[i-1])  ;
                     
         }

         return Math.min(db[db.length-2],db[db.length-1]);
        
    }
}