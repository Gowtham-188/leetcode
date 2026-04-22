// Last updated: 4/22/2026, 3:48:32 PM
class Solution {
    public int[][] generateMatrix(int n) {

        int[][] matrix=new int[n][n];

        int [] dr={0,1,0,-1};
        int [] dc={1,0,-1,0};

        int r=0,c=0;
        int dir=0;

        for(int i=1;i<=n*n;i++)
        {
            matrix[r][c] = i;

            int nr=r+dr[dir];
            int nc=c+dc[dir];
            if(nr<0 ||nc<0 ||nr>=n || nc>=n ||matrix[nr][nc]!=0)
            {
               dir=(dir+1)%4;
               nr=r+dr[dir];
               nc=c+dc[dir];
          }
            r=nr;
            c=nc;

        }
         return matrix;
      
       

     
    }
}