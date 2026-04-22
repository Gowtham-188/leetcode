// Last updated: 4/22/2026, 3:48:12 PM
class Solution {
    public int numDecodings(String s) {

        int n=s.length();
        int [] db=new int [n+1];
        db[0]=1;

        db[1]= s.charAt(0)=='0'?0:1;

        for(int i=2;i<=n;i++)
        {
            int onedigit=Integer.valueOf(s.substring(i-1,i));
            int twodigit=Integer.valueOf(s.substring(i-2,i));

            if(onedigit>=1)
            {
                db[i]=db[i]+db[i-1];
            }
            if(twodigit>=10 && 26>=twodigit)
            {
                db[i]=db[i]+db[i-2];
            }
        }
        return db[n];
        
    }
}