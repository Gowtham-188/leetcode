// Last updated: 8/7/2026, 10:17:10 AM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3
4
5        int [] merged = new int [nums1.length+nums2.length];
6
7        int k = 0;
8
9        for(int i=0;i<nums1.length;i++) {
10            
11            merged[k] =nums1[i];
12            k++;
13        }
14        for(int j=0;j<nums2.length;j++) {
15            
16            merged[k] =nums2[j];
17            k++;
18        }
19
20        Arrays.sort(merged);
21
22        int total = merged.length;
23
24        if(total % 2 != 0) {
25            return (double) merged[total/2];
26        }
27
28        else {
29            int m1 = merged[total/2-1];
30            int m2 = merged[total/2];
31
32            return ((double)m1 + (double)m2) /2 ; 
33        }
34        
35    }
36}