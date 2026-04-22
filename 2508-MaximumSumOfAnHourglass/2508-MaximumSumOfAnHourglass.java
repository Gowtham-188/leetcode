// Last updated: 4/22/2026, 3:44:04 PM
class Solution {
    public int maxSum(int[][] grid) {

        int lastrow=grid.length-1;
        int lastcol=grid[0].length-1;

        int max=0;
        for(int i=1;i<lastrow;i++)
        {
            for(int j=1;j<lastcol;j++)
            {
                int sum = grid[i][j] + grid[i-1][j] + grid[i-1][j-1] + grid[i-1][j+1] + grid[i+1][j] + grid[i+1][j-1] + grid[i+1][j+1];
              

                max=Math.max(max,sum);
            }
        }
        return max;
        
    }
}
