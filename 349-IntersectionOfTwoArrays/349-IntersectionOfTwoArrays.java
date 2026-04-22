// Last updated: 4/22/2026, 3:46:49 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

       int n=nums1.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
              map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        
        }

        ArrayList<Integer> ans=new ArrayList<>();
        for(int j=0;j<nums2.length;j++)
        {
            if(map.containsKey(nums2[j]))
            {
                ans.add(nums2[j]);
               
            }
              map.remove(nums2[j]);
           
        }

        int [] arr=new int[ans.size()];

        for(int k=0;k<ans.size();k++)
        {
            arr[k]=ans.get(k);
        }

        

       return arr;
        
    }
}