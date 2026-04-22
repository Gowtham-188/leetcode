// Last updated: 4/22/2026, 3:48:10 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     ArrayList<Integer> result;
    public List<Integer> inorderTraversal(TreeNode root) {

        result=new ArrayList<Integer>();
        inorder(root);
        return result;
        
    }
    public void inorder(TreeNode root)
    {
        if(root==null)
        return ;


            inorder(root.left);
            result.add(root.val);
            inorder(root.right);
        
    }
}