// Last updated: 7/24/2026, 4:52:48 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        
4        int [] arr = new int [nums1.length];
5
6        for(int k = 0;k<arr.length;k++) {
7            arr[k] = -1;
8        }
9
10        for(int i=0;i<nums1.length;i++) {
11
12            int find = nums1[i];
13            boolean f = false ;
14            
15            for(int j = 0 ;j<nums2.length;j++) {
16
17                if(find == nums2[j]) {
18                    f = true;
19                }
20                
21                if(f && nums1[i] < nums2[j])
22                {
23                   arr[i] =  nums2[j];
24                   break;
25                }
26            }
27        }
28        return arr;
29    }
30}