// Last updated: 7/24/2026, 6:26:09 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3       
4       int [] arr = new int[nums.length];
5        for(int i=0;i<nums.length;i++) {
6
7            arr[i] = -1;
8
9            for(int j=1;j<nums.length;j++) {
10
11               int idx = (i+j) % nums.length;
12
13                if(nums[i] < nums[idx]) {
14
15                    arr[i] = nums[idx];
16                    break;
17
18                }
19              
20            }
21          
22            
23        }
24
25
26
27    return arr;
28
29        
30    }
31}