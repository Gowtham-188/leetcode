// Last updated: 8/6/2026, 6:53:32 PM
1class Solution {
2    public int smallestNumber(int n, int t) {
3
4        for(int i=n;i<=100;i++) {
5            
6            int temp = i;
7            int product = 1 ;
8
9            while (temp > 0 ) {
10
11                product = product * (temp % 10) ;  // 1*(0)  = 0
12                
13                temp = temp / 10 ; // 10 / 10 = 0
14            }
15
16            if(product % t == 0) {
17                return i ;
18            }
19        }
20
21        return 0;
22        
23    }
24}