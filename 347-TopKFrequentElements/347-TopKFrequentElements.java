// Last updated: 4/22/2026, 3:46:51 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length ; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(a) - map.get(b));


        for(int num : map.keySet())
        {
            pq.add(num);

            if(pq.size() > k)
            {
                pq.poll();
            }

        }
        int []  arr = new int [ pq.size()];
         int i = 0;
        while(!pq.isEmpty())
        {
            arr[i++] = pq.poll();
        }
        return arr;


        
        
    }
}