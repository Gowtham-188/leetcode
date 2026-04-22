// Last updated: 4/22/2026, 3:48:44 PM
class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list=new ArrayList<>();
        perm(0,nums,list);

        return list;
    

        
    }

    public void perm(int index,int[] nums,List<List<Integer>> list )
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