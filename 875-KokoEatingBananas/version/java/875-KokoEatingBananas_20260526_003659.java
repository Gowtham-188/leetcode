// Last updated: 5/26/2026, 12:36:59 AM
1class Solution {
2    public int minEatingSpeed(int[] arr, int h) {
3        int max = 0;
4
5        for (int i : arr) 
6            max = Math.max(max, i);
7
8        int l = 1;
9        int r = max;
10        long t = 0;
11        int ans = max;
12
13        while (l <= r) {
14            int mid = l + (r - l) / 2;
15
16            for (int i : arr) {
17                int eatingHours = i / mid;
18                if (i % mid != 0) eatingHours++;
19                t += eatingHours;
20            }
21
22            if (t <= h) {
23                ans = Math.min(ans, mid);
24                r = mid-1;
25            } else {
26                l = mid + 1;
27            }
28            
29            t = 0;
30        }
31        
32
33        return ans;
34    }
35}