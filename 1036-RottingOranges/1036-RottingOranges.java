// Last updated: 4/22/2026, 3:45:58 PM
class Solution {
    public int orangesRotting(int[][] grid) {

        Queue<int[]> q=new LinkedList<>();


     int m=grid.length; 
     int n=grid[0].length;
     boolean fresh=false;

     for(int i=0;i<m;i++)
     {
        for(int j=0;j<n;j++)
        {
            if(grid[i][j]==2) q.add(new int[]{i,j,0});
            if(grid[i][j]==1) fresh=true;

        }
     }

     if(fresh && q.isEmpty())
     {
        return -1;
     }
     int max=0;

     int div[]=new int []{1,0,-1,0,1};


     while(!q.isEmpty())
     {
        int cur[]=q.poll();

        for(int i=0;i<4;i++)
        {
            int x=div[i]+cur[0];
            int y=div[i+1]+cur[1];

            if(x<m && x>=0 && y<n && y>=0 && grid[x][y]==1)
            {
                max=Math.max(max,cur[2]+1);

                q.add(new int[]{x,y,cur[2]+1});

                grid[x][y]=2;
                 

            }
        }
     }

     for(int i=0;i<m;i++)
     {
        for(int j=0;j<n;j++)
        {
            if(grid[i][j]==1)
            {
                return -1;
            }
        }
     }
     return max;
        
    }
}