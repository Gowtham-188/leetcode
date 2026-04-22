// Last updated: 4/22/2026, 3:45:46 PM
class Solution {
    public int[][] diagonalSort(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        for(int i=0;i<m;i++)
        {
            int k = i,j = 0;
         ArrayList<Integer> list = new ArrayList<>();
            while(k < m && j < n)
            {
                list.add(mat[k][j]);
                k++;
                j++;
            }

            Collections.sort(list);

            k = i;
            j = 0;
        int x = 0;

            while(k < m && j < n)
            {
                mat[k][j] = list.get(x);
                k++ ;j++; x++;
                

            }
        }

        for(int j=1;j<n;j++)
        {
            int k = j ,i = 0;
            ArrayList<Integer> list = new ArrayList<>();

            while( k < n && i < m)
            {
                list.add(mat[i][k]);
                k++;i++;
            }
            Collections.sort(list);
            k = j ;i = 0; 
            int x = 0;

            while(k < n && i < m)
            {
                mat[i][k] = list.get(x);
                k++; i++; x++;
            }
        }

        return mat;
    }
}