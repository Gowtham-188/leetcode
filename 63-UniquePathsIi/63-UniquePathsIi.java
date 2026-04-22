// Last updated: 4/22/2026, 3:48:29 PM
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int rows=obstacleGrid.length;
        int colm=obstacleGrid[0].length;

        int[] dp=new int[colm];

        dp[0]=1;


        for(int r=0;r<rows;r++)
        {
            for(int c=0;c<colm;c++)
            {
                if(obstacleGrid[r][c]==1)
                {
                    dp[c]=0;
                }
                else
                {
                    if(c>0)
                    {
                        dp[c]=dp[c]+dp[c-1];
                    }
                }
            }
        }

        return dp[colm-1];
        
    }
}