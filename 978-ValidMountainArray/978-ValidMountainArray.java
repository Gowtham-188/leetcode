// Last updated: 4/22/2026, 3:46:01 PM
class Solution {
    public boolean validMountainArray(int[] arr) {

        if(arr.length<3)
        {
            return false;            
        }
        int left=0;
        int right=arr.length-1;
        // while(left<right)
        // {
        //     if(arr[left]<arr[left+1] || arr[right]<arr[right-1]){
        //     if (arr[left]<arr[left+1] )
        //     {
        //         left++;
        //     }
        //     if (arr[right]<arr[right-1])
        //     {
        //         right--;
        //     }
        //     }
        //     else { return false;}

        // }
        // if(arr[left] != arr[right] || right==arr.length-1 || left == 0) return false;
        // return true;
        //.................................................

        while (left+1 < arr.length-1 && arr[left] < arr[left+1]){
            left++;
        }
        while (right-1 > 0 && arr[right] < arr[right-1] ){
            right--;
        }
        return left == right;
        
    }
}