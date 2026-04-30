// Last updated: 4/30/2026, 9:40:52 AM
1class Solution {
2    public int findMaxLength(int[] nums) {
3
4        HashMap<Integer,Integer> map = new HashMap<>();
5        map.put(0,-1);
6        int max = 0 ;
7        int sum = 0;
8
9        for(int i=0;i<nums.length;i++)
10        {
11            if(nums[i] == 0) nums[i]  = -1;
12
13            sum = sum + nums[i];
14            if(map.containsKey(sum))
15            {
16                max = Math.max(max , i - map.get(sum));
17            }
18            else
19            {
20                map.put(sum , i);
21            }
22        }
23        return max;
24        
25    }
26}