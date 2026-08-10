// Last updated: 8/10/2026, 11:38:19 AM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3
4        if(s.length() != goal.length()) {
5
6            return false;
7        }
8
9        return (s+s).contains(goal);
10        
11    }
12}