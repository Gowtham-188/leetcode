// Last updated: 4/22/2026, 3:46:33 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
          return burstBalloons(points, points.length);
        
    }
       private int burstBalloons(int[][] points, int n)
       {
        if(n==0||n==1)
        {
            return n;
        }
        
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));

        int x1=points[0][0];
        int y1=points[0][1];

        int arrow=0;
        for(int i=1;i<n;i++)
        {
            int x2=points[i][0]; 
            int y2=points[i][1]; 

            if(y1>=x2 && y1>=y2)
            {   
                y1=y2;
                if(i+1==n)
                {
                    arrow++;
                }
            }
            else if(y1>=x2)
            {
                if(i+1==n)
                {
                    arrow++;
                }
            }
            else
            {
                arrow++;
                y1=y2;

                if(i+1==n)
                {
                    arrow++;
                }
            }
        }
        return arrow;
  }
}