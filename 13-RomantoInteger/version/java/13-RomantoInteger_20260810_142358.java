// Last updated: 8/10/2026, 2:23:58 PM
1class Solution {
2    public int romanToInt(String s) {
3
4        HashMap<Character,Integer> hash = new HashMap<>();
5
6        hash.put('I' , 1);
7        hash.put('V' , 5);
8        hash.put('X',10 );
9        hash.put('L', 50);
10        hash.put('C',100 );
11        hash.put('D',500 );
12        hash.put('M',1000 );
13
14        int ans = 0;
15
16        for(int i=0;i<s.length()-1;i++) {
17
18            if(hash.get(s.charAt(i)) < hash.get(s.charAt(i+1))) {
19                
20                ans = ans - hash.get(s.charAt(i));
21                
22            }
23            else {
24                  ans = ans + hash.get(s.charAt(i)); 
25            }
26        }
27
28        return ans+hash.get(s.charAt(s.length()-1));
29    }
30}