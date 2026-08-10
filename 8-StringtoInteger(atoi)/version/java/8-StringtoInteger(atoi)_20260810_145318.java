// Last updated: 8/10/2026, 2:53:18 PM
1class Solution {
2    public int myAtoi(String s) {
3
4
5        boolean gow = false ;
6
7        long num = 0;
8
9        String str = s.trim();
10        int n = str.length();
11
12        int i = 0;
13
14        if( i < n && (str.charAt(0) == '+' || str.charAt(0) == '-')) {
15
16            gow = (str.charAt(i) == '-') ? true : false ;
17            i++;
18        }
19
20        while (i < n && Character.isDigit(str.charAt(i))) {
21
22            num  = num * 10 + (str.charAt(i) - '0');
23
24            if(!gow && num > Integer.MAX_VALUE) {
25                return Integer.MAX_VALUE;
26            }
27
28            if(gow && -num < Integer.MIN_VALUE) {
29                return Integer.MIN_VALUE;
30            }
31            i++;
32        }
33
34        return gow ? (int)-num : (int)num;
35        
36    }
37}