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
    int paths=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return paths;
        
        helper(root, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return paths;
    }
    
    public void helper(TreeNode root, long target){
        if(root==null) return;
        if(target-root.val==0) {
            paths++;
        }
        
        helper(root.left, target-root.val);
        helper(root.right, target-root.val);
    }
}