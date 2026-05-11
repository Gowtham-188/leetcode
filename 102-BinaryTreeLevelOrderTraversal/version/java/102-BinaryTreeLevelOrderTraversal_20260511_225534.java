// Last updated: 5/11/2026, 10:55:34 PM
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
17    public int minDepth(TreeNode root) {
18        if(root == null) return 0;
19       
20       if(root.left == null ) return minDepth(root.right)+1;
21
22       if(root.right == null) return minDepth(root.left)+1;
23
24       int minDepth = Math.min(minDepth(root.left) ,minDepth(root.right))+1;
25
26       return minDepth;
27
28    }
29}