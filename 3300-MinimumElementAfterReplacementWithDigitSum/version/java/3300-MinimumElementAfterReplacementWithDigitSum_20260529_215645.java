// Last updated: 5/29/2026, 9:56:45 PM
1class Solution {
2    public int minElement(int[] nums) {
3
4        for(int i=0;i<nums.length;i++)
5        { 
6            int num = nums[i];
7            int ans = 0;
8            while(num > 0)
9            {
10                ans  = ans + num % 10;
11
12                num = num /10;
13            }
14            nums[i]= ans;
15        }
16       int  ans1 = Integer.MAX_VALUE;
17        for(int i=0;i<nums.length;i++)
18        {
19            ans1 = Math.min(ans1,nums[i]);
20        }
21        return ans1;
22        
23    }
24}