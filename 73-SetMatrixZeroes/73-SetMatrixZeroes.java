// Last updated: 4/22/2026, 3:48:22 PM
class Solution {
    public void setZeroes(int[][] matrix) {


        int row=matrix.length;
        int colum=matrix[0].length;


         boolean firstrowzero=false;
         boolean firstcolumzero=false;

         for(int r=0;r<row;r++)
         {
            if(matrix[r][0]==0)
            {
                firstrowzero=true;
                break;
            }
         }
         for(int c=0;c<colum;c++)
         {
            if(matrix[0][c]==0)
            {
                firstcolumzero=true;
                break;
            }
         }

         for(int r=1;r<row;r++)
         {
            for(int c=1;c<colum;c++)
            {
                if(matrix[r][c]==0)
                {
                    matrix[r][0]=0;
                    matrix[0][c]=0;
                }
            }
         }

         for(int r=1;r<row;r++)
         {
            if(matrix[r][0]==0)
            {
                for(int c=1;c<colum;c++)
                {
                    matrix[r][c]=0;
                }
            }
         }

         for(int c=1;c<colum;c++)
         {
            if(matrix[0][c]==0)
            {
                for(int r=1;r<row;r++)
                {
                    matrix[r][c]=0;
                }
            }
         }

         if(firstrowzero)
         {
            for(int r=0;r<row;r++)
            {
                matrix[r][0]=0;
            }
         }

         if(firstcolumzero)
         {
            for(int c=0;c<colum;c++)
            {
                matrix[0][c]=0;
            }
         }

        
        
        
    }
}