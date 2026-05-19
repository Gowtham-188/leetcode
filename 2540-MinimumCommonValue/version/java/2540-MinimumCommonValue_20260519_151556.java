// Last updated: 5/19/2026, 3:15:56 PM
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3
4    
5
6    int left = 0;
7    int right = 0;
8
9    while(left < nums1.length && right < nums2.length)
10    {
11        if(nums1[left] == nums2[right])
12        {
13            return nums1[left];
14        }
15        else if(nums1[left] < nums2[right])
16        {
17            left++;
18        }
19        else
20        {
21            right++;
22        }
23    }
24       return -1;
25    }
26 
27}