// Last updated: 4/22/2026, 3:48:46 PM
class Solution {
    public int trap(int[] height) {

        int left=0;
        int right=height.length-1;
        int lmax=height[left];
        int rmax=height[right];
        int water=0;

        while(left<right)
        {
           if(lmax<rmax)
           {
             left++;
             lmax=Math.max(lmax,height[left]);
             water +=lmax-height[left];
           } 
           else
           {
            right--;
            rmax =Math.max(rmax,height[right]);
            water +=rmax-height[right];
           }

        }
        return water;



        // int [] lmax=new int[height.length];
        // int [] rmax=new int[height.length];
        // lmax[0]=0;
        // rmax[height.length]=0;

        // for(int i=1;i<lmax.length;i++)
        // {
        //    lmax[i]=Math.max(lmax[i-1],height[i-1]);
        // }
        
        // for(int j=height.length-2;j>0;j--)
        // {
        //    rmax[i]=Math.max(lmax[j+1],height[j+1]);
        // }


        
    }
} 