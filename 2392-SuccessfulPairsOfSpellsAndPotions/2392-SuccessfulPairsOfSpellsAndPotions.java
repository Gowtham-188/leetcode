// Last updated: 4/22/2026, 3:44:15 PM
/*class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        int s=spells.length;
        int p=potions.length;

        int count=0;
        int [] arr=new int [s];

        for(int i=0;i<s;i++)
        {
            for(int j=0;j<p;j++)
            {

                int ans=spells[i]*potions[j];

                if(success<=ans)
                {
                    count++;
                }
                else
                {
                    continue;
                }
            }
            arr[i]=count;
            count=0;
        }
        return arr;
        
    }
}*/
import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
      
      Arrays.sort(potions);
     int [] result=new int [spells.length];
     for(int i=0;i<spells.length;i++)
     {
        int spell=spells[i];

        int left=0;
        int right=potions.length-1;
        int count=0;
        while (left<=right)
        {
            int mid=(right+left)/2;
            if((long)spell*potions[mid]>=success)
            {
                right=mid-1;
                count=potions.length-mid;
            }
            else
            {
                left=mid+1;

            }

        }
        result[i]=count;

     }
     return result;

    }
}