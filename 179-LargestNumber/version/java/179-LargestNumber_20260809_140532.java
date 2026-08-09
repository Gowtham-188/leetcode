// Last updated: 8/9/2026, 2:05:32 PM
1class Solution {
2    public String largestNumber(int[] nums) {
3
4        String [] arr = new String[nums.length];
5        for(int i=0;i<nums.length;i++) {
6            
7            arr[i] = String.valueOf(nums[i]);
8        }
9
10        Arrays.sort(arr,(a,b) ->(b+a).compareTo(a+b));
11
12        if(arr[0].equals("0")) {
13            return "0";
14        }
15
16        StringBuilder st = new StringBuilder();
17
18        for(int j=0;j<arr.length;j++) {
19            st.append(arr[j]);
20        }
21        return st.toString();
22    }
23}