// Last updated: 4/22/2026, 3:48:51 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {

       int [] arr={-1,-1};      
    //     boolean first=true;
    //    if( nums==null)
    //    {
    //     return arr;
    //    }       
    //    for(int i=0;i<nums.length;i++)
    //    {
    //     if(nums[i]==target && first)
    //     {
    //         first=false;
    //         arr[0]=i;
    //     }
    //     if(nums[i]==target)
    //     {
    //         arr[1]=i;
    //     }
    //    }
    //    return arr;

    int left=binarySearch(nums,target,true);
    arr[0]=left;
      int right=binarySearch(nums,target,false);
      arr[1]=right;

      return arr;

        
    }
    private int binarySearch(int[] nums,int target,boolean isleftsearch)
    {
        int left=0;
        int right=nums.length-1;
        int idx=-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(nums[mid]<target)
            {
                left=mid+1;
            }
            else if(nums[mid]>target)
            {
                right=mid-1;
            }

            else
            {
                 idx=mid;
                if(isleftsearch)
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
        }
        return idx;
    }
}