// Last updated: 5/12/2026, 2:53:31 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
18        
19      List<List<Integer>> list = new ArrayList<>();
20   
21      helper(root ,targetSum , 0, list,new ArrayList<>());
22      return list;
23        
24    }
25
26    void helper(TreeNode root , int target , int cursum ,  List<List<Integer>> list, List<Integer> curpath)
27    {
28           if(root == null) return ;
29
30           cursum = cursum + root.val;
31           curpath.add(root.val);
32
33           if(root.left == null && root.right == null && cursum == target )
34           {
35               list.add(new ArrayList<>(curpath));
36           }
37
38           helper(root.left , target , cursum , list , curpath);
39           helper(root.right , target , cursum , list , curpath);
40
41          curpath.remove(curpath.size() -1); 
42    }
43}