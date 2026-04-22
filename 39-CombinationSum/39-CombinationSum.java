// Last updated: 4/22/2026, 3:48:49 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {


        List<List<Integer>> ans=new ArrayList<>();

        List<Integer> res=new ArrayList<>();
        findcombinationsum(0,candidates,target,ans,res);
        return ans;
        
    }

    public void   findcombinationsum(int ind,int[]condidates,int target, List<List<Integer>> ans, List<Integer> res)
    {

        if(ind==condidates.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<Integer>(res));
            }
            return ;
        }

        if(condidates[ind]<=target)
        {
            res.add(condidates[ind]);
            findcombinationsum(ind,condidates,target-condidates[ind],ans,res);
            res.remove(res.size()-1);
        }
         findcombinationsum(ind+1,condidates,target,ans,res);
        

    }
}