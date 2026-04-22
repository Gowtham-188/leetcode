// Last updated: 4/22/2026, 3:47:10 PM
class Solution {
    public boolean isAnagram(String s, String t) {

        char[] n1=s.toCharArray();
        char[] n2=t.toCharArray();

        Arrays.sort(n1);
        Arrays.sort(n2);

        return Arrays.equals(n1,n2);
        
    }
}