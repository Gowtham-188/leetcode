// Last updated: 4/22/2026, 3:45:59 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int [] arr=new int [n];
        for(int i=0;i<n;i++)
        {
            int num=nums[i];

            arr[i]=num*nums[i];

        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}