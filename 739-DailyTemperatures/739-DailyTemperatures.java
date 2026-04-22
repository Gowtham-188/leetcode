// Last updated: 4/22/2026, 3:46:18 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int []  arr = new int[n];
        
        for (int i=0;i<n;i++)
        {
         while ( !st.isEmpty() && temperatures[i] > temperatures[st.peek()])
            {
                arr[st.peek()] = i - st.pop(); 
            }
            
            st.push(i);
        }

        return arr;
    }
}