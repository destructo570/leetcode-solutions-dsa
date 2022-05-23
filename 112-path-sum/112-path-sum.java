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
    int num=0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return recursive(root, targetSum);
    }
    
    public boolean recursive(TreeNode root, int sum) {
        if(root==null) return false;
        if(root.left==null && root.right==null && sum-root.val==0) return true;
        return recursive(root.left, sum-root.val) || recursive(root.right, sum-root.val);
    }
}