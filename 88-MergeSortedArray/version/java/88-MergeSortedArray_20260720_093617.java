// Last updated: 7/20/2026, 9:36:17 AM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        
4       int i = m-1;
5       int j = n-1;
6       int k = m+n-1;
7
8
9       while(j>=0)
10       {
11        if(i>=0 && nums1[i] > nums2[j])
12        {
13            nums1[k] = nums1[i];
14            i--;
15            k--;
16
17        }
18        else
19        {
20            nums1[k] = nums2[j];
21            j--;
22            k--;
23        }
24       }
25
26
27
28    }
29}