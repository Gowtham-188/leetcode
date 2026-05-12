// Last updated: 5/12/2026, 7:07:39 PM
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
17    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
18
19        List<Integer> leaf1 = new ArrayList<>();
20        List<Integer> leaf2 = new ArrayList<>();
21
22        helper(root1,leaf1);
23        helper(root2,leaf2);
24
25        return leaf1.equals(leaf2);     
26    }
27
28    void helper(TreeNode root ,   List<Integer> leaf )
29    {
30        if(root == null) return ;
31        
32        if(root.left == null && root.right == null)
33        {
34            leaf.add(root.val);
35        }
36
37        helper(root.left , leaf);
38        helper(root.right , leaf);
39    }
40}