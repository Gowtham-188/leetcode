// Last updated: 4/22/2026, 3:48:30 PM
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        // return f(0, 0, n, m, dp);

        for (int i = m-1; i>=0; i--) {
            for (int j = n-1; j>=0; j--) {
                if(i==m-1&&j==n-1){
                  dp[m-1][n-1] = 1;

                     continue;
                }
                int a =0;
                int b=0;
                if(i+1<=m-1) a=dp[i+1][j];
                if(j+1<=n-1) b=dp[i][j+1];
                dp[i][j] =a+b;
            }
        }

        return dp[0][0];

    }

    // public int f(int i, int j, int n, int m, int[][] dp) {
    //     if (i >= m || j >= n) return 0;
    //     if (i == m-1 && j == n-1) return dp[i][j] = 1;
    //     if (dp[i][j] != -1) return dp[i][j];
    //     return dp[i][j] = f(i+1, j, n, m, dp) + f(i, j+1, n, m, dp);
    // }

    
}