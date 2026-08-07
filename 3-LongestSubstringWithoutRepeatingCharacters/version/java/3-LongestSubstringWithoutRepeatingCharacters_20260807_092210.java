// Last updated: 8/7/2026, 9:22:10 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3
4        Set<Character> set = new HashSet<>();
5
6        int max = 0;
7        int left = 0;
8
9
10        for(int i=0;i<s.length();i++) {
11            
12            while (set.contains(s.charAt(i))) {
13
14                set.remove(s.charAt(left));
15                left++;
16            }
17            set.add(s.charAt(i));
18            max = Math.max(max,set.size());
19        }
20
21        return max;
22        
23    }
24}