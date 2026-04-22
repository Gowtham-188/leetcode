// Last updated: 4/22/2026, 3:45:51 PM
class Solution {
    public int heightChecker(int[] heights) {

        int count=0;
        int [] expect = heights.clone(); 
        Arrays.sort(expect);

        for(int i=0;i<heights.length;i++)
        {
            if(expect[i] != heights[i])
            {
                count++ ;
            }
           
        }
        return count;
        
    }
}