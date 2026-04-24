// Last updated: 4/24/2026, 12:42:01 PM
1class Solution {
2    public int furthestDistanceFromOrigin(String moves) {
3
4        int l = 0;
5        int r = 0;
6        int b = 0;
7        for(int i=0;i<moves.length();i++)
8        {
9            if(moves.charAt(i) == 'L') l++;
10            else if(moves.charAt(i) == 'R') r++;
11            else b++;
12        }
13        return Math.abs(l- r ) + b;
14
15        
16    }
17}