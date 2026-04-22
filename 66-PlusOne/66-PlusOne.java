// Last updated: 4/22/2026, 3:48:27 PM
class Solution {
    public int[] plusOne(int[] arr) {

       int n=arr.length;
       
       for(int i=n-1;i>=0;i--)
       {

        if(arr[i]<9)
        {
            arr[i]++;
            return arr;
        }

        else
        {
            arr[i]=0;
        }
       }

        arr=new int[arr.length+1];
        arr[0]=1;

        return arr;
    }
}

 