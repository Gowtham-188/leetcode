// Last updated: 7/25/2026, 11:30:48 AM
1class Solution {
2    public int nextGreaterElement(int n) {
3
4        char[] arr  = (Integer.toString(n)).toCharArray();
5
6        int i = arr.length-2;
7
8        while(i >=0 && arr[i] >= arr[i+1]) {
9            i--;
10        }
11        if(i == -1) {
12            return -1;
13        }
14
15        int k = arr.length-1;
16
17        while (arr[k] <= arr[i]) {
18            k--;
19        } 
20
21        swap(arr,i,k);
22
23        StringBuilder st = new StringBuilder();
24
25        for(int j = 0;j<=i ;j++) {
26            st.append(arr[j]);
27        }
28        for(int j = arr.length-1;j>i;j--) {
29            st.append(arr[j]);
30        }
31
32        long ans = Long.parseLong(st.toString());
33        
34        return (ans > Integer.MAX_VALUE) ? -1 : (int)ans;
35
36
37        
38    }
39
40    void swap (char [] arr , int i , int k) {
41
42        char temp = arr[i] ;
43        arr[i]   = arr[k];
44        arr[k] = temp ; 
45    }
46}