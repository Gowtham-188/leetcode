// Last updated: 4/22/2026, 3:46:37 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        

       // Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
       Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
    


        int x1=intervals[0][1];
        int res=0;

        for(int i=1;i<intervals.length;i++)
        {
            if(x1>intervals[i][0])
            {
                res++;
            }
            else
            {
                x1=intervals[i][1];
            }
        }

        return res;
    }
}