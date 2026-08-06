// Last updated: 8/6/2026, 10:24:01 PM
1class Solution {
2    public boolean isValid(String s) {
3
4        Stack<Character> stack = new Stack<>();
5        HashMap<Character,Character> map = new HashMap<>();
6
7        map.put(')' , '(');
8        map.put(']' , '[');
9        map.put('}' , '{');
10
11        for(char c : s.toCharArray()) {
12            
13            if(map.containsValue(c)) {
14                stack.push(c);
15            }
16
17            else if(map.containsKey(c)) {
18
19                if(stack.isEmpty() || map.get(c) != stack.pop()) {
20                    return false ;
21                }
22            }
23        }
24
25        return stack.isEmpty();
26
27    
28        
29    }
30}