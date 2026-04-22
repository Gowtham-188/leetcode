// Last updated: 4/22/2026, 3:44:33 PM
class Solution {
    public int largestAltitude(int[] gain) {
        
        int n=gain.length;
        int[] arr=new int [n+1];
        int max=0;
        int sum=0;

        for(int i=0;i<gain.length;i++)
        {
            arr[0]=0;
             sum=sum+gain[i];
            arr[i+1]=sum;
        }
     
       for(int j=0;j<arr.length;j++)
       {
           max=Math.max(max,arr[j]);
       }
       return max;

         



    }
}