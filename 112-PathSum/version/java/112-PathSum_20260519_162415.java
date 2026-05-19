// Last updated: 5/19/2026, 4:24:15 PM
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
17        public int pathSum(TreeNode root, int targetSum) {
18            
19           return  pathLongSum( root, (long) targetSum) ;
20            
21        }
22
23    public int pathLongSum(TreeNode root, long targetSum) {
24        if(root == null) return 0;
25   
26        int firstroot = helper( root , targetSum);
27
28        int left =  pathLongSum( root.left,  targetSum);
29        int right =  pathLongSum( root.right,  targetSum);
30
31        return firstroot + left + right;
32
33    
34    }
35    int helper(TreeNode root ,long target)
36    {
37         if(root == null) return 0;
38         int count = 0;
39        if(target == root.val)
40        {
41            count++;
42        }
43      
44
45       count += helper(root.left,target-root.val);
46       count +=helper(root.right,target-root.val);
47
48       return count;
49
50       
51
52    }
53}