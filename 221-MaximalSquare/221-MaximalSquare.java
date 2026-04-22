// Last updated: 4/22/2026, 3:47:18 PM
class Solution {
    public int maximalSquare(char[][] matrix) {

        
        int rows = matrix.length;
        int colm = matrix[0].length;
        int [][] dp = new int[rows][colm];
        int maxside = 0;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<colm;j++)
            {
                if(matrix[i][j] == '1')
                {
                    if(i==0 || j == 0)
                    {
                        dp[i][j] = 1;
                    }
                    else
                    {
                        dp[i][j] = 1 + Math.min(Math.min( dp[i-1][j] ,dp[i][j-1] ),dp[i-1][j-1]);
                    }

                    maxside = Math.max(maxside , dp[i][j]);

                }
            }
        }

        return maxside * maxside;
    }
}