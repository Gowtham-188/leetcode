// Last updated: 4/22/2026, 3:48:47 PM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
           List<List<Integer>> ans=new ArrayList<>();

        List<Integer> res=new ArrayList<>();
        Arrays.sort(candidates);
        findcombinationsum(0,candidates,target,ans,res);
        return ans;
        
    }
     public void   findcombinationsum(int ind,int[]condidates,int target, List<List<Integer>> ans, List<Integer> res)                     
    {        
            if(target==0)
            {
                ans.add(new ArrayList<Integer>(res));            
            return ;
            }
            for(int i=ind;i<condidates.length;i++)
            {
             if(i>ind && condidates[i]== condidates[i-1]) continue; 
                 
              if(condidates[i]>target) break;
                
            res.add(condidates[i]);  
            findcombinationsum(i+1,condidates,target-condidates[i],ans,res);// 
            res.remove(res.size()-1);
        
        }       
    }
}