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
        if(root==null) return 0;
        int left=maxDepth(root.left)+1;
        int right=maxDepth(root.right)+1;
        return Math.max(left,right);
    }
    
    public int topDown(TreeNode root) {
        depth(root,1);
        return max;
    }
    
    public void depth(TreeNode root, int depth) {
        if(root==null) return;
        if(root.left==null && root.right==null) max = Math.max(max, depth);
        depth(root.left, depth+1);
        depth(root.right, depth+1);
    }
}