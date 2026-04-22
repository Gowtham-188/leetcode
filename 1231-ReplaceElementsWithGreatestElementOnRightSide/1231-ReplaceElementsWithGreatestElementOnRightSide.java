// Last updated: 4/22/2026, 3:45:45 PM
class Solution {
    public int[] replaceElements(int[] arr) {

        int n=0;
        
        for(int  i=arr.length-2;i>=0;i--)
        {
            int temp=arr[i];

            arr[i]=arr[i+1]>n?arr[i+1]:n;

            n=temp;
        }
        arr[arr.length-1]=-1;

        
       return arr;
     
    }
}