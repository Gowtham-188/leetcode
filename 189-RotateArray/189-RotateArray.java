// Last updated: 4/22/2026, 3:47:33 PM
class Solution {
    public void rotate(int[] nums, int k) {
        
  
   int n=nums.length;
        int [] rotate=new int[n];
    k=k%n;
       
       for(int i=0;i<n;i++)
       {
             rotate[(k+i)%n]=nums[i];
    
       }

       for(int i=0;i<n;i++)
       {

         nums[i]=rotate[i];
       }

        }

    }
