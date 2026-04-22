// Last updated: 4/22/2026, 3:49:17 PM
class Solution {
    public String longestPalindrome(String s) {

        int start = 0, end = 0;

        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                if(ispalinrom(i, j, s)) {
                    if(j - i > end - start) {
                        start = i;
                        end = j;
                    }
                }
            }
        }

        return s.substring(start, end + 1);
    }

    public static boolean ispalinrom(int left,int right ,String s)
    {
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }
}