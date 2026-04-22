// Last updated: 4/22/2026, 3:47:21 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pr = new PriorityQueue<>();


        for(int i=0;i<nums.length;i++)
        {
              pr.add(nums[i]); 

            if(pr.size() > k)
            {
               pr.poll(); 
            }
          
        }

        return pr.peek();
        
        
    }
}