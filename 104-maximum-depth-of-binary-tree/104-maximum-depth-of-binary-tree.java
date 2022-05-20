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
    int max=0;
    public int maxDepth(TreeNode root) {
        return depth(root);
        
    }
    
    public int depth(TreeNode root) {
        if (root==null) return 0;
        int left = maxDepth(root.left)+1;
        int right = maxDepth(root.right)+1;
        //max = Math.max(max, Math.max(left,right));
        return Math.max(left,right);
    }
}