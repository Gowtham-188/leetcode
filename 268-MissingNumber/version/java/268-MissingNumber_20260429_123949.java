// Last updated: 4/29/2026, 12:39:49 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3     int n= nums.length;
4     int total = 0 ;
5     for(int num : nums)
6     {
7        total = total + num;
8     }
9
10     int m = n*(n+1)/2;
11     return m-total;
12    }
13}