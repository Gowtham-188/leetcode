// Last updated: 4/22/2026, 3:48:35 PM
class Solution {
    public int[][] merge(int[][] intervals) {
     
     Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));

     List<int[]> list = new ArrayList<>();

     int[] prev = intervals[0];

     for (int i=0;i<intervals.length;i++)
     {
       int[] interval = intervals[i];

       if (interval[0] <= prev[1])
       {
           prev[1] = Math.max(interval[1] , prev [1]);

       }

       else
       {

        list.add(prev);
        prev = interval;

       }
        

     }

     list.add(prev);

     return list.toArray(new int[list.size()][]);
        
    }
}