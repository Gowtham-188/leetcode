// Last updated: 4/22/2026, 3:47:27 PM
class Solution {
    public boolean isHappy(int n) {

        Set<Integer> visit = new HashSet<>();

        while(!visit.contains(n))
        {
            visit.add(n);

            n = getNextNum(n);
            if(n == 1) return true;
        }
        return false;   
        
        }

    private int getNextNum(int n)
    {
        int ans = 0;

        while(n > 0 )
        {
            int d = n % 10;

            ans += d * d;

            n = n / 10;
        }

        return ans;
    }    
}