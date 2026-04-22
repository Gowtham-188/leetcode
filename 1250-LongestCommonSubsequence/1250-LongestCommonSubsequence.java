// Last updated: 4/22/2026, 3:45:47 PM
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int [] dp = new int [text1.length()];
        int length = 0 ;


        for(char c : text2.toCharArray())
        {
            int curlength = 0;

            for( int i=0; i < dp.length; i++)
            {
                if(curlength < dp[i])
                {
                    curlength = dp[i];
                    
                }
                else if (c == text1.charAt(i))
                {
                    dp[i] = curlength +1;

                    length = Math.max(length , curlength + 1);
                }
            }
        }
        return length;       
    }
}