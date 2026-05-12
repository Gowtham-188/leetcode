// Last updated: 5/12/2026, 10:29:28 AM
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
17    public boolean hasPathSum(TreeNode root, int targetSum) {
18        if(root ==null ) return false;
19
20        if(root.left == null && root.right == null)
21        {
22            return targetSum - root.val == 0;
23        }
24        targetSum =   targetSum -root.val ;
25
26        return  hasPathSum(root.left,targetSum) ||  hasPathSum(root.right, targetSum) ;
27    }
28}