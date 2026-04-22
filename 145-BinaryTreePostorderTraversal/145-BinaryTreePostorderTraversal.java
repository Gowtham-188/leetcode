// Last updated: 4/22/2026, 3:47:50 PM
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
    public List<Integer> postorderTraversal(TreeNode root) {

      result=new ArrayList<Integer>();
     PreOrder(root);
      return result;
    }
    public void PreOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }

        PreOrder(root.left);
        PreOrder(root.right);
        result.add(root.val);

    }
}