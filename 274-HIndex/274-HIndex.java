// Last updated: 4/22/2026, 3:47:07 PM
class Solution {
    public int hIndex(int[] citations) {

        Arrays.sort(citations);

        int n = citations.length;

        for(int i=0; i<n;i++)
        {
            int h = n - i; ;

            if(citations[i] >= h)
            {
                return h;
            }
        }
        return 0;

      
    }
}