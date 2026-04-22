// Last updated: 4/22/2026, 3:45:03 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int n=candies.length;
       // String []gow=new String[n];
       List<Boolean> gow=new ArrayList<Boolean>(n);
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<n;i++)
        {
            int ans=candies[i]+extraCandies;
            if(max<=ans)
            {
                gow.add(true);
            }
            else
            {
                gow.add(false);
            }
        }

        return gow  ;

    }
}