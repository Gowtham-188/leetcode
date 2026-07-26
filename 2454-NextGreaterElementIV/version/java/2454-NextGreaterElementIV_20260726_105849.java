// Last updated: 7/26/2026, 10:58:49 AM
1class Solution {
2    public int[] secondGreaterElement(int[] nums) {
3        int n = nums.length;
4        int [] ans = new int[nums.length];
5        Arrays.fill(ans,-1);
6        Stack <Integer> s1 = new Stack<>();
7        Stack <Integer> s2 = new Stack<>();
8        Stack <Integer> temp = new Stack<>();
9
10        for(int i=0;i<n ; i++) {
11
12            while (!s2.empty() && nums[s2.peek()] < nums[i]) {
13
14                ans[s2.pop()] = nums[i];
15
16            }
17            while (!s1.isEmpty() && nums[s1.peek()] < nums[i] ) {
18                
19                temp.push(s1.pop());
20
21            }
22            while (!temp.isEmpty()) {
23
24                s2.push(temp.pop());
25
26            }
27            s1.push(i);
28        }
29
30        return ans  ;
31
32       
33    }
34}