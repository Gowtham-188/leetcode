// Last updated: 4/22/2026, 3:44:40 PM
class Solution {
    public int twoEggDrop(int n) {



        // oru formula ana en nu purila

        float product = 1.0f; 
         
         for(int x=1;x<=n;x++)
         {
            product = (float)(x*(x+1)/2);

            if(Math.round(product)>=n)
            {
                return x;
            }

            product = 1.0f;

         }


         return 0;
        
        
    }
}