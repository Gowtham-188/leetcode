// Last updated: 4/22/2026, 3:48:09 PM
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
    public boolean isValidBST(TreeNode root) {

        boolean result= Inorder(root,Long.MIN_VALUE,Long.MAX_VALUE);

        return result;
        
    }

    public boolean Inorder(TreeNode root,long minimum,long maximum)
    {
        if(root==null)
        {
            return true ;
        }
        if(!(root.val>minimum && root.val<maximum))
        {
            return false;
        }

        return Inorder(root.left,minimum,root.val)&&Inorder(root.right,root.val,maximum);


            
           
           
        
     
       
     
    }
}