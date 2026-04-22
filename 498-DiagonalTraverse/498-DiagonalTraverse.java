// Last updated: 4/22/2026, 3:46:30 PM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

      //  ArrayList<Integer> list = new ArrayList<>();
      if(mat == null || mat.length == 0) return new int [0];
        int  n = mat[0].length;
        int m = mat.length;
      int [] result = new int[m*n];
      
        int row = 0 ;
        int col = 0 ;
        for(int i=0;i < m*n ;i++)
        {
            result[i] = mat[row][col];

                if((row + col) % 2 == 0)
                {
                    if(col == n - 1)  row++;
                    else if (row == 0) col++;
                    else {row--; col++;}

                }
                else
                {
                    if(row == m-1 ) col++;
                    else if( col == 0 ) row++;
                    else{ row++; col--;}

                }

        }
        return result;

        
    }
}