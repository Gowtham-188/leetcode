// Last updated: 4/24/2026, 1:24:21 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        
4  
5//    int n=nums.length;
6//         int [] rotate=new int[n];
7//     k=k%n;   //  3%7 = 3 
8       
9//        for(int i=0;i<n;i++)
10//        {
11//              rotate[(k+i)%n]=nums[i]; //3+0 % 7 =  3 
12    
13//        }
14
15//        for(int i=0;i<n;i++)
16//        {
17
18//          nums[i]=rotate[i];
19//        }
20     int n = nums.length;
21     
22     k = k%n;
23        swap(0 , n-k-1 ,nums);
24        swap(n-k, n-1 ,nums);
25        swap(0 , n-1 ,nums);
26
27
28        }
29
30
31        void swap(int left ,int right , int[] arr)
32        {
33            while(left < right)
34            {  
35                int temp = arr[left];
36                arr[left] = arr[right];
37                arr[right] = temp;
38                left ++ ;
39                right -- ;
40            }
41        }
42
43    }
44