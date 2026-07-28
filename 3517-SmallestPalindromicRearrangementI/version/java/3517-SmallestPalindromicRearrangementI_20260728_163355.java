// Last updated: 7/28/2026, 4:33:55 PM
1class Solution {
2    public String smallestPalindrome(String s) {
3
4        int n = s.length() ;
5 
6        char[] arr =s.substring(0,n/2).toCharArray();
7        Arrays.sort(arr);
8
9         String res = new String(arr) + ((n & 1) == 1 ? s.charAt(n/2) : "") + new StringBuilder(new String(arr)).reverse();
10
11         
12
13        
14
15        return res;
16
17
18    }
19}