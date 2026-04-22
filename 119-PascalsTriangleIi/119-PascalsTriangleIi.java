// Last updated: 4/22/2026, 3:48:06 PM
class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>> pascal=new ArrayList<List<Integer>>();

       

        for(int i=0;i<=rowIndex;i++)
        {
             List<Integer> list=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {

                if(j==0 || i==j)
                {
                  list.add(1);
                }

                else
                {
                    List<Integer> prev=pascal.get(i-1);

                    int val=prev.get(j)+prev.get(j-1);
                    
                    list.add(val);
                }

            }
             pascal.add(list);
        }


        List<Integer> ans=(pascal.get(pascal.size()-1));

        return ans;
    }
}