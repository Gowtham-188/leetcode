// Last updated: 6/9/2026, 11:48:21 AM
1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3
4        
5
6           int max = Integer.MIN_VALUE;
7             int min = Integer.MAX_VALUE;
8            for(int j=0;j<nums.length;j++)
9            {
10
11                max = Math.max(max,nums[j]);
12                min = Math.min(min,nums[j]);
13
14            }
15        
16           long sum = (long)  (max -min) * k;
17      
18       return sum;
19
20
21        
22    }
23}