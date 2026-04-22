// Last updated: 4/22/2026, 3:45:56 PM
class Solution {
    public int numRookCaptures(char[][] board) {
       int ans=0;


        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(board[i][j]=='R')
                {
                 ans =ans+left(board,i,j);
                 ans =ans+right(board,i,j);
                 ans =ans+up(board,i,j);
                 ans =ans+down(board,i,j);
                 i=8;
                 j=8;
                }
            }
           
        }
      return ans;
    }


    public int left(char[][] grid, int x, int y) {
        if(y < 0 || grid[x][y] == 'B') return 0;
        if(grid[x][y] == 'p') return 1;
        return left(grid, x, y-1);
    }
    public int right(char[][] grid, int x, int y) {
        if(y >= grid.length || grid[x][y] == 'B') return 0;
        if(grid[x][y] == 'p') return 1;
        return right(grid, x, y+1);
    }
    public int up(char[][] grid,int x,int y)
    {  
        if(x<0 ||grid[x][y]=='B') return 0;
        if(grid[x][y]=='p')return 1;
        return up(grid,x-1,y);
    }
 
    public int down(char[][] board,int x,int y)
    {  
        if(x >= board.length ||board[x][y]=='B') return 0;
        if(board[x][y]=='p')return 1;
        return down(board,x+1,y);
    }
       

    
}