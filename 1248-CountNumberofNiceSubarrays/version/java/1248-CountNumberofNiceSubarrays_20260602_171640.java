// Last updated: 6/2/2026, 5:16:40 PM
1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3
4        int odd = 0;
5        int count = 0;
6        int j = 0;
7        int temp = 0;
8
9
10        for(int i=0;i<nums.length;i++)
11        {
12              if(nums[i]%2 == 1)
13                {
14                    odd++;
15                    temp = 0;
16                }
17
18                while(odd == k)
19                {
20                    temp++;
21                    if(nums[j]%2 ==1)
22                    {
23                        odd--;
24                    }
25                    j++;
26
27                }
28
29                count = count+ temp;
30
31        }
32        return count;
33        
34    }
35}