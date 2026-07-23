// Last updated: 7/23/2026, 10:45:30 AM
1class Solution {
2    public int smallestDivisor(int[] nums, int threshold) {
3
4        int start = 1;
5        int end   = 0;
6        int ans   = 0;
7
8        for(int num : nums) {
9            end = Math.max(num , end);
10        }
11
12        while(start <= end) {
13            int mid = (start+end) / 2;
14
15            if(findDiv(nums,threshold,mid))
16            {
17                ans  = mid ;
18                end = mid-1;
19            }
20
21            else {
22                start = mid +1;
23            }
24        }
25
26        return ans ;
27
28
29        
30    }
31
32    public boolean findDiv(int[] nums,int threshold , int mid) {
33         int sum = 0;
34
35             for(int j=0;j<nums.length;j++) { 
36                int  div = (int ) Math.ceil( (double)nums[j]/ mid);
37                sum  = sum +  div;          
38             }
39
40             if (threshold < sum) {
41                 return false;
42             }
43             return true;
44    }
45} 