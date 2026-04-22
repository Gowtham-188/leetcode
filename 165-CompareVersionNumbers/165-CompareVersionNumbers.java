// Last updated: 4/22/2026, 3:47:41 PM
class Solution {
    public int compareVersion(String version1, String version2) {
        int i=0;
        int j=0;

        int a=version1.length();
        int b=version2.length();

        while(i<a || j<b)
        {
            int num1=0;
            int num2=0;

            while(i<a && version1.charAt(i)!='.')
            {
                num1=num1*10+(version1.charAt(i)-'0');
                i++;
            }
            while (j<b && version2.charAt(j)!='.')
            {
                num2=num2*10+(version2.charAt(j)-'0');
                j++;
            }

            if(num1<num2)
            {
                return -1;
            }
            if(num1>num2)
            {
                return 1;
            }
            i++;
            j++;
            num1=0;
            num2=0;
        }
        return 0;
        
    }
}