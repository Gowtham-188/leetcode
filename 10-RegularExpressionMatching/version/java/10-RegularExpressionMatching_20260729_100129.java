// Last updated: 7/29/2026, 10:01:29 AM
1class Solution {
2    public boolean isMatch(String s, String p) {
3
4        return match(s,p,0,0);
5        
6    }
7    private boolean match (String s , String p , int i , int j) {
8
9        if(j == p.length()) {
10            return i == s.length();
11        }
12
13        boolean firstMatch = (i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) ==  '.'));
14
15        if(j + 1 < p.length() && p.charAt(j + 1) == '*') {
16            return match(s,p,i,j+2) || (firstMatch && match(s,p,i+1,j));
17        } 
18
19        return firstMatch && match(s,p,i+1,j+1);
20    }
21}