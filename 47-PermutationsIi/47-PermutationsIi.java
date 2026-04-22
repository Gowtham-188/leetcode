// Last updated: 4/22/2026, 3:48:43 PM
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
          HashSet<List<Integer>> list=new HashSet<>();
        perm(0,nums,list);
          List<List<Integer>> result = new ArrayList<>(list);

        return result;
    

        
    }

    public void perm(int index,int[] nums,HashSet<List<Integer>> list )
    { 

        if(nums.length==index)
        {

            List<Integer> ans=new ArrayList<>();
            for(int arr:nums)
            {
                ans.add(arr);
            }

            list.add(ans);
            return ;
            
        }
         
       for(int i=index;i<nums.length;i++)
       {
        swap(i,index,nums);
        perm(index+1,nums,list);
        swap(i,index,nums);

       }


    }

    public void swap(int a,int b,int []nums)
    {
        int temp=nums[a];

        nums[a]=nums[b];
        nums[b]=temp;
        
    }
}