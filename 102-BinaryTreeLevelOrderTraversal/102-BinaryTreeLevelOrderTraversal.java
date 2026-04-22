// Last updated: 4/22/2026, 3:48:08 PM
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
    public List<List<Integer>> levelOrder(TreeNode root) {

     List<List<Integer>> list = new ArrayList<>();

    Queue<TreeNode> q = new LinkedList<>();

    if(root == null) return list;

    q.offer(root);

    while(!q.isEmpty())
    { 
      List<Integer> temp = new ArrayList<>();
        int n = q.size();

        for(int i=0;i<n;i++)
        {
       

        TreeNode curvalue = q.poll();

        temp.add(curvalue.val);

        if(curvalue.left != null) q.add(curvalue.left);
        if(curvalue.right != null) q.add(curvalue.right);

    }
    list.add(temp);

    }

    return list;

    }
}