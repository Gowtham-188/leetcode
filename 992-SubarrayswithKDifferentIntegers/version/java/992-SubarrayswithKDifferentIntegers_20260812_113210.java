// Last updated: 8/12/2026, 11:32:10 AM
1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3
4        int ans1 = helper(nums , k);
5        int ans2 = helper(nums,k-1);
6
7        return ans2  - ans1 ;
8        
9    }
10    public int helper (int[] nums , int k) {
11    int l = 0;
12    int r = 0;
13    int count = 0;
14
15    HashMap<Integer,Integer> map = new HashMap<>();
16
17    while( r < nums.length) {
18
19        map.put(nums[r] , map.getOrDefault(nums[r] ,0)+1);
20
21        while(map.size() > k) {
22            map.put(nums[l] , map.get(nums[l])-1);
23
24            if(map.get(nums[l]) == 0) {
25                map.remove(nums[l]);
26            }
27            l++;
28        }
29        count = count +(l-r+1) ;
30        r++;
31    }
32    return count; 
33    }
34
35
36}