// Last updated: 4/22/2026, 3:47:28 PM
class Solution {
    public int numIslands(char[][] grid) {

        int n=grid.length;
        int m=grid[0].length;
        int count=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    mark0(grid,i,j);
                }
            }
        }
        return count;
        
    }
    public static void mark0(char[][] grid,int i,int j)
    {
        int n=grid.length;
        int m=grid[0].length;

        if(i<0 || i>=n || j<0 || j>=m)
        {
            return ;
        }
        if(grid[i][j]=='0') return ;
        grid[i][j]='0';
      mark0(grid,i+1,j);
      mark0(grid,i,j+1);
      mark0(grid,i-1,j);
      mark0(grid,i,j-1);
        
    }
}