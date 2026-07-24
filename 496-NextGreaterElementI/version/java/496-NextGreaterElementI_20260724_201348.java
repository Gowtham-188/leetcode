// Last updated: 7/24/2026, 8:13:48 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3       int n = nums.length;
4       int [] arr = new int[nums.length];
5
6       Stack<Integer> st = new Stack<>();
7
8       for(int i= 2* n-1 ; i>=0 ; i--) {
9           int current = nums [i % n] ; 
10
11           while (!st.isEmpty() && st.peek() <=  current) {
12
13            st.pop(); 
14
15
16           } 
17
18           if( i < n) { 
19
20            arr[i] = st.isEmpty() ? -1 :st.peek();
21             
22           }
23
24           st.push(current);
25       }
26     
27          
28     
29    return arr;
30        
31    }
32}