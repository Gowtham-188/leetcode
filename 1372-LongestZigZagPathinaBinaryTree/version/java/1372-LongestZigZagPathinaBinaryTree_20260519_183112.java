// Last updated: 5/19/2026, 6:31:12 PM
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
17     private int ans = 0;
18    public int longestZigZag(TreeNode root) {
19       
20        helper(root,true,0);
21        helper(root,false,0);
22        return ans;
23        
24    }
25    void helper(TreeNode root , boolean goleft , int length)
26    {
27
28        if(root == null) return ;
29
30        ans = Math.max(ans,length);
31
32        if(goleft)
33        {
34            helper(root.left , false ,length+1);
35            helper(root.right , true ,1);
36
37        }
38        else
39        {
40             helper(root.right , true ,length+1);
41             helper(root.left , false ,1);
42
43
44        }
45    }
46}