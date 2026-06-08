// Last updated: 6/8/2026, 5:29:02 PM
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3
4         int left = 0;
5         int right = nums.length-1;
6         int [] arr = new int [nums.length];
7     
8         int  inx =  0 ;
9        for(int i=0;i< nums.length;i++)
10        {
11           if(nums[i] < pivot)
12           {
13            arr[inx] =  nums[i]; 
14            inx++;
15           }          
16        }
17        
18        for(int k=0;k<nums.length;k++)
19        {
20            if(nums[k] == pivot)
21            {
22                arr[inx] =nums[k];
23                inx++;         
24            }
25        }
26
27        for(int j=0;j<nums.length;j++)
28        {
29            if(nums[j] > pivot)
30            {
31                arr[inx] = nums[j];
32                inx++;
33            }
34        }
35
36        return arr;
37
38        
39    }
40}