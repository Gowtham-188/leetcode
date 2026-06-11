// Last updated: 6/11/2026, 5:39:59 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> list = new ArrayList<>();
4
5           helper( candidates , target, 0 ,list , new ArrayList<>());
6
7           return list;
8
9        
10    }
11    private void helper(int[] candidates , int target,int start , List<List<Integer>> list , List<Integer> current)
12    {
13        if(target == 0)
14        {
15            list.add(new ArrayList<Integer> (current));
16            return ;
17        }
18
19        if(target < 0 ) return ;
20
21        for(int i=start;i<candidates.length;i++)
22        {
23            current.add(candidates[i]);
24            helper( candidates , target - candidates[i], i,list , current);
25            current.remove(current.size()-1);
26        }
27       
28    }
29}