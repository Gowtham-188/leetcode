// Last updated: 5/12/2026, 2:57:55 PM
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
18        List<List<Integer>> list  = new ArrayList<>();
19
20        helper(root , targetSum , 0 , list, new ArrayList<>());
21
22        return list;
23    }
24    void helper(TreeNode root ,int target , int cursum ,  List<List<Integer>> list, List<Integer> curpath )
25    {
26        if(root == null) return ;
27        cursum = cursum + root.val;
28        curpath.add(root.val);
29        if(root.left == null && root.right == null && cursum == target)
30        {
31            list.add(new ArrayList<>(curpath));
32        }
33          helper(root.left , target , cursum , list, curpath);
34          helper(root.right , target , cursum , list, curpath);
35
36          curpath.remove(curpath.size()-1);
37    }
38}