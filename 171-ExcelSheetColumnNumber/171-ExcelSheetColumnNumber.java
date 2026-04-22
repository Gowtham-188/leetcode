// Last updated: 4/22/2026, 3:47:36 PM
class Solution {
    public int titleToNumber(String columnTitle) 
    {

        int n=columnTitle.length();
        int result=0;

        for(int i=0;i<n;i++)
        {
            result=result*26+columnTitle.charAt(i)-'A'+1;
        }
        return result;
        
    }
}





