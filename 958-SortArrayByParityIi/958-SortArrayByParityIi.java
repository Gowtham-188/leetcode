// Last updated: 4/22/2026, 3:46:04 PM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        

        int  even=0;
        int add=1;
          int [] arr=new int[nums.length];
       for(int i=0;i<nums.length;i++)
       {  
          if(nums[i]%2==0){
            arr[even]=nums[i]; 
            even=even+2;
          }
          else{
             arr[add]=nums[i]; 
            add=add+2;
          }
       }

       return arr;


        
        
    }
}