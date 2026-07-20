// Last updated: 7/20/2026, 1:10:55 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        
4        int max = nums[0];
5        int min = nums[0];
6        int ans = nums[0];
7
8        for(int i=1;i<nums.length;i++)
9        {
10            int temp = max;
11
12            max = Math.max(Math.max(max*nums[i],min*nums[i]),nums[i]);
13            min = Math.min(Math.min(temp*nums[i],min*nums[i]),nums[i]);
14
15            if(max > ans )
16            {
17                ans = max;
18            }
19        }
20
21        return ans;
22    }
23}