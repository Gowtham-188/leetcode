// Last updated: 4/22/2026, 3:44:14 PM
class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int [] [] colm =new int [n][n];
        int i=0;
        int j=0;

        while (j<n)
        {
            colm[j][i]=grid[i][j];
            i++;

            if(i>=n)
            {
                i=0;
                j++;
            }
        }

        i=0;
        j=0;
        int ans=0;

        while (i<n)
        {
            if(Arrays.equals(grid[i],colm[j]))
            {
                ans++;

            }
            j++;

            if(j>=n)
            {
                i++;
                j=0;
            }
        }
        return ans;

        
    }
}