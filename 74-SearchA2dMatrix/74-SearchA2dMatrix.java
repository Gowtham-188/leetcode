// Last updated: 4/22/2026, 3:48:21 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          
        boolean ans=false;
    
        for(int[]num:matrix)
        {
            if(BinarySearch(num,target))
            {
                ans=true;
                break;
            }
        }
        return ans;
        
    }

    public boolean BinarySearch(int[] num,int target)
    {
          int left=0;
          int right=num.length-1;

          while(left<=right)
          {
            int mid=left+(right-left)/2;

            if(num[mid]==target)
            {
                return true;
            }

            if(num[mid]>target)
             { 
                right=mid-1;
             }
             else
             {
                left=mid+1;

             }
          }
          return false;
    }
}