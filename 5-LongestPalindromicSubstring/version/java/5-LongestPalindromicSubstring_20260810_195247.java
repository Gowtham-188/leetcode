// Last updated: 8/10/2026, 7:52:47 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        
4
5        int start = 0;
6        int end = 0;
7
8        for(int i=0;i<s.length();i++) {
9            for(int j=i;j<s.length();j++) {
10
11                if(ispalindrome(i,j,s)) {
12
13                    if(j-i > end-start) {
14                        start = i;
15                        end = j ;
16                    }
17                }
18            }
19
20           
21        }
22         return s.substring(start,end+1);
23    }
24
25    boolean ispalindrome(int start,int end,String s) {
26
27        while(start < end) {
28
29            if(s.charAt(start) != s.charAt(end)) return false;
30
31            start++;
32            end--;
33        }
34        return true;
35    }
36
37
38}