// Last updated: 7/24/2026, 6:22:43 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3
4        int [] ans=new int[nums.length];
5
6        for(int i=0;i<nums.length;i++)
7        {
8            ans[i]=-1;
9            for(int j=1;j<nums.length;j++)
10            {
11                int idx=(i+j)%nums.length;
12                if(nums[i]<nums[idx])
13                {
14                    ans[i]=nums[idx];
15                    break;
16                }
17            }
18        
19        }
20
21        return ans;   
22    }
23}