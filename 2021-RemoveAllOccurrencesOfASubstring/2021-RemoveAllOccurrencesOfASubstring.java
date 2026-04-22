// Last updated: 4/22/2026, 3:44:25 PM
class Solution {
    public String removeOccurrences(String s, String part) {
        int n=s.length();
        int index=s.indexOf(part);

        while (index!=-1)
        {
            s= s.substring(0,index)+s.substring(index+part.length());

             n=s.length();
            index=s.indexOf(part);
        }
        return s;
    }
}