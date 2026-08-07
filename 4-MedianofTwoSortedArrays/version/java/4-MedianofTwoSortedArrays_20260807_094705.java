// Last updated: 8/7/2026, 9:47:05 AM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        
4
5        int [] merged =new int[nums1.length+nums2.length];
6
7           int k=0;
8        for(int i=0;i<nums1.length;i++)
9        {
10            merged[k]=nums1[i];
11            k++;
12        }
13        for(int j=0;j<nums2.length;j++)
14        {
15            merged[k]=nums2[j];
16            k++;
17        }
18
19        Arrays.sort(merged);
20
21        int total=merged.length;
22        
23        if(total%2!=0)
24        {
25            return (double) merged[total/2];
26        }
27        else
28        {
29            int m1=merged[total/2-1];
30            int m2=merged[total/2];
31
32            return ((double)m1+(double)m2)/2;
33        }
34    }
35}