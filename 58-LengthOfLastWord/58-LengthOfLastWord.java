// Last updated: 4/22/2026, 3:48:33 PM
class Solution {
    public int lengthOfLastWord(String s) {

        String[] st=s.split(" ");

        int ans=st[st.length-1].length();
        return ans;
        
        
    }
}