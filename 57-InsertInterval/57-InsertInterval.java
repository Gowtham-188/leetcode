// Last updated: 4/22/2026, 3:48:34 PM
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

     List<int[]> list=new ArrayList<>(Arrays.asList(intervals));
     list.add(newInterval);

     Collections.sort(list,(a,b)->Integer.compare(a[0],b[0]));
     
     List<int[]> res=new  ArrayList<>();
     int[] current=list.get(0);


     for(int i=1;i<list.size();i++)
     {
        int[] ind=list.get(i);

        if(current[1]>=ind[0])
        {
            current[1]=Math.max(current[1],ind[1]);

        }
        else
        {
            res.add(current);
            current=ind;
        }
     }

     res.add(current);

     return res.toArray(new int[res.size()][]);
        
    }
}