// Last updated: 4/22/2026, 3:46:13 PM
class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length()!=goal.length())
        {
            return false;
        }
        return (s+s).contains(goal);
    }
}