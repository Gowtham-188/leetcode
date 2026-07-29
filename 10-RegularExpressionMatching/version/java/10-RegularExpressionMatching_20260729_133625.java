// Last updated: 7/29/2026, 1:36:25 PM
1class Solution {
2    public boolean isMatch(String s, String p) {
3
4      return   match(s,p,0,0);
5
6
7    }
8
9    public boolean match(String s,String p,int i  ,int j) {
10
11        if(j == p.length()) {
12             
13             return i == s.length();
14        }
15
16        boolean firstmatch = ( i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.' ));
17
18        if(j+1 < p.length() && p.charAt(j+1) == '*') {
19            return match(s,p,i,j+2) || (firstmatch && match(s,p,i+1,j));
20        }
21
22        return firstmatch && match(s,p,i+1,j+1);
23    }
24
25    }