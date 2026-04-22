// Last updated: 4/22/2026, 3:46:58 PM
class Solution {
    public String removeDuplicateLetters(String s) {

      Stack<Character>  stack = new Stack<>();
      Set<Character> visit = new HashSet<>();
      Map<Character ,Integer> map = new HashMap<>();
      for (int i=0;i<s.length();i++)
      {
        map.put(s.charAt(i),i);
      }

      for(int j=0;j<s.length();j++)
      {
        if(visit.contains(s.charAt(j))) continue;
        

          
          while(!stack.isEmpty() && s.charAt(j) < stack.peek() && j < map.getOrDefault(stack.peek() ,-1))
          {

            visit.remove(stack.pop());

          }
          stack.push(s.charAt(j));
          visit.add(s.charAt(j));

      }

      StringBuilder st =  new StringBuilder();

      for(char c : stack)
      {
        st.append(c);
      }
     
     return st.toString();

        
    }
}