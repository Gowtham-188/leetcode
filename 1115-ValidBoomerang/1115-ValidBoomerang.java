// Last updated: 4/22/2026, 3:45:52 PM
class Solution {
    public boolean isBoomerang(int[][] points) {
        int dx1=points[0][0]-points[1][0];//0
        int dx2=points[0][1]-points[2][1];//1
        int dy1=points[0][0]-points[2][0];//1
        int dy2=points[0][1]-points[1][1];//0


        return (dx1*dx2!=dy1*dy2);
        
    }
}