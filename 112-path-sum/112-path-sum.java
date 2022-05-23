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
        return pathSum(root, targetSum, 0);
    }
    
    public boolean pathSum(TreeNode root, int targetSum, int sum) {
        if(root==null) return false;
        sum+=root.val;
        if(root.left==null && root.right==null && sum==targetSum) return true;
        return pathSum(root.left, targetSum, sum) || pathSum(root.right, targetSum, sum);
    }
}