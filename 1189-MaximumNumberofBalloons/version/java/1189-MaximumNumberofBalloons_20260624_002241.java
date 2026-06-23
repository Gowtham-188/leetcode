// Last updated: 6/24/2026, 12:22:41 AM
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3
4        String  target = "balloon";
5
6        int[] arr  = new int[256];
7
8        for(char ch : text.toCharArray())
9        {
10            arr[ch]++;
11        }
12
13        int total = Integer.MAX_VALUE;
14    
15      for(char ch : target.toCharArray() )
16      {
17             if( ch == 'l' ||  ch == 'o')
18             {  
19                
20                    total = Math.min(total,arr[ch]/2);
21                    System.out.println(ch);
22                                
23             }
24             else
25             {
26                total = Math.min(total,arr[ch]);
27             }
28      }
29
30      return total;
31        
32    }
33}