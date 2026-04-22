// Last updated: 4/22/2026, 3:48:42 PM
class Solution {
    public void rotate(int[][] matrix) {
        
        int n=matrix.length;


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
 

 for(int i=0;i<n;i++)
 {
        reverse(matrix[i],0,n-1);
 }

     
    }
    public  void reverse(int[] matrix, int left,int right)
    {
    while(left<right)
    {
        int temp=matrix[left];
        matrix[left]=matrix[right];
        matrix[right]=temp;

        left++;
        right--;
    }
    }


}