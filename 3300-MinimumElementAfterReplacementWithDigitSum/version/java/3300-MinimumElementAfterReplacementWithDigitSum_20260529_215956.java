// Last updated: 5/29/2026, 9:59:56 PM
1class Solution {
2    public int minElement(int[] nums) {
3      
4             int  minval = Integer.MAX_VALUE;
5        for(int i=0;i<nums.length;i++)
6        { 
7            int num = nums[i];
8            int ans = 0;
9            while(num > 0)
10            {
11                ans  = ans + num % 10;
12
13                num = num /10;
14            }
15            nums[i]= ans;
16            minval = Math.min(minval,nums[i]);
17
18        }
19
20    
21        return minval;
22        
23    }
24}