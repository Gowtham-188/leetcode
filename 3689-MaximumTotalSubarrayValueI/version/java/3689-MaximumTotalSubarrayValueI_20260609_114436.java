// Last updated: 6/9/2026, 11:44:36 AM
1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3
4        long sum = 0;
5
6       
7        long maxi = 0;
8
9           long max = 0;
10             long min = Integer.MAX_VALUE;
11            for(int j=0;j<nums.length;j++)
12            {
13
14                max = Math.max(max,nums[j]);
15                min = Math.min(min,nums[j]);
16
17                maxi = Math.max(maxi , max-min);
18               
19            }
20        
21
22       sum = (maxi*k);
23       return sum;
24
25
26        
27    }
28}