// Last updated: 4/22/2026, 3:48:07 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {

   List<List<Integer>> pascal=new ArrayList<List<Integer>>();

   for(int i=0;i<numRows;i++)
   {
       List<Integer> row=new ArrayList<Integer>();

       for(int j=0;j<=i;j++)
       {
            if(j==0||j==i)
            {
                row.add(1);
            }
            else
            {
            List<Integer> previes=pascal.get(i-1);

            int val=previes.get(j)+previes.get(j-1);
         row.add(val);
            }

       }
       pascal.add(row);

   }
   return pascal;
        
    }
}