// Last updated: 8/10/2026, 1:05:35 PM
1class Solution {
2    public String frequencySort(String s) {
3
4        ArrayList<int[]> list = new ArrayList<>();
5
6        int[] arr = new int[256];
7        for(int i=0;i<s.length();i++) {
8
9            arr[s.charAt(i)]++;
10        }
11
12        for(int j=0;j<arr.length;j++) {
13
14            if(arr[j] > 0) {
15
16                list.add(new int[]{arr[j],j});
17            }
18        }
19
20        list.sort((a,b) -> Integer.compare(b[0] , a[0]));
21
22        StringBuilder st = new StringBuilder();
23
24        for(int[] li : list) {
25
26            while(li[0] != 0) {
27                st.append((char)li[1]);
28                li[0]--;
29            }
30        }
31
32        return st.toString();
33
34
35        
36    }
37}