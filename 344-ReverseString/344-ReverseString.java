// Last updated: 4/22/2026, 3:46:53 PM
class Solution {
    public void reverseString(char[] s) {

       int i=0;
       int j=s.length-1;
        while(i<j)
        {

            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;

            i++;
            j--;

        }
       // return Arrays.toString(s);
        
    }
}