// Last updated: 8/10/2026, 1:39:45 PM
1class Solution {
2    public int maxDepth(String s) {
3
4        int d = 0;
5        int max = 0;
6
7        for(char ch : s.toCharArray()) {
8
9            if(ch == '(') {
10
11                d++;
12                if(max < d) max = d;                
13            }
14
15            else if (ch == ')') d--;
16        }
17
18        return max ;
19        
20    }
21}