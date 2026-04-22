// Last updated: 4/22/2026, 3:47:40 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int []arr=new int[2];

        int left=0,right=numbers.length-1;

        while(left<right)
        {
          
            if(numbers[left]+numbers[right]==target)
            {
                return new int[]{left+1,right+1};
            }

            else if(numbers[left]+numbers[right]>target)
            {
                right--;

            }
            else
            {
                left++;
            }
             } 


             return new int[]{-1,-1};
    }
}