// Last updated: 4/22/2026, 3:48:05 PM
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    
     int row=triangle.size();
     int [] arr=new int[row];

     for(int i=0;i<row;i++)
     {
        arr[i]=triangle.get(row-1).get(i);
     }

     for(int r=row-2;r>=0;r--)
     {
        for(int c=0;c<=r;c++)
        {
            arr[c]=Math.min(arr[c],arr[c+1])+triangle.get(r).get(c);
        }
     }

      return arr[0];

    }
}