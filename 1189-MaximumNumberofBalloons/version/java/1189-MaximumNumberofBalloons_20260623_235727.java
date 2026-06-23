// Last updated: 6/23/2026, 11:57:27 PM
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3
4        int[] arr = new int[256];
5
6        for (char ch : text.toCharArray()) {
7            arr[ch]++;
8        }
9
10        int total = Integer.MAX_VALUE;
11
12        total = Math.min(total, arr['b']);
13        total = Math.min(total, arr['a']);
14        total = Math.min(total, arr['l'] / 2);
15        total = Math.min(total, arr['o'] / 2);
16        total = Math.min(total, arr['n']);
17
18        return total;
19    }
20}